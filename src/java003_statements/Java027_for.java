package java003_statements;

public class Java027_for {

	public static void main(String[] args) {
	// 누적된 값이 최초로 15이상일때 까지만 반복문을 수행
		
		int sum = 0;
		int i;
			
		for(i = 1;; i++) {
			sum = sum + i;
			System.out.printf("i=%d, sum=%d\n", i, sum); // for문 안에서 결과가 나오는 과정까지 확인 , 단계별로 결과값이 변화하는것을 확인할 때 사용
			if(sum >= 15) {
				break; // 반복문 for문을 강제적으로 빠져나옴
			}
		}
		// System.out.printf("i=%d, sum=%d\n", i, sum);
	}	// for문 밖에서 결과값만 확인

}
