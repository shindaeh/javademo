package java002_statements;
//  if(조건식){

//if(조건식){
//    수행문장;
// }else{
//    수행문장;
// }
//  }else{
//  if(조건식){
//     수행문장;
//  }else{
//      수행문장;
//  }
//  }

public class Java018_if {
	public static void main(String[] args) {
		boolean member = false; // 회원(true) or 비회원(false)
		//비회원으로 표기해야 할 경우 false; 로 표기
		String grade = "일반"; // 회원등급(VIP, 일반)
		// grade는 회원등급을 구분하는 변수로 사용

		if (member) { //member 가 true 조건(grade)이 일반
			// 회원
			if (grade == "VIP") {
				// 회원이고 등급이 VIP일때
				System.out.printf("고객님은 %s이며 %d%% 적립 했습니다.\n", grade, 30);
			} else {
				System.out.printf("고객님은 %s이며 %d%% 적립 했습니다.\n", grade, 10);
				// 회원이고 회원등급이 일반일때
			}

		} else {
			// 비회원
			System.out.printf("고객님은 %s이며 %d%% 적립 했습니다.\n", "비회원", 0);
		}
		System.out.println("고객님 오늘도 방문해 주셔서 감사합니다.");
	}
}
