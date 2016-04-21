package tpc;

public class Student {
    private String firstname;
    private String lastname;
    private String rollNo;
    private String DateOfBirth;
    private String branch;
    private String password;
    private float CGPA;
    private String gender;
    private String emailId;
    private String PlacedCompany;
    private int noOfOffers;
    private String onOffCampus;
    private int type;

    Student(){
    	this.type = 2;
    }
    
    void settype(int type){
        this.type = type;
    }

    void setFirstName(String name){
        this.firstname=name;
    }

    void setLastName(String lastname){
        this.lastname=lastname;
    }

    void setrollNo(String rollNo){
        this.rollNo=rollNo;
    }

    void setDateOfBirth(String DateOfBirth){
        this.DateOfBirth=DateOfBirth;
    }

    void setbranch(String branch){
        this.branch=branch;
    }

    void setCGPA(float cgpa){
        this.CGPA=cgpa;
    }

    void setemailId(String emailId){
        this.emailId=emailId;
    }

    void setgender(String gender){
        this.gender=gender;
    }

    void setonOffCampus(String onOffCampus){
        this.onOffCampus=onOffCampus;
    }

    void setPlacedCompany(String PlacedCompany){
        this.PlacedCompany=PlacedCompany;
    }

    void setpassword(String password){
        this.password=password;
    }

    int gettype(){
        return this.type;
    }

    String getname(){
        return (this.firstname+" "+this.lastname);
    }

    String getrollNo(){
        return this.rollNo;
    }

    String getDateOfBirth(){
        return this.DateOfBirth;
    }

    String getbranch(){
        return this.branch;
    }

    float getCGPA(){
        return this.CGPA;
    }

    String getemailId(){
        return this.emailId;
    }

    String getgender(){
        return this.gender;
    }

    String getpassword(){
        return this.password;
    }

    String getonOffCampus(){
        return this.onOffCampus;
    }

    int getnoOfOffers(){
        return this.noOfOffers;
    }

    String getPlacedCompany(){
        return this.PlacedCompany;
    }
}
