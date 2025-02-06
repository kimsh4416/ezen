package p0206;

public class StringTest5 {

	public static void main(String[] args) {
		String str = " 우 리 나 라 ";
		int idx = str.indexOf(" "); //앞에서부터 검색해서 index 값 0
		
		System.out.println(idx); // 0
		
		idx = str.lastIndexOf(" "); // 뒤에서부터 검색해서 index 값 8
		System.out.println(idx); // 8
		str = str.trim(); // 앞 뒤 공백을 제거함
		System.out.println(str); // 우 리 나 라
		
		idx = str.indexOf("타"); // -1
		if(str.indexOf("타")!=-1) {
			System.out.println("str에는 타 라는 글자가 있다.");
		}else {
			System.out.println("str에는 타 라는 글자가 없다.");
		}
		
		boolean hasTa = str.contains("타");
		System.out.println(hasTa);
		
	}
}
