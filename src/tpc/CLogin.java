package tpc;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CLogin")
public class CLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int flag=0;
	
    public CLogin() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		boolean fl = false;
		HttpSession ht = request.getSession();
		
		LoginClass lc = new LoginClass();
		Dao db = new Dao();
		
		String uid = request.getParameter("username");
		String tp = request.getParameter("type");
		lc.setUsername(uid);
		lc.setPassword(request.getParameter("password"));
		lc.setType(tp);
		fl = db.confirmLogin(lc);
	
		if(fl == true){
			ht.setAttribute("UserID", uid);
			ht.setAttribute("Type", tp);
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
		else{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Wrong username or password.')");
			out.println("</script>");
			response.sendRedirect(request.getContextPath() + "/login.jsp");;
		}
	}
}
