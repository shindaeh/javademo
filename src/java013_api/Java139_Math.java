package java013_api;

import java.util.Arrays;

public class Java139_Math {

	public static void main(String[] args) {
		int[] num = new int[5]; // 1부터 10까지

		for (int i = 0; i < num.length; i++) {
			//난수저장
			//1부터 ~ 10까지
			num[i] = (int) Math.floor(Math.random() * 10) + 1;
			
			//1부터~45까지                                 100은 소수점으로 인한 자리수 이동때문
			//num[i] = ((int) Math.floor(Math.random() * 100) + 1) % 45 + 1;
			
			//2. 중복체크용 for문
			for (int j = 0; j < i; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}// end for j
			}// end for i

		}
		for (int data : num)
			System.out.printf("%4d", data); // 1.중복된 값이 출력 되었을 경우

		//오름차순
		Arrays.sort(num);
		for(int data :num) {
			System.out.printf("%4d", data);
		}
	}// end main()

	
}// end class
