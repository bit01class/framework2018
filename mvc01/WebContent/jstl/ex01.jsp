<%@page import="java.util.Date"%>
<%@page import="com.bit.model.JavaBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	String msg="Hello JSTL";
	pageContext.setAttribute("msg", msg);
	/* 
	JavaBean bean=new JavaBean();
	pageContext.setAttribute("bean", bean);
	 */
%>
<body>
	<h1>jstl 문법</h1>
	<div><c:out value="${msg }">여기도 메시지</c:out> </div>
	
	<c:set var="msg2" scope="request" value="xyz"/>
	<div>${requestScope.msg2 }</div>
	<div><c:out value="${msg2 }"></c:out> </div>
	
	
	<jsp:useBean id="bean" class="com.bit.model.JavaBean" scope="page"></jsp:useBean>
	<c:set target="${bean }" property="num" value="1234"></c:set>
	<c:set target="${bean }" property="num2" value="3.14"></c:set>
	<c:set target="${bean }" property="ch" value="*"></c:set>
	<c:set target="${bean }" property="nalja" value="<%=new Date() %>"></c:set>
	<c:set target="${bean }" property="boo" value="true"></c:set>
	
	<div>${bean.num }</div>
	<div>${bean.num2 }</div>
	<div>${bean.ch }</div>
	<div>${bean.name }</div>
	<div>${bean.nalja }</div>
	<div>${bean.boo }</div>
</body>
</html>
































