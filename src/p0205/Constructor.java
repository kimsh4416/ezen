package p0205;

public class Constructor { // 생성자의 조건 데이터타입이 없어야함
	public Constructor() {
		System.out.println("컨스트럭쳐 클래스 메모리를 생성했으니");
		System.out.println("...");
		System.out.println("할일을 다해야 다음으로 넘어감");
	};
	
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c);
	}
}
