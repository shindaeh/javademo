package java010_abstract_interface.part01;

// public class CarAbs {

// abstract를 넣어 추상 클래스로 만들 수 있다.
public abstract class CarAbs {
	int speed;
	String color;
	
	// public void work();
	// 이 메소드를 abstract 메소드를 넣어 추상메소드로 만든다.
	
	// 추상메소드 
	public abstract void work();
	
	//구현된 메소드
	public void display() {
		System.out.printf("speed=%d, color=%s\n", speed, color);
		
	// 메소드를 선언하고 구현해야 하는데 추상메소드를 통하여 선언을 하지 않고 출력할 수 있다.
	}

}
