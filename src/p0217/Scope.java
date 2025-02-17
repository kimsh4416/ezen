package p0217;

public class Scope {
	public Scope() { // class 명과 이름이 같기에 생성자
		System.out.println("1");
	}
	static {
		System.out.println("2"); // 생성자가 실행되기 전에 실행됨
	}
	
	public static void main(String[] args) {
		new Scope();
		System.out.println("3");
	}
}
