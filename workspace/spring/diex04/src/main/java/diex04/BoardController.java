package diex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoardController {
	/*
	 * @Resource ������̼��� �̸��� �������� ������ �ڵ� �����Ѵ�.
	 * bean�� �̸��� �ߺ� �Ǵ� ��찡 �����Ƿ� �̸��� ��ġ�ϴ� bean�� ���ٸ�
	 * ������ ������ �߻��Ѵ�. Ȥ�� bean�� �̸��� ���Ե� �ʵ��� �̸��� ������
	 * Ÿ���� �޶� ������ �߻��Ѵ�.
	 */
	/*
	 * @Autowired,@inject ������̼��� Ÿ���� �������� ������ �ڵ� �����Ѵ�.
	 * �̶� Ÿ���� ���� bean�� ������ �� ��� �̸��� ���� bean�� �켱������ ��������.
	 * Ȥ��, Ÿ���� ���� bean�� ������ �̸� �̸��� ���� bean�� �ϳ��� ���ٸ� ���� �߻�!
	 * �����ϱ� ���Ͽ� @Qualifier ������̼��� ����Ͽ� ���ԵǴ� bean�� �̸��� Ư���� �� �ִ�.
	 */
	@Autowired
	@Qualifier("boardDAO02")
	public BoardDAO boardDAO;
	
	public void doGet() {
		System.out.println("�Խñ� get ��û ������");
	}
	
	public void doPost() {
		System.out.println("�Խñ� post ��û ������");
		boardDAO.insert();
	}
}
