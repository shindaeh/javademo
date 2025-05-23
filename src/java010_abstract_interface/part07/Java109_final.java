package java010_abstract_interface.part07;

//final
//class : 상속을 할 수 없는 클래스
//method : 오버라이딩을 할 수 없는 메소드
//variable : 상수 (변수에 한번만 대입할 수 있는 값)

public class Java109_final {
	
	
	public static void main(String[] args) {
		//final int ~(대문자) = ?; - ?에 값을 적용해야한다
		final int DATA = 10;
		// 위에 DATA = 10이 상수로 할당 되었기 때문에 아래 DATA = 20;은 적용이 안됨
		//DATA = 20;
		// 상수는 변수에 한번만 적용할 수 있기 때문에 새로운 값을 할당 할 수 없다.
		// 이 클래스에서는 DATA의 변수는 항상 10으로 지정
		
	} // end main()

	
} // end class
