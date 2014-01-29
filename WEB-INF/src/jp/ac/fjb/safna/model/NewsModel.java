package jp.ac.fjb.safna.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import jp.ac.fjb.safna.bean.NewsBean;
import jp.ac.fjb.safna.util.DBManager;
import jp.ac.fjb.safna.util.SqlTool;

public class NewsModel {
	
	public int addNews(String title,String body,String user){
		
		//SQL文の生成
		SqlTool tool = new SqlTool();
		String newsId = tool.getRow("ニュース",3);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String sql = "INSERT INTO ニュース VALUES('"+ newsId +"','"
													+ title+"',"
													+ "to_date('"+sdf.format(date)+"','yyyy/mm/dd hh24:mi'),'"
													+ body+"','"
													+ user+"')";
		DBManager dm = new DBManager();
		dm.openDB();
		int insNum = dm.insertSQL(sql);
		return insNum;

		
	}
	
	public ArrayList<NewsBean> getNews(){
		
		ArrayList<NewsBean> newses = new ArrayList<NewsBean>();
		NewsBean nb;
		String sql = "select * from ニュース order by 投稿日";
		DBManager dm = new DBManager();

		try {
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);		
			
			//取得したニュースのデータをBeanに格納していく
			while(rs.next()){
				nb = new NewsBean();
				nb.setTitle(rs.getString(2));
				nb.setTime(rs.getString(3));
				nb.setBody(rs.getString(4));
				nb.setUser(rs.getString(5));
				newses.add(nb);
			}
					
			return newses;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally{
			dm.closeDB();
		}

		
	}

}
