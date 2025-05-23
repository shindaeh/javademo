package java010_abstract_interface.part02;

// 2. 추상메소드를 사용했기 때문에 class에 abstract를 적용
public abstract class Shape {
	private int width;
	private int height;
	
	public Shape(){
		
	}
//this를 붙일때는 멤버변수를 호출할떄만 가능
	public Shape (int width, int height) {
		this.width = width;
		this.height = height;
	}
	//Shape private로 getter사용
	public int getheight() {
		return height;
	}
	
	
	public int getwidth() {
		return width;
	}
	
	public abstract double getArea(); // 1. 추상메소드
}// end class
