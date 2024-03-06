<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="edu.board.vo.BoardVO2" %>
<%
	BoardVO2 vo = (BoardVO2)request.getAttribute("vo");
	/* String title = (String)request.getAttribute("title");
	int hit = (Integer)request.getAttribute("hit");
	String writer = (String)request.getAttribute("writer");
	String wdate = (String)request.getAttribute("wdate");
	String content = (String)request.getAttribute("content"); */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 상세페이지입니다.</h2>
	BoardController를 수정하여  board/view.do 가상경로 요청시
	현재 페이지가 포워드 될 수 있도록 작성하세요.
	<table border="1">
		<tr>
			<th>제목</th>
			<td><%= vo.getTitle() %></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td><%=vo.getHit() %></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><%=vo.getWriter() %></td>
		</tr>
		<tr>
			<th>작성일</th>
			<td><%=vo.getWdate() %></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%=vo.getContent() %></td>
		</tr>
	
	</table>
	-------------------------------------<br>
	<h2>el사용하기</h2>
	
	<table border="1">
		<tr>
			<th>제목</th>
			<td>${vo.title}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${vo.hit }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${vo.writer }</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${vo.wdate }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${vo.content }</td>
		</tr>
	
	</table>
	
</body>
</html>