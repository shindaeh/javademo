package java009_inheritance.part03;

//object는 매개변수가 없는 생성자
public class SuperConst {/* entends object*/
	 int x;
	 int y;
	 
	
	 public SuperConst(int x, int y) { // 4
		 super(); // 5
		 this.x = x; // 6 x라는 멤버변수에 값을 할당
		 this.y = y;  // 7 y라는 멤버변수에 값을 할당
	 } // end SuperConst() // 8

}
