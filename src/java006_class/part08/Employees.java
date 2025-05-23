package java006_class.part08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees() {
	}
	// 값이 1개(name)일 때 생성자 호출을 먼저("보류",3000) 우선 순위
	// 포맷 타입에 맞춰서 스트링 - 스트링 ,인트 -인트 와 같이 타입 - 타입을 맞춰서 작성
	
	public Employees(String name) {
		this("보류", 3000);
		this.name = name;
	}
	
	//오버로딩은 매개변수의 타입과 갯수를 가지고 구분을 하므로 string타입이 1개인 생성자가 2개이면 안된다.
//	사용이 안되는 이유 : 오버로딩 사용 시 같은 타입을 이용하는 것 유의 - 동일 타입 중복 사용 불가능
//	public Employees(String dept) { <-불가능함
//		tins.dept = dept;
//	}
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary =salary;
	}
	
	public Employees(String name, String dept, int salary) { // - 타입과 갯수를 이용
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		
	}
	
	public String toString() {
		return String.format("%s %s %d", name, dept, salary);
	}
} // end class
