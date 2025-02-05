package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생각하는 수를 입력해주세요 : ");
		// 1-10의 난수를 생성
		// s의 nextLine()으로 값을 받아와서
		// 업앤다운을 완성
		// 예) 입력한 값이 4, 난수가 9: 업
		// 입력값이 3, 난수가 1 : 다운
		// 맞췄으면 맞췄다.
		Random r = new Random();
		String str = s.nextLine();
		int num = Integer.parseInt(str);
		int rNum = r.nextInt(10)+1;
		if(num==rNum) {
			System.out.println("맞췄다");
		}else if(num<rNum) {
			System.out.println("업");
		}else if(num>rNum){
			System.out.println("다운");
		}
		System.out.println("난수 : "+rNum);
	}
}
