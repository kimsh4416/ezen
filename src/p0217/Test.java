package p0217;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/ezen";
		String use = "root";
		String pwd = "r1r2r3";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, use,pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("FI_NUM"));
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		if(con != null) {
			try {
				con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
