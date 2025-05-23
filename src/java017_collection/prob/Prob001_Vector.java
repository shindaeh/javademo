package java017_collection.prob;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/*
 * [문제] : booklist.txt 파일의 데이터를 이용하여 
 *      책 정보 하나당 하나의 Book 객체를 생성하고 생성된 Book 객체들을 
 *      Vector에 담아서 리턴하는 makeBookList() 메서드를 구현하시오.
 *      
 * [실행결과]
 * Java Programming 의 가격 : 25000
 * SQL Fundamentals 의 가격 : 47000
 * JDBC Programming 의 가격 : 30000
 * Servlet Programming 의 가격 : 20000
 * JSP Programming 의 가격 : 21000
 */

public class Prob001_Vector {

	public static void main(String[] args) throws Exception {
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}

	}// end main()

	private static Vector<Book> makeBookList() throws Exception {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
		// 데이터 경로 잡기 .\\src 현재 기준경로에서 src
		// retrun은 한번박에 수행이 안되기 때문에 5개의 값을 한번에 출력하기 위해 vector 컬렉션의 기능을 이용
		Vector<Book> vt = new Vector<Book>();
		// path 변수선언 , vector에 파일(File)안에 값 5개를 담는다.
		String path = ".\\src\\java017_collection\\prob\\booklist.txt";
		// 아규먼트로 파일을 줌
		// scanner에서 hasnextLibe을 이용해서 File 내용에 읽어올 내용이 있는지 확인
		try (Scanner sc = new Scanner(new File(path))) {
			// hasNextline이용 , book File의 라인 1줄씩 반복문
			// while문을 이용해서 반복
			while (sc.hasNextLine()) {
				// split을 이용해서 "/"기준 배열로 나눔
				String[] line = sc.nextLine().split("/");
				// vt 파일안에 배열을 라인 0~3으로 나눠진것을 사용
				// 최종적으로 book으로 리턴
				vt.add(new Book(line[0], line[1], line[2], line[3]));
			}
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}

		return vt;
	}// end makeBookList()

}// end class
