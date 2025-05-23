package java012_api.part07;

import java.util.StringJoiner;

//java.lang.String join() 과 java.util.StringJoiner

public class Java127_String {

	public static void main(String[] args) {
		String color = "red,geen,blue";
		String[] arr = color.split(",");
				//,를 기준으로 3개의 배열을 만든다.
		String str=String.join("-", arr);
				System.out.println(str);
				// arr(배열의 값을) "-" 하이푼으로 바꾼다.
				System.out.println(color); // 여전히 ,로 구분되어있다.
				
				//StringJoiner sj = new StringJoiner( "," );
				//위의 방식으로 출력하면 red,geen,blue
				StringJoiner sj = new StringJoiner( "," , "[","]" );
				for(String data : arr)
					sj.add(data);
				//쉼표로 구분하고 [](대괄호)가 생겻다.
				System.out.println(sj);
				//[](대괄호)까지 문자열로 되어출력
				System.out.println(sj.length());
				
				
	} //end main()

} //end class
