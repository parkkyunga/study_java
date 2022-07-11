package co.micol.prj.dept;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deptUpdate")
public class DeptUpdateServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//수정페이지이동
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptId = request.getParameter("deptId");
		
		//부서번호로 단건조회
		DeptDAO dao = new DeptDAO();
		request.setAttribute("dept", dao.selectDeptOne(deptId));
		
		request.getRequestDispatcher("/WEB-INF/jsp/dept/deptUpdate.jsp").forward(request, response);;
	}

	//DB수정처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String id = (request.getParameter("deptId"));//deptvo - deptinsert.jsp(form) 네임이랑 같아야됨
		String name = request.getParameter("deptName");
		String mng = (request.getParameter("mngId"));
		String loc = (request.getParameter("locId"));
		System.out.println(id+name+mng+loc);
		
		DeptVO vo = new DeptVO();
		vo.setDeptId(id);
		vo.setDeptName(name);
		vo.setMngId(mng);
		vo.setLocId(loc);
		
		DeptDAO dao = new DeptDAO();
		int cnt = dao.deptUpdate(vo);  
		
		response.getWriter().append(cnt+"건 수정완료.");
	}

}
