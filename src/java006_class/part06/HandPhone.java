package java006_class.part06;

public class HandPhone {
	String name;
	String number;
	
	public HandPhone() {
		
	}
	
	public HandPhone(String a,String n) {
		name = a;
		number = n;
	}

	void display() {
		System.out.printf("%s %s\n", name, number);
	}
	
} // end class
