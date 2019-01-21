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
			  	<a class="btn btn-default" href="main.jsp" role="button">HOME</a>
			  	<a class="btn btn-default" href="intro.jsp" role="button">INTRO</a>
			  	<a class="btn btn-default active" href="list.jsp" role="button">BBS</a>
			  	<a class="btn btn-default" href="#" role="button">LOGIN</a>
			  </div>
		  </div>
		</div> <!-- row end -->
		<div class="row">
		  <div class="col-md-12">
		  	<ol class="breadcrumb">
				  <li><a href="main.jsp">Home</a></li>
				  <li><a href="list.jsp">Bbs</a></li>
				  <li class="active">Add</li>
			</ol>
			<div class="page-header">
			  <h1>글쓰기 <small>xxx게시판</small></h1>
			</div>
			<!-- form start -->
			<form>
			  <div class="form-group">
			    <label for="sub">제목</label>
			    <input type="text" name="sub" class="form-control" id="sub" placeholder="제목을 입력하세요">
			  </div>
			  <div class="form-group">
			    <label for="content">내용</label>
			    <textarea name="content" id="content" class="form-control" placeholder="내용을 입력하세요"></textarea>
			  </div>
			  <button type="submit" class="btn btn-primary">작성</button>
			  <button type="reset" class="btn btn-default">취소</button>
			</form>
			<!-- form end -->
		  </div>
		</div> <!-- row end -->
	</div><!-- container end -->
</body>
</html>













