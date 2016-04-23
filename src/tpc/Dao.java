package tpc;

import java.sql.*;
import java.util.*;

public class Dao {
	private Connect co;
	private Connection c;
	private PreparedStatement pstmt;
	private PreparedStatement pst;

    Dao(){
		Connect co = new Connect();
		c = co.Conn();
		pstmt = null;
	}

	public boolean confirmLogin(LoginClass lc){
		boolean flag = false;
		try{
			String str = "SELECT * FROM login";
			pstmt = c.prepareStatement(str);
			ResultSet rs = pstmt.executeQuery(str);
			while(rs.next()){
				String uid = rs.getString("UserID");
				String passwd = rs.getString("Password");
				String tp = rs.getString("Type");
				if(uid.equals(lc.getUsername()) && passwd.equals(lc.getPassword()) && tp.equals(lc.getType())){
					System.out.println("Congratulations " + uid + "!! You are logged in.");
					flag = true;
					break;
				}
			}
			if(flag == false){
				System.out.println("Wrong username or password.");
			}
			rs.close();
			pstmt.close();
			c.close();
		}
		catch (Exception e) {
            e.printStackTrace();
        }
		return flag;
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
			String str = "UPDATE signup SET Job_Name = ? , EmailID = ? , Contact = ? , Password = ? WHERE RecruiterID = ?";
			pstmt = c.prepareStatement(str);
			pstmt.setString(1, rec.getName());
			pstmt.setString(2, rec.getEmail());
			pstmt.setString(3, rec.getPhone());
			pstmt.setString(4, rec.getPassword());
			pstmt.setString(5, rec.getUserID());
			pstmt.executeUpdate();
			System.out.println("Signup table edited");
			String s = "UPDATE login SET Password = ? WHERE UserID = ?";
			pst = c.prepareStatement(s);
			pst.setString(1, rec.getPassword());
			pst.setString(2, rec.getUserID());
			pst.executeUpdate();
			System.out.println("Login table edited");
		}
		catch (Exception e) {
            e.printStackTrace();
        }
	}

	public ArrayList<ForJob> getAllRecruiter() throws SQLException{
		Statement stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("select name,email,phone,baseSalary,minCPI,branchPreffered,dateOfVisit from recruiter join forjob on recruiter.userid= forjob.userid");
		ArrayList<ForJob> rec = new ArrayList<ForJob>();
		while(rs.next()){
			ForJob f = new ForJob();
			f.setName(rs.getString("name"));
			f.setEmail(rs.getString("email"));
			f.setPhone(rs.getString("phone"));
			f.setBaseSalary(rs.getFloat("baseSalary"));
			f.setMinCPI(rs.getFloat("minCPI"));
			f.setBranchPrefferd(rs.getString("branchPreffered"));
			f.setDateOfVisit(rs.getString("dateOfVisit"));
			rec.add(f);
		}
		return rec;
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

	public Student getAlldata(String username){
			Connect co = new Connect();
			Connection c = co.Conn();
			PreparedStatement pstmt;
			Student st = new Student();
			try{
				String str = "SELECT * FROM student WHERE RollNo = ?";
				pstmt = c.prepareStatement(str);
				pstmt.setString(1, username);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()){
					st.setFirstName(rs.getString("Fname"));
					st.setLastName(rs.getString("Lname"));
					st.setrollNo(rs.getString("RollNo"));
					st.setDateOfBirth(rs.getString("DateOfBirth"));
					st.setbranch(rs.getString("Branch"));
					st.setCGPA(rs.getFloat("CGPA"));
					st.setemailId(rs.getString("EmailID"));
					st.setpassword(rs.getString("Password"));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return st;
	 }
}
