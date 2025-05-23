package java006_class.part07;

//this : 메모리에 생성된 객체 자신을 의미한다.
//1. this.멤버변수
//2. this.메소드()
//3. this( ) :생성자

public class Java072_this {
	public static void main(String[] args) {
		Product pt = new Product ("s001", "공산품", 4000);
		pt.display();
		
		Product pd = new Product();
		pd.process();
		
	} //end main()

} // end class
