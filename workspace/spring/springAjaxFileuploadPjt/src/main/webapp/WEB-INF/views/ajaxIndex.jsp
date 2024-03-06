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
		$.ajax({
			url:"callText.do",
			success:function(data){
				$("#result").html(data);
			}
		});
	}
	
	function callAjaxJSON(){
		$.ajax({
			url:"callJSON.do",
			success:function(data){ // jackson을 이용하여 객체 반환시 알아서 javascript 객체로 json 데이터를 변환해서 넘겨준다.
				console.log(data.key1);
			}
		});
	}
	
	function callAjaxJSON2(){
		$.ajax({
			url : "callJSON2.do",
			success:function(data){
				console.log(data);
				var html = "";
				html += "<table border='1'>"
				for(var i=0; i<data.length; i++){
					html += "<tr>";
					html += "<td>"+data[i].name+"</td><td>"+data[i].age+"</td>";
					html += "</tr>";
				}
				html += "</table>";
				$("#result").html(html);
			}
			
		});
		/*
			ajax를 사용하여 callJSON2.do 로 요청을 보냅니다
			이때, 요청 페이지에서는
			[{name : 홍길동
			  age : 20}
			,{name : 이길동
			  age : 25}
			,{name : 고길동
			  age : 29}]
			
			형태의 json 데이터를 반환하여 화면에 테이블로 출력합니다.
			(jackson 라이브러리 활용)
		*/
		
	}
</script>
</head>
<body>
	<h2>ajax 예제 페이지</h2>
	<button onclick="callAjaxText()">ajax1</button>
	<button onclick="callAjaxJSON()">ajax2</button>
	<button onclick="callAjaxJSON2()">ajax3</button>
	<div id="result"></div>
</body>
</html>




