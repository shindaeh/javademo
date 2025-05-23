package java014_api;

import java.util.GregorianCalendar;

public class Java158_Calendar {

	public static void main(String[] args) {
int year = 2024;
GregorianCalendar gre = new GregorianCalendar();
System.out.println(gre);

//boolean isLeapYear:윤년 true ,평년 false
String chk = gre.isLeapYear(year) ? "윤년" : "평년";
System.out.printf("%d년도는 %s입니다.\n", year, chk);

	}//end main()

}//end class
