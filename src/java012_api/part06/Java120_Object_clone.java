package java012_api.part06;

import java.util.Arrays;

public class Java120_Object_clone {

	public static void main(String[] args) {
		Rect[] rect = new Rect[3];
		rect[0] = new Rect(2, 5);
		rect[1] = new Rect(1, 4);
		rect[2] = new Rect(3, 2);

		// Rect[] copy = rect;

		Rect[] copy = rect.clone();
		System.out.println(rect);
		System.out.println(copy);
		System.out.printf("%d %d\n", rect[0].width, rect[0].height);
		System.out.printf("%d %d\n", copy[0].width, copy[0].height);
		// System.out.println(Arrays.toString(rect));
		// System.out.println(Arrays.toString(copy));

		System.out.println("=======================");
		// 새로생성하는 것 말고 기존값에서 변경하기
		// copy[0] = new Rect(100, 200); //이건 새로생성한거

		// copy[0].width = 100;
		// copy[0].height = 300;
		// System.out.printf("%d %d\n", rect[0].width, rect[0].height);
		// System.out.printf("%d %d\n", copy[0].width, copy[0].height);
		// 위의 기입은 모든 변화값이 동일하게 변경되어 출력

		System.out.println("=======================");

		// 0번째 클론[Rect]을 호출
		// 클론을 통하여 각원본의 배열값을 변경하면 원본에는 영향을 안간다.
		for (int i = 0; i < copy.length; i++)
			copy[i] = rect[i].clone();
		copy[0].width = 100;
		copy[0].height = 300;
		System.out.printf("%d %d\n", rect[0].width, rect[0].height);
		System.out.printf("%d %d\n", copy[0].width, copy[0].height);
	}
}
