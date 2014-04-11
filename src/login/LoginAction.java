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


public class LoginAction extends ActionSupport 
{
	private String loginUserName;
	private String loginPassword;
	private Connection connection;
	private WebSession ws;
	private PreparedStatement checkDuplicate;
	private Map m;

	public String login() 
			throws SQLException, ClassNotFoundException
			{
loginUserName = getLoginUserName();
loginPassword = getLoginPassword();
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/bookstore","root","root");
		checkDuplicate = connection.prepareStatement("SELECT username, password FROM user WHERE username=? AND password= ?");
		checkDuplicate.setString(1, loginUserName);
		checkDuplicate.setString(2, loginPassword);
		ResultSet results = checkDuplicate.executeQuery();
		System.out.println("#result" + results);
		if (results.next()) {
			System.out.println("hey gals");
			//ws.put("user", loginUserName);
			Map session = ActionContext.getContext().getSession();
			session.put("logined","true");
			session.put("user", loginUserName);
			
			return "success";
		}else{

			return "failure";
		}




			}
	  public void setSession(Map m)
	    {
	    	this.m=m;
	    }
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}

	public String getLoginUserName() {
		return this.loginUserName;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}
//	public String logout() {
//		WebSession.remove("current");
//		return "success";
	//}
}