<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>시큐리티 회원 가입 페이지</h2>
	<form action="joinOk.do" method="post">
		<table>
			<tr>
				<th align="right">아이디 : </th>
				<td><input type="text" name="userid"></td>
			</tr>
			<tr>
				<th align="right">비밀번호 : </th>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<th align="right">이름 : </th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th align="right">권한 : </th>
				<td>
					<input type="radio" name="authority" value="ROLE_USER">일반
					<input type="radio" name="authority" value="ROLE_ADMIN">관리자
				</td>
			</tr>
		</table>
		<button>가입하기</button>
	</form>
</body>
</html>