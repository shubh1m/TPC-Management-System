package tpc;
import java.sql.*;
import java.util.*;
import java.io.*;
public class Admindb
{
	String name, userid, email,phone,password;
	Connect co;
	Connection c;
	Statement stmt;
	PrintStream writer;
	TpcMembers Tpc=new TpcMembers();
	 PreparedStatement PS;
	Admindb()
	{
		co = new Connect();
		c = co.Conn();
		stmt = null;
		writer = null;
		try
		{
			stmt = c.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void check()
	{
		
		int flag=0;
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "Select Name,Emailid,Userid,Phone,Password from Admin";
				ResultSet rs = stmt.executeQuery(sql);
				//STEP 5: Extract data from result set
				/*while(rs.next()){
					//Retrieve by column name
					name  = rs.getString("Name");
					email = rs.getString("Emailid");
					userid = rs.getString("Userid");
					phone = rs.getString("Phone");
					
					//Display values
					System.out.print("Name: " + name);
					System.out.print(",  " + email);
					System.out.print(", quantity: " + userid);
					System.out.println(", price: " + phone);
				}
				rs.close();*/
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
		
	}
	public void AddStudent(String Rollno,String name,String year,String gender,String Branch,String emailid, float cpi,String Companyplaced, float pack, int noof,String onoff)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			System.out.println(name + Rollno + year + gender + Branch + emailid + cpi + Companyplaced + pack + noof + onoff);
			String str = "INSERT INTO Students VALUES(?,?,?,?,?,?,?,?,?,?,?);";
			PS=c.prepareStatement(str);
				PS.setString(1,Rollno);
				PS.setString(2,name);
				PS.setString(3,year);
				PS.setString(4,gender);
				PS.setString(5,Branch);
				PS.setString(6,emailid);
				PS.setFloat(7,cpi);
				PS.setString(8,Companyplaced);
				PS.setFloat(9,pack);
				PS.setInt(10,noof);
				PS.setString(11,onoff);
				PS.executeUpdate();
				/*sql = "INSERT INTO Students VALUES ( '"+ Rollno +"','"+
				name +"','"
				+ year + "','"
				+ gender +"','"
				+ Branch + "','"
				+ emailid +"','"
				+ cpi + "','"
				+ Companyplaced+"','"
				+ pack +"',"
				+ noof+",'"
				+ onoff + "');";
				stmt.executeUpdate(sql);*/
				//STEP 5: Extract data from result set
				/*while(rs.next()){
					//Retrieve by column name
					name  = rs.getString("Name");
					email = rs.getString("Emailid");
					userid = rs.getString("Userid");
					phone = rs.getString("Phone");
					
					//Display values
					System.out.print("Name: " + name);
					System.out.print(",  " + email);
					System.out.print(", quantity: " + userid);
					System.out.println(", price: " + phone);
				}
				rs.close();*/
			}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void delStudent(String Roll)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "DELETE FROM Students where RollNo='"+ Roll + "';";
				stmt.executeUpdate(sql);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void ChangeName(String Rollno,String name)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Name=? where RollNo= ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, name);
				PS.setString(2, Rollno);
				PS.executeUpdate();
				System.out.println(name);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void ChangeRoll(String Emailid, String Roll)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET RollNo = ? where Emailid = ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, Roll);
				PS.setString(2, Emailid);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(Roll);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void Updateyear(String Roll,String year)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Year = ? where RollNo= ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, year);
				PS.setString(2, Roll);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(year);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void CorrectGender(String Roll,String Gender)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = " UPDATE Students SET Gender = ? where RollNo = ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, Gender);
				PS.setString(2, Roll);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(Gender);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void UpdateBranch(String Roll,String Branch)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Branch = ? where RollNo = ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, Branch);
				PS.setString(2, Roll);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(Branch);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void ChangeEmailid(String Roll,String Emailid)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Emailid = ? where RollNo = ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, Emailid);
				PS.setString(2, Roll);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(Emailid);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void UpdateCpi(String Roll, float cpi)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Cpi = ? where RollNo = ?;";
				PS=c.prepareStatement(sql);
				PS.setFloat(1, cpi);
				PS.setString(2, Roll);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(cpi);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void UpdateCompany(String Roll,String Company)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Company = ? where RollNo = ?;";
				PS=c.prepareStatement(sql);
				PS.setString(1, Company);
				PS.setString(2, Roll);
				PS.executeUpdate();
				//stmt.executeUpdate(sql);
				System.out.println(Company);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void UpdatePackage(String Roll,float Pack)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Package = ? where RollNo = ?;";
				//stmt.executeUpdate(sql);
				PS=c.prepareStatement(sql);
				PS.setFloat(1, Pack);
				PS.setString(2, Roll);
				PS.executeUpdate();
				System.out.println(Pack);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public void UpdateOther(String Roll,int Noof,String onof)
	{
		try{
			// Execute a query
			//System.out.println("Creating statement...");
			
				String sql;
				sql = "UPDATE Students SET Noofoffers = ? where RollNo= ?;";
				//stmt.executeUpdate(sql);
				PS=c.prepareStatement(sql);
				PS.setInt(1, Noof);
				PS.setString(2, Roll);
				PS.executeUpdate();
				System.out.println(Noof);
				sql = "UPDATE Students SET Onoff = ? where RollNo = ?;";
				//stmt.executeUpdate(sql);
				PS=c.prepareStatement(sql);
				PS.setString(1, onof);
				PS.setString(2, Roll);
				PS.executeUpdate();
				System.out.println(onof);
		}
		catch(SQLException se1){                      //Handle errors for JDBC
			se1.printStackTrace();
			}
	}
	public ArrayList<String> ViewFirstYearStudents()
	{
		 ArrayList al = new ArrayList();
		 String Roll,Name,Year,Gender,Branch,Emailid,Company,Onof,Cpi,Package,Noof;
		 try{
		 String sql="SELECT * FROM Students Where Year='First';";
		 ResultSet rs = stmt.executeQuery(sql);
		 while(rs.next())
		 {
			 Name  = rs.getString("Name");
			 Roll  = rs.getString("RollNo");
			 Year  = rs.getString("Year");
			 Gender  = rs.getString("Gender");
			 Branch  = rs.getString("Branch");
			 Emailid  = rs.getString("Emailid");
			 Company  = rs.getString("Company");
			 Onof  = rs.getString("Onoff");
			 Cpi  = ""+rs.getFloat("CPI");
			 Package  = ""+rs.getFloat("Package");
			 Noof=""+rs.getInt("Noof");
			 al.add(Name);
			 al.add(Roll);
			 al.add(Year);
			 al.add(Gender);
			 al.add(Branch);
			 al.add(Emailid);
			 al.add(Company);
			 al.add(Onof);
			 al.add(Cpi);
			 al.add(Package);
			 al.add(Noof);
		 }
		 rs.close();
		 }
		 catch(SQLException se1){                      //Handle errors for JDBC
				se1.printStackTrace();
				}
		 return al;
		 }
	public ArrayList<String> ViewSecondYearStudents()
	{
		ArrayList al = new ArrayList();
		 String Roll,Name,Year,Gender,Branch,Emailid,Company,Onof,Cpi,Package,Noof;
		 try{
		 String sql="SELECT * FROM Students Where Year='Second';";
		 ResultSet rs = stmt.executeQuery(sql);
		 while(rs.next())
		 {
			 Name  = rs.getString("Name");
			 Roll  = rs.getString("RollNo");
			 Year  = rs.getString("Year");
			 Gender  = rs.getString("Gender");
			 Branch  = rs.getString("Branch");
			 Emailid  = rs.getString("Emailid");
			 Company  = rs.getString("Company");
			 Onof  = rs.getString("Onoff");
			 Cpi  = ""+rs.getFloat("CPI");
			 Package  = ""+rs.getFloat("Package");
			 Noof=""+rs.getInt("Noof");
			 al.add(Name);
			 al.add(Roll);
			 al.add(Year);
			 al.add(Gender);
			 al.add(Branch);
			 al.add(Emailid);
			 al.add(Company);
			 al.add(Onof);
			 al.add(Cpi);
			 al.add(Package);
			 al.add(Noof);
		 }
		 rs.close();
		 }
		 catch(SQLException se1){                      //Handle errors for JDBC
				se1.printStackTrace();
		 }
		 return al;
	}
	public ArrayList<String> ViewThirdYearStudents()
	{
		ArrayList al = new ArrayList();
		 String Roll,Name,Year,Gender,Branch,Emailid,Company,Onof,Cpi,Package,Noof;
		 try{
		 String sql="SELECT * FROM Students Where Year='Third';";
		 ResultSet rs = stmt.executeQuery(sql);
		 while(rs.next())
		 {
			 Name  = rs.getString("Name");
			 Roll  = rs.getString("RollNo");
			 Year  = rs.getString("Year");
			 Gender  = rs.getString("Gender");
			 Branch  = rs.getString("Branch");
			 Emailid  = rs.getString("Emailid");
			 Company  = rs.getString("Company");
			 Onof  = rs.getString("Onoff");
			 Cpi  = ""+rs.getFloat("CPI");
			 Package  = ""+rs.getFloat("Package");
			 Noof=""+rs.getInt("Noof");
			 al.add(Name);
			 al.add(Roll);
			 al.add(Year);
			 al.add(Gender);
			 al.add(Branch);
			 al.add(Emailid);
			 al.add(Company);
			 al.add(Onof);
			 al.add(Cpi);
			 al.add(Package);
			 al.add(Noof);
		 }
		 rs.close();
		 }
		 catch(SQLException se1){                      //Handle errors for JDBC
				se1.printStackTrace();
		 }
		 return al;
	}
	public ArrayList<String> ViewFourthYearStudents()
	{
		ArrayList al = new ArrayList();
		 String Roll,Name,Year,Gender,Branch,Emailid,Company,Onof,Cpi,Package,Noof;
		 try{
		 String sql="SELECT * FROM Students Where Year='Third';";
		 ResultSet rs = stmt.executeQuery(sql);
		 while(rs.next())
		 {
			 Name  = rs.getString("Name");
			 Roll  = rs.getString("RollNo");
			 Year  = rs.getString("Year");
			 Gender  = rs.getString("Gender");
			 Branch  = rs.getString("Branch");
			 Emailid  = rs.getString("Emailid");
			 Company  = rs.getString("Company");
			 Onof  = rs.getString("Onoff");
			 Cpi  = ""+rs.getFloat("CPI");
			 Package  = ""+rs.getFloat("Package");
			 Noof=""+rs.getInt("Noof");
			 al.add(Name);
			 al.add(Roll);
			 al.add(Year);
			 al.add(Gender);
			 al.add(Branch);
			 al.add(Emailid);
			 al.add(Company);
			 al.add(Onof);
			 al.add(Cpi);
			 al.add(Package);
			 al.add(Noof);
		 }
		 rs.close();
		 }
		 catch(SQLException se1){                      //Handle errors for JDBC
				se1.printStackTrace();
		 }
		 return al;
	}
	public void ViewPgStudents()
	{
		
	}
	public void ViewTpcMember(String Roll)
	{
		try
		{
			String sql="Select Name, Emailid,MobileNo,Department From TpcMembers where RollNo="+ Roll +";";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				Tpc.setName(rs.getString("Name"));
				Tpc.setEmailid(rs.getString("Emailid"));
				Tpc.setMobileNo(rs.getString("MobileNo"));
				Tpc.setDept(rs.getString("Department"));
			}
			rs.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void AddTpcMembers(TpcMembers Tpc)
	{
		try
		{
			PS=c.prepareStatement("INSERT INTO TpcMembers VALUES(?,?,?,?,?)");
			PS.setString(1, Tpc.getName());
			PS.setString(2,Tpc.getRollNo());
			PS.setString(3, Tpc.getEmailid());
			PS.setString(4,Tpc.getMobileNo());
			PS.setString(5,Tpc.getDept());
			PS.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	//public void DeleteMembers
}
