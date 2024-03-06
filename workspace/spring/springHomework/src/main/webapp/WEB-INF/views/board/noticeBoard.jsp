<%@page import="org.springframework.web.servlet.support.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="notice.do">공지사항</a>
	<a href="free.do"> 자유게시판</a>
	<a href="qna.do"> Q&A게시판</a>
	<!-- 세션에 있는걸 바로 가져와지는 원리 -->
	<span>
		${login.mname}님 환영합니다
	</span>
	<a href="<%=request.getContextPath() %>/logout.do"> 로그아웃</a>
	<br>
	<hr>
	<br>
	<br>
	<h3>공지사항</h3>
	<hr>
	<span>검색</span>
	
	<form action="notice.do" method="post">
	<!-- 만약 선택되어있다면 조건문 사용해서 선택되도록   -->
		<select name="search">
			<option value='1' <c:if test="${param.search eq 1}">selected</c:if> >전체</option>
			<option value='2' <c:if test="${param.search eq 2}">selected</c:if>>제목+내용</option>
			<option value='3' <c:if test="${param.search eq 3}">selected</c:if>>작성자</option>
		</select>
		<input type="text" name="searchText" value='${param.searchText}'>
		<input type="submit">
	</form>
	
	<br>
	<hr>
	<br>
	
	<table border="1">
		<tr>
			<th>NO</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		 <c:forEach var="vo" items="${blist}">
		<tr>
			<td>${vo.bno}</td>
			<td><a href="view.do?mno=${vo.bno}">${vo.btitle}</a></td>
			<td>${vo.mname}</td>
			<td>${vo.rdate}</td>
			<td>1</td>
		</tr>
		</c:forEach>
	</table>
	
	
	<br>
	<a href="post.do">등록</a>
	
</body>
</html>