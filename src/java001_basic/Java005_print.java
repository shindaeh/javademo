package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 127; // Num 헝가리안 표기법,-128 ~ 127 , 128초과시 인식 실패_인트로 적용
		short sNum = 32767; // -32,768 ~ 32767 
		int iNum = 2147483647; // -2,147,483,648 ~ 2,147,483,647 주석에는 ,(콤마)가능하지만 실제로 적용시에는 콤마 제거
		long lNum = 6L; // L or l , -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F; // F or f 
		double dNum = 4.5;
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";
		
		// 데이트를 출력하고 줄바꿈을 한다.
		System.out.println(bNum + "," + sNum); // "," - 문자열 연결 사용
		System.out.printf("%d,%d\n", bNum, sNum); // printf - f는 포맷
		
//		  System.out.printf("출력형식", 값1, 값2, 값3...);
//		  출력기호
//		  %d : 정수(byte, short, int, long)
//		  %f : 실수 (float, double)
//		  %b : 논리 (boolean)
//		  %c : 문자 (char)
//		  %s : 문자열 (String)
//		  %% : %
//		  \n : 줄바꿈
//		  \t : 탭
		
		System.out.printf("%d %d %d %d\n", bNum, sNum, iNum, lNum);
		System.out.printf("%5.1f %.1f\n", fNum, dNum); // .1 입력 시 소수점 1번째 자리까지 표시 한다는 듯 .3 입력 시 소수점 3번째 자리까지 표시 , 5.1 - 5는 전체자리 .도 자리수에 포함
		System.out.printf("%c %b %s\n", cData, eNum, sData);
		System.out.printf("%d %% %d = %d\n", 5, 2, 5%2); // 나머지
	
		System.out.printf("%o\n", 19); //8진수로 출력
		System.out.printf("%x\n", 19); //16진수로 출력
		System.out.printf("%s\n", Integer.toBinaryString(19)); //2진수 는 기호로 출력이 불가능하기 때문에 Integer.toBinaryString()이용하여 2진수 출력
		System.out.printf("%5x\n", 19); //오른쪽 정렬
		System.out.printf("%-5x\n", 19); //왼쪽 정렬
		System.out.printf("%05x\n", 19); //값이 없는 자리는 0으로 채움
		
		System.out.print("java"); // print만 이용할 경우 한줄로 출력
		System.out.print("\nprogram"); // \n을 이용하여 줄바꿈 가능
		System.out.println(); // println을 이용한 이유는 위에 라인과 줄바꿈 기능을 이용하여 보이게 출력 - 지울시 위에라인 program과 sss가 같이 붙는다.
		System.out.println("sss");
		
		
	}

}
