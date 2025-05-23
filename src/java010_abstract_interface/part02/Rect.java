package java010_abstract_interface.part02;

public class Rect extends Shape{
	public Rect() {
		
	}

	// Shape메인클래스의 12-15라인을 상속받는다.
	public Rect(int width, int height) {
		super(width,height);
	}
	
	//오버라이드-ctrl+space - A아이콘으로 바로 넣기 가능
	@Override
	public double getArea() {
		return getwidth() * getheight();
	}
	
} //end class
