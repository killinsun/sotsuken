package jp.ac.fjb.safna.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import jp.ac.fjb.safna.bean.GroupBean;
import jp.ac.fjb.safna.bean.UserGroupBean;
import jp.ac.fjb.safna.util.DBManager;

public class ProfileModel {

	//グループのメンバー一覧を取得する
	public ArrayList<String[]> getGroupMember(String groupId){
		String sql ="SELECT U.ID,U.氏名,P.権限名 "+
					"FROM ユーザ U,ユーザ管理 M,団体 D,権限 P "+
					"WHERE U.ID = M.ID "+
					"AND     D.団体ID = M.団体ID "+
					"AND M.権限ID = P.権限ID " +
					"AND D.団体ID = '" + groupId + "'";
		
		DBManager dm = new DBManager();
		String[] data = null;
		ArrayList<String[]> dataList = new ArrayList<String[]>();
		
		try{
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);
			while(rs.next()){
				data = new String[3];
				data[0] = rs.getString(1); //ユーザID
				data[1] = rs.getString(2); //氏名
				data[2] = rs.getString(3); //権限名
				dataList.add(data);
			}
			
			return dataList;
			
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally{
			dm.closeDB();
		}
	}
	
	//グループの情報を取得する
	public GroupBean getGroupData(String groupId){
		String sql = "SELECT D.団体名,D.ID,U.氏名,D.団体カテゴリ " +
						"FROM 団体 D,ユーザ U,ユーザ管理 M " +
						"WHERE D.団体ID = '"+ groupId +"' " +
						"AND U.ID = M.ID " +
						"AND U.ID = D.ID " +
						"AND M.ID = D.ID";
		
		DBManager dm = new DBManager();
		GroupBean gb = new GroupBean();
		try{
			dm.openDB();
			ResultSet rs = dm.selectSQL(sql);
			while(rs.next()){
				gb.setGroupId(groupId);
				gb.setGroupName(rs.getString(1));
				gb.setLeaderId(rs.getString(2));
				gb.setLeaderName(rs.getString(3));
				gb.setGroupCategory(rs.getString(4));
			}
			return gb;
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			dm.closeDB();
		}
		
		return null;
	}
	//ユーザーの所属しているグループの情報を返す
	public ArrayList<UserGroupBean> getUserGroupData(String userId){
		String sql = "select M.団体ID,D.団体名,D.ID,D.団体カテゴリ,P.権限名" +
				" from 団体 D,ユーザ管理 M,権限 P"+
				" where M.ID = '"+ userId + "'"+
				" and M.団体ID = D.団体ID"+
				" and M.権限ID = P.権限ID";

		DBManager dm = new DBManager();

		ArrayList<UserGroupBean> gbList = new ArrayList<UserGroupBean>();
		UserGroupBean gb;

		try{
			dm.openDB(); //DBOpen
			ResultSet rs = dm.selectSQL(sql);

			while(rs.next()){
				gb = new UserGroupBean();
				gb.setGroupId(rs.getString(1)); //団体ID
				gb.setGroupName(rs.getString(2));	//団体名
				gb.setLeaderId(rs.getString(3));	//責任者ID
				gb.setGroupCategory(rs.getString(4)); //カテゴリ名
				gb.setPermit(rs.getString(5));			//権限名
				gbList.add(gb);
			}
			
			return gbList;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally{
			dm.closeDB();
		}


	}
	public Map changeGroupProfile(String groupId,String groupName,String addUsers){

		//追加したいユーザーを配列に格納する。(文字列を分割)
		String[] userList = addUsers.split(",");

		String sql=null;
		DBManager dm = new DBManager();

		//存在しなかった場合のためのコレクション
		Map<Integer,String> checkMap = new HashMap<Integer,String>(); 

		//存在するデータをそのままDBに格納する
		try {
			dm.openDB();
			ResultSet rs;
			//配列内のユーザーIDをDBに存在するかチェック
			for(int i=0; i < userList.length;i++){
				sql = "SELECT * FROM ユーザ WHERE ID='" + userList[i] + "'";
				rs = dm.selectSQL(sql);
				//存在しない場合はmapにputする
				if(!rs.next()){
					checkMap.put(i, userList[i]);
				}else{
					//存在する場合はそのままDBに格納する	
					sql ="INSERT INTO ユーザ管理 VALUES('"+ userList[i] +"','" + groupId + "',3)";
					rs = dm.selectSQL(sql);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			dm.closeDB();
		}
		return checkMap;

	}

}
