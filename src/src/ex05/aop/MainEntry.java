package ex05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		
		ApplicationContext ctx =
				new GenericXmlApplicationContext("ex05/aop/appCtx.xml");
		
		ICalc proxyCalc = (ICalc)ctx.getBean("proxy");
		System.out.println(proxyCalc.add(10, 20));
		System.out.println();
		System.out.println(proxyCalc.mul(11, 21));
		System.out.println();
		System.out.println(proxyCalc.sub(1,10,2));
	}
}
