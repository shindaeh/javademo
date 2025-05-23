package java015_exception;

//사용자 정의 예외클래스
//Exceprion클래스를 상속받으면 예외클래스가 된다.
public class UserException extends Exception{

	public UserException(String message) {
		super(message);
		
	}
}
