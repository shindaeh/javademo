package java001_basic;

public class Java004_casting {
	
	public static void main(String[] args) {
		byte bNum = 127; // Num 헝가리안 표기법,-128 ~ 127 , 128초과시 인식 실패_인트로 적용
		short sNum = 32767; // -32,768 ~ 32767 
		int iNum = 2147483647; // -2,147,483,648 ~ 2,147,483,647 주석에는 ,(콤마)가능하지만 실제로 적용시에는 콤마 제거
		long lNum = 6L; // L or l , -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F; // F or f 
		double dNum = 4.5;
		char cData = 'a';
		
		System.out.println("bNum=" + bNum);
		System.out.println("sNum=" + sNum);
		System.out.println("iNum=" + iNum);
		System.out.println("lNum=" + lNum);
		System.out.println("fNum=" + fNum);
		System.out.println("dnum=" + dNum);
		System.out.println("cData=" + cData);
		
		//형변환(casting)
		// 1. 묵시적(자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		// 2. 명시적(강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		
		float tNum = (float)2.6; // 강제 형변환 예시,강제 형변환 double => float
		System.out.println("tNum=" + tNum);
		
		int kNum = 128;
		//데이터 손실이 발생되는 경우
		byte data = (byte)kNum; //-128 ~ 127
		System.out.println("kNum=" + data);
		
	}
}
