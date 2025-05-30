package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

//DAO : Data Access Object
//데이터 베이스에 접근하는 객체
public class MemDAO {
	private MemDAO() {
	}

	private static MemDAO dao = new MemDAO();

	public static MemDAO getInstance() {
		return dao;
	}
	   // Delete,insert,delete,update는 - 갯수라서 int로 만듦 
	public int getDeleteMethod(Connection conn, int num){
		int chk = 0;
		PreparedStatement pstmt = null;
		
		
		
		try {
			String sql = "DELETE FROM mem  WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num); // 매개변수값 확인하기
			chk = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}
	
	public int getUpdateMethod(Connection conn, HashMap<String ,Object> hMap) {
		int chk = 0;	
		PreparedStatement pstmt = null;

		// mem -> where의 num이 ? 일때 name , age ,loc를 수정하라.

		try {
			String sql = "UPDATE mem SET name=?, age=?, loc=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,(String)hMap.get("name"));
			pstmt.setInt(2,(int)hMap.get("age"));
			pstmt.setString(3, (String)hMap.get("loc"));
			pstmt.setInt(4, (int)hMap.get("num"));
			chk = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		return chk;
	}

//삽입(insert)insert,delete,update는 - 갯수라서 int로 만들었따
	public int getInsertMethod(Connection conn, MemDTO dto) {
		int chk = 0;
		PreparedStatement pstmt = null;

		try {
			// num은 sequence로 해놧기 때문에 ?로 작성하지 않고 mem_num_seq.nextval작성했다.
			// 첫번째 인덱스(?)가 name으로 2번째는 age, 3번쨰는 loc에 들어가게 해줘야 한다.
			String sql = "INSERT INTO mem(num, name, age, loc) VALUES (mem_num_seq.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			// 1,2,3은 ?의 순서를 말하는 것이다.
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			// insert,delete,update는 executeUpdate사용
			chk = pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}

		return chk;
	} // end getInsertMethod

	// 전체 데이터를 가져오는 법
	public List<MemDTO> getLisMthod(Connection conn) {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM mem ORDER BY num DESC";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				// 각각 다른 값이 저장되어야 하기 때문에 while문 안에서 객체생성
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
		}

		return aList;
	} // end getLisMthod()
}// end class
