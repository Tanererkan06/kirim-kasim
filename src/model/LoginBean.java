package model;

 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	
	
	private String name;
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public LoginBean(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	
	public LoginBean() {
		super();
	}
	
	 
	
}
