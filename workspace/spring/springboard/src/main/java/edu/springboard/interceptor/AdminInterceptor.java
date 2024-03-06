package edu.springboard.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import edu.springboard.service.MemberService;
import edu.springboard.vo.MemberVO;

@Component
public class AdminInterceptor implements HandlerInterceptor {

	@Autowired
	MemberService memberService;
	
	/*
	 * 1. dispatcher servlet�� controller ���̿��� �����Ѵ�.
	 * 2. ������ dispatcher servlet�� bean�� ��� ������ �����ϴ�.
	 * 3. ����/�ΰ� � ���õ� ���� �۾� ��ġ
	 * 4. controller�� �Ѱ��ִ� ������ ���� ó�� ��ġ
	 * 5. api ȣ�⿡ ���� �α� �Ǵ� ���� ó�� ��ġ
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("controller ���� ��!");
		//1.������ ��Ʈ�ѷ� ���� ������ ȣ��Ǿ� ���۵Ǵ� �޼ҵ� (�ΰ�/���� ó��)
		//2.handle ��ü�� ������ ��Ʈ�ѷ� �ľ� �Ǵ� ���� �޼ҵ� ���� ����
		//3.���� Ÿ�� boolean�� true�̸� ���� �۾� ���� false�̸� ���� �۾� �ߴ�
		
		
		HttpSession session = request.getSession() ;
		MemberVO login = (MemberVO)session.getAttribute("login");
		
		if(login != null && login.getMid().equals("admin")) {
			return true;
		}
		
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter()
			.append("<script>alert('������ �������Դϴ�.');location.href='"
					+request.getContextPath()+"'</script>").flush();
		
		System.out.println("ȭ�� ��ȯ �˴ϴ�!!");
		//response.sendRedirect(request.getContextPath()); //������Ʈ �н����� ��� ����
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("ȭ�� ��ȯ ����!!");
		String data = (String)modelAndView.getModel().get("data");
		System.out.println("data :: "+data);
		//1. ������ ��Ʈ�ѷ� ���� ���Ŀ� ó���ϸ�, dispatcherservlet�� ȭ����
		//   ó���ϱ� ���� ����
		//2. modelAndView�� ����ϸ� ��Ʈ�ѷ����� ���� model��ü�� �����͸� ������ ���ִ�.
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("ȭ�� ��ȯ ����!!");
		//1.dispatcher servlet�� ȭ��ó���� �� ���� �� ����
	}

}
