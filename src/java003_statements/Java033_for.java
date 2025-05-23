package java003_statements;
/* 
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5   
 */


public class Java033_for {
	public static void main(String[] args) {
		
		//int data ; // 1. data 메모리 할당 후
		
		for(int row=1; row<=4; row++) {
			//data = 1; // 2. data 값을 for문 안에서 설정
			for (int col=1; col<=5; col++) {
				//System.out.printf("%4d", data++);
				System.out.printf("%4d", col); // 주석처리 한 식과 같은 결과
			}
			System.out.print("\n");
		}
		
	} // end main()
} // end class
