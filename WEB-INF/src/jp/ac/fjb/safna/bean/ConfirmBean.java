package jp.ac.fjb.safna.bean;

public class ConfirmBean {
	private String userId = "";			// ユーザID
	private String passWord = "";		// パスワード(MD5)
	private String userName = "";		// 氏名 
	private String birthDay = "";		// 生年月日
	private String userClass = "";	// クラス 

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
		this.birthDay = birthDay;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
