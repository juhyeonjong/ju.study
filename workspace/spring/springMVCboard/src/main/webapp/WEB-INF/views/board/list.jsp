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
	<h2>게시글 목록</h2>
	<table border="1">
	<thead>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>조회수</th>
			<th>등록일</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="vo" items="${list}">
		<tr>
			<td>${vo.bno}</td>
			<td><a href="view2.do?bno=${vo.bno}">${vo.btitle}</a></td>
			<td>${vo.bhit}</td>
			<td>${vo.rdate}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>