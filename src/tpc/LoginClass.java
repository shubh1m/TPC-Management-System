package tpc;

public class LoginClass {
		private String username;
		private String password;
		private String type;
		
		LoginClass(){
			username=null;
			password=null;
			type = null;
		}

		LoginClass(String name,String pass,String t){
			username = name;
			password = pass;
			type = t;
		}
		
		public void setUsername(String string){
			this.username = string;
		}
		public void setPassword(String string){
			this.password = string;
		}
		public void setType(String string){
			this.type = string;
		}
		String getUsername(){
			return this.username;
		}
		String getPassword()
		{
			return this.password;
		}
		String getType(){
			return this.type;
		}
}