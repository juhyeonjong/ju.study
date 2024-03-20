<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page session="true" %> <%-- 이게 flase로 되어있으면 session 스코프 사용못함 --%> 

<%-- <html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
</head>
<body>
<h1>
	Hello world!  
</h1>


	<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal.username"/>님, 환영합니다.
	<br>
	<a href="<%=request.getContextPath() %>/logout.do">로그아웃</a> 
	</sec:authorize>
	<sec:authorize access="isAnonymous()">
	<a href="login.do">로그인</a>
	</sec:authorize>
</body>
</html> --%>

