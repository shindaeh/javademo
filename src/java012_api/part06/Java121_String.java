package java012_api.part06;

public class Java121_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");

		// 문자열 길이가 'k''o''R'...같이 1단어가 1개의 칸을 차지하여 길이는 14값이 나온다.
		System.out.println("문자열 길이: " + str.length());
		// str.toUpperCase()를 통하여 소문자를 대문자로 전부 변경가능하다.
		System.out.println("대문자:" + str.toUpperCase());
		// str.toLowerCase()를 통하요 대문자를 소문자로 전부 변경가능하다.
		System.out.println("소문자:" + str.toLowerCase());
		// 현재 메모리에 저장된 N번째 인덱스를 리턴한다.
		System.out.println("문자:" + str.charAt(0));// -- K
		System.out.println("문자:" + str.charAt(5)); // --,
		// 유닛코드(대문자 소문자 +,-32차이나는거 생각) 97번인 A값을 찾아서 출력한다.
		System.out.println("인덱스:" + str.indexOf('a'));
		// 현재 메모리에 저장된 5번째 인덱스에서 출발하여 'a'를 찾아내서 결과 출력
		System.out.println("인덱스:" + str.indexOf(97));
		// 5에서 뒤에있는 a까지 6칸 이동하여 결과값은 11
		System.out.println("인덱스:" + str.indexOf('a', 5)); // -- 11
		// 위에식과 동일한 형식
		System.out.println("인덱스:" + str.indexOf(97, 5));
		
		// 문자열의 가장 앞에있는 인덱스 값으로 나온다.
		System.out.println("인덱스:" + str.indexOf("jsp")); // -- 6
		// 찾고자 하는 문자열이 없으면 -1로 리턴된다.
		System.out.println("인덱스:" + str.indexOf("jsp", 7)); // -- -1
		
		// 5번째 인덱스부터 값을 리턴한다.
		System.out.println("범위:" + str.substring(5));
		
		// 2번째 인덱스부터 8번째 인덱스 값을 리턴한다.
		System.out.println("범위:" + str.substring(2, 8));
		// 메모리에 저장된 문자열은 ","로 구분해서 문자열 배열로 리턴한다.
		// ,로 인덱스를 구분[분리]하게 되는 것
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++)
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		// 산수연산이 아닌 문자열로 바꿔서 출력
		// 계산하는것이 아닌 문자+문자로 출력되는 것.
		int x = 10;
		int y = 20;
		System.out.printf("x=%d, y=%d, x+y=%d\n", x, y, x + y);
		// valuof메서드는 static이선언된 메서드여서 클래스.valueof가능
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n", s1 + s2);

		char[] data = { '1', '2', '3', '4', '5' };
		// 이때 반드시 char로 해야한다.
		String s3 = String.valueOf(data);
		System.out.printf("s3=%s\n", s3);

		// valueOf(char[] data, int offst, int count)
		String s4 = String.valueOf(data, 2, 3); // 인덱스값이기 때문에 3,4,5
		System.out.printf("s4=%s\n", s4); // -- 3,4,5
		
		//System.out.printf("s5=%s\n" , s5);
		// 인덱스 범위를 벗어나면 오류 발생
		// java.lang.StringIndexOutOfBoundsException: offset 2, count 8, length 5
		//String s5 = String.valueOf(data, 2, 8);
	} // end main()

} // end class
