package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		// nums에 1부터 100까지의 난수를 총 10개 추가(중복가능)
		// 반복문을 사용하여 출력하는데
		// 해당 값에 3,6,9라는 숫자가 있다면 짝을 출력.
	
		Random r= new Random();
		while(nums.size()<10) {
			nums.add(r.nextInt(100)+1);
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("nums[" + i + "]=" + nums.get(i));
		}
	}
}
