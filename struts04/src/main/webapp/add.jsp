<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="insert.action" method="post">
		<div>
			<label for="sub">제목</label>
			<input type="text" name="sub" id="sub" />${fieldErrors.sub }
		</div>
		<div>${fieldErrors.content}
			<textarea rows="5" cols="60" name="content"></textarea>
		</div>
		<button type="submit">입력</button>
	</form>
</body>
</html>