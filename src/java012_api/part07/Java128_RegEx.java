package java012_api.part07;

//Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
//있는지를 확인한다.
//Pattern.compile(): 여러개의 텍스트를 재사용 가능한 Pattern 
//인스턴스로 컴파일 한다.
//find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
//find(int start) : start 위치 부터 find 
//start() : 매칭되는 패턴의 시작 인덱스 반환 
//start(int group) : group이 매칭되는 시작 인덱스 반환
//end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
//end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
//group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
//groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
//matches() : 패턴이 전체 문자열과 일치하면 True

public class Java128_RegEx {
	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";

		// a 또는 r 이면 '_'로 변경
		for (int i = 0; i < sn.length(); i++) {
			char data = sn.charAt(i);
			if (data == 'a' || data == 'r') {
				sg += "_";
			} else {
				sg += data; // sg = sg + data;
			}
		}

		System.out.println(sg);

		System.out.println("==========Regular Expreeion==========을 이용한 문자 변경");
		// []대괄호는 or를 의미한다.
		// . : 임의 문자 하나
		// * : 0개 이상

		//a이거나 r = [ar]
		//sn변수에 저장된 문자열에서 a이거나 r을 "_"(언더바)로 변경한다.
		
		System.out.println(sn.replaceAll("[ar]", "_"));
		
		// 위와 같은 값을 출려하지만 방식이 아주 간단!

		//replaceAll은 새로운 메모리에서 생성되어 변경된 값을 리턴하기 때문에
		//sn 변수의 값은 변하지 않는다.
		System.out.println(sn);
		// sq변수에 저장된 문자열에서 "@"갯수가 2이상 3이하면 "_"로 대체한다.
		String sq = "java@@@@@@@@@@korea";
		String sa = sq.replaceAll("@{2,3}", "_");
		System.out.println(sa);
		
		// sq변수에 저장된 문자열에서 "@"갯수가 2이면 "_"로 대체한다.
		// "@"가 2개면 "_"가 1개
		sa = sq.replaceAll("@{2}", "_");
		System.out.println(sa);

		// sq변수에 저장된 문자열에서 "@"갯수가 2이상이면 "_"로 대체한다.
		sa = sq.replaceAll("@{2,}", "_");
		System.out.println(sa);
		
		//사이에 @갯수가 1개이상일 때 공백으로 대체한다.
		String sp = "java@@@asdas@@@@dd@@@korea";
		String[] line = sp.split("@{1,}");
		for(int i = 0; i<line.length; i++) {
			System.out.printf("line[%d]=%s\n", i, line[i]);
			
		}
		
		String sl = "java  jsp oracle     mybatis";
		String[] arr =  sl.split("\\s{1,}"); //인도문법에 따라 \\
		for(int i =0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
		// "c:\\" 인도문법
		// "c:/" 리녹스문법
		
		
	}// end main()
}// end class
