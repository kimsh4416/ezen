package p0214;

public class Switch {
	
	public static void main(String[] args) {
		int age = 20;
		if(age <10) {
			System.out.println("유아");
		}else if(age <20) {
			System.out.println("10대");
		}
		
		switch(age) {
		case 10:
			System.out.println("10살");
			break;
		case 20:
			System.out.println("20살");
			break;
		case 30:
			System.out.println("30살");
			break;
		default :
			System.out.println("노땅");
		}
	}
}
