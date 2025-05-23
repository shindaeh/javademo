package java009_inheritance.part06;

public class DogOver extends PetOver {
	public DogOver() {
		
	}
	//생성자 밖에서 실행
	//move + ctrl + spacebar + 
	
	@Override
	//하위호환자는 상위호환자보다 범위가 넓어야한다 상위호환자가 private면 보다 높은 상위 호환자여야함.
	//보기는 상위호환자(부모)가 public이기 떄문에 보다 큰 범위가 없어 public으로 실행
	//오버라이드를 통해 상속은 받으나 결과값을 다르게 출력할 수 있다
	//오버라이딩 하기 위해서 상속이 되어야 한다.(조건)
	public void move() {
		System.out.println("서브클래스() : 강아지가 걸어갑니다.");
	}
	
} // end class

