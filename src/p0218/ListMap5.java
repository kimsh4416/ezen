package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap5 {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		
		
		Connection con = null;
		List<Map<String,String>> users = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Map<String,String> user1 = new HashMap<>();
				user1.put("UI_NUM", rs.getString("UI_NUM"));
				user1.put("UI_NAME", rs.getString("UI_NAME"));
				user1.put("UI_ID", rs.getString("UI_ID"));
				user1.put("UI_PWD", rs.getString("UI_PWD"));
				users.add(user1);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		for(Map<String,String> user1 : users) {
			System.out.println(user1);
		}
		
	}
}
