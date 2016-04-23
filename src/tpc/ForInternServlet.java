package tpc;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForInternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ForInternServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		String domain = request.getParameter("domain");
		int stipend = Integer.parseInt(request.getParameter("stipend"));
		String year = request.getParameter("year");
		String link = request.getParameter("link");
		
		HttpSession ht = request.getSession();
		String userid = ht.getAttribute("UserID").toString();
		ForIntern reci = new ForIntern();
		reci.setUserID(userid);
		reci.setDomain(domain);
		reci.setStipend(stipend);
		reci.setYearPreffered(year);
		reci.setLinkToWebsite(link);
		//System.out.println("ftygh"+domain);
		Dao db = new Dao();
		db.addIntern(reci);
		// Kaam nhi kar raha
		// out.println("<script type=\"text/javascript\">");
		// out.println("alert('You have successfully added an intern');");
		// out.println("</script>");
		response.sendRedirect(request.getContextPath() + "/my_account.jsp");
	}
}