package p0212;

import java.util.ArrayList;

public class ListTest4 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.setName("911");
		c1.setPrice(15000);
		c1.setCompany("포르쉐");
		
		Car c2 = new Car();
		
		c2.setName("아반떼N");
		c2.setPrice(4000);
		c2.setCompany("현대");
		
		Car c3 = new Car();
		
		c3.setName("M4");
		c3.setPrice(15000);
		c3.setCompany("BMW");
		
		Car c4 = new Car();
		
		c4.setName("우루스");
		c4.setPrice(24000);
		c4.setCompany("람보르기니");
		
		Car c5 = new Car();
		
		c5.setName("R8");
		c5.setPrice(20000);
		c5.setCompany("아우디");
		
		ArrayList<Car> cars = new ArrayList<>();
		
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		
		
		
		for(Car c: cars) {
			int price = c.getPrice();
			if(price<=4000) {
				System.out.println(c);	
			}	
		}
	}
}
