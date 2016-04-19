package tpc;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/CLogin")
@WebServlet("/CLogin")
public class CLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int flag=0;
	
    public CLogin() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		boolean isLoggedIn = false;
		HttpSession ht = request.getSession();
		Connect co = new Connect();
		Connection c = co.Conn();
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		try{
			Statement stmt = c.createStatement();
			//	PrintStream writer = null;
			String str = "SELECT * FROM login";
			ResultSet rs = stmt.executeQuery(str);
			
			while(rs.next()){
				String uid = rs.getString("UserID");
				String passwd = rs.getString("Password");
				String tp = rs.getString("Type");
				//System.out.println(uid + passwd + tp);
				
				if(username.equals(uid) && password.equals(passwd) && type.equals(tp)){
					System.out.println("Congratulations " + uid + "!! You are logged in.");
					isLoggedIn = true;
					Recruiter rec = new Recruiter();
					rec.setUserID(uid);
					ht.setAttribute("RecruiterID", uid);
					response.setContentType("text/html");
					response.sendRedirect(request.getContextPath() + "/index1.jsp");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("Wrong username or password.");
				isLoggedIn = false;
				response.setContentType("text/html");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Wrong username or password.')");
				out.println("</script>");
				response.setHeader("Refresh", "0.01; URL=http://localhost:8080/TPC/login.jsp");
			//	String redirectURL = "login.jsp";
			//	response.sendRedirect(redirectURL);
			}
			rs.close();
			stmt.close();
			c.close();
		}
		catch(SQLException se1){ 
			//Handle errors for JDBC
			se1.printStackTrace();
		}
		catch(Exception e){ 
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally{ 
			//finally block used to close resources
			try{
				if(c!=null)
					c.close();
			}
			catch(SQLException se3){
				se3.printStackTrace();
			}
		}
	}
}
