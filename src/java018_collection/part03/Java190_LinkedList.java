package java018_collection.part03;

import java.util.LinkedList;

//stack(스택)
//1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
//2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로

public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		//push -> pop
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		//2번째 인덱스 값
		System.out.println(nStack.get(2)); //java
		//전체 인덱스 값
		System.out.println(nStack.size()); //3
		
//		//가장 마지막 인덱스
//		System.out.println(nStack.pop()); //spring
//		System.out.println(nStack.pop()); //jsp
//		System.out.println(nStack.pop()); //java
//		//System.out.println(nStack.pop()); //Exception in thread "main" java.util.NoSuchElementException
		//현재 생성한 nstack에 empty - 비어있으면 가지고 와라 , !을 붙이면 비어있지 않으면 가지고 와라
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
		// 요소 3개를 위에 empty를 통해서 갖고왔기 때문에 nStack에서 요소는 더이상 남지 않아 0개가 됨
		System.out.println(nStack.size()); // 0
		
		
	} //end main()

} //end class
