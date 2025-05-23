package java015_exception;

public class Java161_exception {
public static void main(String[] args) {
	StringBuffer sbuffer = null;
	
	try {
	sbuffer.reverse();
	}catch (NullPointerException ex) {
		sbuffer = new StringBuffer("java");
		sbuffer.reverse();
		System.out.println(sbuffer);
	}
	
} // end main()
}// end class
