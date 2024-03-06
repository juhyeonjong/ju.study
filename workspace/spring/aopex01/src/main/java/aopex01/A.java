package aopex01;

import org.springframework.stereotype.Component;

@Component
public class A {
	
	public void method01() {
		
		System.out.println("핵심로직 천줄 실행 중...");
	}
	
	public void method02() {
		
		System.out.println("메소드02의 핵심로직 이천줄 실행 중...");
	}
}
