package p0213;

public abstract class Monster {
	public Monster() {
		System.out.println("난 몬스터지");
	}
	public abstract void test(); // 선언만 하려면 추상화 클래스인걸 알려주기 위해 abstract 를 앞에 붙여야한다.
	public void attack() {
		System.out.println("공격");
	}
}

class Randal extends Monster{
	public void test() {
		System.out.println("난 오버라이딩 된 테스트");
	}
}
class AbstractTest{
	public static void main(String[] args) {
		Monster m = new Randal();
		m.test();
	}
}