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
	 * 1. dispatcher servlet과 controller 사이에서 동작한다.
	 * 2. 때문에 dispatcher servlet의 bean에 모두 접근이 가능하다.
	 * 3. 인증/인가 등에 관련된 공통 작업 위치
	 * 4. controller로 넘겨주는 정보의 가공 처리 위치
	 * 5. api 호출에 대한 로그 또는 감사 처리 위치
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("controller 실행 전!");
		//1.지정된 컨트롤러 동작 이전에 호출되어 동작되는 메소드 (인가/인증 처리)
		//2.handle 객체는 지정된 컨트롤러 파악 또는 지정 메소드 실행 가능
		//3.리턴 타입 boolean은 true이면 이후 작업 실행 false이면 이후 작업 중단
		
		
		HttpSession session = request.getSession() ;
		MemberVO login = (MemberVO)session.getAttribute("login");
		
		if(login != null && login.getMid().equals("admin")) {
			return true;
		}
		
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		response.getWriter()
			.append("<script>alert('관리자 페이지입니다.');location.href='"
					+request.getContextPath()+"'</script>").flush();
		
		System.out.println("화면 전환 됩니다!!");
		//response.sendRedirect(request.getContextPath()); //프로젝트 패스부터 경로 지정
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("화면 전환 이전!!");
		String data = (String)modelAndView.getModel().get("data");
		System.out.println("data :: "+data);
		//1. 지정된 컨트롤러 동작 이후에 처리하며, dispatcherservlet이 화면을
		//   처리하기 전에 동작
		//2. modelAndView를 사용하면 컨트롤러에서 담은 model객체의 데이터를 제어할 수있다.
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("화면 전환 이후!!");
		//1.dispatcher servlet이 화며처리를 한 이후 에 동작
	}

}
