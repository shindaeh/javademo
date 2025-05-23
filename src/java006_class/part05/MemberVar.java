package java006_class.part05;

//멤버변수의 초기값을 생성자를 통해서 전달하지 않으면 JVM에서 멤버변수에 기본값을 할당한다.
public class MemberVar {
	// 멤버변수는 기본값을 제공한다.(JVM)
	byte var_byte; //0
	Short var_short; //0
	int var_int; // 0
	long var_long; // 0L
	
	float var_float; // 0.0F
	double var_double; // 0.0

	boolean var_boolean; // false
	char var_char; // u0000
	
	String var_str; // null
	int[] var_arr; // null
}
