<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
		  <p><a class="btn btn-primary btn-lg" href="add.do" role="button">글쓰기</a></p>
		</div>
    </div>
  </div>
  <div class="row">
    <div class="col-md-12">
    	<div class="page-header">
		  <h1>게시판 <small>BBS</small></h1>
		</div>
		<div class="list-group">
		<c:forEach items="${alist }" var="bean">
		  <a href="${root }detail.do?idx=${bean.idx}" class="list-group-item">
		  	<span class="badge">${bean.cnt }</span>
		  	<h2 class="list-group-item-heading">${bean.sub }</h2>
		  	<p class="list-group-item-text"><fmt:formatDate value="${bean.nalja }" pattern="yy-MM-dd"/> </p>
		  </a>
		</c:forEach>
		</div>
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





























