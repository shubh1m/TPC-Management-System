package tpc;
import java.util.*;

class Recruiter{
	private String name;
	private String userid;
	private String email;
	private String phone;
	private String password;
	private int type;
	Dao db = new Dao();
	
	Recruiter(){
		this.type = 2;
	}
	
	public void setName(String name){
		this.name = name;
		db.updateName(this.userid, name);
	}
	
	public void setUserID(String userid){
		this.userid = userid;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public void setType(int type){
		this.type = type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getUserID(){
		return this.userid;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public int getType(){
		return this.type;
	}
}

class ForJob extends Recruiter{
	private float baseSalary;
	private float minCPI;
	private String branchPreffered;
	private String dateOfVisit;
	
	void setBaseSalary(float baseSalary){
		this.baseSalary = baseSalary;
	}
	
	void setMinCPI(float minCPI){
		this.minCPI = minCPI;
	}
	
	void setBranchPrefferd(String branchPrefferd){
		this.branchPreffered = branchPrefferd; 
	}
	
	void setDateOfVisit(String dateOfVisit){
		this.dateOfVisit = dateOfVisit;
	}
	
	float getBaseSalary(){
		return this.baseSalary;
	}
	
	float getMinCPI(){
		return this.minCPI;
	}
	
	String getBranchPrefferd(){
		return this.branchPreffered;
	}
	
	String getDateOfVisit(){
		return this.dateOfVisit;
	}
	
	ArrayList<String> getDetails(String userid){
		ArrayList<String> al = new ArrayList<String>();
		al = db.getDetails(userid);
		return al;
	}
}

class ForIntern extends Recruiter{
	private String domain;
	private int stipend;
	private String yearPreffered;
	private String linkToWebsite;
	
	void setDomain(String domain){
		this.domain = domain;
	}
	
	void setStipend(int stipend){
		this.stipend = stipend;
	}
	
	void setYearPreffered(String yearPreffered){
		this.yearPreffered = yearPreffered;
	}
	
	void setLinkToWebsite(String linkToWebsite){
		this.linkToWebsite = linkToWebsite;
	}
	
	String getDomain(){
		return this.domain;
	}
	
	int getStipend(){
		return this.stipend;
	}
	
	String getYearPreffered(){
		return this.yearPreffered;
	}
	
	String getLinkToWebsite(){
		return this.linkToWebsite;
	}
}