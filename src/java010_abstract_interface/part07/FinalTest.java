package java010_abstract_interface.part07;

public class FinalTest {
	// class에서 final이 선언된 변수는 대문자로 사용하고 초기값을 할당(저장)해야 한다.
	final int CODE = 1;

	public FinalTest() {
		//상수에는 새로운 값을 할당 할 수 없다.
		//CODE = 2;
	}

	void display() {
		System.out.println("FinalTest display");
	}
	//메서드에 적용되면 상속은 가능하지만 오버라이딩은 불가능
	final void process() {
		System.out.println("FinalTest process()");
	}
	
}// end class
