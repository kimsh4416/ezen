package p0211;

import java.util.ArrayList;

public class ListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(); // .set(값을 넣을곳, 넣는 값)
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(10);
		nums.add(7);
		nums.add(5);
		
		int tmp = nums.get(2); // 1
		nums.set(2, nums.get(0)); // 3 2 3 ..5
		nums.set(0, tmp); // 1 2 3..5
		System.out.println(nums);
		tmp = nums.get(5); // 5
		nums.set(5, nums.get(3)); // 1 2 3 ..10
		nums.set(3, tmp); // 1...5 7 10
		System.out.println(nums);
		
	}
}
