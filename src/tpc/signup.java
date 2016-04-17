package tpc;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Successfully signed up!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String jname = request.getParameter("jname");
		String jid = request.getParameter("juserid");
		String jemail = request.getParameter("jemail");
		String jphone = request.getParameter("jphone");
		float jsalary = Float.parseFloat(request.getParameter("jsalary"));
		float jmincpi = Float.parseFloat(request.getParameter("jmincpi"));
		String jbranch = request.getParameter("jbranch");
		String jdov = request.getParameter("jdov");
		String jpasswd = request.getParameter("passwd");
		String jcpasswd = request.getParameter("cpasswd");
		if(jpasswd.equals(jcpasswd)){
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
			recj.setType(3);
			Login_Job.main(recj);
		}
		else{
			// Kaam nhi kar raha
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Password does not match. Enter your credentials again')");
			out.println("</script>");
			String redirectURL = "./signup.jsp";
			response.sendRedirect(redirectURL);
		}
	}
}