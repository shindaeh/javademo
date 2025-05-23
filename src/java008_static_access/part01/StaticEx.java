package java008_static_access.part01;

public class StaticEx {
	int x = 5;
	// new를 생성한 후 사용 가능
	static int y = 10;
	// 클래스 파일의 new 메모리 생성전에 미리 메모리가 생성 되어있다. 라고 이해할 수 있다.
	// 1.static이 선언된 것은 클래스가 로딩 될 떄 method 영역에만 적용
	// 2.static이 선언 되었기 때문에 method영역에서 생성이 되어 main영역에서 바로 사용 가능하다.
	// 위에 두가지 식으로 84번 static을 보면 y의값이 달라진걸 확인 할 수 있다.
	
	public String toString() {
		return String.format("x=%2d y=%2d", x, y);
	}

}
