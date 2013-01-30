package entities;

public class User {

	int id;
	String username;
	String password;
		
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getUserame(){
		return username;
	}
	
	public void setUsername(String name){
		this.username = name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
}//END Bean
