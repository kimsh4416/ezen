package p0214;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score =0;
		char grade = ' ';
		char opt = '0';
		System.out.print("점수를 입력해주세요");
		
		score = s.nextInt();
		
		System.out.println("당신의 점수는: " + score);
		
		if(score >=90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}else if(score <94) {
				opt = '-';
			}
			else if(score>=80) {
				grade = 'B';
				if(score>=88) {
					opt = '+';
				}else if(score <84) {
					opt = '-';
				}
			}else {
				grade = 'C';
			}
		}
		System.out.println();
	}
}
