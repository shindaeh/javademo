package java003_statements;

//2개의 주사위를 던졌을때  합계가 5가 되는 경우의 수를 구하시오.
//(1,4),(2,3),(3,2),(4,1)

public class Java034_for {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <=6; i++) { // 첫번쨰 주사위
			for(int j = 1; j <= 6; j++) { // 두번째 주사위
				if(i+j == 5) { // 일때 합이 5가 되는 경우의 수를 조건
			System.out.printf("(%d,%d)", i, j);	
				}
			}
		}
		
	} // end main()

} // end class
