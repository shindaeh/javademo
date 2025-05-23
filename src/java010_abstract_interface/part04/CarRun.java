package java010_abstract_interface.part04;

// Class -> interface로 변경
// 변수에 final을 선언하면 사용한다.

public interface CarRun {

	int carCount = 5;
	// 필요에 의해서 interface를 사용하면 반드시 변수에 값을 정해야한다.
	// 기존 class에선 int caf Count;만 선언해도 public static final으로 자동 출력 되었다. 
 
	//public CarRun() {}
	//생성자를 가질 수 없다.
	
	//static {}
	//sttic{}을 가질 수 없다.
	
	void prn(); // public abstract 생략
	
	class Sun{
		public Sun() {
			System.out.println("Sun constructor");
		}
	}
	
	//Java8부터 default 가능
	//구현이 된 메서드를 사용 할 수 있다.
	default void call() {
		System.out.println("CarRun call");
	}
	
	//Java8부터 static 가능
	//static을 붙여서 사용 가능 - 메서드를 직접 구현,호출해서 사용 가능하다.
	static void display() {
		System.out.println("display");
	}
	
} // end class
