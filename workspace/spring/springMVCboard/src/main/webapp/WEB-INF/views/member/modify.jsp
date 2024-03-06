<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 수정페이지</h2>
	<form action="modify.do" method="post">
	<input type="hidden" name="mno" value="${vo.mno }">
	 <table border="1">
	 	<tr>
	 		<th>번호</th>
	 		<td>${vo.mno}</td>
	 	</tr>
	 	<tr>
	 		<th>아이디</th>
	 		<td>${vo.mid}</td>
	 	</tr>
	 	<tr>
	 		<th>비밀번호</th>
	 		<td><input type="password" name="mpassword" value="${vo.mpassword}"></td>
	 	</tr>
	 	<tr>
	 		<th>이름</th>
	 		<td><input type="text" name="mname" value="${vo.mname}"></td>
	 	</tr>
	 	<tr>
	 		<th>연락처</th>
	 		<td><input type="text" name="mphone" value="${vo.mphone}"></td>
	 	</tr>
	 	<tr>
	 		<th>주소</th>
	 		<td><input type="text" name="maddr" value="${vo.maddr}"></td>
	 	</tr>
	 	<tr>
	 		<th>이메일</th>
	 		<td><input type="text" name="memail" value="${vo.memail}"></td>
	 	</tr>
	 	<tr>
	 		<th>가입일</th>
	 		<td>${vo.rdate}</td>
	 	</tr>
	 </table>
	 <button>저장</button>
	 </form>
	 
	 
</body>
</html>