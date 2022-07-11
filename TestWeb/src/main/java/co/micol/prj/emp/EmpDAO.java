package co.micol.prj.emp;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.prj.comm.DAO;

public class EmpDAO extends DAO {
	// JOBs 조회
	public ArrayList<JobsVO> selectJobs() {
		ArrayList<JobsVO> list = new ArrayList<JobsVO>();
		getConnect();
		try {
			psmt = conn.prepareStatement("select * from jobs");
			rs = psmt.executeQuery();
			while (rs.next()) {
				JobsVO vo = new JobsVO();
				vo.setJobId(rs.getString("job_id"));
				vo.setJobTitle(rs.getString("job_title"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 전체조회
	public ArrayList<EmpVO> selectAll(/* String deptId */) {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		try {
			// 1.연결
			getConnect();
			// 2.sql구문준비
			String sql = "select * from employees order by employee_id "; // order by employee_id

//			  if (deptId != null && !deptId.isEmpty()) {
//				  sql += "where department_id = ? ";
//			  }
//			sql += "order by employee_id";
			psmt = conn.prepareStatement(sql);
			// 실행

//			 if (deptId != null && !deptId.isEmpty()) {
//				 psmt.setString(1, deptId); 
//			}

			rs = psmt.executeQuery();
			// 조회결과 list에 담기
			while (rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEmpId(rs.getString("employee_id"));
				vo.setEmpName(rs.getString("last_name"));
				vo.setSalary(rs.getString("salary"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setEmail(rs.getString("email"));
				vo.setDeptId(rs.getString("department_id"));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 4.연결해제
			disconnect();
		}
		return list;
	}

	// 단건조회
	public EmpVO selectOne(String id) {
		EmpVO vo = new EmpVO();
		
		try {
			getConnect();
			String sql = "select * from employees where employee_id = ? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				vo.setEmpId(rs.getString("employee_id"));
				vo.setEmpName(rs.getString("last_name"));
				vo.setSalary(rs.getString("salary"));
				vo.setHireDate(rs.getString("hire_date"));
				vo.setJobId(rs.getString("job_id"));
				vo.setEmail(rs.getString("email"));
				vo.setDeptId(rs.getString("department_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}

	// 등록
	public int empInsert(EmpVO vo) {
		int cnt = 0;
		String sql = "insert into employees(employee_id,last_name,email,hire_date,job_id,department_id) values ((select max(employee_id)+1 from employees),?,?,?,?,?)";
		try {
			getConnect();
			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, vo.getEmpId());
			psmt.setString(1, vo.getEmpName());
			psmt.setString(2, vo.getEmail());
			psmt.setString(3, vo.getHireDate());
			psmt.setString(4, vo.getJobId());
			psmt.setString(5, vo.getDeptId());
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return cnt;
	}

	// 수정
	public int empUpdate(EmpVO vo) {
		int r = 0;
		getConnect();
		String sql = "update employees set last_name=?,email=?,hire_date=?,job_id=?,department_id=? where employee_id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getEmpName());
			psmt.setString(2, vo.getEmail());
			psmt.setString(3, vo.getHireDate());
			psmt.setString(4, vo.getJobId());
			psmt.setString(5, vo.getDeptId());
			psmt.setString(6, vo.getEmpId());
			r = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return r;
	}

	// 삭제
	public int empDelete(String empId) {
		int r = 0;
		try {
			getConnect();
			String sql = "delete from employees where employee_id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, empId);
			r = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return r;
	}
}
