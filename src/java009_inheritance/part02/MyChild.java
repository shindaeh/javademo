package java009_inheritance.part02;

public class MyChild extends MyFather{
	
	public MyChild() { // 6
		//super가 가장 위로 올라와야 한다.
		super(); // 7
		System.out.println("MyChild"); // 8
		
	} // 9
} // end class
