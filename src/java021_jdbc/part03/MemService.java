package java021_jdbc.part03;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

//트랜잭션 처리
public class MemService {
	public MemDAO dao;
	
	public MemService() {
		dao = MemDAO.getInstance();
	}
	
	// 레코드(행)단위를 삭제한다.
	// 고유변호 num을 삭제하기 때문에 int num으로 변수지정
	public int getDelteProcess(int num) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			chk = dao.getDeleteMethod(conn, num); //매개변수 int num
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
			return chk;	
	}//end getDelteProcess
	
	
	
	public int getUpdateProcess(HashMap<String ,Object> hMap ) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection(); //객체값 받아옴
		
		try {
			conn.setAutoCommit(false);
			chk = dao.getUpdateMethod(conn, hMap);
			JdbcTemplate.commit(conn);
					
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		
		return chk;
	}//end getUpdateProcess()
	
	//insert 삽입시 사용
	public int getInsertProcess(MemDTO dto) {
		int chk = 0;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			chk=dao.getInsertMethod(conn, dto);
			JdbcTemplate.commit(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		} finally {
			JdbcTemplate.close(conn);
		}
		
		return chk;
	}//end getInsertProcess
	 
	
	public List<MemDTO> getListProcess(){
		List<MemDTO> aList = null;
		Connection conn = JdbcTemplate.getConnection();
		
		try {
			conn.setAutoCommit(false);
			aList = dao.getLisMthod(conn);
		} catch (SQLException e) {
			JdbcTemplate.commit(conn);
			
			e.printStackTrace();
			JdbcTemplate.rollback(conn);
		}finally {
			JdbcTemplate.close(conn);
		}
		
		return aList;
	}//end getListProcess
} //end MemService
