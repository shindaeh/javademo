package java020_thread.part01;

public class User extends Thread {
	public User() {

	}
	
	@Override //run은 therad에 오버라이딩되ㄴ다.
	public void run() {
	   for(int i=0; i<=5; i++)
		   System.out.printf("%s i=%d\n", getName(), i);
	   
	}	
	

}
