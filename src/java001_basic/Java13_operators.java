package java001_basic;

public class Java13_operators {
	public static void main(String[] args) {
	
		int a = 3; //4
		int b = 5;
		int c = 7;
		
		boolean res;
		
		// && 연산자의 좌변이 false이면 우변은 수행하지 않는다.
		res = (++a > b) && (++b < 3);
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n", a, b, c, res);
		
		int x=4;
		int y=8;
		int z=10;
		
		// || 연산자의 좌변이 true이면 우변은 수행하지 않는다. 
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d, y=%d, z=%d res=%b\n", x, y, z, res);
		
		// && 그리고,값 모두 ,|| 또는,-중 하나 으로 해석
		
		int k = 1;
		int m = 2;
		int n = 3;
		
		/*
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
		 * 산술 > 비교 > 논리 > 조건 > 대입
		 */
		
		// 1) k == 2 => false
		// 2) k == 2 && ++m == 2 => false
		// 3) ++n =>4
		// 4) +n == 4 => true
		// 5) k == 2 && ++m ==2 || ++n == 4 => true
		// 6) res = true
		
		res = k == 2 && ++m == 2 || ++n == 4;
		System.out.println("res=" + res);
		
		k = 1;
		m = 2;
		n = 3;
		
		// 1) --k => 0
		// 2) --k == 2 => false
		// 3) m == 3 => false
		// 4) m-- => 1
		// 5) m-- == 3 => false
		// 6) --k == 2 || m-- == 3 => false
		// 7) res => false
		res = --k == 2 || m-- == 3 && ++n == 4;
		System.out.println("res=" + res);
		
		k = 1;
		m = 2;
		n = 3;
		int p = 1;
		// 1) --k = 0
		// 2) --k == --p1 => true
		// 3) --k == --p || m-- == ++p => true
		// 4) res = true
		res = --k == --p || m-- == ++p && ++n == 4;
		System.out.println("res=" + res);
		System.out.printf("k=%d, m=%d, n=%d, p=%d, res=%b\n", k, m, n, p, res);
}
}
