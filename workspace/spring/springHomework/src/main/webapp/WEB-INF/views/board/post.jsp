<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<span>..님 환영합니다</span>
	<a href="logout.do"> 로그아웃</a>
	<br>
	<hr>
	<br>
	<br>
	<h3>공지사항</h3>
	<hr>
	<br>
	
	<span>제목</span>
	<input type="text" name="btitle">
	<br>
	<textarea name="bcontent"></textarea>
	<br>
	<span>첨부파일</span>
	<input type="file" name="upload">
	
	<br>
	<a href="notice.do">취소</a>
	<input type="submit">
</body>
</html>