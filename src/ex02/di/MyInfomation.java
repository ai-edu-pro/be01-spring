package ex02.di;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Data;

@Data  // Setter, Getter , toString
public class MyInfomation {
	
//	@Autowired
//	@Qualifier("info")
	private Person person;   // has-a
	
	// setter method DI
	
	public boolean proessMessage(StudentPersonImpl student) {
//		for (int i = 0; i < student.getScore().size(); i++) {
//			
//		}
//		return this.person.personShow(student.getName(), student.getAge(), student.getGender(), student.getScore());
		
		return this.person.personShow(student);
	}
	
	public boolean proessMessage(EmployeePersonImpl emp) {
//		return this.person.personShow(emp.getName(), emp.getAge(), emp.getGender());
		return this.person.personShow(emp);
	}
	
	public boolean proessMessage(String name, int age, String gender) {
		return this.person.personShow(name, age, gender);
	}
}
