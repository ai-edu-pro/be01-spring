package ex02.di;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEtry {
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("ex02/di/ctx.xml");
		
		StudentPersonImpl student = ctx.getBean("student", StudentPersonImpl.class);
		EmployeePersonImpl emp = (EmployeePersonImpl)ctx.getBean("employee");
		
		MyInfomation info = ctx.getBean("info", MyInfomation.class);
		info.proessMessage(student);
//		info.setPerson(new StudentPersonImpl());
		
		info.proessMessage("gildong", 30, "남자");
		System.out.println("-------------------------------------");
//		ArrayList<String> hobbys = new ArrayList();
//		hobbys.add("aa");
//		hobbys.add("bb");
//		hobbys.add("cc");
		
		MyInfomation info2 = ctx.getBean("info2", MyInfomation.class);
//		emp.personShow(hobbys);
		info2.proessMessage(emp);
		
	}
}







