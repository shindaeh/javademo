package java014_api;

import java.text.SimpleDateFormat;

public class Java154_System {

	public static void main(String[] args) {
		// 하루는 86400초이다
		System.out.println(60 * 60 * 24);

		// currentTimeMillis() : 1970. 1. 1 부터 초단위로
		// 누적한 값을 밀리세컨드라고 한다.
		// 밀리초(Millsecond, js)는 천분의 1초(1/1000)를 의미한다

		long curr = System.currentTimeMillis();
		System.err.println(curr);
		// HH:24 hh:12 a:오전,오후 EEEE금금요일 EEE금
		// MM:월 mm:분
		
		String pattern = "yyyy-MM-dd HH:mm:ss a EEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// long (autoboxing)-> Long (upcasting)-> Object
		String dateTime = sdf.format(curr);
		System.out.println(dateTime);
	} // end main()

} // end class
