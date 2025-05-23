package java018_collection.Part11;

public class Java198_User {
public static void main(String[] args) {
	Integer[] it = new Integer[] { 1,5,3,2 };
	Average<Integer> av = new Average<Integer>(it);
	System.out.println(av.findAverage());
	
	Number[] nb = new Number[] {2, 2.5f, 4.5 , 10L};
	Average<Number> ae = new Average<Number>(nb);
	System.out.println(ae.findAverage());
	
	//Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Average<T>
	// 상속할때 Number만 상속되는것으로 되어 사용 불가능
	//Average<String> sn = null; 
	
	
	
} //end main()
} //end class
