package java001_basic;

public class Java08_operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println(a + b); // 산술연산자(더하기)
		System.out.println(a + "는(은) 삼입니다."); // 문자열 연결
		System.out.println("결과=" + a + b);	 // 결과=7
			// "결과=" + a => 결과 (a까지 문자열로 인식)
			// "결과=3" + b => 결과34
			// 위의 수식이 34로 뜨는 이유
		
		System.out.println("결과=" + (a + b)); // 결과=7
			// (a + b) 
		
	}


}
