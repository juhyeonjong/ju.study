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
	<a href="logout.do"> 로그아웃</a>
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
			<option value='1' selected >전체</option>
			<option value='2' selected >제목+내용</option>
			<option value='3' selected >작성자</option>
		</select>
		<input type="text" name="searchText">
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
		 <c:forEach var="item" items="${list }">
		<tr>
			<td>${item.mno}</td>
			<td><a href="view.do?mno=${item.mno}">${item.mid}</a></td>
			<td>${item.mname}</td>
			<td>${item.mphone}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>