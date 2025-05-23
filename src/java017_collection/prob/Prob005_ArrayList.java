package java017_collection.prob;


import java.awt.dnd.Autoscroll;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 /*
       [프로그램 실행결과]
		 *   [MBC]
		 *   4  오로라 공주      MBC   13.0
		 *   [KBS1]
		 *   1  지성이면 감천    KBS1  22.6 
		 *   2  KBS 뉴스 9     KBS1  19.0
		 *   5  인간극장         KBS1  12.4  
		 *   6  KBS 뉴스 7     KBS1  11.6  
		 *   7  KBS 뉴스광장    KBS1  10.4 
		 *   10 가요무대        KBS1  10.2 
		 *   [KBS2]
		 *   3  굿 닥터         KBS2  17.9 
		 *   8  TV소설 은희     KBS2  10.3   
		 *   [SBS]
		 *   8 황금의 제국      SBS   10.3
		 */


public class Prob005_ArrayList {

	public static void main(String[] args) {
		ArrayList<Television> aList=new ArrayList<Television>();
     /*
      * tv.txt파일의 데이터를 ArrayList에 저장하는 프로그램을 구현하시오.
      */
		//정보 경로를 잡기
	  String path =".\\src\\java017_collection\\prob\\tv.txt";
	  //스캐너와 해쉬넥스트라인 이용해서 라인 확인
	  try(Scanner sc = new Scanner(new File(path))){
		  while(sc.hasNextLine()) {
			 //반복문을 이용해서 라인 
			String[] line = sc.nextLine().split(":");
			Television tv = new Television();
			tv.setRank(Integer.parseInt(line[0]));
			//나머지 멤버변수도 변환형식을 확인해서 작성 int - int double - double pase@@@을 이용
		  }
	  }catch(IOException ex){
		  System.out.println(ex.toString());
	  }
	  
		
	}//end main()
	
	public static void prnDisplay(ArrayList<Television> aList, String channel){
		//channel매개변수에 해당하는 프로그램이 출력되도록 구현하시오.
		
	}//end prnDisplay()

}//end class





