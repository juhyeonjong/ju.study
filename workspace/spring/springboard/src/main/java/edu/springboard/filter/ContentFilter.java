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
 * 1.pom.xml 에서 servlet 버전을 3.0.1 이상으로 올려준다. 
 * 2.filter class 정의하기 
 * 3.Filter 인터페이스 상속받기
 * 4. @Component 지정
 * 5. @Webfilter 지정 이때 옵션으로 원하는 경로 추가
 * 6. doFilter 메소드에서 비지니스 로직 구현 후 chain.doFilter() 호출
 */

@WebFilter({"/board/writeOk.do"})
@Component
@Order(1)
public class ContentFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//필터 객체가 생성되는 시점에 호출되는 메소드
		System.out.println("필터 생성!!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//경로가 호출 될 때 마다 실행되는 메소드
		
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
		//필터 객체 소멸시 호출되는 메소드
		//필터에서 사용한 리소스 종료할 때 사용하는 위치
	}

}
