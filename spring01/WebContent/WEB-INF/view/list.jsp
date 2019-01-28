<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, com.bit.spr.model.entity.Bbs03Vo"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav>
	<a href="index.do">[HOME]</a>
	<a href="list.do">[BBS]</a>
</nav>
<h1>리스트페이지</h1>
<table>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>날짜</th>
	</tr>
	<%
		List<Bbs03Vo> list=(List<Bbs03Vo>)request.getAttribute("alist");
	for(Bbs03Vo bean : list){
	%>
	<tr>
		<td><%=bean.getNum() %></td>
		<td><%=bean.getSub() %></td>
		<td><%=bean.getNalja() %></td>
	</tr>
	<%
	}
	%>
</table>
<a href="add.do">입력</a>
</body>
</html>