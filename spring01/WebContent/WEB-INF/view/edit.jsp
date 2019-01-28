<%@page import="com.bit.spr.model.entity.Bbs03Vo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	Bbs03Vo bean=(Bbs03Vo)request.getAttribute("bean");
%>
<body>
<nav>
	<a href="index.do">[HOME]</a>
	<a href="list.do">[BBS]</a>
</nav>
<h1>수정페이지</h1>
<form action="update.do" method="post">
	<div>
		<span>글번호</span>
		<span><%=bean.getNum() %></span>
		<span>글쓴이</span>
		<span><%=bean.getName() %></span>
		<span>날짜</span>
		<span><%=bean.getNalja() %></span>
		<input type="hidden" name="num" id="num" value="<%=bean.getNum() %>" />
	</div>
	<div>
		<label for="sub">제목</label>
		<input type="text" name="sub" id="sub" value="<%=bean.getSub() %>" />
	</div>
	<div>
		<label for=""></label>
		<textarea name="content"><%=bean.getContent()%></textarea>
	</div>
	<div>
		<button type="submit">수정</button>
		<button type="reset">취소</button>
	</div>
</form>

</body>
</html>













