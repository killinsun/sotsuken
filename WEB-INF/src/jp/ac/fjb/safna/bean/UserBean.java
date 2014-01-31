package jp.ac.fjb.safna.bean;

public class UserBean {
	private String userId = "";			// ユーザID
	private String passWord = "";		// パスワード(MD5)
	private String userName = "";		// 氏名 
	private String birthDay = "";		// 生年月日
	private String userClass = "";	// クラス 
	private String groupId = "";		//　現在設定している団体ID
	private	String groupName = "";      // 現在設定している団体名
	private String permitCode = "";		//1:学園祭本部 2:責任者 3:教職員 4:一般
	private String permit = "";			//権限名

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserClass() {
		return userClass;
	}

	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		birthDay = birthDay.substring(0,10);
		this.birthDay = birthDay;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPermitCode() {
		return permitCode;
	}

	public void setPermitCode(String permitCode) {
		this.permitCode = permitCode;
		if(permitCode.equals("1")){
			setPermit("学園祭本部");
		}else if(permitCode.equals("2")){
			setPermit("団体責任者");
		}else if(permitCode.equals("3")){
			setPermit("教職員");
		}else if(permitCode.equals("4")){
			setPermit("教職員");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getPermit() {
		return permit;
	}

	public void setPermit(String permit) {
		this.permit = permit;
	}


}
