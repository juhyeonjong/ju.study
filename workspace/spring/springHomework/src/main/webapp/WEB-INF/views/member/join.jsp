<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

	<form action="join.do" method="post">
		<span>아이디 :</span>
		<input type="text" name="mid">
		<input type="button" onclick="checkId()" value="아이디중복검사">
		<br>
		
		<span>비밀번호 :</span>
		<input type="password" name="mpw">
		<br>
		
		<span>이름 :</span>
		<input type="text" name="mname">
		<br>
		
		<span>이메일 :</span>
		<input type="email" name="memail">
		<br>	
		
		<span>연락처 :</span>
		<input type="text" name="mphone">
		<br>
		
		<span>주소 :</span>
		<input type="text" name="maddr">
		<br>	
		
		<input type="submit">						
	</form>
		
</body>
</html>