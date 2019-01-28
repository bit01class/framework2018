<%@ page import="com.bit.spr.model.entity.Bbs03Vo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Bbs03Vo bean=(Bbs03Vo)request.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;
	window.onload=function(){
		var del=document.querySelector('#del');
		del.onclick=function(){
			postDel();
			return false;
		};
	}
	function postDel(){
		xhr = new XMLHttpRequest();
		xhr.onreadystatechange=function(){	
			window.location.href='list.do';
		}; 
		xhr.open('POST', 'delete.do?idx=<%=bean.getNum() %>', false);
		xhr.send(null);
	}
</script>
</head>
<body>
<nav>
	<a href="index.do">[HOME]</a>
	<a href="list.do">[BBS]</a>
</nav>
	<h1>상세페이지</h1>
	<div>
		<span>글번호</span>
		<span><%=bean.getNum() %></span>
		<span>글쓴이</span>
		<span><%=bean.getName() %></span>
		<span>날짜</span>
		<span><%=bean.getNalja() %></span>
	</div>
	<div>
		<span>제목</span>
		<span><%=bean.getSub() %></span>
	</div>
	<div>
		<span>내용</span>
		<span><%=bean.getContent()==null?"":bean.getContent() %></span>
	</div>
	<a href="edit.do?idx=<%=bean.getNum() %>">[수정]</a>
	<a id="del" href="delete.do?idx=<%=bean.getNum() %>">[삭제]</a>
</body>
</html>












