package p0203;

public class ExitTest {
	
	public static void main(String[] args) {
		for(int i=1; i<=10 ; i++) {
			System.out.println(i);
			if(i==5) {
				break; // 반복문에서만 사용가능
				//return; main method 전체종료
			}
		}
		System.out.println("반복문이 종료되었습니다.");
	}
}
