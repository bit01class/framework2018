<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${root }css/bootstrap.min.css" />
<script type="text/javascript" src="${root }js/jquery.min.js"></script>
<script type="text/javascript" src="${root }js/bootstrap.min.js"></script>
</head>
<body>
<div class="navbar navbar-default">
	<div class="container-fluid">
    	<!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <div class="navbar-brand">비트교육센터</div>
	    </div>
	    <ul class="nav navbar-nav">
			<li><a href="${root }index.do">HOME</a></li>
			<li><a href="${root }intro.do">INTRO</a></li>
			<li class="active"><a href="${root }bbs/list.do">BBS</a></li>
			<li><a href="#">LOGIN</a></li>
		</ul>
	</div><!-- /.container-fluid -->
</div>
<div class="container">
  <div class="row">
    <div class="col-md-12">
    	<div class="jumbotron">
		  <h1>게시판!</h1>
		  <p>...</p>
		  <p><a class="btn btn-primary btn-lg" href="list.do" role="button">목록</a></p>
		</div>
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
    	<!-- start -->
    	<form class="form-horizontal" action="insert.do" method="post">
		  <div class="form-group">
		    <label for="sub" class="col-sm-2 control-label">제목</label>
		    <div class="col-sm-10">
		      <input type="text" name="sub" class="form-control" id="sub" placeholder="제목없음">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="content" class="col-sm-2 control-label">내용</label>
		    <div class="col-sm-10">
		      <textarea name="content" class="form-control" id="content"></textarea>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary">작성</button>
		      <button type="reset" class="btn btn-default">취소</button>
		    </div>
		  </div>
		</form>
    	<!-- end -->
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
    	<address>
		  <strong>Twitter, Inc.</strong><br>
		  1355 Market Street, Suite 900<br>
		  San Francisco, CA 94103<br>
		  <abbr title="Phone">P:</abbr> (123) 456-7890
		</address>
		
		<address>
		  <strong>Full Name</strong><br>
		  <a href="mailto:#">first.last@example.com</a>
		</address>
    </div>
  </div>
</div>
</body>
</html>





























