<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 등록 페이지</h2>
	<form action="register.do" method="post">
		아이디 :<input type="text" name="mid"><br>
		비밀번호 :<input type="password" name="mpassword"><br>
		이름 :<input type="text" name="mname"><br>
		연락처 :<input type="text" name="mphone"><br>
		주소 :<input type="text" name="maddr"><br>
		이메일 :<input type="text" name="memail"><br>
		<input type="submit" value="저장">
	</form>
	
	<!-- 
		1.메인페이지에서 회원등록하기 버튼 클릭시 이 jsp를 포워드 합니다.
		2.사용자가 전부 입력하고 저장 버튼을 누르면 입력한 정보를 모두 sts 콘솔에 출력 후
		  메인페이지로 경로 이동합니다. 이때 파라미터는 vo를 새로 만들어도 됩니다.
	 -->
</body>
</html>