package edu.springboard.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import edu.springboard.vo.UserVO;

public class UserLoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		System.out.println("로그인성공!!");
		
		UserVO loginUser = (UserVO)authentication.getPrincipal();
		
		System.out.println(loginUser.getUserid());
		
		
		//로그인 성공!!!
		response.sendRedirect(request.getContextPath());
	}

}
