package java010_abstract_interface.part07;

public class UserFinal extends FinalTest {

	public UserFinal() {
		
	}
	
	
	@Override
	void display() {
		System.out.println("UserFinal display");
	}
	
	//부모클래스에서 작성된 메서드를 자식 클래스로 상속할 수 없다.
	//Cannot override the final method from FinalTest
	//void process() {}
	
}//end class
