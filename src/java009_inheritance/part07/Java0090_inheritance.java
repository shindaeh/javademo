package java009_inheritance.part07;

//다음과 같은 결과가 나오도록 구현하시오.
//(단, main()안의 내용수정과 새로운 Method추가하지마시오)
//
//*** x,y,z에 값채우기***
//10을 넘겨받은 생성자
//10   20   을 넘겨받은 생성자
//10   20   30  을 넘겨받은 생성자
//10   20   30
//합 : 60

public class Java0090_inheritance {
	public static void main(String[] args) {
		SubClass ss = new SubClass(10,20,30); //객체변수 3개 - 멤버변수도 3개라는건 값을 넘겨주겠다는 것
	
		
		// . 데이터값을 사용하여 해당 생성자에 상속된 자식(서브)데이터를 호출할 수 있다.
	} // end main()
} // end class

//데이터 출력 - 최상위 부모 -> 자식으로 위(부모) 아래(자식) 순으로 출력