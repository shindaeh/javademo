package java009_inheritance.part05;

public class Second extends First{
	int b = 20;
	
	public Second() {
		
	}
	
	// 부모클래스의 메소드 접근제어자가 protected이므로
	// 자식클래스의 메소드 접근제어자는 protected 또는 public이 가능하다.
	
	@Override
	public void display() {
		System.out.println("b=" + b);
	}
	
	@Override
	public String toString() {
		return String.format("a=%d, b=%d\n",a ,b);
	}
	
	public void superThisMethod() {
		super.display(); // super이기 때문에 부모 클래스(First)의 display호출
		this.display(); // second 클래스의 display호출
	}
	
}// end class
