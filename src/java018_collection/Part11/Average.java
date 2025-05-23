package java018_collection.Part11;
// Java_197번은 모든것을 받을 수 잇지만 이경우는 넘버의 경우에만 상속되는걸로 제한을 둔다.
public class Average<T extends Number>{
private T[] list;

public Average() {
}

public Average(T[] list) {
	this.list =list;
}
public double findAverage() {
	double sum = 0.0;
	for ( T data : list)
		sum += data.doubleValue();
	return sum / list.length;
}

}//end class
