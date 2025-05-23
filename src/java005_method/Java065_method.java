package java005_method;

public class Java065_method {

	public static void main(String[] args) {
		char[] data  = { 'a', 'b', 'c', 'd' };

		for(int i = 0 ; i <data.length; i++) {
			System.out.printf("%c", data[i]);
		}
		
		System.out.println();
		System.out.println(data); //abcd
		
		System.out.print(data + "\n"); // [C@5674cd4d
		System.out.printf("%s", data); // [C@5674cd4d
		
		System.out.println(); 
		
		int[] num = { 1, 2, 3 };
		System.out.println(num); // [I@38af3868
		
	}

}
