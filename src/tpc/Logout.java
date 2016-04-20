package tpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Logout() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Bye");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Bye");
		String clogout = request.getParameter("confirm");
		HttpSession ht = request.getSession();
		if(clogout.equals("yes")) {
			ht.invalidate();
		}
		response.setContentType("text/html");
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	}
}
