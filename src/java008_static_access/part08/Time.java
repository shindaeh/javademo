package java008_static_access.part08;
//private를 사용하여 캡슐화 한 것_private는 외부 접근 불가능

//캡슐화(encapsulation) : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법으로
//데이터의 접근 제한을 원칙으로 한다.
//
//캡슐화 정의 방법 // 외부에서 접근이 불가능하여 getter,setter 메서드를 이용하여 접근
//1. 멤버변수의 접근제어자는 private으로 선언한다.
//2. setter메서드의 정의 방법
//   - 접근제어자 public으로 지정한다.
//   - 리턴 타입은 void으로 지정한다.
//   - 메소드명은 set으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
//     private int num; // 멤버변수 private 
//     public void setNum(int num){ //객체변수 명 동일하게 // set으로 시작해서 setter메서드
//             this.num = num;
//     }

//3. getter메서드의 정의 방법
//   - 접근제어자 public으로 지정한다.
//   - 리턴타입은 멤버변수의 데이터 타입과 같게 한다.
//   - 메소드명은 get으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
//     public int getNum() {
//     return num;
//     }

public class Time {
	private int hour;
	private int minute;
	private int second; // 멤버변수

	public int getHour() {
		return hour;
	}
// 중요
// getter,setter 자동
// 오른쪽 마우스 - source - Generate Getters and Setters
// set은 데이터 저장 , get은 데이터 출력
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	//접근제어자는 public
	//데이터타입은 return
	//
	public int getMinute() {
		return minute;
	}
	//return값이 없으면 void로 작성
	//int minute <- 멤버변수와 동일한 매개변수
	//this.멤버변수 = 매개변수
	                      //매개변수
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

} // end class
