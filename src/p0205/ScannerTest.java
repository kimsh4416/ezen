package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생각하는 숫자를 작성해주세요 : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr); // 입력한 문자열을 난수와 비교하기 위해 numStr을 int로 형변환
		Random r= new Random();
		int rNum = r.nextInt(5)+1; //1-10 까지의 난수를 생성
		
		if(rNum == num) {
			System.out.println("맞췄다");
		}else {
			System.out.println("틀렸다");
		}
		System.out.println("난수 : " + rNum);
	}
}
