package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java164_exception {
public static void main(String[] args) {
File file = new File("sample.txt");
System.out.println(file);

FileReader fr = null;

try {
	//file의 위치는 현재작업하는 패키지의 프로젝트에 넣어야함 (가장 최상위)
	fr = new FileReader(file);
	//Unhandled exception type FileNotFoundException
	//반드시 try~catch~finally(예외처리)를 한다.
System.out.println((char)fr.read()); // IOException
} catch (IOException e) {
	e.printStackTrace();
}

}//end main()
}//end class
