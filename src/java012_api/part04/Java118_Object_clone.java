package java012_api.part04;

public class Java118_Object_clone {
	public static void main(String[] args) {
		// new Address는 Addess ads = new Address처럼 ads라는 객체를 생성하지 않았기 때문에
		// house라는 객체 안에서 만들어졌기 때문에 객체안에서만 불러올 수있다.
		// 
		House house = new House("홍길동", 30, new Address("서울", "서초동"));
		System.out.printf("%s, %d, %s, %s\n", house.name, house.age, house.address.city, house.address.dong);
	

	//shallow copy(얕은 복사)
	//주소가 복사가 되는 것
	//값을 넘기는곳과 받는 곧이 영향이 간다.
	//name,address 출력값을 다르게 적용하면
	//출력할 때 house값이 변경된다.
	House house2 = house;
	// 주소가 같은것을 확인할 수 있다.
	System.out.println(house2);
	System.out.println(house);
	house2.name="김영희";
	house2.address.city="경기";
	System.out.printf("%s, %d, %s, %s\n", house.name, house.age, house.address.city, house.address.dong);
	
	House houseCopy = house.shallowCopy();
	//System.out.println(houseCopy);
	houseCopy.name = "Steven";
	houseCopy.address.city="제주";
	System.out.printf("%s, %d, %s, %s\n", houseCopy.name, houseCopy.age, houseCopy.address.city, houseCopy.address.dong);
	
	}// end main()
} // end class

//deep copy는 기존이 메모리값을 그대로 복사하나 주소값이 다르다.
//clone을 사용하면 반드시 implements Cloneable 이용해야한다.
//서로 다른 독립체가 되며 값을 바꾸면 결과값이 다르게 출력된다.

//shallow copy는 기존의 메모리값을 그대로 복사하고 주소값디 같다.
//주소값(EX:1,2,0,0)을 바꾸지 않는다면 값(4,4,공백,공백)을 바꾸어도 
//주소값에 이미 (0,0)이 있기 때문에 나머지 결과값이(처럼 4,4,0,0) 같게 출력된다.
// 이것을 각자의 값으로 형식은같지만 각자값을 출력하기 위해 딥카피를 사용