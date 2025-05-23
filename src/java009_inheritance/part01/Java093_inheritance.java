package java009_inheritance.part01;

//다른 클래스가 가지고 있는 멤버들을 새로 만들 클래스에서 직접 만들지 않고
//상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있게 만들 기술이다.
//
//상속(inheritance)
//1. 기본 클래스를 재사용해서 새로운 클래스를 정의하는 기능이다.
//2. 두 클래스를 조상과 자손 관계를 맺어준다. (extends)
//3. 상속을 해주는 클래스 : 수퍼클래스(super class), 부모클래스, 기본클래스
//상속을 받는 클래스 : 서브클래스 , 자식클래스, 유도클래스
//4. 자식(손)클래스는 조상의 모든 자원을 상속받는다. ( 생성자, static{} 은 제외)
//5. 자식(손)의 자원은 부모보다 크거가 같아야 한다.
//6. 상속을 할때 사용되는 키워드 : extends
//클래스를 클래스에 상속 : extends(단일상속), 인터페이스에 인터페이스 상속: extends(다중상속)
// 
//class A{}
//class B extends A{}
//
//=> 자식클래스 B extends 부모클래스 A
//
//- A는 B에게 상속한다.
//- B는 A이다. (상속관계의 클래스를 is a 관계라 한다.)
//
//class 도형{}
//class 삼각형 extends 도형{  }
//삼각형은 도형이다.

public class Java093_inheritance {

	public static void main(String[] args) {
		// 포함관계 (has a ~)
		Father father = new Father();
		
		//inhertance -> Father -> Child 상속이 되었기 때문에 child를 출력해도 위에 상속된 father의 a=3이 출력된다.
		//father클래스의 private영역 직접접근 불가능 외(public)에 가능
		Child child = new Child();
		System.out.println(child.a);
		
		//System.out.println(child.c);
		//system.out.println(chld.c); <- inheritance에서 작성해도 출력 불가능
		//c변수-private가 있는 Father 클래스에서 수정해야 값이 출력된다.
		//c변수는 private으로 선언되여 있기 때문에 상속이 안된다.
		
		child.display();
		Sub sub = new Sub();
		System.out.println(sub.a);
		
		
	}// end main()

}// end class
