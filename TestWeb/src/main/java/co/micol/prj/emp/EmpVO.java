package co.micol.prj.emp;

public class EmpVO {
	private String empId;
	private String empName;
	private String salary;
	private String email;
	private String hireDate;
	private String jobId;
	private String deptId;
	
	public EmpVO() {
		super();
	}

	

	public EmpVO(String empId, String empName, String salary, String email, String hireDate, String jobId,
			String deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.deptId = deptId;
	}



	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

}
