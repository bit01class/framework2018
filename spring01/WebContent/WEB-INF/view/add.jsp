<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1>입력페이지</h1>
	<form action="insert.do" method="post">
		<div>
			<label for="sub">제목</label>
			<input type="text" name="sub" id="sub" />
		</div>
		<div>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<textarea name="content"></textarea>
		</div>
		<div>
			<input type="submit" value="입력" />
			<input type="reset" value="취소" />
		</div>
	
	</form>
</body>
</html>














