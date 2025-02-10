package p0210.review;

import p0205.MethodTest5;

public class Test2 {

	static void printGugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" X " + i + " = "+(dan*i));
		}
	}
	
	static int plus(int n1, int n2) {
		return n1 + n2;
	}
	
static int money = 100; 
	
	static void saveMoney(int money) {
		Test2.money += money;
	}
	
	int num = 1000;
	void addNum(int num) {
		this.num += num;
	}
	
	public static void main(String[] args) {
		
		printGugudan(5);
		
		int n1 = 1;
		int n2 = 2;
		
		System.out.println(plus(n1,n2));
		
		n1 = 2;
		n2 = 3;
		
		System.out.println(plus(n1,n2));
		
		saveMoney(10);
		System.out.println(Test2.money); // 110
		Test2 t = new Test2();
		t.addNum(10);
		System.out.println(t.num); // 1010
		
	}
}
