package tpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditStudent
 */
@WebServlet("/EditStudent")
public class EditStudent extends HttpServlet {
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
		String year = request.getParameter("year");
		String gender = request.getParameter("gender");
		String Branch = request.getParameter("branch");
		String emailid = request.getParameter("email");
		float cpi = Float.parseFloat(request.getParameter("cpi"));
		String Companyplaced = request.getParameter("Comp");
		float pack = Float.parseFloat(request.getParameter("pack"));
		String onoff = request.getParameter("onof");
		int noof = Integer.parseInt(request.getParameter("noof"));
		System.out.println(name);
		admin.ChangeName(Rollno, name);
		admin.ChangeEmailid(Rollno, emailid);
		admin.ChangeRoll(emailid, Rollno);
		admin.CorrectGender(Rollno, gender);
		admin.UpdateBranch(Rollno, Branch);
		admin.UpdateCpi(Rollno, cpi);
		admin.UpdatePlacement(Rollno, Companyplaced, pack, noof, onoff);
		response.sendRedirect("admin.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
