
public class User {
	private String username;
	private String password;
	
	public User(String User, String Pass ) {
		this.username=User;
		this.password=Pass;
		
	}
	
	
	public boolean Validate(String password) {
		boolean validated = false;
		
		if (this.password.equals(password)) {
			validated = true;
		}
		
		return validated;
		
	}
	
	public void ChangePass(String newpass) {
		this.password = newpass;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
