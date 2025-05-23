package java008_static_access.part02;

public class Java085_staric {

	public static void main(String[] args) {

//	OrderStatic os = new OrderStatic(); //<-출력 가능
//	OrderStatic os; <-출력 불가능 : new OrderStatic(); 의 생성자를 호출하지 않았기 때문
		System.out.println("OrderStatic.z="+OrderStatic.z);
		System.out.println("OrderStatic.y="+OrderStatic.y); // OrderStatic클래스의 static{}영역의 접근 불가능
//		OrderStatic.process();
//		os.display();
		
		OrderStatic os = new OrderStatic();
		// static 블럭이 앞에 호출되어있기 때문에 중복 호출이 안되는 것을 확인
	} // end main()
} // end class
