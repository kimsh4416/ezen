package p0218;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListMap3 {
	
	static List<Map<String,String>> getList(){
		
		List<Map<String,String>> users = new ArrayList<>();
		
		Map<String,String> user1 = new HashMap<>();
		
		user1.put("UI_NUM", "4");
		user1.put("UI_NAME", "김길동");
		user1.put("UI_ID", "SUNG");
		user1.put("UI_PWD", "1234");
		
		Map<String,String> user2 = new HashMap<>();
		
		user2.put("UI_NUM", "5");
		user2.put("UI_NAME", "홍길동");
		user2.put("UI_ID", "HONG");
		user2.put("UI_PWD", "1234");
		
		Map<String,String> user3 = new HashMap<>();
		
		user3.put("UI_NUM", "6");
		user3.put("UI_NAME", "김길동");
		user3.put("UI_ID", "KIM");
		user3.put("UI_PWD", "1234");
		
		Map<String,String> user4 = new HashMap<>();
		
		user4.put("UI_NUM","7");
		user4.put("UI_NAME", "이길동");
		user4.put("UI_ID","LEE");
		user4.put("UI_PWD", "1234");
		user4.put("UI_PWD", "1234");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		
		return users;
	}
	
	public static void main(String[] args) {
		
		List<Map<String,String>> users = getList();
		for(Map<String,String> user : users) {
			System.out.println(user);
			
		
			
		}
	}
}
