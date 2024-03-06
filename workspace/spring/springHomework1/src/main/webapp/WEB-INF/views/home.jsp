<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
</head>
<body>
	<h1>해당 시스템은 로그인 후 이용 가능합니다.</h1>
	<form action="<%=request.getContextPath()%>/member/loginOk.do" method="post">
		<input type="text" name="id">
		<input type="password" name="pw">
		<input type="button">
	</form>
	<a href="<%=request.getContextPath()%>/member/join.do">[회원가입]</a>
</body>
</html>








