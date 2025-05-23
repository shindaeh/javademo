package java007_class.part06;

//오버로딩(overloading)
//1. 단일 클래스에서 같은 이름의 메소드를 여러개 정의 하는 기능이다.
//2. 오버로딩의 조건
// 1) 메소드의 이름이 같아야 한다.
// 2) 매개변수의 갯수 또는 데이터 타입이 달라야 한다.
// 3) 리턴타입은 오버로딩을 구분하는데 사용되지 않는다.


public class Java080_class {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		cal.addValue(2, 7, 5);
		// fleat으로 정의된 메소드가 없으면
		// 상위 데이터 타입을 찾아서 자동 형변환시킨다.
		
		cal.addValue(1.0F, 2.0F);
		cal.addValue(1L, 2L);
	}

}
