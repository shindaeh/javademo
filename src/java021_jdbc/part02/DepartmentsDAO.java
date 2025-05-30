package java021_jdbc.part02;

//저장된 값을 호출 

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		} // end getListMethod()
		
		
		public List<DepartmentsDTO> getSearchMethod(Connection conn, String search){
			List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();
			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
			
				/*	stmt = conn.createStatement();
				//WHERE deaprtment_name LIKE '%"어제(위에)와 차이점
				String sql = "SELECT * FROM departments WHERE department_name LIKE '%" + search+ "%' ORDER BY department_id";
				//쿼리문이 시행되려면  .executeQuery 사용해야한다.
				rs = stmt.executeQuery(sql);
				*/
				
				//위에 식과 쿼리문의 위치가 다르다.
				// ? ='%" + search+ "%'
				// 왼쪽에서 인덱스가 1로 붙는다.
				String sql = "SELECT * FROM departments WHERE department_name LIKE ? ORDER BY department_id";
				pstmt = conn.prepareStatement(sql);
				// 쿼리문의 ?의 데이터 타입이 String타입이기 떄문에 setString
				pstmt.setString(1, "%" + search + "%");
				rs = pstmt.executeQuery();
				
				//"SELECT * FROM departments WHERE deaprtment_name LIKE '%" + search+ "%'";의 결과의 갯수많큼 while문이 작동
				while(rs.next()) {
					//각각 행위의 값을 저장하기 위함
					DepartmentsDTO dto = new DepartmentsDTO();
					dto.setDepartment_id(rs.getInt("department_id"));
					dto.setDepatmnent_name(rs.getString("department_name"));
					dto.setManager_id(rs.getInt("manager_id"));
					dto.setLocation_id(rs.getInt("location_id"));
					aList.add(dto);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				JdbcTemplate.close(rs);
				JdbcTemplate.close(stmt);
			}
			
			return aList;
		}//end getSearchMethod
		
		
		
		
}//end class
