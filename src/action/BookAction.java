package action;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import login.ConnectionFactory;

import com.opensymphony.xwork2.ActionSupport;


public class BookAction extends ActionSupport
{

	private String title;
	private String author;
	private String price;
	private String category;
	private Connection connection;
	private PreparedStatement addBook;
	private PreparedStatement viewBooks;
	private Map m;


	private Connection getConnection() throws SQLException {
		java.sql.Connection con;
		con = ConnectionFactory.getInstance().getConnection();
		return con;
	}

	public String addBook()
			throws ClassNotFoundException, SQLException
			{

		connection = getConnection();

		this.addBook = this.connection.prepareStatement("INSERT INTO books(title, author, price, category) VALUES(?,?,?,?)");
		this.addBook.setString(1, getTitle());
		this.addBook.setString(2, getAuthor());
		this.addBook.setString(3, getPrice());
		this.addBook.setString(4, getCategory());
		this.addBook.executeUpdate();
		return "success";
			}


	public String viewBooks()
	
			throws ClassNotFoundException, SQLException
			{

		connection = getConnection();
	
		this.viewBooks = this.connection.prepareStatement("SELECT * FROM books");
	
		viewBooks.executeQuery();
	
		return "success";
			}
	
	public String getTitle() {
		return author;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}




	public void setSession(Map m)
	{
		this.m=m;
	}
}