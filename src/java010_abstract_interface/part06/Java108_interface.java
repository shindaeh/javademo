package java010_abstract_interface.part06;
//-(private) +(public) *(protected)
//class와 interface를 이용하여 성적처리

//인터페이스명 : Score
//+sol:int  (초기값:20)
//+getScore():int

//인터페이스명 : Print
//+toPaint():String

//클래스명 : User
// -표시는 private으로 작성하라는 표시
//-name:String
// +표시는 public으로 작성하라는 표시
//+User()
//+User(name:String)
// toString 메서드를 요구한다.
//+toString():String

//클래스명 : UserTest에 위에서 정의한 클래스,인터페이스 상속받음
//[출력화면]
//이름 : 홍길동
//점수 : 60점


public class Java108_interface {
	public static void main(String[] args) {
		UserTest ut = new UserTest("홍길동", 3);
		System.out.println(ut.toPaint());
		
	} //end main()

} //end class
