package p0204;

import java.util.Random;

public class MethodTest2 {
	static boolean isDuple(int[] nums, int rNum) { // 메서드 이름앞에 is,has,nexthas가 붙으면 데이터타입은 boolean
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0) {
				return false;
			}
			if(nums[i] == rNum) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[6];
		
		Random r = new Random();
		for(int i=1;i<nums.length;i++) {
			int rNum = r.nextInt(6)+1;
			if(isDuple(nums, rNum)) {
				i--;
				continue;
			}
			nums[i] = rNum;
		}
		
		for(int i=1;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
