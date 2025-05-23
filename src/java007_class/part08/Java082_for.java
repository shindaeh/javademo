package java007_class.part08;

public class Java082_for {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		
		//일반 for
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		System.out.println("=========================");
		
//		개선된 루프 = 확장된 루프 = 개선된 fo문
//		for( 데이터타입 변수 : 배열 or 컬렙션 ) {
//			수행할 문장;
//		}
		
		//주어진 값을 반복문 일 때 위에 식과 같은 값을 나오게 한다.
		for(int element : num) {
			System.out.println(element);
			
		}
} // end main()
} // end class
