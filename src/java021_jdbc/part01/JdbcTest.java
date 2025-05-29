package java021_jdbc.part01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	public JdbcTest() {
		
	}
	
	public void process() {
		
		try {
			//1. 드라이버 연동
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB서버 연결
			String url ="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			//System.out.println(conn);
			
			//3. 쿼리문 실행을 위한 Statement 객체를 생성
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행 : SELECT - ResultSet executeQuery(),
			//               UPDATE,INSEDRT,DELETE - (int) executeUpdate() 메소드 고정
			String sql = "SELECT * FROM mem";
			rs = stmt.executeQuery(sql);
			//System.out.println(rs);
			// rs는 oracle에 있는 고수 30 서울 이라는 데이터가 있다.
			
			//5. 쿼리의 결과 출력
			  // rs.next( : 다음에 읽어올 레코드가 있는지 여부를 체크한다.
			  // 이씅면 트루 없으면 펄스 와일문이니까
			while(rs.next()) {
				int num = rs.getInt("num"); //오라클에서 num number이기 때문에 java에서는 int로 불러서 읽어내야한다.
				String name = rs.getString("name"); //오라클에서 name varchar2 이기 때문에 java에서 string으로 불러 읽어내야 한다.
				int age = rs.getInt("age"); // age number
				String loc = rs.getString("loc");
				System.out.printf("%d %s %d %s\n", num, name, age, loc);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6. 모든 자원 종료
			if(rs != null){
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				
			}
			
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}//end process()
	
		
}//end class
