package p0210.review;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int rNum = r.nextInt(100)+1;
		int count = 1;
		
		while(true) {
			System.out.print("입력한 값 : ");
			String str = s.nextLine();
			
			int strNum = Integer.parseInt(str);
			
			if(strNum<rNum) {
				System.out.println("up");
			}else if(strNum>rNum) {
				System.out.println("down");
			}else {
				System.out.println(count+"번 만에 맞췄다.");
				break;
			}
			count++;
		}
		System.out.println("게임이 끝났습니다.");
	}
}
