package java012_api.part07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//java.lang.String join() 과 java.util.StringJoiner

/*
* 정규화 표현식(Regular Expression)
* 1 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
*    찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
*    작성한 문자열을 말한다.    
*/

public class Java129_RegEx {
	public static void main(String[] args) {
		String sn = "12345";
		String st = "aetwef";
		// Parameters:regex the regular expression to which this string is to be
		// matchedReturns:true
		// if, and only if, this string matches thegiven regular
		// expressionThrows:PatternSyntaxException
		// - if the regular expression's syntax is invalid

		// .*[abcd].*
		// System.out.println(sn.matches(".*[a-z].*")); // false - sn값이 문자열이 아니고 숫자여서
		// [a-zA-Z] // 소문자,대문자 모두
		// $ 특수문자

		// a-zA-Z_*$가 sn변수에 포함되여 있으면 true 아니면 false을 리턴한다.
		// [ ]은 or을 의미한다.
		// . 은 임의의 문자이고 .* 은 임의 문자 여러개를 의미한다.(0개 이상) - (".")(".*")
		System.out.println(sn.matches(".*[a-zA-Z].*$].*")); // false a이거나 b이거나 c이거나 d이거나 하는 문자열
		// sn변수에 숫자 0-9가 포함되어 있으면 true false를 의미한다.
		System.out.println(sn.matches(".*[0123456789].*")); // true 0~9 는 sn의 1~5의 값 해당 true
		System.out.println(sn.matches(".*[0-9].*")); // 0-9는 0123456789와 같은 뜻
		// \d \n [](대괄호)값을 문자열로 표현 - \\d
		//\\d는 정규표현식에서 숫자를 의미하지만,Java 문자열 안에서는 \\를 한 번 더 써야 해요. "\\d" → 정규표현식에서 \d 그래서 전체적으로 [\\d]라고 씀
		System.out.println(sn.matches(".*[\\d].*"));
		
		
		// 배열값이 1개 일때는 []제거 해도 true
		System.out.println(sn.matches(".*\\d.*")); // 

		// [^0123456789]에서 ^은 sn 변수에 숫자 0-9 포함되어 있지 않으면 true 포함되어 있으면 false를 의미한다.
		System.out.println(sn.matches(".*[^0123456789].*"));
		System.out.println(sn.matches(".*[^0-9].*"));
		// 대문자 사용
		System.out.println(sn.matches(".*[\\D].*"));
		System.out.println(sn.matches(".*\\D.*"));

		String sb = "bscba5";
		// sb변수에 저장된 값이 2로 시작되면 true 아니면 false로 리턴한다.
		System.out.println(sb.matches("2.*")); // false

		// sb변수에 저장된 값이 2로 시작해서 5로 끝나면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*5")); // false

		// sb변수에 저장된 값이 a이거나 b로 시작하고, 임의의 문자 5개가 오면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{5}")); // true

		System.out.println("==========pattern==========");
		
		String input = "3a4bsfa";
		System.out.println(input.matches("\\d"));
		
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		System.out.println(mc);
		//mc.find(인덱스) mc변수의 N번째 인덱스부터 검색을 시작한다.
		//mc.find() : 현재 작업위부터 검색을 시작한다.
		//현재기준으로는 0인덱스
		System.out.printf("%b %s\n", mc.find(), mc.group());
		
		// \\d = 숫자
		//mc.find(0) : 0인덱스부터 검색을 시잔한다. 그래서 처음으로 일치한 3을 리턴한다.
		System.out.printf("%b %s\n", mc.find(0), mc.group());
		//mc.find(1) : 1인덱스부터 검색을 시잔한다. 그래서 처음으로 일치한 3을 리턴한다.
		System.out.printf("%b %s\n", mc.find(1), mc.group());
		//mc.find(2) : 2인덱스부터 검색을 시잔한다. 그래서 처음으로 일치한 4를 일치한다.
		System.out.printf("%b %s\n", mc.find(2), mc.group());
		//System.out.printf("%b %s\n", mc.find(3), mc.group());
		
		
		
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);

		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
		System.out.println(mhMatcher);
		
		int i = 1;
		while (mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		}
		
		
	} // end main()
} // end class
