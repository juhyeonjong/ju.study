package aopex01;

import org.aspectj.lang.ProceedingJoinPoint;

//aspect : ���ɻ� ��� �ǹ̸� ������ ������ɻ翡 ���� ���� ������ 
//        ��� �ִ� Ŭ���� �׷��� �ǹ��Ѵ�.
//target : aspect�� ������ Ŭ���� �Ǵ� �޼ҵ带 �ǹ���.
//advice : ���������� � ���� �ؾ������� ���� ������ �ΰ������ ���� ����ü (������ �ϳ�)
//joinpoint : �������� �ٽ� ��ɿ� ���� �־����� ����
//pointcut : joinpoint�� ���� �� ������ �ǹ���.
public class LogAOP {

	public void beforeLog() {
		System.out.println("�޼ҵ� �����մϴ�.");
	}
	
	public void afterLog() {
		System.out.println("�޼ҵ� ���� �Ǿ����ϴ�.");
	}
	
	public void aroundLog(ProceedingJoinPoint joinpoint) throws Throwable {
		
		System.out.println("�޼ҵ� ����");
		
		try {
			
			joinpoint.proceed(); //�ٽ� ���� ����
			
		}finally {
			System.out.println("�޼ҵ� ����!");
		}
		
	}
}










