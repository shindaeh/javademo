package java012_api.part04;

//protected Object clone() throws CloneNotSupportedException
//Cloneable인터페이스를 상속받아야만 clone()메소드를 호출할 수 있다.
//deep copy하기위해 implements Cloneable 

public class Address implements Cloneable{
 String city;
 String dong;
 
 public Address() {
 }
 
 //Address deepCopt를 해준다.
 public Address(String city, String dong) {
	 this.city = city;
	 this.dong = dong;
 }
 
 public Address clone() {
	 Address address = null;
	 
	 try {
		address = (Address)super.clone();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
	 
	 return address;
 }
} // end class
