package java010_abstract_interface.part06;

public class UserTest extends User implements Score, Print{
 
	int s;
	
	public UserTest(){
	}
 
 
	public UserTest(String name, int s) {
		super(name);
		//this.s int s; 변수만 적용 위에 ints 매개변수는 적용 x
		this.s = s;
	}
 
	@Override
	public String toPaint() {
		return String.format("이름: %s\n점수: %d\n", toString(), getScore());
	}
	
	@Override
	public int getScore() {
		return s * sol;
	}
} // end class
