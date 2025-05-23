package java018_collection.Part10;

//<>안에 뭐가들어가도 상관없다.
public class Box<T> {
	//제너릭 <T(문자 아무거나)>를 줘서 클래스에 영향을 준다
	//<T>의 제너릭타입의 변수를 영향이 가는 변수로 만들 수 있따.
	//<제너릭타입 변수>입력한 값을 메인클래스의 객체값에 변수값을 다르게 설정할 수있다.
	
	
	// 여기서는 T data 로 한것을 메인클래스에서 박스1 객체에 <String>으로 하면 String으로 되고
	// 메인에서 박스2 객체명.Integer로 설정하면 인트로 값이 변한다.
	// 자주사용되지 않음
	
	private T data;

	public Box() {
	}
	
	public Box(T data) {
		this.data = data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
}//end class

//만약에 아래식으로 생성하면 
//Box<String> b = new Box<String>("java");

//Box<Interger> b = new Box<Interger>(10);