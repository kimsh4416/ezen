package p0212;

public class Game {
	
	private String name;
	private int price;
	private String genre;
	
	// getter, setter, toString 만드시오
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getGenre() {
		return genre;
	}
	public String toString() {
		return name + price + genre;
	}
	
}
