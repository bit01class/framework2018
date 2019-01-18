<%@page import="java.util.HashSet"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String msg="환영합니다";
	pageContext.setAttribute("msg", msg);
	
	String[] msgs={"item1","item2","item3","item4"};
	pageContext.setAttribute("msgs", msgs);
	
	ArrayList<String> alist=new ArrayList<String>();
	alist.add("array1");
	alist.add("array2");
	alist.add("array3");
	alist.add("array4");
	pageContext.setAttribute("alist", alist);
	/* 
	HashSet<Integer> hset=new HashSet<Integer>();
	hset.add(1111);
	hset.add(3333);
	hset.add(5555);
	hset.add(3333);
	hset.add(1111);
	pageContext.setAttribute("hset", hset);
	 */
	 
	HashMap<String,String> hmap=new HashMap<String,String>();
	 hmap.put("key1", "value1");
	 hmap.put("key2", "value2");
	 hmap.put("key3", "value3");
	 hmap.put("key4", "value4");
	pageContext.setAttribute("hmap", hmap);
	%>
	<h1>el 활용</h1>
	<div>el page scope:${pageScope.msg }</div>
	<div>el request scope:${requestScope.msg }</div>
	<div>page:<%=pageContext.getAttribute("msg") %></div>
	<div>request:<%=request.getAttribute("msg") %></div>
	<%
		String[] strs=(String[])pageContext.getAttribute("msgs");
	%>
	<ul>
		<li><%=strs[0] %></li>
		<li><%=strs[1] %></li>
		<li><%=strs[2] %></li>
		<li><%=strs[3] %></li>
	</ul>
	<ul>
		<li>${msgs[0] }</li>
		<li>${msgs[1] }</li>
		<li>${msgs[2] }</li>
		<li>${msgs[3] }</li>
	</ul>
	<%
	ArrayList<String> alist2= (ArrayList<String>)pageContext.getAttribute("alist");
	%>
	<ol>
		<li><%=alist2.get(0) %></li>
		<li><%=alist2.get(1) %></li>
		<li><%=alist2.get(2) %></li>
		<li><%=alist2.get(3) %></li>
	</ol>
	
	<ol>
		<li>${alist.get(0) }</li>
		<li>${alist.get(1) }</li>
		<li>${alist.get(2) }</li>
		<li>${alist.get(3) }</li>
	</ol>
	
	<dl>
		<dt>key1</dt>
		<dd>${hmap.key1 }</dd>
		<dt>key2</dt>
		<dd>${hmap.key2 }</dd>
		<dt>key3</dt>
		<dd>${hmap.key3 }</dd>
		<dt>key4</dt>
		<dd>${hmap.key4 }</dd>
	</dl>
	
	<div>int:${bean.num }</div>
	<div>double:${bean.num2 }</div>
	<div>char:${bean.ch }</div>
	<div>String:${bean.name }</div>
	<div>Date:${bean.nalja }</div>
	<div>boolean:${bean.boo }</div>
	
</body>
</html>




















