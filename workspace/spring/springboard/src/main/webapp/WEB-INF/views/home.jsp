<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8">
</head>
<body>
<h1>
	Hello world!  
</h1>
<!-- 로그인 정보가 존재하는 경우 로그아웃 링크 노출 없는 경우 로그인 링크 노출 -->
<%-- <c:choose>
	<c:when test="${not empty login}">
	<a href="logout.do">로그아웃</a> <!-- 기능 구현하세요! -->
	<P> ${login.mname}님, 환영합니다!! The time on the server is ${serverTime}. </P>
	
	<c:if test="${login.mid eq 'admin' }">
	<a href='admin/index.do'>관리자 페이지 이동</a> <!-- 로그인 아이디가 admin인 경우에만 노출 -->
	</c:if>
	
	<a href="board/index.do">게시판으로 이동</a> <!-- 로그인 된 모든 회원에게 노출 -->
	
	</c:when>
	<c:otherwise>
	<a href="login.do">로그인</a>
	</c:otherwise>
</c:choose> --%>


	<sec:authorize access="isAuthenticated()">
	<sec:authentication property="principal.username"/>님, 환영합니다.
	<br>
	<a href="<%=request.getContextPath() %>/security/logout.do">로그아웃</a> 
	</sec:authorize>
	<sec:authorize access="isAnonymous()">
	<a href="login.do">로그인</a>
	</sec:authorize>
</body>
</html>








