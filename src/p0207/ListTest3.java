package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
	
		// nums의 1부터 45까지의 난수를 6개 추가하고
		// nums 의 각 index에 어떤값이 있는지 출력하시오
		// ex) nums에 [1,5,6,10,30,44]이 저장되어 있다면
		// 출력은 "nums[0]=1"
		// ...
		// "nums[5]=44" 이런식으로 출력되어야 한다.
		
		ArrayList<Integer> nums = new ArrayList<>();
		Random r= new Random();
		for(int i=0;i<7;i++) {
			nums.add(r.nextInt(45)+1);	
		}
		for(int i = 0;i<=5;i++) {
			System.out.println("nums[" + i + "]=" + nums.get(i));	
		}
	}
}
