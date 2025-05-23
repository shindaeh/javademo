package java009_inheritance.part01;

public class Father { /* extends Object */
	int a = 3;
	//private는 외부접근 불가능
	private int c = 10;
	
	public Father() {
		
	}
	public void display() {
		System.out.println("a=" + a);
		System.out.println("c=" + c);
		//같은 클래스 안에있기 때문에 private가 출력이 된다.
		//c는 Father클래스 에서만 수정 가능하다.
	}
}// end class
