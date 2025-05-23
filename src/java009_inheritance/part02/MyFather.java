package java009_inheritance.part02;

public class MyFather extends MyGrand{
	// MyFather() <- 인자 값에 a를 넣는다면
	// MyGrand클래스의 sper() 값에 를 넣어야 MyFather이 실행이된다
public MyFather() { // 4
	super(); // 5
	System.out.println("MyFather"); // 10
} // 11
} // end class