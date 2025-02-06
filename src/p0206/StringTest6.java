package p0206;

public class StringTest6 {
	
	public static void main(String[] args) {
		String str = "korea";
		System.out.println(str.length()); // 5
		
		str = str.toUpperCase();
		System.out.println(str.toUpperCase()); // KOREA
		
		str = str.toLowerCase();
		System.out.println(str.toLowerCase()); //korea
		
		boolean startK = str.startsWith("K");
		System.out.println(startK); // false
		
		boolean endA = str.endsWith("a");
		System.out.println(endA); // ture
		
		str = "k,o,r,e,a";
		String[] strs = str.split(",");
		for(int i = 0;i<strs.length;i++) {
			System.out.println("strs["+ i + "] = " + strs[i]);
		}
		
		str = "k.o.r.e.a";
		strs = str.split("\\."); // |, . , *
		System.out.println(strs.length);
		
		str = "";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
		
	}
}
