package tpc;

import java.sql.*;

public class Login{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/signup";
	// Database credentials
	static final String USER = "root";
	static final String PASS = "shashwat";
	
	public static void main(Recruiter rec)
	{
		Connection conn = null;
		Statement stmt = null;
		try{
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			// Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String str = "CREATE TABLE IF NOT EXISTS signuprec(Job_Name varchar(20), LName varchar(20), )";
			}
		catch(Exception e)
		{
			
		}
	}
}