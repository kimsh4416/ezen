package p0212;

public class Car {

	private String name;
	private int price;
	private String company;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getCompany() {
		return company;
	}
	public String toString() {
		return name + price + company;
	}
}
