package java012_api.part04;

//protected Object clone() throws CloneNotSupportedException
//Cloneable인터페이스를 상속받아야만 clone()메소드를 호출할 수 있다.
// deep copy하기위해 implements Cloneable 

public class House implements Cloneable{
String name;
int age;
Address address;

public House() {
	
}

public House(String name, int age, Address address) {
	this.name = name;
	this.age = age;
	this.address = address;
}

public House shallowCopy() {
	House house = null;
	//clone은 throws
	//shallow copy(얇은카피)는 주소값으로 영향이 받기 때문에 다른값을 출력하기 위해 deep copy를 사용해야한다.
	//House만 clone을 이용하여 deep copy를 한다.
	try {
		house = (House)super.clone();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	return house;
}
	
	public House deepCopy() {
		House house = null;
		try {
			Address cloneAddress = address.clone();
			house = (House)super.clone();
			house.address=cloneAddress;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
	}
	return house;
	
}// end shallowCopy

}// end class

