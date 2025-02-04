package p0204;

class Gf{
	String name = "할아버지";
}
class Mother extends Gf{
	int money = 100000;
	int age;
	void test() {
		System.out.println("난 엄마 테스트");
	}
}
public class Extends extends Mother{
	
	public static void main(String[] args) {
		Extends e = new Extends();
		e.test();
		System.out.println(e.age);
		System.out.println(e.money);
		System.out.println(e.name);
	}
}
