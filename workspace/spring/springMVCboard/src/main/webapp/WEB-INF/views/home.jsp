<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
	<script src="<%=request.getContextPath()%>/js/home.js"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<div>
	<h2>spring을 사용한 가상경로 포워드 연습하기</h2>
	<a href="first.do">first.do 로 이동하여 firstPage.jsp 포워드하기</a><br>
	<a href="<%=request.getContextPath()%>/board/list.do">board/list.do로 이동하여 WEB-INF/views/board/list.jsp포워드하기</a>
	<a href="<%=request.getContextPath()%>/board/view.do">board/view.do로 이동시 WEB-INF/views/board/view.jsp 포워드하기</a>
	<br>
	<a href="<%=request.getContextPath()%>/member/register.do">회원 등록하러가기</a>
	<br>
	<a href="member/list.do">회원목록으로 이동</a>
	<br>
	<a href="calc/main.do">계산기로 이동</a>
</div>
</body>
</html>







