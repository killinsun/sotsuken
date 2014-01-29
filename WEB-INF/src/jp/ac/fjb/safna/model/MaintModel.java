package jp.ac.fjb.safna.model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jp.ac.fjb.safna.util.DBManager;

public class MaintModel {

	public ArrayList<String[]> getData(String menuName){

		//DBのオープン
		DBManager dm = new DBManager();
		dm.openDB();

		ArrayList<String[]> dataList = new ArrayList<String[]>();

		try {

			String sql = "SELECT * FROM " + menuName  ;

			ResultSet rs = dm.selectSQL(sql);
			ResultSetMetaData rsm = rs.getMetaData(); //テーブルに関するメタデータの取得
			String [] column = new String[rsm.getColumnCount()]; //配列をメタデータから取得した要素数分作る

			//カラム名のセット
			for(int i=0; i< rsm.getColumnCount(); i++){
				column[i] = rsm.getColumnName(i+1);
				System.out.println(column[i]);

			}
			dataList.add(column.clone()); //カラム名を追加
			
			//データ部のセット
			while(rs.next()){
				for(int i=0; i< rsm.getColumnCount();i++){
					//15文字以上の場合は省略
					column[i] = rs.getString(i+1);
					if(column[i].length() >= 30){
						column[i] = column[i].substring(0,30) + "...";
					}
					System.out.println(column[i]);
				}
				dataList.add(column.clone());
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			// データベースのクロース
			dm.closeDB();
		}
		return dataList;

	}

}
