package aopex01;

import org.aspectj.lang.ProceedingJoinPoint;

//aspect : 관심사 라는 의미를 가지며 공통관심사에 대한 공통 모듈들을 
//        담고 있는 클래스 그룹을 의미한다.
//target : aspect을 적용할 클래스 또는 메소드를 의미함.
//advice : 실질적으로 어떤 일을 해야할지에 대한 것으로 부가기능을 담은 구현체 (공통모듈 하나)
//joinpoint : 공통모듈이 핵심 기능에 끼워 넣어지는 시점
//pointcut : joinpoint에 대한 상세 스펙을 의미함.
public class LogAOP {

	public void beforeLog() {
		System.out.println("메소드 시작합니다.");
	}
	
	public void afterLog() {
		System.out.println("메소드 종료 되었습니다.");
	}
	
	public void aroundLog(ProceedingJoinPoint joinpoint) throws Throwable {
		
		System.out.println("메소드 시작");
		
		try {
			
			joinpoint.proceed(); //핵심 로직 실행
			
		}finally {
			System.out.println("메소드 종료!");
		}
		
	}
}










