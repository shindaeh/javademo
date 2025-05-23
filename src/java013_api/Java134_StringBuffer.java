package java013_api;

public class Java134_StringBuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("java test");
	System.out.println(sb);
	System.out.println(sb.toString());
	
	//4인덱스부터 "jsp"문자열을 삽입한다.
	sb.insert(4,  "jsp");
	System.out.println(sb);
	
	//4인덱스부터 7인덱스 미만의 사이의 문자열을 삭제한다.
	sb.delete(4, 7);
	System.out.println(sb);
	
	//문자열 앞뒤 순서를 변경한다.
	sb.reverse();
	System.out.println(sb);
	
	//String -> StringBuffer -> String
	// 변환값 - 변환값 적용 잘하기
	String data = "mybatis orm";
	StringBuffer sf = new StringBuffer(data);
	sf.reverse(); // 결론적으로는 이게 결과값
	System.out.println(sf);
	String ss = sf.toString();
	System.out.println(ss);
	
	//char[] -> StringBuffer
	char[] arr = {'k','o','r','e','a'};
	//String ss = new String(arr);
	//StringBuffer sk = new StringBuffer(ss);
	//위에 식 2가지를 합친 결과값과 동일하다
	StringBuffer sk = new StringBuffer(new String(arr));
	System.out.println(sk.reverse());
	
	StringBuffer se = new StringBuffer(String.valueOf(arr));
	System.out.println(se.reverse());
	
	//StringBuffer -> String -> char[]
	//String 타입을 toString타입으로 받은 것
	String sp = se.toString();
	char[] val = sp.toCharArray();
	System.out.println(val);
	
	//메소드를 호출했을 때 리턴타입을 알아야 사용할 수 있다
	// 아래 식과같이 . . . 일 경우 (왼쪽에서 오른쪽으로 해석)
	System.out.println(se.toString().toCharArray());
	
	
} // end main()
} // end class
