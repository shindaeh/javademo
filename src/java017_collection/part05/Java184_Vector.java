package java017_collection.part05;

//[프로그램 출력결과]
//kim    56  78   12  146
//hong   46  100  97  243
//park   96  56   88  240

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Java184_Vector {
	public static void main(String[] args) {
		String path = "./src/java017_collection/part05/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);
	}// end main()

	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.
		Vector<Sawon> vt = new Vector<Sawon>();

		
			// sc = new Scanner(new File(fileName));했을경우 오류떠서 마우스 올려두고 예외처리 (s...어쩌고 클릭)
		try (Scanner sc = new Scanner(new File(fileName));) {
			// hasNextLine() - 읽어올 라인,내용이 있는지 확인해주는 것
			while (sc.hasNextLine()) {
				// System.out.println(sc.nextLine());
				// break;
				// :/로 나눌 수 잇기 때문에 split을 이용해서 나눈다
				// Sawon의 객체가 String 타입이기 때문에String 타입을 int로 바꿔야 한다.
				String[] data = sc.nextLine().split("[:/]");
				Sawon sn = new Sawon(data[0],
						Integer.parseInt(data[1]),
						Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				vt.add(sn);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return vt;
	}// end lines()

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
for(Sawon sn : vt) {
	System.out.println(sn.toString());
}
	}// end prnDisplay()

}// end class
