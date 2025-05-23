package java013_api;

import java.util.Scanner;
// java.utill.Scanner : jdk5에서 추가 되었음
public class Java145_Scanner {
public static void main(String[] args) {
	
	//콘솔창(ctral + F11)으로 데이터를 읽어오기 위해서 콘솔창과 연결
	//읽기전용
	Scanner sc = new Scanner(System.in);
	System.out.print("이름:");
	
	//콘솔창(ctrl + F11)창에 데이터 입력 가능
	//sc.next() : 콘솔창으로부터 데이터를 입력받기 위햇 대기상태
	// 사용자 데이터를 입력하고 Enter를 하면 next()메소드를 읽는다.
	
	//next(홍길동 화이팅)을 적용하면 홍길동만 읽는다.
	//next()은 공백 앞까지만 읽는다. - 띄어쓰기(공백)을 기준
	//nextLine(홍길동 화이팅)을 적용하면 한 라인을 읽는다.. 
	String name = sc.nextLine();
	System.out.print(name);
	
	
}
}
