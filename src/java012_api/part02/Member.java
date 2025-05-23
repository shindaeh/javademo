package java012_api.part02;

//상속을 지정하지 않으면 자바가상머신속 Object를 자동으로 상속받는다.
public class Member /* extedns Object */ {
	int id;

	public Member() {

	}

	public Member(int id) {
		this.id = id;
	}

	@Override
								//1. obj
	public boolean equals(Object obj) {
		//다운캐스팅
		if(obj instanceof Member)
		return id==((Member)obj).id;
		else
			return false;
	}
}// end class
