package aopex02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAOP {
	
	@Before("within(aopex02.A)")
	public void beforeLog(JoinPoint jp) {
		String methodNM =  jp.getSignature().toShortString();
		System.out.println(methodNM+" 시작!");
	}
	
	@After("within(aopex02.B)")
	public void afterLog(JoinPoint jp) {
		String methodNM =  jp.getSignature().toShortString();
		System.out.println(methodNM+" 종료!");
	}
}
