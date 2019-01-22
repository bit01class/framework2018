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
			<li class="active"><a href="${root }intro.do">INTRO</a></li>
			<li><a href="${root }bbs/list.do">BBS</a></li>
			<li><a href="#">LOGIN</a></li>
		</ul>
	</div><!-- /.container-fluid -->
</div>
<div class="container">
  <div class="row">
    <div class="col-md-12">
    	<div class="jumbotron">
		  <h1>Intro!</h1>
		  <p>...</p>
		</div>
    </div>
  </div>
  <div class="row">
    <div class="col-xs-12 col-md-6">
    	<img src="${root }imgs/Koala.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
    </div>
    <div class="col-xs-12 col-md-6">
    	<img src="${root }imgs/Hydrangeas.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
    </div>
    <div class="col-xs-12 col-md-6">
    	<img src="${root }imgs/Penguins.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
    </div>
    <div class="col-xs-12 col-md-6">
    	<img src="${root }imgs/Tulips.jpg" class="img-responsive img-thumbnail" alt="Responsive image">
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





























