package java018_collection.part17;

public class Sort {
	public static void main(String[] args) {
		String a = "ABCawser24";
		String b = "ACB";
		String c = "ABC";
		String d = "ABC";
		String e = "ab";
		
		System.out.println(a.compareTo(b));//7
		System.out.println(b.compareTo(d));//0
		System.out.println(b.compareTo(e)); //-32 (A-a)
		System.out.println(b.compareTo(d)); // 32 (a-A)
	} //end main()

} // end class
