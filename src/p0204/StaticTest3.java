package p0204;

class Test{
	static int num1 = 1;
	int num2 = 2; // 접근제어자가 따로 표기되어있지않으면 default
}
public class StaticTest3 {
	static int num1;
	public static void main(String[] args) {
		System.out.println(Test.num1);
		Test t = new Test();
		System.out.println(t.num2);
	}
}
