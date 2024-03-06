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
	<h2>회원 목록 페이지</h2>
	<form action="list.do" method="get">
	
		<select name="searchType">
			<option value="id" <c:if test="${param.searchType eq 'id'}">selected</c:if>>아이디</option>
			<option value="name" <c:if test="${param.searchType eq 'name'}">selected</c:if>>이름</option>
		</select>
		
		<input type="text" name="searchValue" value='${param.searchValue}' >
		<button>검색</button>
	</form>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>이름</th>
			<th>연락처</th>
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
	<button onclick="location.href='register.do'">등록</button>
</body>
</html>



