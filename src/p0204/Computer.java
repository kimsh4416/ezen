package p0204;

public class Computer {

	public String cpu;
	public String ram;
	public String ssd;
	public int price;
	
	public String toString() {
		return "pc의 사양은 : " + cpu + " " + ram + " " + ssd + " " + "pc의 가격은 : " + price;
	}
	
	public static void main(String[] args) {
		// cpu i7-13 ram16GB ssd 2T price 1100000
		// 위의 값으로 객체를 만들고 출력했을때 각 값이 나오는 코드를 완성하시오
		
		Computer c = new Computer();
		c.cpu = "i7-13700";
		c.ram = "16GB";
		c.ssd = "2T";
		c.price = 110000;
		
		System.out.println(c);
	}
	
}
