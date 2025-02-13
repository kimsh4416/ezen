package p0213;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	static void printList(List<String> list) {
		for(String str: list) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		//List Map 
		ArrayList<String> als = new ArrayList<>(); //ArrayList 가 아닌 List<String> 의 형태로 많이사용함
		als.add("4");
		als.add("2");
		als.add("3");
		printList(als);
		
		LinkedList<String> lls = new LinkedList<>();
		lls.add("4");
		lls.add("2");
		lls.add("3");
		printList(lls);
		
	}
}
