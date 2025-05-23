package java003_statements;

//do{
//반복 수행문장;
//}while(조건식);

public class Java038_dowhile {

	public static void main(String[] args) {
		char chk = 'n';
		
		do {
			System.out.println("고객님 주문하시겠습니까?(y/n)");
		}while(chk == 'y'); // do while 사용 시 while; <-while 뒤에 ; 세미콘 반드시 부착 _ 소괄호로 끝나기 때문에 문장의 끝을 알려주는 ;(세미콘) 사용
		
	} //end main ()

} // end class
