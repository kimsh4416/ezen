package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DB1 {

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
		
		try {
			Connection con = DriverManager.getConnection(url, use, pwd);
			Statement stmt = con.createStatement();
			
			String sql = "UPDATE USER_INFO";
			sql += " SET UI_NAME  = '김길동'";
			sql += " WHERE UI_NAME = '성룡'";
			
			int result = stmt.executeUpdate(sql);
			
			if(result>=1) {
				System.out.println("업데이트 성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
