package co.micol.prj.emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/EmpListServ", "/empList" })
public class EmpListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpListServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();

		EmpDAO dao = new EmpDAO();

		String deptId = request.getParameter("deptId");; 
		if (deptId != null && !deptId.isEmpty()) {
			request.setAttribute("list", dao.selectOne(deptId));
			System.out.println("selectOne : "+deptId);
		} else {
			request.setAttribute("list", dao.selectAll());
		}
		request.getRequestDispatcher("/WEB-INF/jsp/emp/empList.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
