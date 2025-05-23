package java009_inheritance.part05;

public class First { /* extends object */
	int a = 10;

//인자값을 받지 않는 매개변수 생성
	public First() {
	}

	protected void display() {
		System.out.println("a=" + a);
	}

	@Override
	public String toString() {
		return String.format("a=" + a);
	}

}// end class
