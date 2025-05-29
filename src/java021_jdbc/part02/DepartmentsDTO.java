package java021_jdbc.part02;

// DB에서 받은 값을 한번에 받기 위한 용도 (불러지는 값 데이터 타입,등을 맞춤)
// 각행을 한번에 묶어서 받기 위한 것
//DTO : Data Transfer Object
//VO : Variable Object
//Entity

public class DepartmentsDTO {
	
 private int department_id;
 private String depatmnent_name;
 private int manager_id;
 private int location_id;
 
 	public DepartmentsDTO() {
 		
 	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepatmnent_name() {
		return depatmnent_name;
	}

	public void setDepatmnent_name(String depatmnent_name) {
		this.depatmnent_name = depatmnent_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
 	
}//end class


