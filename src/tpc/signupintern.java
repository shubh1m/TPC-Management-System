package tpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signupintern extends HttpServlet {
	private static final long serialVersionUID = 1L;

   /* public void TPC() {
        super();
         TODO Auto-generated constructor stub
    }*/

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Successfully signed up!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String iname = request.getParameter("iname");
		String iid = request.getParameter("iuserid");
		String iemail = request.getParameter("iemail");
		String iphone = request.getParameter("iphone");
		String idomain = request.getParameter("idomain");
		int istipend = Integer.parseInt(request.getParameter("istipend"));
		String iyear = request.getParameter("iyear");
		String ilink = request.getParameter("ilink");
		String ipasswd = request.getParameter("passwd");
		ForIntern reci = new ForIntern();
		reci.setName(iname);
		reci.setUserID(iid);
		reci.setEmail(iemail);
		reci.setPhone(iphone);
		reci.setDomain(idomain);
		reci.setStipend(istipend);
		reci.setYearPreffered(iyear);
		reci.setLinkToWebsite(ilink);
		reci.setPassword(ipasswd);
	//	Login.main(recj);
	}
}