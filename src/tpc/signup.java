package tpc;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signup extends HttpServlet {
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
		System.out.println("svfv");
		String jname = request.getParameter("jname");
		String jid = request.getParameter("juserid");
		String jemail = request.getParameter("jemail");
		String jphone = request.getParameter("jphone");
		float jsalary = Float.parseFloat(request.getParameter("jsalary"));
		float jmincpi = Float.parseFloat(request.getParameter("jmincpi"));
		String jbranch = request.getParameter("jbranch");
		String jdov = request.getParameter("jdov");
		String jpasswd = request.getParameter("passwd");
		ForJob recj = new ForJob();
		recj.setName(jname);
		recj.setUserID(jid);
		recj.setEmail(jemail);
		recj.setPhone(jphone);
		recj.setBaseSalary(jsalary);
		recj.setMinCPI(jmincpi);
		recj.setBranchPrefferd(jbranch);
		recj.setDateOfVisit(jdov);
		recj.setPassword(jpasswd);
		Login_Job.main(recj);
	}
}