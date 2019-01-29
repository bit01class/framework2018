<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<div class="col-md-12">
		
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12">
			<table class="table">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>글쓴이</th>
						<th>조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${alist }" var="bean">
						<tr>
							<td><a href="#">${bean.num }</a></td>
							<td><a href="#">${bean.sub }</a></td>
							<td><a href="#">${bean.name }</a></td>
							<td><a href="#">${bean.cnt }</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<a href="add.do" role="button" class="btn btn-primary">입력</a>
	</div>

<%@ include file="template/footer.jspf" %>
</body>
</html>
















