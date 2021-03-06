package co.micol.prj.dept;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deptInsert")
public class DeptInsertServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//등록페이지이동
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/dept/deptInsert.jsp").forward(request, response);;
	}

	//DB등록처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = (request.getParameter("deptId"));//deptvo - deptinsert.jsp(form) 네임이랑 같아야됨
		String name = request.getParameter("deptName");
		String mng = (request.getParameter("mngId"));
		String loc = (request.getParameter("locId"));

		DeptVO vo = new DeptVO();
		vo.setDeptId(id);
		vo.setDeptName(name);
		vo.setMngId(mng);
		vo.setLocId(loc);
		
		DeptDAO dao = new DeptDAO();
		int cnt = dao.deptInsert(vo);
		
		response.getWriter().append(cnt+"건 등록완료.");
	}

}
