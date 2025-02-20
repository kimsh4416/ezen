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

public class FoodInfoCRUD {
	
	static int updateFoodInfo(String fiNum, String fiName, int fiPrice) {
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
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "UPDATE FOOD_INFO";
			sql += "SET FI_NAME='" + fiName + "'";
			sql += "FI_PRICE=" + fiPrice ;
			
			
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	

	static int insertFoodInfo(String fiName, int fiPrice) {
		
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
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)";
			sql += " VALUES ('"+ fiName + "',"+ fiPrice + ")";
			
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	
	static int deleteFoodInfo(int fiNum) {
     
        String url = "jdbc:mysql://localhost:3306/ezen";
        String user = "root";
        String pwd = "r1r2r3";
        
        Connection con = null;
      
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection(url, user, pwd);
            Statement stmt = con.createStatement();
            String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM = " + fiNum ;
            
            return stmt.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return 0;
    }
	
	
	
	static List<Map<String,String>> getFoods(){
		
		List<Map<String,String>> foods = new ArrayList<>();
		
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
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				Map<String,String> food = new HashMap<>();
			
				food.put("FI_NUM", rs.getString("FI_NUM"));
				food.put("FI_NAME",rs.getString("FI_NAME"));
				food.put("FI_PRICE",rs.getString("FI_PRICE"));
				foods.add(food);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return foods;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		List<Map<String,String>> foods = getFoods();
		
		for (Map<String, String> food : foods) {
            System.out.println(food);
		}
		
		int result = insertFoodInfo("피자",25000);
		System.out.println("입력된 갯수 : " + result);
	}
}
