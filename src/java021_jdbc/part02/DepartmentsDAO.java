package java021_jdbc.part02;

//저장된 값을 호출 

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java021_jdbc.template.JdbcTemplate;

//전방에 접근하는 데이터베이스
//DAO : Data Access Object
public class DepartmentsDAO {

		private static DepartmentsDAO dao = new DepartmentsDAO();
		
		private DepartmentsDAO() {
			
		}
		//외부에서 객체생성없이 자원을 생성할 수 있도록 static을 붙인것
		// DAO를 private로 만들엇기 떄문에 싱글톤패턴을이용해서 외부에서 호출하기 위해서
		// static이 선언되어있어야 한다.
		// private dao있는거 외부에서 뽑으려면 겟인스턴스로 리턴값을 만들어야함
		public static DepartmentsDAO getInstance() {
			return dao;
		}
		
		public List<DepartmentsDTO> getListMethod(Connection conn){
			List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
			Statement stmt = null;
			ResultSet rs = null;
			
			try {
				stmt = conn.createStatement();
				String sql = "SELECT * FROM departments ORDER BY department_id";
				rs = stmt.executeQuery(sql);
				//각행에 있는것을 dto에 담아 값 변환 , 최종데이터가 여러개인데 하나만 보낼 수 있으니까 다적는거
				while(rs.next()) {
					// 오라클의 SELECT * FROM departments ORDER BY department_id 1번행(1)부터 읽어낸다.
					DepartmentsDTO dto = new DepartmentsDTO();
					dto.setDepartment_id(rs.getInt("department_id"));
					dto.setDepatmnent_name(rs.getNString("department_name"));
					dto.setManager_id(rs.getInt("manager_id"));
					dto.setLocation_id(rs.getInt("location_id"));
					aList.add(dto);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(rs);
				JdbcTemplate.close(stmt);
			}
			return aList;
		}
}//end class
