package java014_api;

import java.util.Calendar;

import javax.xml.crypto.Data;

public class Java155_Calendar {
public static void main(String[] args) {
	//Cannot instantiate the type Calendar
	//Calendar은 추상클래스이므로 객체생성을 할 수 없다.
	//Calendar cal = new Calendar();
	
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	// 출력값 중 MONTH=4가 나오는 이유 0의 값이 1월달이기 떄문이다.
	
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int date = cal.get(Calendar.DATE);
	
	//int hour = cal.get(Calendar.HOUR); //hour는 12시간 표현
	int hour = cal.get(Calendar.HOUR_OF_DAY); //HOUR_OF_DAY는 24시간 표현
	int minute = cal.get(Calendar.MINUTE);
			int second = cal.get(Calendar.MINUTE);
	System.out.printf("%d-%d-%d   %d:%d:%d \n", year,month,date,hour,minute,second);
	//현재 달(month)의 마지막 일을 리턴_cal.getActualMaximum(Calendar.DAY_OF_MONTH)
	System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	
	//오늘의 요일 리턴(일요일->1, 토요일 ->7)_cal.get(Calendar.DAY_OF_WEEK)
	//숫자가 출력된다.
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	
	//오늘의 기준으로 5일전의 날짜 지정
	cal.add(Calendar.DATE, -5);
	year = cal.get(Calendar.YEAR);
	month = cal.get(Calendar.MONTH) + 1;
	date = cal.get(Calendar.DATE);
	System.out.printf("%d-%d-%d   %d:%d:%d \n", year,month,date,hour,minute,second);
	
	//현재날자로 초기화
	cal.set(2025, 0,1); //2025,1,1
	year = cal.get(Calendar.YEAR);
	month = cal.get(Calendar.MONTH) + 1;
	date = cal.get(Calendar.DATE);
	System.out.printf("%d-%d-%d   %d:%d:%d \n", year,month,date,hour,minute,second);
	
	//DAY_OF_YEAR class에 설정되어있는 현재까지(오늘까지) 총일수
	System.out.println(cal.get(Calendar.DAY_OF_YEAR));
}//end main()
}//end class
