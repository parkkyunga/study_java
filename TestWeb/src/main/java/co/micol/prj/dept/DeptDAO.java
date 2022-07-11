package co.micol.prj.dept;

import java.sql.SQLException;
import java.util.ArrayList;

import co.micol.prj.comm.DAO;

public class DeptDAO extends DAO {

	// 조회
	public ArrayList<DeptVO> selectDeptAll() {
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		getConnect();
		String sql = "select * from departments order by department_id";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				DeptVO vo = new DeptVO();
				vo.setDeptId(rs.getString("department_id"));
				vo.setDeptName(rs.getString("department_name"));
				vo.setMngId(rs.getString("manager_id"));
				vo.setLocId(rs.getString("location_id"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 단건조회
	public DeptVO selectDeptOne(String deptId) {
		DeptVO vo = new DeptVO();
		getConnect();
		String sql = "select * from departments where department_id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, deptId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo.setDeptId(rs.getString("department_id"));
				vo.setDeptName(rs.getString("department_name"));
				vo.setMngId(rs.getString("manager_id"));
				vo.setLocId(rs.getString("location_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}
	

	// 등록
	public int deptInsert(DeptVO vo) {
		int cnt = 0;
		try {
			getConnect();
			String sql = "insert into departments values (?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, vo.getDeptId());
			psmt.setString(2, vo.getDeptName());
			psmt.setString(3, vo.getMngId());
			psmt.setString(4, vo.getLocId());

			cnt = psmt.executeUpdate();
			if (cnt > 0) {
				System.out.println(cnt + "건 입력완료");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return cnt;
	}
	
	
	// 수정
	public int deptUpdate(DeptVO vo) {
		int r = 0;
		getConnect();
		String sql = "update departments set department_name=?,manager_id=?,location_id=? where department_id=?";
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, vo.getDeptName());
			psmt.setString(2, vo.getDeptId());
			psmt.setString(3, vo.getMngId());
			psmt.setString(4, vo.getLocId());
			
			r = psmt.executeUpdate();
			if (r > 0) {
				System.out.println(r + "건 수정완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return r;
	}

	// 삭제

}
