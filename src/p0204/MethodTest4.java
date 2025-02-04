package p0204;

public class MethodTest4 {
	int money = 1000;
	
	void saveMoney(int money) {
		this.money += money; // 중복된 메서드 명을 구분하기 위해 this를 사용 4번라인에 money를 지칭함
	}
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		mt.saveMoney(1000);
		System.out.println(mt.money); //2000
		
		MethodTest4 mt1 = new MethodTest4();
		mt1.saveMoney(3000);
		System.out.println(mt1.money); //4000
	}
}
