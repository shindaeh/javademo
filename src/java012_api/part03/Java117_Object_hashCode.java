package java012_api.part03;

//Object의 hashCode( )메소드는 객체의 메모리 주소를 이용해서
//해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴한다.

public class Java117_Object_hashCode {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");

		System.out.println(p1); //--java012_api.part03.Person@7a81197d

		System.out.println(p2); //--java012_api.part03.Person@5ca881b5

		//////////////////////////////////////////
		//이부분은 활용도가 낮기때문에 머리속에 너무 깊숙히 공부말고 이런게 있다고 알아두자!
		//hashCode()메소드는 16진수 값(7a81197d)을
		//10진수 (2055281021)로 리턴해주는 값이다.
		//--2055281021
		System.out.println(p1.hashCode());
		//--1554547125
		System.out.println(p2.hashCode());

		//////////////////////////////////////////
		//system. <- 을 이용하여 identi...을 자동완성
		System.out.println(System.identityHashCode(p1));
	}// end main()

}// end class
