package p0206;

public class StringTest3 {
	
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i==1); //ture
		
		double bl = 1;
		System.out.println(bl); // 1.0
		System.out.println(bl+1); // 2.0
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1); // 안녕
		System.out.println(str2); // 안녕
		System.out.println(str1==str2); // false // str1과 str2가 갖고있는 주소값이 다르기에 false ==은 주소값을 비교함 그렇기에 String은 더블equals을 사용하지 않는다.
		System.out.println(str1.equals(str2)); // ture 
		
		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3==str4); // ture
		
	}
}
