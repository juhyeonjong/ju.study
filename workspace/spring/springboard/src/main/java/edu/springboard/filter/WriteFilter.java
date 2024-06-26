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
 * 1. pom.xml에서 서블릿 버전을 3.0.1 이상으로 올려준다
 * 2. 필터 클래스 정의하기
 * 3. 필터 인터페이스 상속하기
 * 4. 컴포넌트 이노테이션 설정
 * 5. 웹 필터 이노테이션 (경로) 설정
 * 6. dofilter 메소드에서 비지니스 로직 구현 후 chain.dofilter호출
 * */



@WebFilter("/board/writeOk.do")
@Component
public class WriteFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		// 필터객체가 생성되는 시점
		System.out.println("필터 생성2");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//경로가 호출 될 때 마다 실행되는 메소드
		System.out.println("필터링 적용2");
		
		// 여기서 필터링 작업 받아온 값들을 java -> ****로 필터링 후 set하기
		// 값 받아오는 법, 필터링 하는법, 경로 깨지는 이유
		
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
		//필터 객체 소멸 시 호출되는 메소드
		System.out.println("필터 종료2");
	}

}


