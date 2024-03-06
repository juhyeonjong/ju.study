<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>시큐리티를 사용한 로그인 페이지</h2>
	<form action="<%=request.getContextPath()%>/security/loginOk.do" method="post">
		<table>
			<tr>
				<th align="right">아이디 : </th>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<th align="right">비밀번호 : </th>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<button>로그인</button>
		<button type="button" onclick="location.href='<%=request.getContextPath()%>/join.do'">회원가입</button>
	</form>
</body>
</html>