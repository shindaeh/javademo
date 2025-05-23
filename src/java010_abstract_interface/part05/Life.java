package java010_abstract_interface.part05;
//인터페이스는 상속(implements)는 다중 상속이 가능하다 ,(쉼표로) 1개씩 나눠서 상속
//class,interface를 같이 상속하려면 반드시 extends를 먼저 사용 후 implements를 사용
//extends ~~~ implements ~~~,~~~,~~~
public class Life extends Animal implements SamplaA, SampleB{

	public Life() {
		
	}
	
	@Override
	public void call() {
		System.out.println("call");
	}
	
	@Override
	public void prn() {
		System.out.println("prn");
	}
	
} // end class
