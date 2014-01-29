package jp.ac.fjb.safna.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.safna.bean.UserBean;
import jp.ac.fjb.safna.util.DBManager;
import jp.ac.fjb.safna.util.SafePassword;

public class LoginModel {

	// ***************************************** //
	//  IDとパスワードを元に、ユーザ情報を取得する
	// ***************************************** //
	public UserBean getUser(String id, String pass) {

		// ユーザ情報格納用
		UserBean user = new UserBean();

		// SQL文を組み立てる
		String sql = "SELECT ID,パスワード,氏名,生年月日,クラス FROM ユーザ WHERE ID = '" + id + "' AND パスワード = '" + pass + "'";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			// データが取得できなかったらnullを返す
			if ( !rs.next() ) {
				return null;
			}
			
			// 取得したユーザ情報をDAOに詰めてセッションに格納
			String userId = rs.getString("ID");
			user.setUserId(userId);
			user.setPassWord(pass);
			user.setUserName(rs.getString("氏名"));
			user.setBirthDay(rs.getString("生年月日"));
			user.setUserClass(rs.getString("クラス"));
			
			//取得ができたら、団体情報を取得する---------------------------------------------------------------
			//クラス団体を優先して団体の情報を取得する(団体名、所属する団体においての権限、団体ID)
			//最初にユーザIDを元に団体IDと権限IDを取得
			sql ="SELECT D.団体ID,D.団体名,D.団体カテゴリ,M.権限ID,M.ID " +
					"FROM 団体 D, ユーザ管理 M " +
					"WHERE M.ID = '" + userId + "' " +
					"AND D.団体ID = M.団体ID " +
					"AND D.団体カテゴリ = 'クラス'";
			rs = dm.selectSQL(sql);
			rs.next();
			user.setGroupId(rs.getString(1));
			user.setGroupName(rs.getString(2));
			user.setPermitCode(rs.getString(4));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// データベースのクロース
			dm.closeDB();
		}
		return user;
	}
	
	
	//ログイン中の団体を変更する
	public void setLoginGroup(UserBean user,String groupId){
		
		String sql = "SELECT D.団体ID,D.団体名,M.権限ID " +
						"FROM 団体 D,ユーザ管理 M  " +
						"WHERE M.団体ID ='"+ groupId +"' " +
						"AND D.団体ID = M.団体ID " +
						"AND M.ID = '" + user.getUserId() + "'";
		
		DBManager dm = new DBManager();
		try{
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);
			while(rs.next()){
				user.setGroupId(rs.getString(1));
				user.setGroupName(rs.getString(2));
				user.setPermitCode(rs.getString(3));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dm.closeDB();
		}
	}

}
