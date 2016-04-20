package tpc;

import java.sql.*;
import java.util.*;

public class Dao {
	Connect co;
	Connection c;
	PreparedStatement pstmt;
	Dao(){
		Connect co = new Connect();
		c = co.Conn();
		pstmt = null;
	}
	
	public ArrayList<String> getDetails(String userid){
		ArrayList<String> al = new ArrayList<String>();
		try{
			String str = "SELECT * FROM signup WHERE RecruiterID = ?";
			pstmt = c.prepareStatement(str);
			pstmt.setString(1, "userid");
			pstmt.executeUpdate();
			ResultSet rs = pstmt.executeQuery(str);
			
			al.add(rs.getString("Job_Name"));
			al.add(rs.getString("RecruiterID"));
			al.add(rs.getString("EmailID"));
			al.add(rs.getString("Contact"));
			al.add(rs.getString("Password"));
			al.add(rs.getInt("Type") + "");
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		return al;
	}
	
	public void updateName(String userid, String name){
		try{
			String str = "UPDATE signup SET JOB_NAME = ? where RecruiterID = ?";
			pstmt = c.prepareStatement(str);
			pstmt.setString(1, "name");
			pstmt.setString(2, "userid");
			pstmt.executeUpdate();
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void addJob(ForJob recj){
		try{
			String str = "INSERT INTO For_Job values(?, ?, ?, ?, ?)";
			pstmt = c.prepareStatement(str);
			pstmt.setString(1, recj.getUserID());
			pstmt.setFloat(2, recj.getBaseSalary());
			pstmt.setFloat(3, recj.getMinCPI());
			pstmt.setString(4, recj.getBranchPrefferd());
			pstmt.setString(5, recj.getDateOfVisit());
			pstmt.executeUpdate();
			System.out.println("Job inserted");
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void addIntern(ForIntern reci){
		try{
			String str = "INSERT INTO For_Intern values(?, ?, ?, ?, ?)";
			pstmt = c.prepareStatement(str);
			pstmt.setString(1, reci.getUserID());
			pstmt.setString(2, reci.getDomain());
			pstmt.setInt(3, reci.getStipend());
			pstmt.setString(4, reci.getYearPreffered());
			pstmt.setString(5, reci.getLinkToWebsite());
			pstmt.executeUpdate();
			System.out.println("Intern inserted");
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public void editDetails(Recruiter rec){
		try{
			String str = "UPDATE signup SET Job_Name = ? AND EmailID = ? AND Contact = ? AND Password = ? WHERE RecruiterID = ?";
			pstmt = c.prepareStatement(str);
			pstmt.setString(1, rec.getName());
			pstmt.setString(2, rec.getEmail());
			pstmt.setString(3, rec.getPhone());
			pstmt.setString(4, rec.getPassword());
			pstmt.setString(5, rec.getUserID());
			pstmt.executeUpdate();
			System.out.println("Details edited");
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}
}