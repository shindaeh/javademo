package java008_static_access.part02;

//class 클래스명 {
//	멤버변수;
//	static {} (<- 괄호는 스테이틱 블럭으로 부른다.)
//	생성자(){}
//	메소드(){}
//}

public class OrderStatic {
	int x; // 객체 멤버변수
	static int y; // 클래스 멤버변수
	static int z; 
	
	// static 블럭이 가자 우선순위 실행 , class에서 main영역에서 한번만 실행 가능
	static {
		y = 5;
		System.out.println("static");
		System.out.println("y=" + y);
	}
	
	//생성자
	public OrderStatic() {
		x = 10;
		System.out.println("contructor");
		System.out.println("x=" + x);
	}
	
	public void display() {
		System.out.println("display");
		// process(); <- 출력 가능 : 아래 static에 이미 메소드 영역에 바이트 코드(메모리)가 저장되어 있기 때문
	}
	
	public static void process() {
		System.out.println("static method");
		System.out.println("display method");
		// display(); 메소드는 생성(new)한 다음에 method area에 바이트코드가 저장된다.
		// process(); 메소는 OrderStatic 클래스는 loader하는 시점에 method area에 바이트코드가 저장된다.
		// process()메소드가 method area에 저장되는 시점이 display()보다 빠르다.
		
		// display(); <- 출력 불가능 : new(class) 메모리 생성된 값이 없기 때문,참조하기 위한 메모리 시점이 중요
		// static영역에 있는 메모리는 먼저 생성이 된다.라고 이해하기
	}
} // end class
