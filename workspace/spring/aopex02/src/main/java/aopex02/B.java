package aopex02;

import org.springframework.stereotype.Component;

@Component
public class B {
	
	public void sum(int num1, int num2) {
		System.out.println("�� ���� ���� "+(num1+num2));
	}
	
	public void minus(int num1, int num2) {
		System.out.println("�� ���� ���� "+(num1-num2));
	}
	/*
	 * �� ���� ������ LogAOP Ŭ������ ���� ���� �и��Ͽ� 
	 * ���� �� �� �ֵ��� �����ϼ���.
	 * 
	 */
}
