package jp.ac.fjb.safna.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

	// DB接続用の変数を定義
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	// ******************************* //
	// Oracle接続メソッド
	// ******************************* //
	public void openDB() {
		System.out.println("openDB 開始");

		// ユーザ名、パスワード、接続文字列
		String username = "killinsun";
		String password = "killinsunoldmind0";
		String thinConn = "jdbc:oracle:thin:@killinsun.com:1521:xe";

		try {
			// JDBCドライバの読み込み
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// DBへの接続
			con = DriverManager.getConnection(thinConn, username, password);

			// SQL文発行オブジェクトの取得
			stmt = con.createStatement();

		} catch (SQLException e1) {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			System.out.println("例外発生により、DBに接続出来ませんでした");
			e1.printStackTrace();
		} catch (ClassNotFoundException e3) {
			e3.printStackTrace();
		}
		System.out.println("openDB 終了");
	}


	// ******************************* //
	// Oracle切断メソッド
	// ******************************* //
	public void closeDB() {
		System.out.println("closeDB 開始");
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
			System.out.println("DBから切断しました");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("closeDB 終了");
	}

	// ******************************* //
	// SELECT文を実行する
	// ******************************* //
	public ResultSet selectSQL(String sql) {

		System.out.println("selectSQL 開始");
		System.out.println("selectSQL：" + sql);

		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e1) {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
				System.out.println("例外発生により、コネクションを切断しました");
				e1.printStackTrace();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("selectSQL 終了");
		return rs;
	}

	// ******************************* //
	// INSERT文を実行する
	// ******************************* //
	public int insertSQL(String sql) {
		System.out.println("insertSQL 開始");
		System.out.println("insertSQL:" + sql);

		int inCount = 0;

		try {
			System.out.println("stmt start");
			inCount = stmt.executeUpdate(sql);
			System.out.println("登録件数：" + inCount);
		} catch (SQLException e1) {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
				System.out.println("例外発生により、コネクションを切断しました");
				e1.printStackTrace();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("insertSQL 終了");
		return inCount;
	}

	// ******************************* //
	// UPDATE文を発行する
	// ******************************* //
	public int updateSQL(String mySQL) {
		System.out.println("updateSQL 開始");
		System.out.println("updateSQL:" + mySQL);

		int upCount = 0;

		try {
			upCount = stmt.executeUpdate(mySQL);
			System.out.println("更新件数：" + upCount);
		} catch (SQLException e1) {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
				System.out.println("例外発生により、コネクションを切断しました");
				e1.printStackTrace();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("updateSQL 終了");
		return upCount;
	}

	// ******************************* //
	// DELETE文を発行する
	// ******************************* //
	public int deleteSQL(String mySQL) {
		System.out.println("deleteSQL 開始");
		System.out.println("deleteSQL:" + mySQL);

		int delCount = 0;

		try {
			delCount = stmt.executeUpdate(mySQL);
			System.out.println("削除件数：" + delCount);
		} catch (SQLException e1) {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
				System.out.println("例外発生により、コネクションを切断しました");
				e1.printStackTrace();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		System.out.println("deleteSQL 終了");
		return delCount;
	}

}
