package edu.springboard.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.stereotype.Component;

/*
 * 1. pom.xml���� ������ ������ 3.0.1 �̻����� �÷��ش�
 * 2. ���� Ŭ���� �����ϱ�
 * 3. ���� �������̽� ����ϱ�
 * 4. ������Ʈ �̳����̼� ����
 * 5. �� ���� �̳����̼� (���) ����
 * 6. dofilter �޼ҵ忡�� �����Ͻ� ���� ���� �� chain.dofilterȣ��
 * */



@WebFilter("/board/writeOk.do")
@Component
public class WriteFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		// ���Ͱ�ü�� �����Ǵ� ����
		System.out.println("���� ����2");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//��ΰ� ȣ�� �� �� ���� ����Ǵ� �޼ҵ�
		System.out.println("���͸� ����2");
		
		// ���⼭ ���͸� �۾� �޾ƿ� ������ java -> ****�� ���͸� �� set�ϱ�
		// �� �޾ƿ��� ��, ���͸� �ϴ¹�, ��� ������ ����
		
		String content = request.getParameter("content");
		
		String title = request.getParameter("title");
				if(title != null) {
					request.setAttribute("title", title.replaceAll("java","****"));				
				}
				if(content != null) {
					request.setAttribute("title", content.replaceAll("java","****"));				
				}
		
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//���� ��ü �Ҹ� �� ȣ��Ǵ� �޼ҵ�
		System.out.println("���� ����2");
	}

}

