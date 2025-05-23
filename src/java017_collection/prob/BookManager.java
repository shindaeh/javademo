package java017_collection.prob;

import java.util.ArrayList;

public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
	int sum = 0;
for(int i =0; i<bookList.size(); i++) {
	//Java Programming", "컴퓨터", 1400 i가 0이면 가져오는 정보
	//값을 가져오고 상위 static int에 있는 bookList값이랑 비교해야 한다.
	BookDTO bookDTO = bookList.get(i);
	//Java Programming", "컴퓨터", 1400 이값에 맞게 가져오는지 확인
	if(bookDTO.getKind().equals(kind))
		sum += bookDTO.getRentalPrice();
}
		return sum;
	}// end getRentalPrice()
}// end class
