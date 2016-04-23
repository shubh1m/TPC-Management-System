package tpc;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditDetailsServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String passwd = request.getParameter("passwd");
		String cpasswd = request.getParameter("cpasswd");
		if(passwd.equals(cpasswd)){
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String conatct = request.getParameter("contact");
			
			HttpSession ht = request.getSession();
			String userid = ht.getAttribute("UserID").toString();
			Recruiter rec = new Recruiter();
			rec.setUserID(userid);
			rec.setName(name);
			rec.setEmail(email);
			rec.setPhone(conatct);
			rec.setPassword(passwd);
			
			Dao db = new Dao();
			db.editDetails(rec);
			// Kaam nhi kar raha
			// out.println("<script type=\"text/javascript\">");
			// out.println("alert('You have successfully added an intern');");
			// out.println("</script>");
			ht.invalidate();
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
		else{
			response.sendRedirect(request.getContextPath() + "/my_account.jsp");
		}
	}
}