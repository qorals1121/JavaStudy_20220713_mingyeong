package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode; 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //기본 생성자
@AllArgsConstructor //전체 생성자
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data // 위의 4개를 묶어서 사용가능한 lombok 

public class Student {
	
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;
	
	
	
	

}
