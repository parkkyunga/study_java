package co.micol.prj.emp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.prj.dept.DeptDAO;
//http://localhost/컨택스트패스(TestWeb)/
@WebServlet("/empInsert")
public class EmpInsertServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB조회
		//jobs,부서정보,사원리스트

		request.setAttribute("jobs", new EmpDAO().selectJobs());
		request.setAttribute("depts", new DeptDAO().selectDeptAll());
		
		request.getRequestDispatcher("/WEB-INF/jsp/emp/empInsert.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 등록처리
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = request.getParameter("empId");
		String name = request.getParameter("empName");
		String job = request.getParameter("jobId");
		String hDate = request.getParameter("hireDate");
		String email = request.getParameter("email");
		String did = request.getParameter("deptId");
		
		EmpVO vo = new EmpVO();
		vo.setEmpId(id);
		vo.setEmpName(name);
		vo.setEmail(email);
		vo.setHireDate(hDate);
		vo.setJobId(job);
		vo.setDeptId(did);
		
		EmpDAO dao = new EmpDAO();
		int cnt = dao.empInsert(vo);

		if(cnt > 0) {
			//request.getRequestDispatcher("empList").forward(request, response);
			response.sendRedirect("empList");
		}else {
			return; 
		}
		//response.getWriter().append(cnt+"건 등록완료.");
	}
	
}
