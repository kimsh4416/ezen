package p0211;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		
		while(lotto.size()<6) {
			int num = r.nextInt(45)+1;
			if(lotto.indexOf(num)==-1) {
				lotto.add(num);
			}
		}
		System.out.println(lotto);
	}
}
