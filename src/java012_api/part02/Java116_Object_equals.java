package java012_api.part02;
//Object에서 제공된 equals()메소드 객체만 비교가 가능하다.

//Object에서 제공된 equals()메소드 메모리 주소를 비교한다.

public class Java116_Object_equals {
	public static void main(String[] args) {

//		Object obj = new Object();
//		System.out.println(obj.equa));
//		//메모리 객체 비교
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.toString());
		System.out.println(v2.toString());

		//메모리 주소를 비교
		System.out.println(v1 == v2); //--false
		System.out.println(v1.equals(v2)); //--false
		
		System.out.println();
		
		System.out.println("==========");
		// Class는 참조데이터 타입이다.
		// 참조 데이터 타입일때는 주소를 비교한다 
		// java012_api.part02.Member@4517d9a3 (M1)
		// java012_api.part02.Member@372f7a8d (M2)
		// @주소값이 다르기 때문에 (m1==m2)의 값은 false가 출력된다.
		Member m1 = new Member(10);
		Member m2 = new Member(10);
		//--java012_api.part02.Member@4517d9a3
		System.out.println(m1);
		//--java012_api.part02.Member@372f7a8d
		System.out.println(m2);
		System.out.println(m1==m2); //--false
		// equals를 사용하여 m1과 m2안에 있는 정수값이 같기 때문에 true
		// Member 클래스에서 다운캐스팅 발생
		System.out.println(m1.equals(m2)); //--true
		
		System.out.println();
		
		System.out.println("==========");
		//String은 Object를 상속 받앗다.
		String s1 = new String("java");
		String s2 = new String("java");
		
		// toString() : 메모리에 저장된 문자열 리턴하도록 오버라이딩 해준다.
		System.out.println(s1); //--java
		System.out.println(s2.toString());//--java
		// 참조데이터 타입이기 때문에 메모리 주소를 비교한다.(위와 같은 예시)
		System.out.println(s1==s2); //--false
		// 메모리에 저장된 문자열 비교해서 리턴하도록 오버라이딩 해준다.
		System.out.println(s1.equals(s2)); //--true
		
		System.out.println();
		
		System.out.println("==========");
		String s3 = new String("jsp");
		System.out.println(s1==s3);//--false
		System.out.println(s1.equals(s3));//--false
		
	} // end main()
	
} // end class
