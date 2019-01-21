<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			  	<a class="btn btn-default" href="index.do" role="button">HOME</a>
			  	<a class="btn btn-default" href="intro.do" role="button">INTRO</a>
			  	<a class="btn btn-default active" href="list.do" role="button">BBS</a>
			  	<a class="btn btn-default" href="#" role="button">LOGIN</a>
			  </div>
		  </div>
		</div> <!-- row end -->
		<div class="row">
		  <div class="col-md-12">
		  	<ol class="breadcrumb">
				  <li><a href="index.do">Home</a></li>
				  <li><a href="list.do">Bbs</a></li>
				  <li class="active">Add</li>
			</ol>
			<div class="page-header">
			  <h1>${bean.num }번 상세페이지 <small>조회수:${bean.cnt }</small></h1>
			</div>
			<!-- form start -->
			<form action="insert.do">
			  <div class="form-group">
			    <label for="sub">제목</label>
			    <input type="text" name="sub" class="form-control" id="sub" value="${bean.sub }">
			  </div>
			  <div class="form-group">
			    <label for="content">내용</label>
			    <textarea name="content" id="content" class="form-control">${bean.content }</textarea>
			  </div>
			</form>
			<!-- form end -->
			<a href="delete.do?idx=${bean.num }"  role="button" class="btn btn-danger">삭제</a>
		  </div>
		</div> <!-- row end -->
	</div><!-- container end -->
</body>
</html>













