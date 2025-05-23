package java013_api;

import static java.lang.Math.*;
//난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
//ex) 0.5689....   =>5.7

// 소수점을 옮겨야함 5.7까지

public class Java141_Math {

	public static void main(String[] args) {
		double nan = random();
		System.out.println(nan);
		
		// 소숫점을 뒤로 2칸 이동하기 위해서 100을 곱한다.
		nan = nan * 100;
		System.out.println(nan);
		
		//int round(1.2F)
		//long round(2.5)
		
		
		//doulbe 값을 long타입으로 변환
		long data = round(nan);
		System.out.println(data);
					//(double) - double로 형변환
					//10을 나눈 이유 - 소수점을 앞으로 1칸이동하기 위해서 10으로 나눈다.
		double val = (double)data/10;
		System.out.println(val);
		
		
		System.out.println((double)round(random() * 100) / 10);
	} //end main()

} //end class
