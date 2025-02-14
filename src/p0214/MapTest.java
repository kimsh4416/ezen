package p0214;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list2.add("홍길동");
		System.out.println();
		list2.remove(0);
		
		
		HashMap<String,String> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		
		map2.put("이름", "홍길동");
		System.out.println(map2.get("이름"));
		
		map2.remove("이름");
		System.out.println(map2.get("이름"));
		System.out.println(map2==null); //false
		System.out.println(map2.size()==0); //true
		System.out.println(map2.isEmpty()); // true
	}
}
