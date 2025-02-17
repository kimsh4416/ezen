package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector { // DDL DML DCL
	private static final String URL = "jdbc:mysql://localhost:3306/ezen";
	private static final String USE = "root";
	private static final String PWD = "r1r2r3";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
public class DateaBaseConnector{
	public static Connection getCon() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = DriverManager.getConnection(url, user, pwd);
		return con;
}
	
	public static void main(String[] args) {
		try {
			Connection con = getCon();
		} catch (SQLException e) {
			e.printStackTrace();
			}
		}
	}
}
