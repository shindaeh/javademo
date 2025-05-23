package java017_collection.part08;

import java.util.ArrayList;

public class Java186_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);
		
	}// end main()

	public static String[] display(ArrayList<String> aList) {
//		String[] stn = new String[aList.size()];
//		for(int i = 0 ; i < stn.length; i++)
//			stn[i] = aList.get(i);
//		return stn;
	
		
		//ArrayList에 toArray를 지원해준다
		//위에 값과 출력결과는 같다.
		String[] stn = new String[aList.size()];
		return aList.toArray(stn);
		
		//마찬가지로 위에 값과 출력값은 같다. stn객체를 생성했냐 안했냐 차이
		//return aList.toArray(new String[aList.size()]);
		
	}// end display()
}// end class
