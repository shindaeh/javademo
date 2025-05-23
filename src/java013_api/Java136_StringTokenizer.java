package java013_api;

import java.util.StringTokenizer;

public class Java136_StringTokenizer {
	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자");
		// 문자열의 구분자가 공백일때는 2번째 파라미터값은 생략 할 수 있다.
		// StringTokenizer("java jsp");
		StringTokenizer st = new StringTokenizer("java_jsp", "_");
		// "_"(언더바)를 기준으로 2개의 토큰을 만든다.
		System.out.println(st.countTokens()); // 2
		// java - 앞에  메모리
		// 메모리에 저장된 "java"문자열을 가져오면서 기존 메모리에 저장된 "java" 문자열 메모리를 삭제한다.
		System.out.println(st.nextToken());
		// 남은 토큰 1
		
		System.out.println(st.countTokens());
		// "_"기준으로 뒤에 2메모리(jsp)
		System.out.println(st.nextToken());
		// "_"기준으로 남은 메모리 0
		System.out.println(st.countTokens());
		//System.out.println(st.nextToken()); -	// java.util.NoSuchElementException (값X 출력 오류)
	
		System.out.println("==========countTokens()==========");
		st = new StringTokenizer("java_jsp", "_");
		int count = st.countTokens();
		for(int i =0; i<count; i++)
			System.out.println(st.nextToken());
		
		//has , is로 시작하는 메서드 반환값은 bloolean
		System.out.println("==========hasMoreTokens()==========");
		st = new StringTokenizer("java_jsp", "_");
		//hasMoreTokens()은 메모리에 저장된 토큰이 있으면 true, 없으면 false을 리턴한다.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	} //end main()
	
}// end class
