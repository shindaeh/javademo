package java021_jdbc.part02;

import java.util.List;
//받은 정보를 DB를 SERVICE로 보냄...?
public class DepartmentsController {

	private DepartmentsService service;
	
	public DepartmentsController() {
		service = new DepartmentsService();
	}
	
	public List<DepartmentsDTO> listProcess(){
		return service.getDepartmentsList();
		}// end process
} // end class
