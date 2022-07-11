package co.micol.prj.emp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empDelete")
public class EmpDeleteServ extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String empId = request.getParameter("empId");
		EmpDAO dao = new EmpDAO();
		int cnt = dao.empDelete(empId);
		
		response.getWriter()
				.append("<script>")
				.append("alert('"+cnt+" 건 삭제완료');")
				.append("location.href='empList';")
				.append("</script>");
		
		//response.sendRedirect("empList");
		//페이지이동
		//request.setAttribute("msg", cnt+"건 삭제완료.");
		//request.getRequestDispatcher("/WEB-INF/jsp/message.jsp").forward(request, response);
		//response.getWriter().append(cnt+"건 삭제완료.");
	}


}
