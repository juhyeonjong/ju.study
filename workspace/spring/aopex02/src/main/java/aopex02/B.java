package aopex02;

import org.springframework.stereotype.Component;

@Component
public class B {
	
	public void sum(int num1, int num2) {
		System.out.println("두 수의 합은 "+(num1+num2));
	}
	
	public void minus(int num1, int num2) {
		System.out.println("두 수의 차는 "+(num1-num2));
	}
	/*
	 * 위 공통 로직을 LogAOP 클래스에 공통 모듈로 분리하여 
	 * 실행 될 수 있도록 수정하세요.
	 * 
	 */
}
