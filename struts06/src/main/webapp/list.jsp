<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<meta charset="utf-8" >
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css" integrity="sha384-PmY9l28YgO4JwMKbTvgaS7XNZJ30MK9FAZjjzXtlqyZCqBY6X6bXIkM++IkyinN+" crossorigin="anonymous">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap-theme.min.css" integrity="sha384-jzngWsPS6op3fgRCDTESqrEJwRKck+CILhJVO5VvaAZCq8JYf8HsR/HPpBOOPZfR" crossorigin="anonymous">
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js" integrity="sha384-vhJnz1OVIdLktyixHY4Uk3OHEwdQqPppqYR8+5mjsauETgLOcEynD9oPHhhz18Nw" crossorigin="anonymous"></script>
<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">
        비트교육센터
      </a>
    </div><!-- navbar header end  -->
    <ul class="nav navbar-nav">
    	<li><a href="index.do">HOME</a></li>
    	<li><a href="intro.do">INTRO</a></li>
    	<li><a href="#" class="dropdown-toggle" data-toggle="dropdown" 
    		role="button" aria-haspopup="true" aria-expanded="false">BBS<span class="caret"></span></a>
    		<ul class="dropdown-menu">
	            <li><a href="bbs/list.do">목록</a></li>
	            <li role="separator" class="divider"></li>
	            <li><a href="bbs/add.do">글쓰기</a></li>
        	</ul>
    	</li>
    	<li><a href="#">LOGIN</a></li>
    </ul>
  </div><!-- container-fluid end  -->
</nav><!-- navbar navbar-default end  -->
<div class="jumbotron">
  <h2>Hello, world!</h2>
  <p>...</p>
  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
</div>
<div class="page-header">
  <h1>목록 <small>게시판 목록</small></h1>
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
	<c:forEach items="${list }" var="bean">
		<tr>
			<td><a href="detail.do?idx=${bean.idx }">${bean.idx }</a></td>
			<td><a href="detail.do?idx=${bean.idx }">${bean.sub }</a></td>
			<td><a href="detail.do?idx=${bean.idx }"><fmt:formatDate value="${bean.nalja }" pattern="yy/MM/dd"/></a></td>
			<td><a href="detail.do?idx=${bean.idx }">${bean.cnt }</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>












