package java003_statements;

public class Java029_for {
	public static void main(String[] args) {
		
		//1~10까지 합계 - for
		int sum = 0;
		int i;
		
		for(i = 1; i <= 10; i++) {
			sum = sum + i; // sum += i; 와 같은 식
			
		}
				System.out.println("sum="+sum);
		
	}
}
