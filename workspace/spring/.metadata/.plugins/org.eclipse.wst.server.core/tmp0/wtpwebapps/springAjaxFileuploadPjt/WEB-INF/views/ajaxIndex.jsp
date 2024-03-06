<%@page import="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath()%>/js/jquery-3.7.1.min.js"></script>
<script>
	function callAjaxText(){
		System.out.println("121");
		$.ajax({
			url:"callText.do",
			success:function(data){
				$("#result").html(data);
			}
		});
	}
	
	
	function callAjaxJson(){
		$.ajax({
			url:"callJSON.do",
			success: function(data){
				$("#result").html(data);
			}
		})
	}
	
	
	function callAjaxJson2(){
		$.ajax({
			url:"callJSON2.do",
			success: function(data){
				$("#result").html(data);
			}
		})
	}
	
	
</script>
</head>
<body>
	<h2>ajax 예제 페이지</h2>
	<button onclick="callAjaxText()">ajax1</button>
	<button onclick="callAjaxJson()">json</button>
	<button onclick="callAjaxJson2()">json2</button>
	<div id="result"></div>
</body>
</html>