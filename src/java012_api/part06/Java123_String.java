package java012_api.part06;

public class Java123_String {
	public static void main(String[] args) {
		String sn = "korea";
		char[] data = reverse(sn);
		System.out.println(sn);
		System.out.println(data);
		System.out.println(sn);
	}// end main()

	//alpa.length(), arr.length = 값은 똑같다.
	public static char[] reverse(String alpa) {
		//alpa매개변수에 저장된 문자열을 reverse한 후 반환하는 프로그램을 구현하시오.
		
		//문자열로 바꾸기 위해서 char(캐릭터)배열로 바꾼다.
		//문자[](배열)로
		char[] arr = new char[alpa.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = alpa.charAt(arr.length - 1 - i);
		}
		
		return arr;
	}// end reverse()

}// end class
