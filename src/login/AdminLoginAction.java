package login;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import util.WebSession;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class AdminLoginAction extends ActionSupport 
{
	private String adminLoginUsername;
	private String adminLoginPassword;
	private Connection connection;
	private WebSession ws;
	private PreparedStatement checkDuplicate;
	private Map m;
			
	private Connection getConnection() throws SQLException {
		java.sql.Connection con;
		con = ConnectionFactory.getInstance().getConnection();
		return con;
	}
	public String execute() 
			throws SQLException, ClassNotFoundException
			{
adminLoginUsername = getadminLoginUsername();
adminLoginPassword = getadminLoginPassword();
connection = getConnection();
		checkDuplicate = connection.prepareStatement("SELECT username, password FROM admin WHERE username=? AND password= ?");
		checkDuplicate.setString(1, adminLoginUsername);
		checkDuplicate.setString(2, adminLoginPassword);
		ResultSet results = checkDuplicate.executeQuery();
		System.out.println("#result" + results);
		if (results.next()) {
			System.out.println("hey gals");
			//ws.put("user", adminLoginUsername);
			Map session = ActionContext.getContext().getSession();
	//		session.put("logined","true");
	//		session.put("admin", adminLoginUsername);
			
			return "success";
		}else{

		return "success";
		}




			}
	  public void setSession(Map m)
	    {
	    	this.m=m;
	    }
	public void setadminLoginUsername(String adminLoginUsername) {
		this.adminLoginUsername = adminLoginUsername;
	}

	public String getadminLoginUsername() {
		return this.adminLoginUsername;
	}

	public void setadminLoginPassword(String adminLoginPassword) {
		this.adminLoginPassword = adminLoginPassword;
	}

	public String getadminLoginPassword() {
		return this.adminLoginPassword;
	}
//	public String logout() {
//		WebSession.remove("current");
//		return "success";
	//}
}