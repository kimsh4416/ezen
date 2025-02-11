package p0211;

import java.util.HashMap;

public class MapTest2 {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>(); 
		map.put("이름", "홍길동");
		map.put("age", "33");
		map.put("adress", "한양");
		map.put("job", "도적");
		System.out.println(map);
		// ArrayList 장점 순서가 중요할때 사용, 순서대로 저장하고 순서대로 불러올때 사용, 구성원이 중요하다(e)
		// map 장점 key,value가 중요하다 순서가 따로 없으며 입력한대로 출력되지 않는다
	}
}
