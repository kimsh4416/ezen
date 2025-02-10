package p0210;

import java.util.Scanner;

public class Calc2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("계산할 값을 숫자,연산자,숫자 : ");
			String calcStr = s.nextLine();
			if("q".equals(calcStr.toLowerCase())) {
				break;
			}
			String[] strs = calcStr.split(",");
			int a = Integer.parseInt(strs[0]);
			int b = Integer.parseInt(strs[2]);
			
			String operator = strs[1];
			
			if("+".equals(strs[1])) {
				System.out.println("결과값 : "+ (a + b));
			}
			else if("-".equals(strs[1])) {
				System.out.println("결과값 : "+ (a - b));
			}
			else if("*".equals(strs[1])) {
				System.out.println("결과값 : "+ (a * b));
			}
			else if("/".equals(strs[1])) {
				System.out.println("결과값 : "+ (a / b));
			}
			else if("%".equals(strs[1])){
				System.out.println("결과값 : "+ (a % b));
			}
			else {
				System.out.println("알 수 없는 연산자 입니다.");
			}
		}
		System.out.println("계산기가 종료되었습니다.");
	}
}
