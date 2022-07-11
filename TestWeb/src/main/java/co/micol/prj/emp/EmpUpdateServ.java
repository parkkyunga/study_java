package co.micol.prj.emp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.dept.DeptDAO;

@WebServlet("/empUpdate")
public class EmpUpdateServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB조회
		//jobs,부서정보,사원리스트
		EmpDAO eDAO = new EmpDAO();
		DeptDAO dDAO = new DeptDAO();
		request.setAttribute("jobs", eDAO.selectJobs());
		request.setAttribute("depts", dDAO.selectDeptAll());
		
		//사번으로 단건조회
		String empId = request.getParameter("empId");
		request.setAttribute("emp", eDAO.selectOne(empId));
		
		request.getRequestDispatcher("/WEB-INF/jsp/emp/empUpdate.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("empId");
		String name = request.getParameter("empName");
		String job = request.getParameter("jobId");
		String hDate = request.getParameter("hireDate");
		String email = request.getParameter("email");
		String dId = request.getParameter("deptId");
		
		EmpVO vo = new EmpVO();
		vo.setEmpId(id);
		vo.setEmpName(name);
		vo.setEmail(email);
		vo.setHireDate(hDate);
		vo.setJobId(job);
		vo.setDeptId(dId);
		
		EmpDAO dao = new EmpDAO();
		int cnt = dao.empUpdate(vo);

		response.getWriter().append(cnt+"건 수정완료.");
	}
	
}
