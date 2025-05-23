package java001_basic;

// 증감연산자 : 증가연산자(++), 감소연산자(--)
// 전위연산자 : 증감연산자가 변수 앞에 있을 때
// 후위연산자 : 증감연산자가 변수 뒤에 있을 때
// 증강연산자는 리터널, 상수에서 사용 할 수 없다.

public class Java09_opreators {
	public static void main(String[] args) {
		int x = 3;
		
		// 전위(증가)연산자, 리터널,상수 사용 불가능
		++x; // x = x + 1
		System.out.println("x=" + x); //4
		
		--x; // x = x - 1
		System.out.println("x=" + x); //3
		
		// 후위연산자
		int y = 5;
		y++; // y = y + 1
		System.out.println("y=" + y); //6
		
		y--; // y = y - 1
		System.out.println("y=" + y); //5
		
		// 리터널은 증감연산자를 사용할 수 없다.
		// 10++;
		
		// 상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4; // 상수로 사용하는 문자는 대문자로 작성 ,  변수와 데이터 타입은 나란히 있어야함 (int-변수 NUM-데이터 타입)
		// 상수는 새로운 값을 할당 할 수 없다.
		// NUM = 10;
		// 상수는 증감연산자를 사용 할 수 없다.	
		// NUM++;
		
		System.out.println("NUM=" + NUM);
	}
}
