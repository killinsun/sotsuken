package jp.ac.fjb.safna.model;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jp.ac.fjb.safna.bean.ChartBean;
import jp.ac.fjb.safna.bean.LogBean;
import jp.ac.fjb.safna.bean.ProductBean;
import jp.ac.fjb.safna.util.DBManager;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AccountingModel {

	// ***************************************** //
	// 　商品登録
	// ***************************************** //
	public boolean addProduct(String code,String name, String category,int genka,int teika,int baika,int kosu) {

		// SQL文を組み立てる
		String sql = "INSERT INTO 商品 values('" + code + "','" + 
				name + "','" + 
				category + "'," + 
				genka + "," +
				teika + "," +
				baika + "," +
				kosu + ")";
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

	public int modifyProduct(String code,String name,String category,int genka,int teika,int baika,int kosu){

		String sql="UPDATE 商品 SET " +
				"商品ID = '"+code+
				"',商品名='"+name+
				"',カテゴリID="+category+
				",原価="+genka+
				",定価="+teika+
				",売価="+baika+
				",準備個数="+kosu+
				" WHERE 商品ID='"+code+"'";

		DBManager dm = new DBManager();
		dm.openDB();
		int check = dm.updateSQL(sql);

		dm.closeDB();
		return check;
	}
	public void deleteProduct(String code,String groupId){
		String sql="DELETE FROM 商品 WHERE 商品ID='"+code+"'";
		String sql2="DELETE FROM 商品管理 WHERE 商品ID='"+code+"' AND 団体ID='"+groupId+"'";
		DBManager dm = new DBManager();
		dm.openDB();
		dm.deleteSQL(sql2);
		dm.deleteSQL(sql);
		dm.closeDB();

	}
	// ***************************************** //
	// 　商品情報変更
	// ***************************************** //

	// ***************************************** //
	// 　商品と団体を紐付ける
	// ***************************************** //
	public boolean insertProductKanri(String code,String groupId) {

		// SQL文を組み立てる
		String sql = "INSERT INTO 商品管理 values('" + groupId + "','" + 
				code + "')";
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
	// 　団体の所有する商品を検索する
	// ***************************************** //

	public ArrayList<ProductBean> getProduct(String groupId){
		String sql = "select 商品ID from 商品管理 where 団体ID = '"+ groupId + "'";

		DBManager dm = new DBManager();
		dm.openDB();
		try{
			ResultSet rs = dm.selectSQL(sql);
			ArrayList<String> productList = new ArrayList<String>();
			while(rs.next()){
				productList.add(rs.getString(1));
			}

			ProductBean pb;
			String sql2="";
			ArrayList<ProductBean> pbList = new ArrayList<ProductBean>();
			for(String sId:productList){
				sql2 = "select * from 商品 where 商品ID ='"+ sId + "'";
				rs = dm.selectSQL(sql2);
				while(rs.next()){
					pb = new ProductBean();
					pb.setCode(rs.getString(1));
					pb.setName(rs.getString(2));
					pb.setCategory(rs.getString(3));
					pb.setGenka(rs.getInt(4));
					pb.setTeika(rs.getInt(5));
					pb.setBaika(rs.getInt(6));
					pb.setKosu(rs.getInt(7));

					//販売数の取得(会計ログからマッチするデータを合算する)
					String sql3 = "select * from 会計ログ where 商品ID='"+sId+"' and 団体ID='"+groupId+"'";
					ResultSet rs2 = dm.selectSQL(sql3);
					while(rs2.next()){
						pb.setHanbai(pb.getHanbai() + rs2.getInt(3)); //販売数の計算
					}

					//現在在庫の計算
					pb.setGenzai(pb.getKosu() - pb.getHanbai());
					pbList.add(pb);
					System.out.println("データ追加");
				}
			}
			return pbList;

		}catch(SQLException e){
			return null;

		}finally{
			dm.closeDB();
		}

	}
	// ***************************************** //
	// 　カテゴリを追加する　
	// ***************************************** //
	public boolean addCategory(String categoryCode,String categoryName) {

		// SQL文を組み立てる
		String sql = "INSERT INTO 商品カテゴリ values(" + categoryCode + ",'" + 
				categoryName + "')";
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
	// 　カテゴリを取得する　
	// ***************************************** //
	public ArrayList<String> getCategory(){
		String sql="select カテゴリ名 from 商品カテゴリ";

		DBManager dm = new DBManager();
		dm.openDB();
		try {
			ResultSet rs = dm.selectSQL(sql);
			ArrayList<String> cateList = new ArrayList<String>();

			while(rs.next()){
				cateList.add(rs.getString(1));
			}
			return cateList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}finally{
			dm.closeDB();
		}
	}
	// ***************************************** //
	// 　会計情報を登録する　
	// ***************************************** //
	public boolean addLog(String jsonString,String groupid,String userid){

		JsonFactory factory = new JsonFactory();
		// JsonParserの取得
		try {
			JsonParser parser = factory.createJsonParser(jsonString);
			parser.nextToken();
			ObjectMapper mapper = new ObjectMapper();
			ArrayList<LogBean> lb = new ArrayList<LogBean>();
			while(parser.nextToken() == JsonToken.START_OBJECT){
				LogBean log = mapper.readValue(parser, LogBean.class);	
				lb.add(log);
			}

			//商品ごとにログに追加する
			String sql ="";
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
			for(LogBean log:lb){
				sql = "INSERT INTO 会計ログ VALUES('"+log.getCode()+"','" +
						groupid + "',"+
						log.getCounter() + ","+
						"to_date('"+sdf.format(date)+"','yyyy/mm/dd hh24:mi'),'" +
						userid +"')";
				DBManager dm = new DBManager();
				dm.openDB();
				int check = dm.insertSQL(sql);
				System.out.println(check);
				dm.closeDB();
			}
			return true;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}
	// ***************************************** //
	// 　会計情報を取得する　
	// ***************************************** //
	public ArrayList<LogBean> getLogData(String groupId){

		ArrayList<LogBean> lbList = new ArrayList<LogBean>();
		LogBean lb;
		String sql = "select a.商品ID,b.商品名,c.カテゴリ名,b.売価,a.個数,a.日付 " +
				"from 会計ログ a,商品 b ,商品カテゴリ c " +
				"where a.商品ID = b.商品ID and b.カテゴリID = c.カテゴリID and 団体ID = '"+groupId+"'";
		DBManager dm = new DBManager();
		dm.openDB();
		ResultSet rs = dm.selectSQL(sql);
		try {
			while(rs.next()){
				lb = new LogBean();
				lb.setCode(rs.getString(1));
				lb.setName(rs.getString(2));
				lb.setCategoryName(rs.getString(3));
				lb.setBaika(rs.getInt(4));
				lb.setCounter(rs.getInt(5));
				lb.setDate(rs.getString(6));
				lbList.add(lb);
			}
			return lbList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally{
			dm.closeDB();
		}

	}

	//指定された商品を取得する
	public ProductBean getProductOnce(String code,String groupId){
		ProductBean pb = new ProductBean();
		String sql = "SELECT * FROM 商品 WHERE 商品ID='"+code+"'";
		DBManager dm = new DBManager();
		dm.openDB();

		try{
			ResultSet rs = dm.selectSQL(sql);
			String categoryCode ="";
			while(rs.next()){
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				categoryCode = rs.getString(3);
				pb.setGenka(rs.getInt(4));
				pb.setTeika(rs.getInt(5));
				pb.setBaika(rs.getInt(6));
				pb.setKosu(rs.getInt(7));
			}
			sql="SELECT カテゴリ名 FROM 商品カテゴリ WHERE カテゴリID='"+categoryCode+"'";
			rs=dm.selectSQL(sql);
			while(rs.next()){
				pb.setCategory(rs.getString(1));
			}
			//販売数の取得(会計ログからマッチするデータを合算する)
			String sql3 = "select * from 会計ログ where 商品ID='"+code+"' and 団体ID='"+groupId+"'";
			ResultSet rs2 = dm.selectSQL(sql3);
			while(rs2.next()){
				pb.setHanbai(pb.getHanbai() + rs2.getInt(3)); //販売数の計算
			}

			//現在在庫の計算
			pb.setGenzai(pb.getKosu() - pb.getHanbai());
			return pb;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally{
			dm.closeDB();
		}
	}

	//チャート集計に必要な情報を取得する
	public ArrayList<ChartBean> getChartData(String groupId){

		String sql="select * from chart_view where 団体ID='" + groupId + "' order by 日付";

		DBManager dm = new DBManager();
		ChartBean cb;
		ArrayList<ChartBean> cbList = new ArrayList<ChartBean>();

		try {
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);
			while(rs.next()){
				cb = new ChartBean();
				cb.setGroupId(groupId);
				cb.setGroupName(rs.getString(2)); //団体名
				cb.setCode(rs.getString(3)); //商品ID;
				cb.setName(rs.getString(4)); //商品名;
				cb.setCategoryId(rs.getString(5)); //カテゴリID;
				cb.setCategoryName(rs.getString(6)); //カテゴリ名;
				cb.setPrice(rs.getInt(7));   //売価
				cb.setDate(rs.getString(8)); //日付時間
				cbList.add(cb);
			}
			
			return cbList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally{
			dm.closeDB();
		}


	}
}
