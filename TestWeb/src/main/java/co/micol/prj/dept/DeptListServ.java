package co.micol.prj.dept;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deptList")
public class DeptListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeptListServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DeptDAO dao = new DeptDAO();
		request.setAttribute("list", dao.selectDeptAll());
		request.getRequestDispatcher("/WEB-INF/jsp/dept/deptList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
