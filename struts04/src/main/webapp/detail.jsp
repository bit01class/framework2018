<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세페이지</h1>
	<form action="edit.action" method="post">
		<div>
			<label for="idx">글번호</label>
			<input type="text" name="idx" id="idx" value="${bean.idx }" readonly="readonly"/>
		</div>
		<div>
			<label for="sub">제목</label>
			<input type="text" name="sub" id="sub" value="${bean.sub }" />
		</div>
		<div>
			<label for="nalja">날짜</label>
			<input type="text" id="nalja" value="${bean.nalja }" />
		</div>
		<div>
			<label for="cnt">조회수</label>
			<input type="text"  id="cnt" value="${bean.cnt }" />
		</div>
		<div>
			<textarea name="content" rows="5" cols="60">${bean.content }</textarea>
		</div>
		<button type="submit">수정</button>
	</form>

</body>
</html>












