package java003_statements;

public class Java035_for {
	public static void main(String[] args) {

		go: // label(변수처러 임의로 설정 가능, 콜론을 꼭 찍어야 한다.)
		for (int i = 1; i <= 3; i++) { //(int i = 1; i <= 3; i++(증감식)으로 이동한다.)
			for (int j = 1; j <= 5; j++) {
				System.out.printf("j=%d\n", j);
				if (j == 3) {
					// break;
					// break go; //for문에서 continue을 만나면 현재 수행중인 for문의 증감식으로 이동한다.
					continue go; //for문에서 continue go을 만나면 go라벨이 설정된 for문의 증감식으로 이동한다.
				}

			}
		}

	} // end main
}// end class
