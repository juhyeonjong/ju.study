<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 등록 페이지입니다.</h2>
	<form action="write.do" method="post">
		제목 : <input type="text" name="title"><br>
		내용 : <textarea name="content" rows="10"></textarea><br>
		숫자 : <input type="number" name="num"><br>
		<input type="submit" value="저장">
	</form>
</body>
</html>