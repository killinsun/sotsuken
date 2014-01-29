package jp.ac.fjb.safna.util;

import java.sql.ResultSet;
import java.sql.SQLException;


public class SqlTool {

	public boolean searchUser(String id){

		//sqlを組み立てる
		String sql = "select * from ユーザ where ID = '" + id + "'";

		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			if(!rs.next()){
				return true;

			}else{
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	public boolean searchGroup(String groupName){

		//sqlを組み立てる
		String sql = "select * from 団体 where 団体名 = '" + groupName + "'";

		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			if(!rs.next()){
				return true;

			}else{
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	//テーブルの件数+1を取得する（戻り値はint型で、左０埋めされる。）　(テーブル名,桁数)
	public String getRow(String tableName,int digits){

		//sqlを組み立てる
		String sql = "select lpad(count(*) + 1,'" + digits + "','0') from " + tableName;

		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			rs.next();
			return rs.getString(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	public int getRow(String tableName){

		//sqlを組み立てる
		String sql = "select count(*) + 1 from " + tableName;

		DBManager dm = new DBManager();

		try {
			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			ResultSet rs = dm.selectSQL(sql);

			rs.next();
			return rs.getInt(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}

	}
}
