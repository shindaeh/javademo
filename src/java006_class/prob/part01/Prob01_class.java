package java006_class.prob.part01;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
	//자바피자
	Auswjr jp = new Auswjr();
	jp.name = "자바피자";
	jp.width = 10;
	jp.height = 5;
	System.out.println(jp.area());
	
	
	System.out.printf("%s %d %d %d",jp.name, jp.width, jp.height, jp.area());
	
     jp.display();
     
	}//end main()

}//end class
