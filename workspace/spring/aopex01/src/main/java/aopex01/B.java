package aopex01;

import org.springframework.stereotype.Component;

@Component
public class B {

	public void method01() {
		System.out.println("method01의 핵심로직 진행 중...");
	}
	
	public void method02() {
		System.out.println("method02의 핵심로직 진행 중...");
	}
}
