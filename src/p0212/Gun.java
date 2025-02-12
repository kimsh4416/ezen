package p0212;

public class Gun {
	
	private String name;
	private String type;
	private int range;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	@Override
	public String toString() {
		return "Gun [name=" + name + ", type=" + type + ", range=" + range + "]";
	}
	
	
}
