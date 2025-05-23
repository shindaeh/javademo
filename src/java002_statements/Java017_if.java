package java002_statements;

//조건식을 만족할때만 수행할 문장이 있는 경우
//if(조건식) {
// 수행할 문장;
//}

public class Java017_if {

	public static void main(String[] args) {
		int num = 8;
		// if는 조건에 해당되지 않을경우 출력되지 않고 넘어간다.
		// num 의 수를 -8로 바꿀 경우 바로 program end로 넘어간다.
		if(num > 0) {
			System.out.printf("%d는 자연수입니다. \n", num);
		}
		
		System.out.println("program end");
	} //end main
}//end class
