package tpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddTPC
 */
@WebServlet("/AddTPC")
public class AddTPC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Admin admin= new Admin();
		if(request.getParameter("ok")!=null){
		String name = request.getParameter("name");
		String Rollno = request.getParameter("rollno");
		String emailid = request.getParameter("emailid");
		String mobile = request.getParameter("mobile");
		String department = request.getParameter("department");
		
		admin.AddTpcMembers(name, Rollno, mobile, emailid, department);
		response.sendRedirect("admin.jsp");}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
