package ex05.DI;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data  // Getter / Setter / ToString
//@AllArgsConstructor
public class MemberDTO {  // model
	
	private String name;
	private int age;
	private String message;
	
	public MemberDTO(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
	}

	
	
//	public MemberDTO() {
//		// TODO Auto-generated constructor stub
//	}
	
	
	
}
