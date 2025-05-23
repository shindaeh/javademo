package java017_collection.Part02;

public class Java180_List {

	public static void main(String[] args) {
		UserList us = new UserList();
		//append
		us.add(10); // 포인트 현재 위치에 10을 추가한다.
		us.add(20);
		us.add(30);
		us.add(40);
		
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		
		System.out.println("----------insert-----------");
		//insert
		us.add(2,50);
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		System.out.println(us.get(4));
		
		System.out.println("----------remove-----------");
		System.out.println("삭제요소:" + us.remove(2));
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		
		
	} //end main()
} //end class
