package java007_class.part01;

public class Goods {
	String name; // 상품명
	int price; // 가격
	int numberOfStock;
	int sold;
	
	//Ctrl + 스페이스 누르면 문장 자동완성으로 공백 생성자 추가
	public Goods() {
	}

	// 오른쪽 클릭 + Source + Generate Constructor using fields (아래에쉬 위로 3번쨰)
	// 멤버 변수 한번에 생성 가능
	
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	// tostring을 사용하는 이유 콘솔창에 출력은 안하고 값을 자리에 저장
	public String toString() {
						//-14_14자리수를 왼쪽 정렬 한다.(기본이 오른쪽 정렬이기 때문에 왼쪽으로 정렬하기 위해)									 // num입력 후 Ctrl+스페이스바 누르면 자동 완성 가능
		return String.format("%-14s %8d %5d %5d", name, price, numberOfStock, sold);
	}
}//end class
