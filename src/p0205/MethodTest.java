package p0205;

public class MethodTest {

	int test() {
		return 1;
	}
	
	static void test2() {
		
	}
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int i = mt.test(); 
		test2(); // void가 값을 리턴 할 수 없기에 호출만 가능
	}
}
