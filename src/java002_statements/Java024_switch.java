package java002_statements;

public class Java024_switch {

	public static void main(String[] args) {
		enum Day {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		}
		
		//열거형 변수 = 열거타입,열거상수;
		Day day = Day.MONDAY;
		System.out.println(day);
		
		if(day == Day.MONDAY) {
			System.out.println("월");
		}
		switch(day) {
		case MONDAY : System.out.println("월"); break;
		case TUESDAY : System.out.println("화"); break;
		case WEDNESDAY : System.out.println("수"); break;
		case THURSDAY : System.out.println("목"); break;
		case FRIDAY : System.out.println("금"); break;
		case SATURDAY : System.out.println("토"); break;
		case SUNDAY : System.out.println("일"); break;

		}
	}// end main()

}// end class
