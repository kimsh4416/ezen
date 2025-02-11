package p0211;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("로또번호를 , 를 기준으로 입력 : ");
		String lottoNum = s.nextLine();
		System.out.println("니가 입력한 로또번호 : " + lottoNum);
		String[] str = lottoNum.split(",");
		ArrayList<Integer> lotto = new ArrayList<>();
		
		Random r= new Random();
		
		while(lotto.size()<6) {
			int rNum = r.nextInt(45)+1;
			if(lotto.indexOf(rNum)==-1) {
				lotto.add(rNum);
			}
		}
		System.out.println(lotto);
		
		int count = 0;
		for(int i=0;i<str.length;i++) {
			
			int num = Integer.parseInt(str[i]);
			if(lotto.indexOf(num)!=-1) {
				count++;	
			}
		}
		System.out.println("맞은 갯수 : " + count);
	}
}
