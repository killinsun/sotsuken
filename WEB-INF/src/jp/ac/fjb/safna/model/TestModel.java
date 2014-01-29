package jp.ac.fjb.safna.model;

import jp.ac.fjb.safna.util.DBManager;

public class TestModel {
	// ***************************************** //
	// データベースアクセスのテストとし、ダミーデータを挿入し、結果をテーブルで表示する
	// ***************************************** //

	public void testInsert (){
		
		// SQL文を組み立てる
		String sql = "INSERT INTO ユーザ VALUES ('x11g000','killinsun','竹内かつみ',to_date('1970/03/11','yyyy/mm/dd'),'3G1')";
		System.out.println(sql);

		// DBアクセス部品の準備
		DBManager dm = new DBManager();
		try {

			// DBのオープン
			dm.openDB();

			// SELECT文の実行
			dm.insertSQL(sql);


		} finally {
			// データベースのクロース
			dm.closeDB();
		}

	}
}
