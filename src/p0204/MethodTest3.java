package p0204;

public class MethodTest3 {
	int cofeePrice = 1000;
	int getCofee(int money) {
		return money - cofeePrice;
	}
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();
		// getCofee를 2000을 넣고 호출했을때
		// 커피값을 뺀 나머지 잔돈을 출력하는 코딩을 완성하시오.
		int change = mt.getCofee(2000);
		System.out.println("잔돈은 " + change + "원 입니다.");
	}
}
