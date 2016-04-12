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
	float BaseSalary;
	float minCPI;
	String BranchPreffered;
	String DateOfVisit;
	
	void setBaseSalary(float BaseSalary){
		this.BaseSalary = BaseSalary;
	}
	
	void setMinCPI(float minCPI){
		this.minCPI = minCPI;
	}
	
	void setBranchPrefferd(String BranchPrefferd){
		this.BranchPreffered = BranchPrefferd; 
	}
	
	void setDateOfVisit(String DateOfVisit){
		this.DateOfVisit = DateOfVisit;
	}
	
	float getBaseSalary(){
		return this.BaseSalary;
	}
	
	float getMinCPI(){
		return this.minCPI;
	}
	
	String getBranchPrefferd(){
		return this.BranchPreffered;
	}
	
	String getDateOfVisit(){
		return this.DateOfVisit;
	}
}

class ForIntern extends Recruiter{
	String Domain;
	int Stipend;
	String YearPreffered;
	String LinkToWebsite;
	
	void setDomain(String Domain){
		this.Domain = Domain;
	}
	
	void setStipend(int Stipend){
		this.Stipend = Stipend;
	}
	
	void setYearPreffered(String YearPreffered){
		this.YearPreffered = YearPreffered;
	}
	
	void LinkToWebsite(String LinkToWebsite){
		this.LinkToWebsite = LinkToWebsite;
	}
	
	String getDomain(){
		return this.Domain;
	}
	
	int getStipend(){
		return this.Stipend;
	}
	
	String getYearPreffered(){
		return this.YearPreffered;
	}
	
	String getLinkToWebsite(){
		return this.LinkToWebsite;
	}
}