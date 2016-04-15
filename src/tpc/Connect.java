package tpc;

import java.sql.*;

public class Connect{
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/tpc";
	// Database credentials
	static final String USER = "";
	static final String PASS = "";
	
	Connect(){
		Connection conn = null;
		try{
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	//	return conn;
	}

	public Statement createStatement(){
		return null;
	}

	public void close(){
	}
}
