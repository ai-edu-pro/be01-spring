package ex04.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ex04/DI/appCtx.xml"); // 설정파일 기재 - xml기반
//				new ClassPathXmlApplicationContext("appCtx.xml");
//		new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml", "test.xml", "appCtx.xml"});
		
		
//		IRecordViewImpl view = (IRecordViewImpl)context.getBean("view");
//		IRecordViewImpl view = (IRecordViewImpl)context.getBean("v");
		IRecordViewImpl view = (IRecordViewImpl)context.getBean("abc");
//		IRecordViewImpl view = context.getBean("view", IRecordViewImpl.class);
		view.print();
		
		
		
		
//		IRecordImpl  record = new IRecordImpl();
//		
//		IRecordViewImpl view = new IRecordViewImpl();
//		
//		// 조립
//		view.setRecord(record);
//		view.input();
//		view.print();
	}
}
