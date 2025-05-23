package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		//File file = new File("temp");
		// new File("parent/child") parant 폴더 안 child폴더 경로라는 뜻
		// 새로운 파일이나 폴더를 생성했을때 Package Explorer에서 F5(새로고침)
		File file = new File("parent/child");
		System.out.println(file.isDirectory());
		
		if(!file.isDirectory()) {			
			//file.mkdir(); 생성할 폴더가 1개 일때
			file.mkdirs(); //생성할 폴더가 1개 이상일때
			System.out.println("Create folder");
		}
		
		
		
	}//end main()

}//end class
