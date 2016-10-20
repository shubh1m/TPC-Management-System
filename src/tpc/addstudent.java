package tpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addstudent
 */
public class addstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addstudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		
		admin.AddStudent(Rollno,name,year,gender,Branch,emailid, cpi,Companyplaced, pack, noof,onoff);
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
