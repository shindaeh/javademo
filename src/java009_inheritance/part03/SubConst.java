package java009_inheritance.part03;

// 부모 클래스에 int x, int y값을 부여했기 때문에 중복으로 하지 않는다.
public class SubConst extends SuperConst { 
	
	public SubConst(int x, int y) { // 2
		super(x,y); // 3
		// 인자값이 없는 생성자를 호출(아규먼트가 없다)
		// 매개변수가 없는 생성자
		// public SuperConst() {} - 부모 클래스에 생성자가 있어야 super(); 실행
		// 상위 생성자의 값을 확인하고 호출하기
	} // 9
} //end SubConst 
