package co.micol.prj.dept;

public class DeptVO {
	private String deptId;
	private String deptName;
	private String mngId;
	private String locId;
	 
	
	
	public DeptVO() {
		super();
	}



	public DeptVO(String deptId, String deptName, String mngId, String locId) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.mngId = mngId;
		this.locId = locId;
	}



	public String getDeptId() {
		return deptId;
	}



	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public String getMngId() {
		return mngId;
	}



	public void setMngId(String mngId) {
		this.mngId = mngId;
	}



	public String getLocId() {
		return locId;
	}



	public void setLocId(String locId) {
		this.locId = locId;
	}
	
}
