package p0204;

public class StaticTest2 {
	int num1 = 1;
	static int num2 = 2;
	public static void main(String[] args) {
		StaticTest2 st = new StaticTest2();
		System.out.println(st.num2); // 2
		st.num2 = 10;
		st = new StaticTest2();
		System.out.println(st.num2); // 10 static에선 초기화를 했다고해서 기존값이 사라지지않는다
	}
}
