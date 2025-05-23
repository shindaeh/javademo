package java009_inheritance.part02;

public class Java094_inheritance {
	public static void main(String[] args) {
		MyChild child = new MyChild(); // 1
	
	} // end main()
} // end class


// 상속관계에서 가장 마지막 클래스부터 상위로 이해해야할것 같다...
// 부모 -> 자식 -> 부모 -> 자식 -> 부모 -> 오브젝트
// Child자식 <-(상속) Father부모,자식 <-(상속) Grand 부모
// child를 호출 했으니 상위 값인 부모객체값을 먼저 호출
// 부모 -> 자식 순으로 실행(호출)
