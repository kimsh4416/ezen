package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>();
		Random r= new Random();
		for(int i=1;i<11;i++) {
			int rNum = r.nextInt(10)+1;
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}else{
				i--;
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println("nums[" + i + "]=" + nums.get(i));
		}
	}
}
