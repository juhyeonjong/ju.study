package diex04;

import org.springframework.stereotype.Component;
/*
 * @Component ������̼��� ����Ͽ� ioc �����̳ʰ� ��ü�� �����ϰ� �Ǹ�
 * �� ��ü�� �̸��� Ŭ���� ��� ���������� �ձ��ڴ� �ҹ��ڷ� �����Ѵ�.
 */
@Component
public class Print {
	
	public void print01() {
		System.out.println("Print ��ü�� print01�޼ҵ� ȣ��!");
	}
}
