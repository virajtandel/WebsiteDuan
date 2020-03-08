<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiết Học Thử</title>
<!--HEAD TAG-->
<%@include file="includes/heatag.jsp"%>
<link rel="stylesheet" href="css/hocthu.css">
<link rel="stylesheet" href="css/stylehocthu.css">
</head>
<body>
	<!--HEADER-->
	<%@include file="includes/header.jsp"%>
	<section class="container">
		<div class="row">
			<div class="col-12 col-sm-1 col-md-1"></div>
			<div class="col-12 col-sm-10 col-md-10" style="height: 400px">
				${ViewHocThuById.video }
			</div>
				<div class="col-12 col-sm-1 col-md-1"></div>	
		</div>
		<div class="row mt-3 mb-4">
			<div class="col-12 col-sm-1 col-md-1"></div>	
			<div class="col-12 col-sm-2 col-md-2"><button type="button" class="btn btn-danger"> <i class="far fa-list-alt"> Nội dung</i></button></div>		
		</div>
		<div class="row mt-3 mb-4">
			<div class="col-12 col-sm-1 col-md-1"></div>	
			<div class="col-12 col-sm-10 col-md-10">
				<div class="card">
	    			<div class="card-body" style="text-align: justify;">${ViewHocThuById.noidung }</div>
	  			</div>
			</div>
			<div class="col-12 col-sm-1 col-md-1"></div>
		</div>
		<!-- Phan kiem tra  -->
		<div class="row mt-3 mb-4">
			<div class="col-12 col-sm-1 col-md-1"></div>	
			<div class="col-12 col-sm-2 col-md-2"><button type="button" class="btn btn-danger"> <i class="far fa-list-alt"> Kiểm tra</i></button></div>		
		</div>
		<div class="row mt-3 mb-4">
			<div class="col-12 col-sm-1 col-md-1"></div>	
			<div class="col-12 col-sm-10 col-md-10">
				<div class="card">
	    			<div class="card-body" style="text-align: justify;" id="tracnhiem">
		    			<div class="row"id="tencauhoi">
		    					<!-- Show tên câu hỏi -->	
		    			</div>
	    			</div>
	    			<div class="col-xs-12 col-sm-12 col-md-12 row mb-4">
						<div class="col-12 col-sm-5 sol-md-5"></div>
						<div class="col-12 col-sm-2 sol-md-2">
						<a href="/khoahoc">
							<button type="button" class="btn btn-danger" id="">Kiểm tra <i class="fas check"></i></button> <br>
						</a>
						</div>
						<div class="col-12 col-sm-5 sol-md-5"></div>
					</div>
	  			</div>
			</div>
			<div class="col-12 col-sm-1 col-md-1"></div>
		</div>
	</section>
	<section>
		<div class="col-xs-12 col-sm-12 col-md-12 row">
			<div class="col-12 col-sm-5 sol-md-5"></div>
				
				<div class="col-12 col-sm-2 sol-md-2">
				<a href="/khoahoc">
					<button type="button" class="btn btn-lg btn-primary container " id="btn-hoanthanh">Hoàn thành <i class="fas fa-forward"></i></button>
				</a>
				</div>
		
			<div class="col-12 col-sm-5 sol-md-5"></div>
		</div>
	</section>
	<!--FOOTER-->
	<%@include file="includes/footer.jsp"%>
	<%@include file="includes/tag_plugin_fb.jsp"%>
	<script type="text/javascript">
	$(document).ready(function () {
		 $.getJSON('http://localhost:8888/rest/quiz/quizhiragetAll', function(data){
	   		 $.each(data,function(key,value){
	   			 $('#tencauhoi').append('<div class="col-12 col-12 col-md-12" ><h5>Câu'+value.id+': '+value.cauhoi+'</h5></div><div class="col-12 col-sm-6 col-md-6"> a) <button type="button" class="btn ">'+value.a+'</button></div><div class="col-12 col-sm-6 col-md-6"> b) <button type="button" class="btn ">'+value.b+'</button></div><div class="col-12 col-sm-6 col-md-6">c) <button type="button" class="btn ">'+value.c+'</button></div><div class="col-12 col-sm-6 col-md-6"> d) <button type="button" class="btn ">'+value.d+'</button></div>')
	   			 $('#btn-hoanthanh').hide();
	   		 });
	 
	   	
	   	 });
		
	});
	</script>
</body>
</html>