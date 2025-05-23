package java012_api.part06;

//출력결과
//ip:127.0.0.1
//port:8080

public class Java122_String {
public static void main(String[] args) {
	
	String sn = "127.0.0.1:8080";
	
	int index = sn.indexOf(":");
	System.out.println("ip:"+ sn.substring(0, index));
	System.out.println("port:"+ sn.substring(index + 1));
	
	System.out.println("=======================");
			
	String[] data = sn.split(":");
	System.out.printf("ip:"+ data[0]);
	System.out.printf("port:"+ data[1]);
	
}//end main()
}//end class
