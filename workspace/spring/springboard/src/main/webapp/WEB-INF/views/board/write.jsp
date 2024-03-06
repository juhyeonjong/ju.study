<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글쓰기</h2>
	<!-- 글쓰기 화면은 login이 안되어 있으면 접근이 안됩니다. -->
	<form action="writeOk.do" method="post">
		<table>
			<tr>
				<th align="right">제목 :</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th align="right">내용 : </th>
				<td><textarea name="content"></textarea></td>
			</tr>
		</table>
		<button>저장</button>
	</form>
	<!-- 글 목록 페이지에서 글등록 버튼 클릭시 해당 페이지 포워드 됩니다
		글 쓰기 페이지에서 작성 완료 후 저장 버튼 클릭시 board 테이블에 작성 내용 insert
		됩니다 이때 mno는 로그인한 회원의 mno 이며 작성 된 제목, 내용 중 java라는 내용이
		포함 되어 있다면 **** 로 치환하여 db에 저장합니다.
		
		참고로 filter 에서 다시 파라미터로 데이터를 추가하거나 변경하는 것은 불가능 합니다.
		request의 attribute를 사용하세요.
	 -->
	
	
	
	
	
	
	
	
	
</body>
</html>