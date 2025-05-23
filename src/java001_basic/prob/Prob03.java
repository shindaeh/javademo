package java001_basic.prob;

/*
1  사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
2  만일 [전체]사과의 수가 123개이고 /하나의 바구니에는 10개[단위]의 사과를 담을 수 있다면,
   13개의 바구니가 필요하다
   
3  [실행결과]
    필요한 바구니의 수 : 13
 */
public class Prob03 {

	public static void main(String[] args) {
		 int numOfApple = 123; //사과의 수
	      int sizeOfBucket = 10; //하나의 바구니에 담는 사과수
	      int numOfBucket; //필요한 바구니 수
	      
	      				//123 %[나머지 연산자] 10[10의 단위] ==[같으면 트루,다르면 페일] 0[나머지] ?[조건] 123 /[나누기] + 1[나머지가 1~9가 되던 바구니느 1개가 무조건 필요하기에 +1이 됨]
	      numOfBucket = numOfApple % sizeOfBucket == 0 ? numOfApple / sizeOfBucket : numOfApple / sizeOfBucket + 1;
	      System.out.printf("필요한 바구니의 수 : %d\n", numOfBucket);
	      
	  //여기에 구현하세요.		
     
      
	}//end main()

}//end class

//note
// ?은 조건 , %은 나머지 연산자 , /는 연산자 나누기 , ==[같으면] ?[앞의 조건일 때] 












