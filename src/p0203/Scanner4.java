package p0203;

import java.util.Scanner;

public class Scanner4 {
	
	public static void main(String[] args) {
		// 스캐너클래스를 사용하여
		// 사용자에게 숫자를 입력받아
		// 해당 단을 출력하는 반복문을 완성하시오
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 단을 입력해주세요 : ");
		String numStr = s.nextLine();
		
		int num = Integer.parseInt(numStr);
		
		for(int i = 1;i<10;i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
}
