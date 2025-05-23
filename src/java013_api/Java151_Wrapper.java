package java013_api;

import javax.sql.rowset.CachedRowSet;

public class Java151_Wrapper {

	public static void main(String[] args) {
		//char data = '한'; //upper는 한이 그대로 출력
		char data = 'a';
		//대문자를 소문자로, 소문자를 대문자로 변경
		
		if(data >= 'a' && data <='z')
			//기존에는 'a'에서'z'까지 캐릭터값에 -32(대문자-소문자)를 해서 정수값을 추출된것을 char타입으로 변환하여 하였다.
			System.out.println((char)(data-32));

		//class.method(메모리) 형식
		System.out.println(Character.isLowerCase(data)); //소문자?인지 아닌지를 확인 , true or flase
		//데이터값이 소문자가 아니어도 데이터값은 출력된다. Ex)한을 데이터값에 넣는다면 한이 출력
		System.out.println(Character.toUpperCase(data)); //대문자로 변경
		System.out.println(Character.isUpperCase(data));//대문자?인지 아닌지를 확인 , true or flase
		System.out.println(Character.toLowerCase(data));//소문자로 변경
		
		System.out.println(Character.isDigit(data)); //소문자?인지 아닌지를 확인 , true or flase
		System.out.println(Character.isAlphabetic(data)); //알파벳?인지 아닌지를 확인 , true or flase

	} // end main()

} //end class
