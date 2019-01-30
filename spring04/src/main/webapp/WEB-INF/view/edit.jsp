<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="template/header.jspf" %>
<style type="text/css">
	textarea {
	width: 100%;
	height: 200px;
}
</style>
<script type="text/javascript">
	/* $(function(){
		$('.alert').hide();
		$('form').submit(function(){
			var sub=$('#sub').val();
			if(sub==''){
				$('.alert').show();
				return false;	
			}			
		});
			
	}); */

</script>
</head>
<%
Enumeration<String> enu=request.getAttributeNames();
while(enu.hasMoreElements()){
	System.out.println(enu.nextElement());
}
%>
<body>

<div class="alert alert-danger alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>Warning!</strong> 제목을 입력하세요${fieldErrors.sub}
</div>
<%@ include file="template/menu.jspf" %>

	<div id="header" class="row">
		<div class="col-md-12">
			<div class="page-header">
			  <h1>수정페이지 <small>게시글을 작성하세요</small></h1>
			</div>
		</div>
	</div>
	<div id="content" class="row">
		<div class="col-md-12">
			<form class="form-horizontal" action="update.do" method="post">
				<input type="hidden" name="num" value="${bean.num }"/>
			  <div class="form-group">
			    <label for="sub" class="col-sm-2 control-label">제목</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="sub" id="sub"  value="${bean.sub }"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="userNum" class="col-sm-2 control-label">글쓴이</label>
			    <div class="col-sm-10">
			      <input type="hidden" name="userNum" value="0">
			      <input type="text" class="form-control" id="userNum" value="손님">
			    </div>
			  </div>
			  <div class="form-group">
			  <label for="content" class="col-sm-2 control-label"></label>
			    <div class="col-sm-10">
			    	<textarea id="content" name="content">${bean.content }</textarea>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary">수정</button>
			      <button type="reset" class="btn btn-default">취소</button>
			    </div>
			  </div>
			</form>
		</div>
	</div>

<%@ include file="template/footer.jspf" %>
</body>
</html>

















