package p0205;

public class MethodTest2 { // 메서드는 class 영역안에서만 선언 가능.
	static int add(int n1, int n2) {
		return n1 +n2;
	}
	static int mod(int n1, int n2) {
		return n1 % n2;
	}
	static int m(int n1, int n2) {
		return n1 - n2;
	}
	static int mt(int n1, int n2) {
		return n1 * n2;
	}
	static int d(int n1, int n2) {
		return n1 / n2;
	}
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 4;
		System.out.println(add(n1,n2));
		System.out.println(m(n1,n2));
		System.out.println(d(n1,n2));
		System.out.println(mt(n1,n2));
		System.out.println(mod(n1,n2));
	}
}
