package java005_method;

public class Java057_method {
	public static void main(String[] args) {  //1
//		int a = 4;
//		int b = 2;
//		int c = 5;
//		데이터 타입이 같을 경우 ,(쉼표)를 사용하여 한 줄로 기입 가능하다.
		int a = 4, b = 2, c = 5;               //2
		System.out.println(hap(a, b, c));     //3  7
		
		// 메소드의  
		// System.out.println(proc(a,b,c));
		int[] num = { 2, 3 };                //8
		System.out.println(plus(num));       //9   15
		
		int[] arr = {2, 6, 4, 8};            //16
		System.out.println(plus(arr));       //17   23
	}// end main()                           //24
	public static void proc(int x, int y, int z) {
		System.out.println(x + y + z);
	}
	public static int hap(int x, int y, int z) {  //4
		return x + y + z;                         //5		
	}// end hap()                                 //6
	public static int plus(int[] arr) {            //10  18
		int sum = 0;                               //11  19
		for (int i = 0; i < arr.length; i++) {     //12  20
			sum += arr[i]; // sum = sum + arr[i];
		}
		return sum;                                 //13  21
	}// end plus()                                  //14  22
}// end class

