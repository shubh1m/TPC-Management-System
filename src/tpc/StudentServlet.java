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
        	request.setAttribute("userName", str);
            response.sendRedirect( request.getContextPath() +"login.html");
        }

        else if(request.getParameter("logout") != null){
            System.out.println("CASE 2");
            session.invalidate();
            response.sendRedirect( request.getContextPath() + "index.jsp");
        }
        
        if( request.getParameter("logout")==null && request.getParameter("recpInformation")!=null){
            System.out.println("hey i am working");
            Recruiter r = new Recruiter();
            ForJob f = new ForJob();
            try {
                Statement smt = co.createStatement();
                ResultSet rs = smt.executeQuery("select name,email,phone,baseSalary,minCPI,branchPreffered,dateOfVisit from recruiter join forjob on recruiter.userid= forjob.userid");
                String name = null;
                String email = null;
                String phone = null;
                Float baseSalary;
                Float minCpi;
                String branch ;
                String dov;
                while(rs.next()){
                    r.setName(rs.getString("name"));
                    r.setEmail(rs.getString("email"));
                    r.setPhone(rs.getString("phone"));
                    f.setBaseSalary(rs.getFloat("baseSalary"));
                    f.setMinCPI(rs.getFloat("minCPI"));
                    f.setBranchPrefferd(rs.getString("branchPreffered"));
                    f.setDateOfVisit(rs.getString("dateOfVisit"));
                    name = r.getName();
                    email = r.getEmail();
                    phone = r.getPhone();
                    baseSalary = f.getBaseSalary();
                    minCpi = f.getMinCPI();
                    branch = f.getBranchPrefferd();
                    dov = f.getDateOfVisit();
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
                response.sendRedirect(request.getContextPath() + "recdetails.jsp");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(request.getParameter("logout")==null && request.getParameter("yourInformation")!=null){
            System.out.println("CASE 3");	
            Student s = new Student();
            Dao db = new Dao();
            db.getAlldata(str);
            String name = s.getname();
            String rollno = s.getrollNo();
            String dob = s.getDateOfBirth();
            String branch = s.getbranch();
            double cgpa = s.getCGPA();
            String email = s.getemailId();
            request.setAttribute("name", name);
            request.setAttribute("rollno", rollno);
            request.setAttribute("dob", dob);
            request.setAttribute("branch", branch);
            request.setAttribute("cgpa", cgpa);
            request.setAttribute("email", email);
            RequestDispatcher r= request.getRequestDispatcher("Studentdetails.jsp");
            r.forward(request, response);
            return;
        }
        
        if(request.getParameter("logout")==null && request.getParameter("reciInformation")!=null){
            response.sendRedirect( request.getContextPath() + "recidetails.jsp");
        }
        
        if(request.getParameter("logout")==null && request.getParameter("eligiblecomp")!=null){
            response.sendRedirect(request.getContextPath() + "elidetails.jsp");
        }
    }
}
