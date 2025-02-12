package p0212;

public class Human {
	private String name;
	private int age;
	private String address;
	private double weight;
	/*
	 * 모든 멤버변수는 private으로 선언한다.
	 * 대신 값을 셋팅하고 겟할 수 있는
	 * public get set 메소드를 만든다.
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return "[name="+name +", age="+ age+", adress=" + address + ", weight="+weight+"]";
	}
}

class Execute{
	
	public static void main(String[] args) {
		Human h = new Human();
		// name = 홍길동, age = 30, address = 서울, weight = 70.5
		// 출력
		h.setName("홍길동");
		h.setAge(30);
		h.setAddress("서울");
		h.setWeight(70.5);
		
		System.out.println(h.getName());
		System.out.println(h.getAge());
		System.out.println(h.getAddress());
		System.out.println(h.getWeight());
		
		System.out.println(h);
	}
}
