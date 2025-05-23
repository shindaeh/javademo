package java011_casting.part02;

public class Employee {
	String name;
	String code;
	
 public Employee() {
 }
	public Employee(String name, String code) {
		this.name = name;
		this.code = code;
	}
	
	// to 하고 스페이스바 누르면 자동완성 가능
	@Override
	public String toString() {
		
		return String.format("name:%s code:%s", name, code);
	}
	
	public String pay( ) {
		return String.format("%s님의 급여는 %d입니다.", name, 5000);
	}
	
	
} // end class
