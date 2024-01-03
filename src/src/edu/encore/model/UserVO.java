package edu.encore.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data  // Setter , Getter, ToString
public class UserVO {  // model  - ~~DTO,  ~~~VO, ~~TO
	
	private String id, name, password;
	
}
