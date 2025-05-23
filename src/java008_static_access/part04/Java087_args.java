package java008_static_access.part04;

// javac -d Java087_args.java
// java - cp . package java008_static_access.part04.Java087_args hello world

// run configuratons - Arguments - Program arguments - hello world 2025(공백은 인덱스)
// Name - 마지막 실행 파일로 지정

// 접근제어자(public) 메모리 사용 범위(한계)를 지정
public class Java087_args {

	public static void main(String[] args) {
		
		//System.out.println(args[0])
		//System.out.println(args[1])
		//아래식과 같다.
		
		for(String data : args) {
		System.out.println(data);
		}

	} 

}
