<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
	width: 100%;
}
</style>
</head>
<body>
	<h1>el 표현식</h1>
	<table>
		<tr>
			<th>자료형</th>
			<th>표현식</th>
			<th>java</th>
		</tr>
		<tr>
			<td>문자열</td>
			<td>${"abc" }</td>
			<td><%="abc" %></td>
		</tr>
		<tr>
			<td>문자열</td>
			<td>${'abc' }</td>
			<td><%="abc" %></td>
		</tr>
		<tr>
			<td>정수</td>
			<td>${100 }</td>
			<td><%=100 %></td>
		</tr>
		<tr>
			<td>실수</td>
			<td>${3.14 }</td>
			<td><%=3.14 %></td>
		</tr>
		<tr>
			<td>연산</td>
			<td>${7/3 }</td>
			<td><%=7/3 %></td>
		</tr>
		<tr>
			<td>연산</td>
			<td>${7%3 }</td>
			<td><%=7%3 %></td>
		</tr>
		<tr>
			<td>연산</td>
			<td>${7 div 3 }</td>
			<td><%=7/3 %></td>
		</tr>
		<tr>
			<td>연산</td>
			<td>${7 mod 3 }</td>
			<td><%=7%3 %></td>
		</tr>
		<tr>
			<td>boolean</td>
			<td>${false }</td>
			<td><%=false %></td>
		</tr>
		<tr>
			<td>비교연산</td>
			<td>${5==3 }</td>
			<td><%=5==3 %></td>
		</tr>
		<tr>
			<td>비교연산</td>
			<td>${5 eq 5 }</td>
			<td><%=5==5 %></td>
		</tr>
		<tr>
			<td>비교연산</td>
			<td>${5 gt 3 }</td>
			<td><%=5>3 %></td>
		</tr>
		<tr>
			<td>비교연산</td>
			<td>${5 le 3 }</td>
			<td><%=5<3 %></td>
		</tr>
		<tr>
			<td>비교연산</td>
			<td>${5 ge 3 }</td>
			<td><%=5>=3 %></td>
		</tr>
		<tr>
			<td>비교연산</td>
			<td>${5 lt 3 }</td>
			<td><%=5<=3 %></td>
		</tr>
		<% String msg=null; %>
		<tr>
			<td>null</td>
			<td>${msg }</td>
			<td><%=msg %></td>
		</tr>
		
	</table>
	
	
</body>
</html>










