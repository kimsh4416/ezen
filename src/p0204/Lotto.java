package p0204;

import java.util.Random;

public class Lotto {

		public static void main(String[] args) {
			// 6개의 사이즈를 가진 int배열 nums를 선언하고
			// 각방의 1부터 45까지의 난수를 대입
			Random r = new Random();
			int[] nums= new int[6];
			
			for(int i=1;i<nums.length;i++) {
					nums[i] = r.nextInt(45)+1;
					for(int j=0;j<i;j++) {
						if(nums[i]==nums[j]) {
							i--;
							break;
						}
					}
			}
			for(int i=1;i<nums.length;i++) {
				System.out.println(nums[i]);
		}
	}
}
