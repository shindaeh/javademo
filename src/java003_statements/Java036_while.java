package java003_statements;

/*
 * while(조건식){
 *    반복 수행 문장;
 * }
 * 
 * while문은 조건식을 생략할 수 없다.
 */

public class Java036_while {
	public static void main(String[] args) {
//		for(int i = 1; i<=5; i++) {
//			System.out.println(i);
//		}
		
		//while 문은 변수(int = N)를 먼저 선언 후 진행
		int i = 1;
		while(i <= 5) {
//			System.out.println(i);
//			i++;
			System.out.println(i++); // 위에 2줄과 같은 식
		}
		
	}// end mian()

}// end class
