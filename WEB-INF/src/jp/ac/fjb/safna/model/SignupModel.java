package jp.ac.fjb.safna.model;

import jp.ac.fjb.safna.util.DBManager;

public class SignupModel {

	// ***************************************** //
	// 　入力されたユーザを登録する 
	// ***************************************** //
	public boolean addUser(String name,String id, String pass,String birthday,String userClass) {

		// SQL文を組み立てる
		String sql = "INSERT INTO ユーザ values('" + id + "','" + 
													pass + "','" + 
													name + "'," + 
													"to_date('" + birthday + "','yyyy/mm/dd'),'" +
													userClass + "')";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			int count = dm.insertSQL(sql);

			//挿入件数を取得
			System.out.println(count);
			
			return true;
			

		} finally {
			// データベースのクロース
			dm.closeDB();
		}
	}
	// ***************************************** //
	// 　入力された団体を登録する 
	// ***************************************** //
	public boolean addGroup(String groupId,String groupName,String groupCategory, String leader) {
		
		//団体IDを生成する
		//	団体テーブルから最後尾を取得する
		
		// SQL文を組み立てる
		String sql = "INSERT INTO 団体 values('" + groupId + "','" + 
													leader + "','" + 
													groupName + "','" + 
													groupCategory + "')";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			int count = dm.insertSQL(sql);

			//挿入件数を取得
			System.out.println(count);
			
			return true;
			

		} finally {
			// データベースのクロース
			dm.closeDB();
		}
	}
	// ***************************************** //
	// 　ユーザと団体を紐付ける 
	// ***************************************** //
	public boolean insertUserkanri(String userId,String groupId,int authority) {
		
		// SQL文を組み立てる
		String sql = "INSERT INTO ユーザ管理 values('" + userId + "','" + 
													groupId + "'," + 
													authority + ")";
		System.out.println(sql);

		// DBアクセス部品の生成
		DBManager dm = new DBManager();

		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			int count = dm.insertSQL(sql);

			//挿入件数を取得
			System.out.println(count);
			
			return true;
			

		} finally {
			// データベースのクロース
			dm.closeDB();
		}
	}

}
