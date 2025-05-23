package java019_inner.part02;

public class Java208_inner {

	public static void main(String[] args) {
		OuterStatic.call();
		//클래스.메소드로 별도 호출가능
		
		OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
		inner.prn();
	}

}
