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
		System.out.println("�α��μ���!!");
		
		UserVO loginUser = (UserVO)authentication.getPrincipal();
		
		System.out.println(loginUser.getUserid());
		
		
		//�α��� ����!!!
		response.sendRedirect(request.getContextPath());
	}

}
