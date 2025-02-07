package p0207;

import java.util.ArrayList;

public class StringTest3 {
	
	public static void main(String[] args) {
		// list에 1부터 100까지의 값을 순서대로 추가
		// 반복문을 사용해서 차례대로 출력
		// 단 3,6,9가 있는 스트링은 짝으로 출력.
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=1;i<=100;i++) {
			list.add(i+"");
		}
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			if(str.contains("3")||str.contains("6")||str.contains("9")){
				System.out.println("짝");
			} else {
				System.out.println(str);
			}
		}
	}
}
