package p0210.review;

import java.util.Random;

public class Test {

	
	public static void main(String[] args) {
		
		Random r= new Random();
		int[] nums = new int[6];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(6)+1;
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
		System.out.println(nums[i]);
		}
	}
}
