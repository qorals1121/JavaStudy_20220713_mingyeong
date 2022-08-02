package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 디자인 패턴 (필독서!)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {
	private String company;
	private String model;
	private String color;
	


}
