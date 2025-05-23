package java004_array;

//[출력결과]
//1 2  3  4   5
//-  -  -  -   -
//11 12 13 14 15
//-  -   -  -  -

public class Java049_array {
	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		//연산
		for (int row = 0; row < num.length; row++) {
			                    //num[행][열] 값을 입력해야 행,열의 값을 구할 수 있다.
			for (int col = 0; col < num[row].length; col++) {
				//출력
				
				//num[row][col]은 배열 전체를 나타내는 것, row는 행만 나타내는 것이기 때문에 행의 수가 짝수 일 때 0이 되면 값을 출력한다.
				if(row % 2 == 0) {
					System.out.printf("%4d", num[row][col]);
				}else {
					System.out.printf("%4c", '-');
				} 
			} 
			//for문 안에서 출력해야 줄바꿈
			System.out.println();
		}
		

	} // end main()
} // end class
