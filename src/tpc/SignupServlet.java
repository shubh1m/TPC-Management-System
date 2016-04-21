package tpc;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Successfully signed up!!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String id = request.getParameter("userid");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String passwd = request.getParameter("passwd");
		String cpasswd = request.getParameter("cpasswd");
		if(passwd.equals(cpasswd)){
			Recruiter rec = new Recruiter();
			rec.setName(name);
			rec.setUserID(id);
			rec.setEmail(email);
			rec.setPhone(phone);
			rec.setPassword(passwd);
			rec.setType(3);
			Signup.main(rec);
		}
		else{
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Password does not match. Enter your credentials again')");
			out.println("</script>");
			response.sendRedirect(request.getContextPath() + "/signup.jsp");
		}
	}
}

/*
		float jsalary = Float.parseFloat(request.getParameter("jsalary"));
		float jmincpi = Float.parseFloat(request.getParameter("jmincpi"));
		String jbranch = request.getParameter("jbranch").toUpperCase();
		String jdov = request.getParameter("jdov");
		
			recj.setBaseSalary(jsalary);
			recj.setMinCPI(jmincpi);
			recj.setBranchPrefferd(jbranch);
			recj.setDateOfVisit(jdov);
 */