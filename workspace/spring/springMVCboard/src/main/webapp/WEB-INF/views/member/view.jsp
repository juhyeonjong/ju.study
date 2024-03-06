<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원 상세페이지</h2>
	<!-- 
		회원 목록 페이지에서 각 아이디 클릭시 해당 회원의 상세정보를
		현재 페이지에 테이블 구조로 모든 정보를 출력한다.
		이때, mybatis를 사용하여 데이터를 조회한다.
		
		hint!!mybatis를 사용하여 정보 조회시 한건에 대한 정보조회는 selectOne 메소드를
		사용한다.
		VO vo = sqlSession.selectOne(namespace.id,parameter);
		
	 -->
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
	 		<td>${vo.mpassword}</td>
	 	</tr>
	 	<tr>
	 		<th>이름</th>
	 		<td>${vo.mname}</td>
	 	</tr>
	 	<tr>
	 		<th>연락처</th>
	 		<td>${vo.mphone}</td>
	 	</tr>
	 	<tr>
	 		<th>주솧</th>
	 		<td>${vo.maddr}</td>
	 	</tr>
	 	<tr>
	 		<th>이메일</th>
	 		<td>${vo.memail}</td>
	 	</tr>
	 	<tr>
	 		<th>가입일</th>
	 		<td>${vo.rdate}</td>
	 	</tr>
	 </table>
	 
	 <button onclick="location.href='modify.do?mno=${vo.mno}'">수정</button>
	 
	 <!-- 
	 	회원 정보 수정 기능을 완성하세요 
	 	수정 대상 : 이름, 연락처, 비밀번호, 주소, 이메일
	  -->
	 
	 
	 
</body>
</html>