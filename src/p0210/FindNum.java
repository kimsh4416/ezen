package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Random r = new Random();
		
		int rNum = r.nextInt(100)+1;
		System.out.println("랜덤수 : " + rNum);
		int count = 1;
		while(true) {
			System.out.print("입력한 숫자:");
			String strNum = s.nextLine();
			
			int nums = Integer.parseInt(strNum);
			
			if(nums>rNum) {
				System.out.println("down");
			}
			else if(nums<rNum) {
				System.out.println("up");
			}else {
				System.out.println(count+"번 만에 맞췄다.");
				break;
			}
			
			count++;
		}
		System.out.println("게임이 끝났습니다.");
	}
}
