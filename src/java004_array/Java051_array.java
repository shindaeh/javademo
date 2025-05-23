package java004_array;

//[출력결과]
//1  *  3  *  5
//6  *  8  * 10
//11 * 13  * 15
//16 * 18  * 20

public class Java051_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				//출력
				if(col % 2 == 0) {
					System.out.printf("%4d", num[row][col]);
				}else {
					System.out.printf("%4c", '*');
				}
			}
			
			System.out.println();
		}
		
	} // end main()

} // end class
