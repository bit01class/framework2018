<%@page import="java.util.HashMap"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl 제어문</h1>
	
	<h2>조건문</h2>
	<c:set var="obj" value="5" scope="page"></c:set>
	<c:set var="obj2" value="1" scope="page"></c:set>
	<c:if test="${obj gt obj2}">
		<p>${obj2 }보다 큼</p>
	</c:if>
	<c:if test="${obj le obj2}">
		<p>${obj2 }보다 작거나 같음</p>
	</c:if>
	
	<c:set var="su" value="5"></c:set>
	<c:choose>
		<c:when test="${su eq 0 }">su=0</c:when>
		<c:when test="${su eq 1 }">su=1</c:when>
		<c:when test="${su eq 2 }">su=2</c:when>
		<c:otherwise>
		몰라
		</c:otherwise>
	</c:choose>
	
	
	<h2>반복문</h2>
	<c:forEach begin="1" end="10" step="2" var="obj3" varStatus="status">
		<p>${status.step} - ${obj3 }출력</p>
	</c:forEach>
	<hr/>
	<%
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("item1");
		alist.add("item2");
		alist.add("item3");
		alist.add("item4");
		
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(1111);
		hset.add(2222);
		hset.add(3333);
		hset.add(2222);
		hset.add(1111);
		
		HashMap<String,String> hmap=new HashMap<String,String>();
		hmap.put("key1", "value1");
		hmap.put("key2", "value2");
		hmap.put("key3", "value3");
		hmap.put("key4", "value4");
		
		
		pageContext.setAttribute("alist", alist);
	
		/* for(String msg: alist){
		} */
	%>
	
	<c:forEach var="msg" items="${alist }" varStatus="status">
		<p>${status.index} - ${msg }</p>
	</c:forEach>
	
</body>
</html>






























