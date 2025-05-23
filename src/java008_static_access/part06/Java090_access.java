package java008_static_access.part06;
//part.05를 part.06에서 사용하는 방법

import java008_static_access.part05.Java088_access;

// import java008_static_access.part05.Java088_access; (입력 하는건 옛날 방식)
							// extends (상속)
public class Java090_access extends Java088_access{

	public static void main(String[] args) {
		Java088_access p = new Java088_access();
		// package가 다른 클래스를 접근할때는 public일때만 가능하다.
		// 그러나 상속관계일때는 protected일때에도 접근이 가능하다.
		
//		System.out.printf("var_private=%d\n", p.var_private);
//		System.out.printf("var_default=%d\n", p.var_default);
//		System.out.printf("var_protected=%d\n", p.var_protected);
		System.out.printf("var_public=%d\n", p.var_public);
				
	
		//1.Java088입력 후 Ctal + 스페이스바 -> 상단에  import 자동입력 (1개만 불러옴)
		// 2.Ctrl + shift + o(알파벳) : 자동import -> 사라짐..?

		
		System.out.println("====== 상속 후 =======");
		Java090_access ps = new Java090_access();
		//System.out.printf("var_private=%d\n", ps.var_private);
		//System.out.printf("var_default=%d\n", ps.var_default);
		// private,default는 패키지가 다르면 상속할 떄 사용 불가능
		System.out.printf("var_protected=%d\n", ps.var_protected);
		System.out.printf("var_public=%d\n", ps.var_public);
		// protected는 패키지가 달라도 상속관계일때 사용 가능
	} // end main()

} // end class


// ==============================================================
//package 패키지명;             package java.lang;
//import 패키지명.클래스;        import java.util.Random;
//import 패키지명.인터페이스;     import java.lang.Seriable;
//
//class 클래스{
//멤버변수;
//static { }
//생성자(){};
//메서드(){};  
//}
//
//package :
//1. 비슷한 작업을 수행하는 클래스 및 인터페이스를 묶어서 사용한다.
//2. open API에서 제공하는 클래스 : 클래스 및 인터페이스 중복을 피하기 위해서 사용한다.   
// domain : www.gov.kr
// package: kr.gov
//
//import : 외부 클래스 및 인터페이스 위치를 JVM에 알려주기 위해서 사용한다.
//System, String등 java.lang패키지에 정의된 자원들을 별도로 import을 안해줘도 된다.
//
//제어자(modifier)
//1.  클래스, 변수, 메서드, 생성자의 선언부에 사용되어 부가적인 의미를 부여한다
//2. 제어자는 크게 접근제어자(access modifier)와 그 외의 제어자로 구분한다.
//3. 하나의 대상에 여러 개의 제어자를 조합해서 사용할 수 있으나, 접근 제어자는 단 하나만 사용할 수 있다.
//  접근제어자 - public, protected, default(=package), private
//  그외제어자 - static, final, abstract, synchronized...
//  public static final int data;
//
//접근제어자(Access Modifier)
//:멤버 또는 클래스에 사용되어, 외부로 부터의 접근을 제한한다.
//
//1. private : 정의된 클래스에서만 접근이 가능하다.
//2. default : 같은 패키지에서만 접근이 가능하다.
//3. protected: 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
//4. public : 접근 제한이 없다.
//
//접근제어자 사용
//class : default, public
//variable, method, constructor : private, default, protected, public
//
//접근제어자 범위
//private < default < protected < public   

