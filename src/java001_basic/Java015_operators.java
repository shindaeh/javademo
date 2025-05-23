package java001_basic;

public class Java015_operators {

	public static void main(String[] args) {
		//대입연산자
		int x = 3;
		int res = 0;
		
		res = 3 + 2;
		System.out.println(res);
		// (+=<-항상 대입연산자가 뒤에 위치)
		// x = x + 1; (x = x + 1;에 서 x = x 는 값이 같아야 한다)
		x += 1; // 표현 방식만 다를 뿐 값은 같다.
		System.out.println(x);
		
		// x = x - 1;
		x -= 1;
		System.out.println(x);
		
		// x = x * 1;
		x *= 1;
		
		// x = x / 1;
		x /= 1;
		System.out.println(x);
	}

}
