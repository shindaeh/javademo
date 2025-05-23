package java006_class.part07;

public class Product {
	String code;
	String pname;
	int cnt;
	
	public Product() {
		this("b001", "식품", 2000);
		System.out.println("매개변수가 없는 생성자");
	}
	
	public Product(String code, String pname, int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}

	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
	
	void process() {
		this.display();
	}
} // end class
