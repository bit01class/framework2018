<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="template/header.jspf" %>
</head>
<body>
<%@ include file="template/menu.jspf" %>

	<div id="header" class="row">
		<div class="col-md-12"></div>
	</div>
	<div id="content" class="row">
		<div class="col-md-2">글번호</div>
		<div class="col-md-2">${bean.num }</div>
		<div class="col-md-2">글쓴이</div>
		<div class="col-md-2">${bean.name }</div>
		<div class="col-md-2">조회수</div>
		<div class="col-md-2">${bean.cnt }</div>
		<div class="col-md-4">제목</div>
		<div class="col-md-8">${bean.sub }</div>
		<div class="col-md-4">내용</div>
		<div class="col-md-8">${bean.content }</div>
		<div class="col-md-12">
			<a href="edit.do?idx=${bean.num }" class="btn btn-default" role="button">수정</a>
		</div>
	</div>


<%@ include file="template/footer.jspf" %>
</body>
</html>