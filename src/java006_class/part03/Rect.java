package java006_class.part03;

public class Rect {
	int width;
	int height;
	String color;
	// 넓이
	int area() {
		return width * height;
	} // end area()
	// 둘레
	int grith() {
		return (width + height) * 2;
	}
	
	void display() {
		System.out.println("가로:" +  width);
		System.out.println("세로:" + height);
		System.out.println("색상:" + color);
		System.out.println("넓이:" + area());
		System.out.println("둘레:" + grith());		
	}//end display()
} // end class
