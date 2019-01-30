<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="template/header.jspf" %>

</head>
<body>
<%@ include file="template/menu.jspf" %>


	<div id="header" class="row">
		<div class="col-md-12">
			<!-- START -->
			<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
					<div class="jumbotron">
					  <h1>1PAGE</h1>
					  <p>...</p>
					  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
					</div>
			    </div>
			    <div class="item">
					<div class="jumbotron">
					  <h1>2PAGE!</h1>
					  <p>...</p>
					  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
					</div>
			    </div>
			    <div class="item">
					<div class="jumbotron">
					  <h1>3PAGE!</h1>
					  <p>...</p>
					  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
					</div>
			    </div>
			  </div>
			
			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
			<!-- END -->
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12"></div>
	</div>
	
<%@ include file="template/footer.jspf" %>
</body>
</html>



























