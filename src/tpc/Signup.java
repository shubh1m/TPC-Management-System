package tpc;

import java.sql.*;

public class Signup{
	public static void main(Recruiter rec)
	{
		Connect co = new Connect();
		Connection c = co.Conn();
		Statement stmt = null;
		PreparedStatement  pstmt = null;
		int flag=0;
		try{
			// Execute a query
			System.out.println("Creating statement...");
			stmt = c.createStatement();

			String name = rec.getName();
			String userid = rec.getUserID();
			String email = rec.getEmail();
			String phone = rec.getPhone();
			String password = rec.getPassword();
			int type = rec.getType();
			
			ResultSet rs  = stmt.executeQuery("select * from login");
			while(rs.next()){
				String id = rs.getString("UserID");
				if(id.equals(userid)){
					System.out.println("Username already exist. Choose another username");
					// Not working
					// writer.println("<script type=\"text/javascript\">");
					// writer.println("alert('Username already exist. Choose another username')");
					// writer.println("</script>");
					flag = 1;
					//	response.setHeader("Refresh", "0.01; URL=http://localhost:8080/TPC/login.jsp");
					// flag1 removed
					break;
				}
			}
			
			if(flag == 0){
				String s = "INSERT INTO signup values(?, ?, ?, ?, ?, ?)";
				pstmt = c.prepareStatement(s);
				pstmt.setString(1, name);
				pstmt.setString(2, userid);
				pstmt.setString(3, email);
				pstmt.setString(4, phone);
				pstmt.setString(5, password);
				pstmt.setInt(6, type);
				pstmt.executeUpdate();
				
				String str = "INSERT INTO login values(?, ?, ?)";
				pstmt = c.prepareStatement(str);
				pstmt.setString(1, userid);
				pstmt.setString(2, password);
				pstmt.setInt(3, type);
				
				System.out.println("Congratulations " + userid + "!! You have successfully signed up");
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
