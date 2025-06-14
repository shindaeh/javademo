package java024_lombok.part02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data //->getter,setter 등등 묶어 놓은 것
//publc MemDTO (int num, String name, int age, String loc){}
//this.name ... 등등 = @AllArgsConstructor와 같다
@AllArgsConstructor
@ToString
@Getter
@Setter

//인자값이 없는 메소드 (클래스로 정의) -> 임포트 되어야함 public MemDTO() {}와 같다.
@NoArgsConstructor
public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;

}
