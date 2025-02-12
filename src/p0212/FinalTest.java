package p0212;

import java.security.DomainCombiner;

public class FinalTest {
	
	final int I = 1;
	int i;
	
	public static void main(String[] args) {
		final int i= 1;
		System.out.println(i);
		FinalTest ft = new FinalTest();
		System.out.println(ft.I);
	}
}
