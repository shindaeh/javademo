package java015_exception;

public class Java160_exception {

	public static void main(String[] args) {
		int [] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
		// num 인덱스가 3까지 생성되었지만 4라는 초과범위가 생겨서 num이 관리할 수 없다.
		// num[4]의 인덱스에는 불확실한 값이 있지만 java와 같은 객체지향 프로그램에서는 정확한값만 처리하기 때문에 num[4]를 처리하지 않는다. [error발생]
		// 정확한 값만 처리할수 있도록 exception[예외처리]을 제공
		// exception이 발생이 되면 프로그램이 정상적인 종료가 안되므로 이를 해결하기 위해서 예외처리를 제공해주고 있다.
		try {
		num[4] = 20; 
		System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		
	}//end main()

}//end class
