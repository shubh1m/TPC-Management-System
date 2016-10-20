package tpc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class admin
 */
public class admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("addstudent")!=null){
			response.sendRedirect("addstudent.jsp");
		}
		if(request.getParameter("editstudent")!=null){
			response.sendRedirect("EditStudent.jsp");
			
		}
		if(request.getParameter("deletestudent")!=null){
			response.sendRedirect("Deletestudent.jsp");
			
		}
		if(request.getParameter("viewfirstyearstudents")!=null){
			response.sendRedirect("ViewFirst.jsp");
			
		}
		if(request.getParameter("viewsecondyearstudents")!=null){
			response.sendRedirect("ViewSecond.jsp");
			
		}
		if(request.getParameter("viewthirdyearstudents")!=null){
			response.sendRedirect("ViewThird.jsp");
			
		}
		if(request.getParameter("viewfourthyearstudents")!=null){
			response.sendRedirect("ViewFourth.jsp");
			
		}
		if(request.getParameter("addtpcmember")!=null){
			response.sendRedirect("AddTPC.jsp");
			
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
