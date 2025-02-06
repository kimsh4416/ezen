package p0205;

public class Test {

	static int add(int a,int b) {
		return a + b;
	}
		
	static int multiple(int a , int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		System.out.println(add(a,b));
		System.out.println(multiple(a,b));
		
	}
}
