package p0206;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	static boolean exists(int[] nums, int num) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		// 1-45의 난수를 생성하여 반복문을 사용하여
		// 각 nums 에 대입하고 반복문으로 출력하시오.
		
		int[] nums = new int[6];
		Random r= new Random();
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = r.nextInt(45)+1;
		}
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		// 스캐너 클래스를 사용해서
		// 사용자에게 1-45까지의 숫자를 ","를 기준으로 6개를 입력받아
		// int[] lotto 에 저장하여
		// 위에서 생성된 nums와 비교하여 몇개의 숫자가 맞았는지
		// 출력하는 코드를 완성하시오.
		Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		String[] strs = str.split(",");
		int[] lotto = new int[strs.length];
		
		for(int i=0;i<strs.length;i++) {
			lotto[i] = Integer.parseInt(strs[i]);
		}
		
		int correctNum = 0;
		for(int i = 0;i<nums.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if(nums[i] == lotto[j]) {
					correctNum++;
					break;
				}
			}
		}
		System.out.println("맞은 갯수 : " + correctNum);
	}
}
