<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 수정페이지</h2>
	<form action="modify.do" method="post">
	<input type="hidden" name="bno" value="${vo.bno}">
		<table>
			<tr>
				<th align="right">제목 : </th>
				<td><input type="text" name="btitle" value="${vo.btitle }"></td>
			</tr>
			<tr>
				<th align="right">작성자 : </th>
				<td>${vo.mname}</td>
			</tr>
			<tr>
				<th align="right">조회수 : </th>
				<td>${vo.bhit}</td>
			</tr>
			<tr>
				<th align="right">등록일 : </th>
				<td>${vo.rdate }</td>
			</tr>
			<tr>
				<th align="right">내용 : </th>
				<td><textarea name="bcontent" rows="10" cols="30">${vo.bcontent}</textarea></td>
			</tr>
		</table>
		<input type="submit" value="저장">
		<!-- 
			저장버튼 클릭시 입력한 값들을 해당 DB 게시글을 실제 수정 후 
			목록 페이지로 이동하세요.
		 -->
	</form>
</body>
</html>