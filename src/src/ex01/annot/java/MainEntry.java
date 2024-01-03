package ex01.annot.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext  ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);  //
		
		Cats info = ctx.getBean("catsInfo", Cats.class);
		info.getMyCatsInfo();
		
		MyCats cats2 = (MyCats)ctx.getBean("cat2");
		info.setMyCats(cats2);
		info.getMyCatsInfo();
		
		ctx.close();
	}
}
