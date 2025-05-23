package java004_array;

public class Java039_array {

	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;

		//자바에서는 같은 데이터 타입끼리 배열로 묶을 수 있다.
		int[] arr; // int[] 배열선언
		//new키워드를 이용해서 배열생성
		// 각 요소(elment)마다 인덱스(index)가 0부터 생성된다. 
		arr = new int[3]; 
		
		// int[] arr = new int[3];
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;
		
		System.out.printf("arr[0]=%d\n", arr[0]);
		System.out.printf("arr[1]=%d\n", arr[1]);
		System.out.printf("arr[2]=%d\n", arr[2]);
		
		System.out.println("배열의 크기:" + arr.length);
		
		for(int index = 0; 1 < arr.length; index++) {
			System.out.printf("arr[%d]=]dn", index, arr[index]);
		}
	}// end main()

}// end class
