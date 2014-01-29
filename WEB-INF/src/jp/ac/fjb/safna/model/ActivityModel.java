package jp.ac.fjb.safna.model; import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jp.ac.fjb.safna.bean.CpBean;
import jp.ac.fjb.safna.bean.MovieBean;
import jp.ac.fjb.safna.util.DBManager;
import jp.ac.fjb.safna.util.SqlTool;

public class ActivityModel {


	//キャッチコピーをすでに投稿しているかどうか
	public boolean isCPexist(String groupId){

		//１件でもあればその団体はキャッチコピーを投稿している
		String sql="SELECT count(*) FROM キャッチコピー WHERE 団体ID = '"+ groupId + "'";

		DBManager dm = new DBManager();
		try {
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);

			rs.next();
			if(rs.getInt(1) == 1){
				return true;
			}else{
				return false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally{
			dm.closeDB();
		}
	}


	//キャッチコピー一覧を取得
	public ArrayList<CpBean> getCP(){

		String sql = "SELECT C.団体ID,D.団体名,C.キャッチコピーID,C.キャッチコピー FROM キャッチコピー C,団体 D WHERE C.団体ID = D.団体ID";
		DBManager dm = new DBManager();

		try{
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);

			ArrayList<CpBean> cpList = new ArrayList<CpBean>();
			CpBean cb = null;

			while(rs.next()){
				cb = new CpBean();
				cb.setGroupId(rs.getString(1));
				cb.setGroupName(rs.getString(2));
				cb.setCpId(rs.getString(3));
				cb.setCatchCopy(rs.getString(4));
				//投票数を取得
				cb.setVoteNum(getVoteCP(rs.getString(1),"キャッチコピー"));  //直接代入している

				cpList.add(cb);
			}

			return cpList;
		} catch(SQLException e){
			e.printStackTrace();
			return null;
		} finally{
			dm.closeDB();
		}

	}

	//キャッチコピーの追加
	public void addCP(String groupId,String catchcopy){

		SqlTool sqlTool = new SqlTool();

		String cpId = sqlTool.getRow("キャッチコピー", 3);


		String sql="INSERT INTO キャッチコピー VALUES('" + cpId + "','" + groupId + "','" + catchcopy +"')";

		DBManager dm = new DBManager();
		dm.openDB();
		int count = dm.insertSQL(sql);
		dm.closeDB();
	}

	//キャッチコピーへの投票

	public void voteCP(String cpId,String userId){

		int catId = 1;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");

		String sql = "INSERT INTO 投票ログ VALUES("+catId+"," +  //ログID
				"'"+userId+  //投票者ID
				"',to_date('"+sdf.format(date)+"','yyyy/mm/dd hh24:mi'),'" + //時間
				cpId + "')"; //投票先ID

		DBManager dm = new DBManager();
		dm.openDB();
		dm.insertSQL(sql);
		dm.closeDB();
	}

	//指定したグループの投票数を計算して返す
	public int getVoteCP(String groupId,String type){

		//DBManagerの準備
		DBManager dm = new DBManager();
		dm.openDB();

		try{

			//管理するIDが違うので、最初にキャッチコピーIDまたは動画IDを求める
			String sql;
			int catId=0;
			if(type.equals("キャッチコピー")){
				sql = "SELECT キャッチコピーID FROM キャッチコピー WHERE 団体ID = '" + groupId +"'";
				catId = 1;
			}else{ //動画ID
				sql = "SELECT 動画ID FROM CM動画 WHERE 団体ID = '" + groupId + "'";
				catId = 2;

			}

			ResultSet rs = dm.selectSQL(sql);
			rs.next();
			String voteTargetId = rs.getString(1);  //投票ログテーブルの[投票先ID]はここに返される

			//投票先IDと活動カテゴリIDを元に、投票数を計算する

			sql = "SELECT COUNT(*) FROM 投票ログ WHERE 活動カテゴリID ="+ catId + " AND 投票先ID = '" + voteTargetId +"'";
			rs = dm.selectSQL(sql);
			rs.next();
			int voteNum = rs.getInt(1);
			dm.closeDB();

			return voteNum;


		}	catch(SQLException e){
			e.printStackTrace();
			return 0;

		} finally{
			dm.closeDB();
		}

	}

	public void UploadMovie(ArrayList<String[]> formDataList,String groupId){

		//formDataListの期待されるデータ内容
		//get(0)=hidden get(1)=ファイル名	get(2):コメント
		String fileName = formDataList.get(1)[1];
		String message	= formDataList.get(2)[1];

		System.out.println("1:" +fileName+  ",2:" + message );


		//動画ID取得
		SqlTool sTool = new SqlTool();
		int movieId = sTool.getRow("CM大会動画");

		String sql = "INSERT INTO CM大会動画 VALUES("+movieId+",'" +groupId+"','"+fileName+"','"+message+"')";

		DBManager dm = new DBManager();
		dm.openDB();
		dm.insertSQL(sql);
		dm.closeDB();

	}

	public ArrayList<MovieBean> getMovieData(){

		String sql ="SELECT M.動画ID,M.団体ID,D.団体名,M.動画URL,M.コメント FROM CM大会動画 M,団体 D WHERE D.団体ID = M.団体ID";
		DBManager dm = new DBManager();

		ArrayList<MovieBean> mvList = new ArrayList<MovieBean>();
		MovieBean mvBean;
		dm.openDB();
		try{
			ResultSet rs = dm.selectSQL(sql);
			while(rs.next()){
				mvBean = new MovieBean();
				mvBean.setMovieId(rs.getString(1));
				mvBean.setGroupId(rs.getString(2));
				mvBean.setGroupName(rs.getString(3));
				mvBean.setFilePath(rs.getString(4));
				mvBean.setMessage(rs.getString(5));
				mvList.add(mvBean);
			}
			
			return mvList;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally{
			dm.closeDB();
		}
	}

}
