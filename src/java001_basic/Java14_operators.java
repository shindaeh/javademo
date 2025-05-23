package java001_basic;

public class Java14_operators {
	
	public static void main(String[] args) {
		
		int total = 23;
		int record = 5;
		
		// total % record == 0 식이 true이면 total / record 계산해서 res변수에 할당(리턴)한다.
		// total % record == 0 식이 true이면 total / record + 1 계산해서 res 변수에 할당(리턴)한다.
		int res = total % record == 0 ? total / record : total / record + 1;
				System.out.println(res);
		// jumsu >= 80 : 상, jumsu < 80 && jumsu >= 60 : 중, jumsu < 60 : 하
				
				
		int jumsu = 75;
		char check = jumsu >= 80 ? '상' : jumsu >= 60 ? '중' : '하';
		System.out.println(check);
		
		check = jumsu >= 60 ? jumsu >= 80 ? '상' : '중' : '하';
		System.out.println(check);
		
	}// end main
	
}// end class
