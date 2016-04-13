package tpc;

class Recruiter{
	private String name;
	private String email;
	String userid;
	private String phone;
	private String password;
	private int type;
	
	Recruiter(){
		this.type = 2;
	}
	
	public void setName(String name){
		this.name = name;
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
	
	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getPhone(){
		return this.phone;
	}
}

class ForJob extends Recruiter{
	float baseSalary;
	float minCPI;
	String branchPreffered;
	String dateOfVisit;
	
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
}

class ForIntern extends Recruiter{
	String domain;
	int stipend;
	String yearPreffered;
	String linkToWebsite;
	
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