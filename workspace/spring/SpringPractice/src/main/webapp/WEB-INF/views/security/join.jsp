<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>

	<!--header-->
    <%-- <jsp:include page="../include/joinHeader.jsp"/> --%>
    <%@ include file="../include/joinHeader.jsp"%>
	<main class="main_frame">
		<div class="center_cont">
			<form action="joinOk.do" method="post">
				<table>
					<tr>
						<th align="right">아이디 : </th>
						<td><input type="text" name="userid"><button type="button">아이디 중복 확인</button></td>
						
					</tr>
					<tr>
						<th align="right">비밀번호 : </th>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<th align="right">이름 : </th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th align="right">이메일 : </th>
						<td><input type="email" name="email"></td>
					</tr>
					<tr>
						<th align="right">연락처: </th>
						<td><input type="text" name="phone"></td>
					</tr>
					<tr>
						<th align="right">주소 : </th>
						<td><input type="text" name="address"></td>
					</tr>
				</table>
				<button>회원 가입</button>
			</form>
		</div>
	</main>
	
</body>
</html>