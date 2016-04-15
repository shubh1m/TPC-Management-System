package tpc;

import java.sql.*;

public class Login_Job{
	public static void main(ForJob rec)
	{
		Connect conn = new Connect();
		Statement stmt = null;
		try{
			// Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
		/*	String str = "CREATE TABLE IF NOT EXISTS signup_job("
					+ " Job_Name varchar(30) not null,"
					+ " RecruiterID varchar(20) not null, "
					+ " EmailID varchar(20) not null,"
					+ " Contact varchar(15),"
					+ " 'Base_Salary(in lakhs)' float not null, "
					+ " 'Min_CPI' float not null,"
					+ " 'Branch_Preffered' varchar(20),"
					+ " 'Date_of_Visit' varchar(20),"
					+ " Password varchar(20) not null,"
					+ " type int)";
			stmt.executeUpdate(str);
			String str1 = "INSERT INTO signup_job values(" + rec.name + "," 
															+ rec.userid + ","
															+ rec.email + ","
															+ rec.phone + ","
															+ rec.baseSalary + ","
															+ rec.minCPI + ","
															+ rec.branchPreffered + ","
															+ rec.dateOfVisit + ","
															+ "3)"; 
		*/	stmt.executeUpdate("INSERT INTO signup_job values(" + rec.name + "," 
					+ rec.userid + ","
					+ rec.email + ","
					+ rec.phone + ","
					+ rec.baseSalary + ","
					+ rec.minCPI + ","
					+ rec.branchPreffered + ","
					+ rec.dateOfVisit + ","
					+ "3)");
			// Clean-up environment
			stmt.close();
			conn.close();
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
		/*	try{
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se3){
				se3.printStackTrace();
			}*/
		}
	}
}