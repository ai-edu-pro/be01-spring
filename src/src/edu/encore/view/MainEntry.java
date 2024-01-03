package edu.encore.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.encore.dao.UserDAO;
import edu.encore.model.UserVO;

public class MainEntry {
	
	static Scanner sc = new Scanner(System.in);
	static UserVO vo = null;
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx.xml");
		UserDAO dao = ctx.getBean("dao", UserDAO.class);
		
		
		
		dao.menu();
		switch (sc.nextInt()) {
			case 1:
					input();
					dao.insert(vo);
					System.out.println(vo.getId() + " 추가 성공!!!");
					System.out.println("----------------------------------");
				break;
	
			case 2:  // selectAll
				dao.selectAll();
				break;
				
			case 3: // selectById
				
			case 4: // update
				dao.update();
				break;
				
			case 5:
				UserVO vo1 = new UserVO();
				System.out.println("user id = ");    vo1.setId(sc.next());
				
				dao.delete(vo1);
				System.out.println(vo1.getId()+"삭제성공!");
				break;
				
			default: System.out.println("번호 선택이 없습니다. 다시 선택.....");
				break;
		}
		
		
		
		
//		UserDAO dao = new MariaDBUserDAOImpl();
//		Connection conn = dao.getConnection();
//		System.out.println(conn.toString());
	}
	
	public static void input() throws Exception {
		vo = new UserVO();
		System.out.print("user id = ");			vo.setId(sc.next());
		System.out.print("user name = ");		vo.setName(sc.next());
		System.out.print("user pass = ");		vo.setPassword(sc.next());
	}
}




