package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			
			String sql = "UPDATE FOOD_INFO";
			sql += " SET FI_NAME = '치즈김밥'";
			sql += " WHERE FI_NAME= '참치김밥'";
			
			String sql2= "DELETE FROM FOOD_INFO WHERE FI_NAME = '참치김밥'";
			
			
			
			int result1 = stmt.executeUpdate(sql);
			if(result1>=1) {
				System.out.println("업데이트 성공");
			}
			else {
				System.out.println("실패");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
