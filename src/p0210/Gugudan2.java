package p0210;

import java.util.Scanner;

public class Gugudan2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("당신이 원하는 단수 : ");
		String dan = s.nextLine();
		// dan이 1일 경우에는 1단
		// dna이 2일 경우에는 2단
		// 즉 단에 따라서 구구단을 출력하는 코드를 완성하시오.
		
		int danNum = Integer.parseInt(dan);
		for(int i=1;i<=9;i++) {
			System.out.println(danNum + " X " + i + " = " + (danNum*i));
		}
	}
}
