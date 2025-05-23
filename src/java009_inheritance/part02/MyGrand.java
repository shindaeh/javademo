package java009_inheritance.part02;
                      // 상속받는게 없으면 자바의 가상머신(object)을 상속받는다.
public class MyGrand /* extends object */{
public MyGrand () { //2
           	 // 3
	super(); // 수퍼클래스의 생성자 호출
			 // 슈퍼는 부모객체를 의미한다.
	System.out.println("MyGrand"); // 12
} // 13

} //end class
