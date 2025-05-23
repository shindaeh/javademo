package java008_static_access.part07;

public class MemberDAO {

	private MemberDAO() {
		
	}
							// new MemberDAO객체생성
							// 하나의 객체를 생성해서 참조하게 한다. (싱글톤 패턴)
							// static이 선언된 메소드에서는 static을 이용해야 한다.
	private static MemberDAO dao = new MemberDAO();
	
	// static은 상위 조건을 들어맞추기 위해 사용됨
	public static MemberDAO getInstance() {
		return dao;
	}
	
	public void display() {
		System.out.println("display");
	}
	
} // end class
