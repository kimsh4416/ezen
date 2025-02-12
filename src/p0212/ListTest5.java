package p0212;

import java.util.ArrayList;

public class ListTest5 {
	
	public static void main(String[] args) {
		
		Gun g1 = new Gun();
		
		g1.setName("글록18");
		g1.setType("권총");
		g1.setRange(50);
		
		Gun g2 = new Gun();
		
		g2.setName("바렛M82");
		g2.setType("저격총");
		g2.setRange(1800);
		
		Gun g3 = new Gun();
		
		g3.setName("mp5");
		g3.setType("기관단총");
		g3.setRange(150);
		
		Gun g4 = new Gun();
		
		g4.setName("M4A1");
		g4.setType("자동소총");
		g4.setRange(500);
		
		Gun g5 = new Gun();
		
		g5.setName("AK47");
		g5.setType("자동소총");
		g5.setRange(500);
		
		ArrayList<Gun> guns = new ArrayList<>();
		guns.add(g1);
		guns.add(g2);
		guns.add(g3);
		guns.add(g4);
		guns.add(g5);
		
		for(Gun g: guns) {
			String type = g.getType();
			
			if(g.getRange()>1000) {
			System.out.println(g);
			}
		}
	}
}
