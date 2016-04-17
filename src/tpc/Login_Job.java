package tpc;

import java.sql.*;
import java.io.*;

public class Login_Job{
	public static void main(ForJob rec)
	{
		Connect co = new Connect();
		Connection c = co.Conn();
		Statement stmt = null;
		PrintStream writer = null;
		int flag=0;
		try{
			// Execute a query
			System.out.println("Creating statement...");
			stmt = c.createStatement();

			String name = rec.getName();
			String userid = rec.getUserID();
			String email = rec.getEmail();
			String phone = rec.getPhone();
			float baseSalary = rec.getBaseSalary();
			float minCPI = rec.getMinCPI();
			String branchPreffered = rec.getBranchPrefferd();
			String dateOfVisit = rec.getDateOfVisit();
			String password = rec.getPassword();
			int type = rec.getType();
			
			ResultSet rs  = stmt.executeQuery("select * from signup_job");
			while(rs.next()){
				String id = rs.getString("userid");
				if(id.equals(userid)){
					writer.println("<script type=\"text/javascript\">");
					writer.println("alert('Username already exist. Choose another username')");
					writer.println("</script>");
					flag = 1;
					// flag1 removed
					break;
				}
			}
			
			if(flag == 0){
				stmt.executeUpdate("INSERT INTO signup_job values('" + name + "','"
						+ userid + "','"
						+ email + "','"
						+ phone + "','"
						+ baseSalary + "','"
						+ minCPI + "','"
						+ branchPreffered + "','"
						+ dateOfVisit + "','"
						+ password + "','"
						+ type + "')");
				
				String str = "INSERT INTO login values('" + userid + "','" + password + "','" + type + "')";
				stmt.executeUpdate(str);
			}
			
			// Clean-up environment
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
				if(stmt!=null)
					stmt.close();
			}
			catch(SQLException se2){
			}// nothing we can do
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



/*	String str = "CREATE TABLE IF NOT EXISTS signup_job("
+ " Job_Name varchar(30) not null,"
+ " RecruiterID varchar(20) not null, "
+ " EmailID varchar(30) not null,"
+ " Contact varchar(15),"
+ " 'Base_Salary(in lakhs)' float not null, "
+ " 'Min_CPI' float not null,"
+ " 'Branch_Preffered' varchar(20),"
+ " 'Date_of_Visit' varchar(20),"
+ " Password varchar(20) not null,"
+ " type int)";
stmt.executeUpdate(str);*/
