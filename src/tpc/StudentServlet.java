package tpc;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public StudentServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hey u are in student servlet");
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connect c = new Connect();
        Connection co = c.Conn();
      //  PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String str = session.getAttribute("UserID").toString();
        
        if(session.getAttribute("UserID") == null){
        	request.setAttribute("UserID", str);
            response.sendRedirect( request.getContextPath() + "/login.html");
        }

        else if(request.getParameter("logout") != null){
            System.out.println("CASE 2");
            session.invalidate();
            response.sendRedirect( request.getContextPath() + "/index.jsp");
        }
        
        if( request.getParameter("logout")==null && request.getParameter("recjInformation")!=null){
            System.out.println("Companies for Job");
            Recruiter r = new Recruiter();
            ForJob f = new ForJob();
            try {
                Statement smt = co.createStatement();
                ResultSet rs = smt.executeQuery("select Job_Name, EmailID, Contact, Base_Salary, Min_CPI, Branch_Preffered, Date_of_Visit FROM signup JOIN For_Job on signup.RecruiterID= For_Job.RecruiterID");
                
                while(rs.next()){
                    r.setName(rs.getString("Job_Name"));
                    r.setEmail(rs.getString("EmailID"));
                    r.setPhone(rs.getString("Contact"));
                    f.setBaseSalary(rs.getFloat("Base_Salary"));
                    f.setMinCPI(rs.getFloat("Min_CPI"));
                    f.setBranchPrefferd(rs.getString("Branch_Preffered"));
                    f.setDateOfVisit(rs.getString("Date_of_Visit"));
                    String name = r.getName();
                    String email = r.getEmail();
                    String phone = r.getPhone();
                    float baseSalary = f.getBaseSalary();
                    float minCpi = f.getMinCPI();
                    String branch = f.getBranchPrefferd();
                    String dov = f.getDateOfVisit();
                    request.setAttribute("name", name);
                    request.setAttribute("email", email);
                    request.setAttribute("phone", phone);
                    request.setAttribute("basesalary", baseSalary);
                    request.setAttribute("minCpi", minCpi);
                    request.setAttribute("branch", branch);
                    request.setAttribute("dov", dov);
                }
                //RequestDispatcher a = request.getRequestDispatcher("recdetails.jsp");
                //a.forward(request,response);
                response.sendRedirect(request.getContextPath() + "/recdetails.jsp");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(request.getParameter("logout")==null && request.getParameter("yourInformation")!=null){
            System.out.println("My details");	
            Student s = new Student();
            Dao db = new Dao();
            s = db.getAlldata(str);
            String name = s.getname();
            String rollno = s.getrollNo();
            String dob = s.getDateOfBirth();
            String branch = s.getbranch();
            float cgpa = s.getCGPA();
            String email = s.getemailId();
            request.setAttribute("name", name);
            request.setAttribute("rollno", rollno);
            request.setAttribute("dob", dob);
            request.setAttribute("branch", branch);
            request.setAttribute("cgpa", cgpa);
            request.setAttribute("email", email);
            RequestDispatcher r= request.getRequestDispatcher("/sdetails.jsp");
            r.forward(request, response);
            return;
        }
        
        if(request.getParameter("logout")==null && request.getParameter("reciInformation")!=null){
        	System.out.println("View Internships");
            response.sendRedirect( request.getContextPath() + "/recidetails.jsp");
        }
        
        if(request.getParameter("logout")==null && request.getParameter("eligiblecomp")!=null){
            response.sendRedirect(request.getContextPath() + "/elidetails.jsp");
        }
    }
}
