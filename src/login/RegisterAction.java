package login;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;


public class RegisterAction extends ActionSupport
{
	private static final long serialVersionUID = 8819479310593058668L;
	private String name;
	private String email;
	private String address;
	private String username;
	private String password;
	private Connection connection;
	private PreparedStatement addUser;
	private Map m;




	public String register()
			throws ClassNotFoundException, SQLException
			{


		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookstore","root","root");
		this.addUser = this.connection.prepareStatement("INSERT INTO user(name, email, address, username, password) VALUES(?,?,?,?,?)");
		this.addUser.setString(1, getName());
		this.addUser.setString(2, getEmail());
		this.addUser.setString(3, getAddress());
		this.addUser.setString(4, getUsername());
		this.addUser.setString(5, getPassword());
		this.addUser.executeUpdate();
	//	this.addUser.close();
	//	this.connection.close();
		m.put("b", getName());
		return "success";
			}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	
	public void setSession(Map m)
	{
		this.m=m;
	}
}
