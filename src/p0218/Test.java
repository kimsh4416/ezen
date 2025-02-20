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

public class Test {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		
		Connection con = null;
		List<Map<String, String>> foodList = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT FI_NUM,FI_NAME,FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Map<String,String> food1 = new HashMap<>();
				food1.put("FI_NUM", rs.getString("FI_NUM"));
				food1.put("FI_NAME", rs.getString("FI_NAME"));
				food1.put("FI_PRICE", rs.getString("FI_PRICE"));
				foodList.add(food1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch(SQLException e) {
				e.printStackTrace();
				}
			}
		}
		for(Map<String,String> food:foodList) {
			System.out.println(food);
		}
	}
}
