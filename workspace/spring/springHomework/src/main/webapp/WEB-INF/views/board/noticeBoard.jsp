<%@page import="org.springframework.web.servlet.support.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath()%>/resources/js/jquery-3.7.1.min.js"></script>
<script>
	$(function(){
		
		let moveForm = $("#moveForm");
		
		$(".pageInfo a").on("click", function(e){
		 	console.log("1234");
	        e.preventDefault();
	        moveForm.find("input[name='pageNum']").val($(this).attr("href"));
	        moveForm.attr("action","notice.do");
	        moveForm.submit();
			
		});
	});
</script>

</head>
<body>
	<a href="notice.do">공지사항</a>
	<a href="free.do"> 자유게시판</a>
	<a href="qna.do"> Q&A게시판</a>
	<!-- 세션에 있는걸 바로 가져와지는 원리 -->
	<span>
		${sessionScope.login.mname}님 환영합니다
	</span>
	<a href="<%=request.getContextPath() %>/logout.do"> 로그아웃</a>
	<br>
	<hr>
	<br>
	<br>
	<h3>공지사항</h3>
	<hr>
	<span>검색</span>
	
	<form action="notice.do" method="post">
	<!-- 만약 선택되어있다면 조건문 사용해서 선택되도록   -->
		<select name="search">
			<option value='1' <c:if test="${param.search eq 1}">selected</c:if> >전체</option>
			<option value='2' <c:if test="${param.search eq 2}">selected</c:if>>제목+내용</option>
			<option value='3' <c:if test="${param.search eq 3}">selected</c:if>>작성자</option>
		</select>
		<input type="text" name="searchText" value='${param.searchText}'>
		<input type="submit">
	</form>
	
	<br>
	<hr>
	<br>
	
	<table border="1">
		<tr>
			<th>NO</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		 <c:forEach var="vo" items="${blist}">
		<tr>
			<td>${vo.bno}</td>
			<td><a href="view.do?mno=${vo.bno}">${vo.btitle}</a></td>
			<td>${vo.mname}</td>
			<td>${vo.rdate}</td>
			<td>1</td>
		</tr>
		</c:forEach>
	</table>
	
	<div class="pageInfo_wrap" >
        <div class="pageInfo_area">
		 	<ul>
		 	
		 	<!-- 이전페이지 버튼 -->
                <c:if test="${pageMaker.prev}">
                    <li class="pageInfo_btn previous"><a href="${pageMaker.startPage-1}">Previous</a></li>
                </c:if>
		 	
		 	
  			 <!-- 각 번호 페이지 버튼 -->
                <c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class="pageInfo ${pageMaker.aa == num ? "active":"" }"><a href="${num}">${num}</a></li>
                </c:forEach>
                
             <!-- 다음페이지 버튼 -->
                <c:if test="${pageMaker.next}">
                    <li class="pageInfo_btn next"><a href="${pageMaker.endPage + 1 }">Next</a></li>
                </c:if>
                 
 			</ul>
        </div>
    </div>
	
	<!-- 다른데 갔다가 다시왔을 때 정보저장을 위한 히든 -->
	<form id="moveForm" method="get">
		<input type="text" name="pageNum" value="${pageMaker.aa }">
    	<input type="text" name="amount" value="${pageMaker.amount }">
	</form>
	
	<br>
	<c:if test="${login.mid == 'admin'}">
		<a href="post.do">등록</a>
	</c:if>
	
	<c:if test="${login.mid != 'admin'}">
		<a href="post.do">드응록</a>
	</c:if>
</body>
</html>