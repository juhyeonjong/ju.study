<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<!--header-->
    <%@ include file="../include/header.jsp"%>
    <%-- <jsp:include page="../include/header.jsp"/> --%>
    <main class="main_frame">
    	
    	<div class="center_cont">
			<form action="<%=request.getContextPath()%>/loginOk.do" method="post">
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
				<button class="btn_large">로그인</button>
				<br>
				<span>[<a href="join.do">회원가입</a>]</span>
			</form>
		</div>
	</main>
</body>
</html>