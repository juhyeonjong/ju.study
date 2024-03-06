<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	<form action="login.do" method="post">
		<table>
			<tr>
				<th align="right">아이디 :</th>
				<td><input type="text" name="mid"></td>
			</tr>
			<tr>
				<th align="right">비밀번호 :</th>
				<td><input type="password" name="mpassword"></td>
			</tr>
		</table>
		<button>로그인</button>
	</form>
</body>
</html>