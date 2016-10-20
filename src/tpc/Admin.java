package tpc;
import java.sql.*;
import java.util.*;
public class Admin{
	private String name;
	private String email;
	private String userid;
	private String phone;
	private String password;
	private int type;
	Admindb Db= new Admindb();
	TpcMembers Tpc= new TpcMembers();
	Admin()
	{
		type=1;
		userid="admin";
		password="admin";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public void AddStudent(String Rollno,String name,String year,String gender,String Branch,String emailid, float cpi,String Companyplaced, float pack, int noof,String onoff) 
	{
		Db.AddStudent(Rollno,name,year,gender,Branch,emailid, cpi,Companyplaced, pack, noof,onoff);
		
	}
	public void DelStudent(String Rollno)
	{
		Db.delStudent(Rollno);
	}
	public void ChangeName(String Rollno,String name)
	{
		Db.ChangeName(Rollno,name);
	}
	public void ChangeRoll(String Emailid, String Roll)
	{
		Db.ChangeRoll(Emailid,Roll);
	}
	public void Updateyear(String Roll,String year)
	{
		Db.Updateyear(Roll,year);
	}
	public void CorrectGender(String Roll,String Gender)
	{
		Db.CorrectGender(Roll,Gender);
	}
	public void UpdateBranch(String Roll,String Branch)
	{
		Db.UpdateBranch(Roll,Branch);
	}
	public void ChangeEmailid(String Roll,String Emailid)
	{
		Db.ChangeEmailid(Roll,Emailid);
	}
	public void UpdateCpi(String Roll, float cpi)
	{
		Db.UpdateCpi(Roll,cpi);
	}
	public void UpdatePlacement(String Roll, String Company, float Pack, int Noof, String onof)
	{
		Db.UpdateCompany(Roll,Company);
		Db.UpdatePackage(Roll,Pack);
		Db.UpdateOther(Roll,Noof,onof);
	}
	public ArrayList<String> ViewFirstYearStudents()
	{
		ArrayList<String> al = Db.ViewFirstYearStudents();
		return al;
	}
	public ArrayList<String> ViewSecondYearStudents()
	{
		ArrayList<String> al=Db.ViewSecondYearStudents();
		return al;
	}
	public ArrayList<String> ViewThirdYearStudents()
	{
		ArrayList<String> al=Db.ViewThirdYearStudents();
		return al;
	}
	public ArrayList<String> ViewFourthYearStudents()
	{
		ArrayList al=Db.ViewFourthYearStudents();
		return al;
	}
	public void ViewPgStudents()
	{
		Db.ViewPgStudents();
	}
	public ArrayList<String> ViewTpcMember(String Roll)
	{
		ArrayList<String> al=new ArrayList<String>();
		Db.ViewTpcMember(Roll);
		al.add(Tpc.getName());
		
		al.add(Tpc.getEmailid());
		al.add(Tpc.getMobileNo());
		al.add(Tpc.getDept());
		return al;
	}
	public void AddTpcMembers(String name,String rollNo,String mobileNo,String emailid,String dept)
	{
		Tpc.setDept(dept);
		Tpc.setEmailid(emailid);
		Tpc.setMobileNo(mobileNo);
		Tpc.setName(name);
		Tpc.setRollNo(rollNo);
		Db.AddTpcMembers(Tpc);
	}
	public void DeleteTpcMembers(String Roll)
	{
	//	Db.DeleteMember(Roll);
	}
	
	
	
}
