package ex01.di;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config = "ex01/di/playerCtx.xml";
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext(config);
		
		PlayerImpl p = ctx.getBean("player", PlayerImpl.class);
//		PlayerImpl p2 = ctx.getBean("p1", PlayerImpl.class);
		PlayerImpl p2 = ctx.getBean("player2", PlayerImpl.class);
		
		if(p == p2 ) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Soccer s = (Soccer)ctx.getBean("soccer");
		
//		p.input();
//		p.info();
		
		String[] sportsName = {"축구", "컬링", "농구" };
		Object[] className = { ctx.getBean("soccer"), ctx.getBean("curling"), ctx.getBean("basketBall") };
		
		for (int i = 0; i < sportsName.length; i++) {
			System.out.println(sportsName[i]);
			
			p.input();
			p.info();
			System.out.println("종목 : "+ sportsName[i]);
			System.out.println();
		}
		
		
	}
}










