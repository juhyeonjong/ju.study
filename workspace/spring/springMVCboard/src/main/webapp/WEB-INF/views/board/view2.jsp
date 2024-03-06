<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 상세페이지입니다.</h2>
	
	<table border="1">
		<tr>
			<th>제목</th>
			<td>${vo.btitle}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${vo.bhit}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${vo.mname}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${vo.rdate}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${vo.bcontent}</td>
		</tr>
	
	</table>
	<button onclick="location.href='modify.do?bno=${vo.bno}'">수정</button>
	<button onclick="delfn()">삭제</button>
	<form name="delfrm" action="delete.do" method="post">
		<input type="hidden" name="bno" value="${vo.bno }">
	</form>
	<script>
		function delfn(){
			document.delfrm.submit();
		}
	</script>
	<!-- 삭제 버튼 클릭시 게시글을 실제 db에서 삭제한 후 list페이지로 이동합니다
		삭제가 잘 되었을 경우 alert("삭제되었습니다") 출력 후 이동
		삭제가 잘 되지 않았을 경우 alert("삭제 실패했습니다") 출력 후 이동
	 -->
	
	
	
</body>
</html>