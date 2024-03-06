<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="java.util.*" %>
<%
	List<String> list = (List<String>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 목록 페이지 입니다.</h2>
	HomeController를 수정하여 board/list.do 가상경로 이동시
	현재 페이지가 포워드 될 수 있도록 작성하세요.
	<br>
	------------------------
	<br>
	전체 게시글 수 : ${fn:length(list)}
	<table border="1">
	<%
		for(int i=0;i<list.size();i++){
			%>
		<tr>
			<td><%=i+1 %></td>
			<td><%=list.get(i) %></td>
		</tr>
			<%
		}
	%>
	</table>
	<table border="1">
		<c:forEach var="item" items="${list}" varStatus="status"> <!-- for(String item : list) -->
			<tr>
				<td>${status.count}</td>
				<td>${item}</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	------------------------
	<br>
	<button onclick="location.href='write.do'">등록</button>
	<!-- http://localhost:8080/springMVCboard/board/write.do -->
	<!-- 
	위 등록 버튼 클릭시 /board/write.do 가상경로로 이동합니다. 이때
	board/write.jsp 페이지를 포워드 합니다.
	 -->
</body>
</html>