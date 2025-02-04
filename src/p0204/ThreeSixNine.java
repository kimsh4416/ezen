package p0204;

public class ThreeSixNine {
	
	public static void main(String[] args) {
		/*
		 * 1부터 100까지 출력하되
		 * 3,6,9 가 들어가면 모두 짝을 출력
		 */
		for(int i=1;i<=100;i++) {
			int n1 = 1%10;
			int n2 = 1/10;
			if((n1!=0 && n1%3==0)||(n2%3==0 && i>10)) {
				System.out.println(i + " : 짝");
			}else {
				System.out.println(i);
			}
		}
	}
}
