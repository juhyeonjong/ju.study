package edu.springboard.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
 * 1.pom.xml ���� servlet ������ 3.0.1 �̻����� �÷��ش�. 
 * 2.filter class �����ϱ� 
 * 3.Filter �������̽� ��ӹޱ�
 * 4. @Component ����
 * 5. @Webfilter ���� �̶� �ɼ����� ���ϴ� ��� �߰�
 * 6. doFilter �޼ҵ忡�� �����Ͻ� ���� ���� �� chain.doFilter() ȣ��
 */

@WebFilter({"/board/writeOk.do"})
@Component
@Order(1)
public class ContentFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//���� ��ü�� �����Ǵ� ������ ȣ��Ǵ� �޼ҵ�
		System.out.println("���� ����!!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//��ΰ� ȣ�� �� �� ���� ����Ǵ� �޼ҵ�
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
				
		if(title != null ) {
			request.setAttribute("title", title.replaceAll("java", "****"));
		}
		
		if(content != null) {
			request.setAttribute("content", content.replaceAll("java", "****"));
		}
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		//���� ��ü �Ҹ�� ȣ��Ǵ� �޼ҵ�
		//���Ϳ��� ����� ���ҽ� ������ �� ����ϴ� ��ġ
	}

}