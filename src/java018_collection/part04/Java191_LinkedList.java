package java018_collection.part04;

import java.util.LinkedList;

//Queue(큐)
//1. FIFO (First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
//2. 최근 사용문서, 인쇄작업대기목록, 버퍼

//Queue -> offer로 받는다.
//값을 가져올때는 poll

public class Java191_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> nQueue = new LinkedList<String>();
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		System.out.println(nQueue.size());
		
		
//		System.out.println(nQueue.poll());	
//		System.out.println(nQueue.poll());	
//		System.out.println(nQueue.poll());	
//		//마찬가지로 요소값을 완전히 빼오는거기 때문에 인덱스 사이즈는 0
		//push와 pop과 같은 개념
//		System.out.println(nQueue.size());
//		// 가져올게 없기 때문에 null
//		System.out.println(nQueue.poll());
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
				
		System.out.println(nQueue.size());
	}//end main()

}//end class
