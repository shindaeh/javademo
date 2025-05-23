package java018_collection.part07;

import java.util.Enumeration;
import java.util.Hashtable;

//Hashtable
//1 Map인터페이스 구현해놓은 클래스
//2 Map인터페이스를 구현해 놓은 클래스들은 key, value쌍으로 저장한다.
//3 value을 구현해주는 것은 key 이므로 key은 중복을 허용하지 않는다.

public class Java194_Hastable {

	public static void main(String[] args) {
		Hashtable<Integer,String> table = new Hashtable<Integer, String>();
		//table.put(key값,value)
		table.put(10, new String("java"));
		table.put(20, new String("jsp"));
		table.put(30, new String("spring"));
		
		System.out.println(table.size()); // 3
		
		System.out.println(table.get(10)); //key값을 입력
		table.put(10, new String("mysql"));
		System.out.println(table.get(10)); //중복되지않고 나중에 입력한 값(mysql)으로 출력
		
		System.out.println("=======Enumeration==elements=====");
		// elements는 value를 가져온다 -> 여기서는 String
		Enumeration<String> enu = table.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		System.out.println("=======Enumeration==keys()=====");
		//keys() : key값을 가져온다.
		Enumeration<Integer> enuKey = table.keys();
		while(enuKey.hasMoreElements()) {
			//System.out.println(enuKey.nextElement()); // next는 중복사용 불가능 1번만~
			int key = enuKey.nextElement();
			System.out.printf("%d: %s\n", key, table.get(key));
		}
		
	} // end main()

} // end class
