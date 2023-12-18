package ex05.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
//		MemberDTO dto = new MemberDTO();
		
		String config = "ex05/DI/memberCtx.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);  //설정파일
		
		MemberDAO dao = (MemberDAO)ctx.getBean("dao");
		MemberDAO dao2 = ctx.getBean("dao", MemberDAO.class);
		
		dao.insert();
	}
}
