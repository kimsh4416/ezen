package p0206;

class Test2{
	public int toInt() { // 메서드에 {}가 있다면 정의 없다면 호출
		return 1;
	}
	
	public String toString() {
		return "abc";
	}
}

public class StringTest2 extends Test2{
	
	public static void main(String[] args) {
		StringTest2 st = new StringTest2();
		int num = st.toInt();
		System.out.println(num); //1
		
		String str = st.toString(); 
		System.out.println(str); //abc
		
		Object o = new StringTest2();
		String objStr = o.toString(); // 원래 toString 으로 인해 StringTest2의 주소값이 나와야 하는데 Test2 상속 받았기에 8번라인의 toString 값인 abc가 출력.
		System.out.println(objStr); // abc // overriding 되기에 9번 라인의 abc가 출력됨 
	}
}
