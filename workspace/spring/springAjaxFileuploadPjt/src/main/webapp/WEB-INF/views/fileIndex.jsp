<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 업로드 페이지</h2>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		file : <input type="file" name="uploadFile"><br>
		title : <input type="text" name="title"><br>
		<button>업로드</button>
	</form>
</body>
</html>