package edu.springboard.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import edu.springboard.vo.MemberVO;


@Component
public class UserInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		MemberVO login = (MemberVO)session.getAttribute("login");
		
		if(login == null) {
			
			String path = request.getRequestURI();
			
			String commands[] = path.split("/");
			
			String lastUri = commands[commands.length-1]; 
			System.out.println("lastUri::"+lastUri);
			if(!lastUri.equals("index.do")) {
				response.setContentType("text/html; charset=utf-8");
				response.setCharacterEncoding("utf-8");
				response.getWriter()
					.append("<script>alert('�α��� �� �̿��ϼ���.');location.href='"
							+request.getContextPath()+"/login.do'</script>").flush();
				
			
				return false;
			}else {
				return true;
			}
		}
		
		return true;
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}