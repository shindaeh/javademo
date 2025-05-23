package java005_method;

//[출력결과]
//java test
//tset avaj
//java test

public class Java064_method {
public static void main(String[] args) {
	char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
	System.out.println(arr);
	System.out.println(reverse(arr));
	System.out.println(arr);
}//end main()

//리버스를 할때는 앞에 있는 메모리와 다른 이름으로 생성해서 진행 EX : data -> alpa (다른 메모리 생성)
//main의 매개변수 cahar[] arr을 이용하여 reverse(매개변수) 생성 후 결과 출력
public static char[] reverse(char[] data) {
	// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
	char[] alpa = new char[data.length];
	
	for(int i = 0; i < data.length; i++) {
		alpa[i] = data[data.length - 1 - i];
	}
	return alpa;
}//end reverse()
}//end class

