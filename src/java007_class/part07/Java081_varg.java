package java007_class.part07;

public class Java081_varg {
	public static void main(String[] args) {
		CountVarg cvar = new CountVarg();
		cvar.addvalue(1,2);
		cvar.addvalue(2, 3, 9);
		cvar.addvalue(1, 5, 2, 4, 9);
		cvar.addvalue("홍길동", 2, 5, 7);
	} // end main()
} // end class
