package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;

public class MemController {
	
	private MemService service;

	public MemController() {
		service = new MemService();
	}
	public int updateExecute(int num) {
		return service.getDelteProcess(num);
	}//end deleteExecute()
	
	public int updateExecute(HashMap<String ,Object> hMap ) {
		return service.getUpdateProcess(hMap);
	}
	
	
	public List<MemDTO> ListExcute() {
		return service.getListProcess();

		
	} // end listExcute()
	
	public int insertExecute (MemDTO dto) {
		return service.getInsertProcess(dto);
	} // end insertExecute()
	
	
	public int deleteExecute(int num) {
		// TODO Auto-generated method stub
		return service.getDelteProcess(num);
	}
	
} // end class
