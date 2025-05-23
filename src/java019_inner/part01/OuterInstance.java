package java019_inner.part01;

//인스턴스 클래스
public class OuterInstance {
	private int num;
	private int data;
	
   public void display() {
	   System.out.println("display");
   }
   
   //클래스 안의 클래스
   public class InnerInstance {
	   int local = 4;
	   public void run() {
		   num = 10;
		   System.out.println(num);
	   }
   }
}
