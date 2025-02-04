package p0204;

public class Calc {
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	int multiple(int n3, int n4) {
		return n3*n4;
	}
	int division(int n5, int n6) {
		return n5/n6;
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.add(1, 2);
		System.out.println(result);
		//minus 빼기, multiple 곱하기, division 나누기
		int result2 = c.multiple(3, 4);
		System.out.println(result2);
		
		int result3 = c.division(6,3);
		System.out.println(result3);
		
	}
}
