package java018_collection.part06;

import java.util.HashSet;

public class Java193_HashSet {
public static void main(String[] args) {
	//Hashset은 중복허용안되고, 순서 유지 안된다.(랜덤이라는뜻이아니다.)
	HashSet<Integer> set = new HashSet<Integer>(); //<>값이 같으면 안써도된다.
	set.add(10);
	set.add(20);
	set.add(30);
	
	for(int it : set)
		System.out.println(it);
} //end main()
} //end class
