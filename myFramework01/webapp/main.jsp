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
	<div class="container-fluid">
		<!-- Stack the columns on mobile by making one full-width and the other half-width -->
		<div class="row">
		  <div class="col-xs-12 col-md-8">.col-xs-12 .col-md-8</div>
		  <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
		</div>
		
		<!-- Columns start at 50% wide on mobile and bump up to 33.3% wide on desktop -->
		<div class="row">
		  <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
		  <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
		  <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
		</div>
		
		<!-- Columns are always 50% wide, on mobile and desktop -->
		<div class="row">
		  <div class="col-xs-6">.col-xs-6</div>
		  <div class="col-xs-6">.col-xs-6</div>
		</div>
	</div>
</body>
</html>