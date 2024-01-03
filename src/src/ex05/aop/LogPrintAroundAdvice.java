package ex05.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Around Sevice invoke() start.................");
		
		
		// 보조 업무
		Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 시작");
		
		/// 주관심 코드 ///////////////////////
		Object result = invocation.proceed();  // 주관심사의 함수 호출
		////////////////////////////////////////
		
		// 보조 업무
		sw.stop();
		log.info("타이머 정지");
		
		log.info("[TimerLOG] Method : " + 
		invocation.getMethod()); // 실행한 메소드 명칭
		System.out.println("[TimerLOG] args : " + 
		Arrays.toString(invocation.getArguments()));
		log.info("[TimerLOG] proecess Time : " +
		sw.getTotalTimeMillis());
		
		return result;
	}

}








