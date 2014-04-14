package login;


import java.sql.Connection;
import java.sql.DriverManager;

// creating a connection factory to encapsulate a set of connection configuration parameters that has been defined.
public class ConnectionFactory {


	String driverName = "com.mysql.jdbc.Driver";
	String conUrl = "jdbc:mysql://localhost/bookstore";
	String dbUser = "root";
	String dbPwd = "root";

	private static ConnectionFactory connection = null;

	private ConnectionFactory() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection()  {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(conUrl, dbUser, dbPwd);

		} catch (Exception e) {
			e.toString();
		}
		return conn;
	}

	public static ConnectionFactory getInstance() {
		if (connection == null) {
			connection = new ConnectionFactory();
		}
		return connection;
	}
}