package java018_collection.part18;

import java.util.Comparator;

public class NameAgeSort implements Comparator<Person> {

	// name 오름차순, age 내림차순
	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().equals(o2.getName()))
			// 비교는 그냥 문법을 외워야한다.
			// Integer.사용하는 이유 인트값이 제공이 안되서 compare로 넣어준다.
			return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge()));
		else
			return o1.getName().compareTo(o2.getName());

	}

}
