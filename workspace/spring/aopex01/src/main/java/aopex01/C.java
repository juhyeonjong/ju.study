package aopex01;

import org.springframework.stereotype.Component;

@Component
public class C {

	public void method01() {
		System.out.println("핵심로직 실행 중... method01");
	}
	
	public void method02() {
		System.out.println("핵심로직 실행 중... method02");
	}
}
