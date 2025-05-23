package java013_api;

import java.util.Random;

public class Java143_Random {
	public static void main(String[] args) {
		// new Random(seed);
		// seed : 고정된 난수값을 구할 때 사용된다.

		Random ran = new Random();
		System.out.println(ran);

		double r1 = ran.nextDouble();
		System.out.println(r1);
		
		int r2 = ran.nextInt();
		System.out.println(r2);
		
		//0부터 10미만 까지의 난수값이 구해진다.
		int r3 = ran.nextInt(10);
		System.out.println(r3);
	} // end main()
} // end class
