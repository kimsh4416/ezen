package p0211;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTest {

	 public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>(); // ArrayList 는 중복 허용 가능
		
		str.add("1");
		str.add("1");
		str.add("1");
		str.add("1");
		System.out.println(str.size()); // 4
		HashSet<String> set = new HashSet<>(); // Set은 중복 허용 불가능
		set.add("1");
		set.add("1");
		set.add("1");
		set.add("1");
		System.out.println(set.size()); // 1
	}
}
