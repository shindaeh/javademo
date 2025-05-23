package java003_statements;

/*
 * 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */

public class Java031_for {
	
	public static void main(String[] args) {
		//i++, i = i, i += 1
		for(int i = 1; i <= 10 ; i ++) {
			if (i % 3 != 0) // (i % 3 == 0)3의 배수일때 0으로 떨어지기 때문
			System.out.println(i); // for문 조건으로 다시 되돌아 간다
		}
		
		
	}// end main()
}//end class
