package java007_class.part06;

public class Calculator {
	public Calculator() {
	}
	void addValue(int x, int y) {
		System.out.println("int, int");
		System.out.println(x + y);
	}
	void addValue(int x, int y, int z) {
		System.out.println("int, int , int");
		System.out.println(x + y + z);
	}
	
	void addValue (double x, double y) {
		System.out.println("double, double");
		System.out.println( x + y);
	}
	
	void addValue(long x, long y) {
		System.out.println("long , long");
		System.out.println(x + y);
	}
	
} // end class
