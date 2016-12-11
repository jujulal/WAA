package bibeklal.mum.edu;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="login")
@RequestScoped
public class Login {
	
	private String userId;
	private String password;
	
	public Login(){
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String verify(){
		
		if(this.userId.equals("k101") && this.password.equals("yoyo")){
			return "success";
		} else {
			return "error";
		}
	}
}
