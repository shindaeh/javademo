package java012_api.part06;
/*
 * [출력결과]
 *  java jsp spring
 */
public class Java125_String {

	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		char[] data = stn.toCharArray(); // 1.tocharArrat - 문자하나하나를 char배열로 만듬(데이터가 1개씩 생성되는 것)
		System.out.println(process(data));

	}// end main()
					//2. 위에서 char 배열로 바꿧기 때문에 char로 사용
	public static char[] process(char[] arr) {
		// '_'를 ' '으로 변환후 리턴하는 프로그램을 구현하세요.
          for(int i =0; i< arr.length;i++)
        	  if(arr[i]=='_')
        		  arr[i]= ' ';
		
		return arr;
	}// end process()

}// end class
