package java006_class.prob.part01;

public class Auswjr {
	String name;
	int width;
	int height;
	
	int area () {
		return width*height;
	}
	
	void display() {
		System.out.println("메뉴명:" + name);
		System.out.println("가로길이:" + width);
		System.out.println("세로길이:" + height);
		System.out.println("둘레:" + width * height);
	}
}
