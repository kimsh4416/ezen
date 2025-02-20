package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public List<Map<String,String>> selectUserInfo2(String type, String str){
		List<Map<String,String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME , UI_ID, UI_PWD FROM USER_INFO";
		if("1".equals(type)) {
			sql += " WHERE UI_NAME LIKE CONCAT('%',?,'%')";
		}else if("2".equals(type)) {
			sql += " WHERE UI_ID LIKE CONCAT('%',?,'%')";
		}else if("3".equals(type)) {
			sql += " WHERE UI_PWD LIKE CONCAT('%',?,'%')";
		}
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> user = new HashMap<>();
				user.put("uiNum", rs.getString("UI_NUM"));
				user.put("uiName", rs.getString("UI_NAME"));
				user.put("uiId", rs.getString("UI_ID"));
				user.put("uiPwd", rs.getString("UI_PWD"));
				
				userInfos.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userInfos;
	}
	
}
