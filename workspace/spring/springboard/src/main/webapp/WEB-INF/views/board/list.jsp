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
	<h2>게시글 목록 페이지</h2>
	<button onclick="location.href='write.do'">글쓰기</button>
	<!-- 
		home.jsp에서 게시판으로 이동 링크 클릭시
		현재 페이지가 포워드 됩니다.
		이때, 로그인 되어있지 않다면 login.do 페이지로
		리다이렉트 됩니다. 로그인이 되어있다면 board 테이블의
		전체 게시글을 출력하세요.
	 -->
	 <!-- 게시글 목록 jstl을 사용하여 출력하세요. -->
	 <table border="1">
	 	<thead>
	 		<tr>
	 			<th>글번호</th>
	 			<th>제목</th>
	 			<th>작성일</th>
	 		</tr>
	 	</thead>
	 	<tbody>
	 		<c:forEach items="${list }" var="vo">
	 			<tr>
	 				<td>${vo.bno}</td>
	 				<td>${vo.btitle}</td>
	 				<td>${vo.rdate}</td>
	 			</tr>
	 		</c:forEach>
	 	</tbody>
	 </table>
</body>
</html>





