package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {
/*
 * 1.Statement 사용시
 * - Connection 연결
 * 연결된 객체로 Statement 실행
 * SQL 생성
 * Statement로 SQL실행
 * 
 * 2. PreparedStatement 생성
 * Connection 연결
 * SQL 생성
 * 연결된 객체로 SQL을 준비한 PreparedStatement 생성
 * SQL의 물음표(?) 에 값을 바인딩
 * PreparedStatement로 실행
 */

	public List<Map<String,String>> gameList(){
		
		List<Map<String,String>> games = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME , GI_PRICE, GI_GENRE, GI_ DESC FROM GAME_INFO";
		
		try(Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
				while(rs.next()) {
					Map<String,String> game= new HashMap<>();
					game.put("giNum", rs.getString("GI_NUM"));
					game.put("giName", rs.getString("GI_NAME"));
					game.put("giPrice",rs.getString("GI_PRICE"));
					game.put("giGenre", rs.getString("GI_GENRE"));
					game.put("giDesc", rs.getString("GI_DESC"));
					
					games.add(game);
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return games;
	}
	
	
	public int insertGameInfo(String giName, int giPrice, String giGenre, String giDesc) {
        String sql = "INSERT INTO GAME_INFO (GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) "
        		+ "VALUES ('%s', %d, '%s', '%s')";
        sql = String.format(sql, giName, giPrice, giGenre, giDesc);

        try (Connection con = DBCon.getCon();
             Statement stmt = con.createStatement()) {
            return stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
	 public int updateGameInfo(int giNum, String giName, int giPrice, String giGenre, String giDesc) {
	        String sql = "UPDATE GAME_INFO SET "
	        		+ "GI_NAME = '%s', GI_PRICE = %d, GI_GENRE = '%s', "
	        		+ "GI_DESC = '%s' WHERE GI_NUM = %d";
	        sql = String.format(sql, giName, giPrice, giGenre, giDesc, giNum);

	        try (Connection con = DBCon.getCon();
	             Statement stmt = con.createStatement()) {
	            return stmt.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return 0;
	        
	    }
	 public int deleteGameInfo(int giNum) {
	        String sql = "DELETE FROM GAME_INFO WHERE GI_NUM = %d";
	        sql = String.format(sql, giNum);

	        try (Connection con = DBCon.getCon();
	             Statement stmt = con.createStatement()) {
	            return stmt.executeUpdate(sql);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return 0;
	    }
	 
	 public List<Map<String,String>> selectGameInfo2(String type, String str){
		 	List<Map<String,String>> games = new ArrayList<>();
		 	String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_DESC FROM GAME_INFO";
		 	if("1".equals(type)) {
		 		sql += " WHERE GI_NAME LIKE CONCAT('%',?,'%')";
		 	}else if("2".equals(type)) {
		 		sql += " WHERE GI_PRICE LIKE CONCAT('%',?,'%')";
		 	}else if("3".equals(type)) {
		 		sql += " WHERE GI_DESC LIKE CONCAT('%',?,'%')";
		 	}
		 	
		 	if("all".equals(type)) {
		 		sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_DESC FROM GAME_INFO";
		 	}
		 	
		 	try(Connection con = DBCon.getCon();
		 		PreparedStatement ps =con.prepareStatement(sql);){
		 		
		 		if("1".equals(type)||"2".equals(type)||"3".equals(type)) {
		 			ps.setString(1, str);
		 		}
		 		
		 		ResultSet rs = ps.executeQuery();
		 		while(rs.next()) {
		 			Map<String,String> game = new HashMap<>();
		 			game.put("giNum", rs.getString("GI_NUM"));
		 			game.put("giName", rs.getString("GI_NAME"));
		            game.put("giPrice", rs.getString("GI_PRICE"));
		            game.put("giDesc", rs.getString("GI_DESC"));
		            games.add(game);
		 		}
		 	}catch(SQLException e) {
		 		e.printStackTrace();
		 	}
		 
		 return games; 
	 }
	 
	 public int insertGameInfo2(String giName, int giPrice, String giGenre,String giDesc) {
		 String sql = "INSERT INTO GAME_INFO (GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES(?,?,?,?)";
		 try(Connection con = DBCon.getCon();
			 PreparedStatement ps = con.prepareStatement(sql);){
			 ps.setString(1, giName);
			 ps.setInt(2, giPrice);
			 ps.setString(3, giGenre);
			 ps.setString(4, giDesc);
			 return ps.executeUpdate();
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return 0;
	 }
	 
	 public int deleteGameInfo2(String giName, int giPrice, String giGenre) {
		 String sql = "DELETE FORM GAME_INFO WHERE ";
		 
		 return 0;
	 }
	 
	public static void main(String[] args) {
		
		GameInfoCRUD game = new GameInfoCRUD();
		
		game.insertGameInfo2("스타시티즌", 50000, "버그시뮬레이터", "버그망겜");
		
		List<Map<String,String>> gameInfos = game.selectGameInfo2("all","");
		for(Map<String,String> selectGame : gameInfos) {
			System.out.println(selectGame);
		}
		
	}
}
