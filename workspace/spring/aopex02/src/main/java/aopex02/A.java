package aopex02;

import org.springframework.stereotype.Component;

@Component
public class A {

	public void method01() {
		//System.out.println("method01() 시작!");
		System.out.println("... 핵심로직 실행중 method01()....");
	}
	
	public void method02() {
		//System.out.println("method02() 시작!");
		System.out.println("... 핵심로직 실행중 method01()....");
	}
}
