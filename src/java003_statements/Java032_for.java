package java003_statements;

public class Java032_for {

	public static void main(String[] args) {

//		for (int i = 1; i <= 12; i++) {
//			System.out.printf("%4d", i);
//			if(i % 4 == 0) { // for문 에서 if 조건식을 만족하는 실행문이 1문장 일 때, 중괄호 생략 가능
//				System.out.println("\n"); // System.out.println(); 출력할게 없으면 빈칸으로 남겨도 만족
//			}
//		}
		int data = 1;
		for ( int row = 1; row <= 3; row++ ) { // 행
			for (int col = 1; col <= 4; col++) { // 열
				System.out.printf("%4d", data);
				data = data + 1; // for문 만족 시 다시 for문 반복
			}
			
			System.out.println("\n");
		}
	} // end main()

}// end class

//반복문 사용시 규칙을 찾는 것이 중요하다.