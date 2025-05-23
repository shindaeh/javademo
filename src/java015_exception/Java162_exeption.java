package java015_exception;

public class Java162_exeption {
public static void main(String[] args) {
	String data1 = "8";
	String data2 = "2";
	try {
	int x = Integer.parseInt(data1);
	int y = Integer.parseInt(data2);
	//int y = Integer.parseInt(data2); data2 변수가 "a"(문자)일때 //NumberFormatException발생
	int res = x/y;
	System.out.println(res);
	//다중 catch가 가능하다.
	}catch(NumberFormatException ex) {
		System.out.println(ex.toString());
	}catch(ArithmeticException ex) {
		System.out.println(ex.toString());
		//Run에 NumberFor,Arithmetic이 상속이 되어있어 Run만 사용해도 된다.
		//catch 다중사용시 상속관계에 있어서는 부모가 가장 아래에 자식가 가장 위에 있어야 한다.
		//마찬가지로 Exception안에 Run이 상속되어 있어 Run보다 Exception을 아래에서 사용해야한다.
		//exception이 발생할 때마다 값을 찾아보려 할때 사용
	}catch(RuntimeException ex) {
		System.out.println(ex.toString());
	}catch(Exception ex) {
		System.out.println(ex.toString());
	}
	
}//end main()
}//end class
