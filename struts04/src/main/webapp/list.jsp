<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
	border-collapse: collapse;
	width: 500px;
}
	td>a{
		display: block;
	}
	
</style>
</head>
<body>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
	<c:forEach items="${list }" var="bean">
		<tr>
			<td><a href="detail.action?bean.idx=${bean.idx }">${bean.idx }</a></td>
			<td><a href="detail.action?bean.idx=${bean.idx }">${bean.sub }</a></td>
			<td><a href="detail.action?bean.idx=${bean.idx }">${bean.nalja }</a></td>
			<td><a href="detail.action?bean.idx=${bean.idx }">${bean.cnt }</a></td>
		</tr>
	</c:forEach>

	</table>
	<a href="add.action">[입력]</a>
</body>
</html>







