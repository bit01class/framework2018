<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
		  <div class="col-md-12">
			  <div class="btn-group btn-group-justified" role="group" >		  
			  	<a class="btn btn-default" href="main.jsp" role="button">HOME</a>
			  	<a class="btn btn-default" href="intro.jsp" role="button">INTRO</a>
			  	<a class="btn btn-default active" href="list.jsp" role="button">BBS</a>
			  	<a class="btn btn-default" href="#" role="button">LOGIN</a>
			  </div>
		  </div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
				  <li><a href="#">Home</a></li>
				  <li class="active">Bbs</li>
				</ol>
				<div class="page-header">
				  <h1>게시판 <small>xxx게시판</small></h1>
				</div>
				
				<table class="table">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>날짜</th>
						<th>조회수</th>
					</tr>				
				</thead>
				<tbody>
					<tr>
						<td>3</td>
						<td>테스트3</td>
						<td>19/01/01</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2</td>
						<td>테스트2</td>
						<td>19/01/01</td>
						<td>0</td>
					</tr>
					<tr>
						<td>1</td>
						<td>테스트1</td>
						<td>19/01/01</td>
						<td>0</td>
					</tr>
				</tbody>
				</table>
				<a href="add.jsp" role="button" class="btn btn-primary">글쓰기</a>
			</div>
		</div>
	</div>

</body>
</html>






















