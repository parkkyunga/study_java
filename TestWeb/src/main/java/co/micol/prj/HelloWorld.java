package co.micol.prj;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/hello") //서버스타트할때 바로 서블릿 요청되게
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("제거됨");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("생성됨");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("서비스");
	}

}
