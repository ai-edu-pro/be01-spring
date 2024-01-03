package ex03.di.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		String config ="ex03/di/qualifier/qualifierCtx.xml";
		ApplicationContext ctx = 
				new GenericXmlApplicationContext(config);
		
		MoniterViewer viewer = (MoniterViewer)ctx.getBean("moniterViewer");
		viewer.show();
		
	}
}
