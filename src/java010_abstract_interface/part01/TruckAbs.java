package java010_abstract_interface.part01;

//추상메소드가 있을 경우 오류로 마우스를 데면 add...- 클릭 -> 자동 오버라이딩 된다
//이거 다시정리하기...
public class TruckAbs extends CarAbs{
	
	public TruckAbs() {
		
	}

	@Override
	public void work() {
		System.out.println("트럭은 물건을 운반하는데 사용합니다.");
		
	}

	
}
