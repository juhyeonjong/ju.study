<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%
	 // 일반 헤더
	 // 로그인되어 있지 않으면 로그인 하세요.
	 // 로그인 되어 있다면 일반헤더 출력

%>

<%@ include file="setting.jsp"%>
<head>
	<link href="${path}/resources/css/header.css" type="text/css" rel="stylesheet"> 
</head>
<body>
<div class="top_frame">
	<sec:authorize access="isAuthenticated()">
	<nav>
		<div class="center_cont">
			<div class="nav_first">
				<span> 
					<a href="<%=request.getContextPath() %>/notification/index.do">공지사항</a>
				</span>
				<span> 
					<a href="<%=request.getContextPath() %>/free/index.do">자유 게시판</a>
				</span>
				<span>  
					<a href="<%=request.getContextPath() %>/qna/index.do">Q&A</a>
				</span>
			</div>
			
			<div class="nav_second">
				<span>
					<sec:authentication property="principal.username"/>님 환영합니다.
				</span>
			</div>
		
			<div class="nav_third">
				
				<span>
				[ 
					<a href="<%=request.getContextPath() %>/mypage.do">마이페이지</a> 
				  |
				  	<a href="<%=request.getContextPath() %>/logout.do">로그아웃</a>
				]
				</span>
			</div>
		</div>
	</nav>
	
	<hr class="top_line">
	</sec:authorize>
	
	<sec:authorize access="isAnonymous()">
		<h2>해당 홈 페이지는 로그인 후 사용 가능합니다.</h2>
		<hr class="top_line">
	</sec:authorize>
</div>


</body>