package p0206;

class Mother{
	void work() {
		System.out.println("어머님이 일하신다.");
	}
}

public class Overriding2 extends Mother{
	void work() {
		System.out.println("내가 일한다.");
	}
	
	public static void main(String[] args) {
		Overriding2 o = new Overriding2();
		//Overriding2 o2 = new Mother();	
		String str = o.toString();
		o.work(); // 오버라이딩의 work();
		
		Mother m = new Mother();
		m.work(); // 오버라이딩의 work();
		
		Mother m2 = new Overriding2();
		m2.work(); // 오버라이딩의 work();
		
		
	}
	
}
