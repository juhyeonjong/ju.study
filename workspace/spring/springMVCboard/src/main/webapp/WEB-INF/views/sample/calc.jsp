<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>계산기</h2>
	<form action="result.do" method="post">
		숫자 1 :<input type="number" name="num1"><br>
		숫자 2 :<input type="number" name="num2"><br>
		연산자 :
		<input type="radio" name="oper" value="plus">+
		<input type="radio" name="oper" value="minus">-
		<input type="radio" name="oper" value="multi">*
		<input type="radio" name="oper" value="divide">/
		<input type="radio" name="oper" value="remain">%
		<br>
		<input type="submit" value="계산하기">
	</form>
</body>
</html>