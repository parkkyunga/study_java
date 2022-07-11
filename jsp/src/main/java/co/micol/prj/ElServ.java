package co.micol.prj;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/elServ")
public class ElServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ElServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("id", "홍길동");
		request.setAttribute("arr", Arrays.asList("사과","바나나","포도"));
		
		request.getRequestDispatcher("/el.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
