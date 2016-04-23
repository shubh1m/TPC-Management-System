package tpc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ForJobServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		float jsalary = Float.parseFloat(request.getParameter("salary"));
		float jcpi = Float.parseFloat(request.getParameter("cpi"));
		String jbranch = request.getParameter("branch");
		String jdate = request.getParameter("date");
		
		HttpSession ht = request.getSession();
		String userid = ht.getAttribute("UserID").toString();
		ForJob recj = new ForJob();
		Dao db = new Dao();
	//	ArrayList<String> al = new ArrayList<String>();
	//	rec.getDetails(userid);
	//	String name = al.get(0);
	//	String email = al.get(2);
	//	String contact = al.get(3);
	//	String password = al.get(4);
		recj.setUserID(userid);
		recj.setBaseSalary(jsalary);
		recj.setMinCPI(jcpi);
		recj.setBranchPrefferd(jbranch);
		recj.setDateOfVisit(jdate);
		db.addJob(recj);
		response.sendRedirect(request.getContextPath() + "/my_account.jsp");
	}
}
