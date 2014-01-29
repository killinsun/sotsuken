package jp.ac.fjb.safna.bean;

public class CpBean {
	private String cpId;
	private String groupId;
	private String groupName;
	private String catchCopy;
	private int voteNum;


	public String getCpId() {
		return cpId;
	}

	public void setCpId(String cpId) {
		this.cpId = cpId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCatchCopy() {
		return catchCopy;
	}

	public void setCatchCopy(String catchCopy) {
		this.catchCopy = catchCopy;
	}

	public int getVoteNum() {
		return voteNum;
	}

	public void setVoteNum(int voteNum) {
		this.voteNum = voteNum;
	}
}