package p0213;

public interface Action { 
	
	// interface 에서 메서드의 접근제어자 디폴트값은 public 
	// interface는 메서드 선언만 가능하며 구현은 불가능하다(바디를 만들 수 없다)
	void eat(); // interface에서 메서드의 바디를 넣으면 오류가 발생함
	void play();
	void work();
	
		
	
}
