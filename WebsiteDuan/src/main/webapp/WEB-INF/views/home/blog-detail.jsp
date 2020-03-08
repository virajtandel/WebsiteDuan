<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tin tức</title>

<!-- mobile responsive meta -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<%@include file="includes/heatag.jsp"%>
<!-- Font Asome -->
<script src="https://kit.fontawesome.com/4d64ca3050.js"></script>
<!-- Main Stylesheet -->
<link href="css/styleblog.css" rel="stylesheet">
<link rel="stylesheet" href="css/footer.css">
<!--Favicon-->
<link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
<link rel="icon" href="images/favicon.png" type="image/x-icon">

</head>
<body>
	<%@include file="includes/header.jsp"%>
	<!-- blog details -->
	<section class="section">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<!-- post thumb -->

					<div class="position-relative mb-5">
						<img src="/files/${showdetail.hinhanh}" alt="post thumb"
							class="img-fluid w-100">
						<div class="card-type hover-ripple">Bài báo</div>
					</div>
					<div class="card-meta text-uppercase mb-2">
						Bởi <strong class="text-dark">${showdetail.user.username}</strong>/
						Ngày <strong class="text-dark"> ${showdetail.ngaydang}
						</strong>
					</div>
					<!--Start post-->
					<h2>${showdetail.tieude}</h2>


					<p style="text-align: justify;">${showdetail.noidung}</p>
					<!-- tags -->
					<div class="mb-3">
						<h5 class="d-inline-block mr-3">Tags:</h5>
						<ul class="list-inline d-inline-block">
							<li class="list-inline-item"><a class="text-color" href="#">Business</a>,</li>
							<li class="list-inline-item"><a class="text-color" href="#">Marketing</a>,</li>
							<li class="list-inline-item"><a class="text-color" href="#">Finance</a></li>
						</ul>
					</div>
					<!--end Post-->
					<!-- share -->
					<div class="mb-5">
						<h5 class="d-inline-block mr-3">Share:</h5>
						<ul class="list-inline d-inline-block">
							<li class="list-inline-item"><a class="text-color" href="#"><i class="fab fa-facebook"></i></a></li>
							<li class="list-inline-item"><a class="text-color" href="#"><i class="fab fa-twitter"></i></a></li>
							<li class="list-inline-item"><a class="text-color" href="#"><i class="fab fa-google"></i></a></li>
							<li class="list-inline-item"><a class="text-color" href="#"><i class="fab fa-instagram"></i></a></li>
						</ul>
					</div>
					<!-- Cmt Fb -->
					<div class="fb-comments"
						data-href="http://localhost:8888/detail-blog?id=${showdetail.idtintuc}"
						data-width="720" data-numposts="5"></div>
				</div>

				<!-- sidebar -->
				<aside class="col-lg-4">
					<!-- search -->
					<div class="bg-white px-4 py-5 box-shadow mb-5">
						<div class="position-relative">
							<form action="#">
								<h4>Search</h4>
								<input type="search"
									class="form-control rounded-0 border-top-0 border-left-0 border-right-0 border-color pl-0 focus-shadow-none"
									id="postSearch" name="postSearch" placeholder="Search here">
								<button type="submit" value="send" class="post-search">
									<i class="fa fa-search text-color"></i>
								</button>
							</form>
						</div>
					</div>
					<!-- latest post -->
					<div class="bg-white px-4 py-5 box-shadow mb-5">
						<h4 class="mb-4">Tin mới</h4>
						<!-- post-item -->
						<c:forEach var="tintuc" items="${showTinTuc}">
							<div class="media border-bottom border-color pb-3 mb-3">
								<img class="mr-3" src="/files/${tintuc.hinhanh}" alt="post-thumb"
									width=30%>
								<div class="media-body">
									<h5 class="mt-0">
										<a href="/detail-blog?id=${tintuc.idtintuc}" class="text-dark">${tintuc.tieude}</a>
									</h5>
									${tintuc.ngaydang }
								</div>
							</div>
						</c:forEach>
					</div>
					<!-- categories -->
					<div class="bg-white px-4 py-5 box-shadow mb-5">
						<h4 class="mb-4">Thể loại</h4>
						<ul class="list-styled style-circle">
							<li class="border-bottom border-color"><a href="#"
								class="text-color d-block pb-3 mt-3 text-decoration-none">Bài
									học kinh nghiệm</a></li>
							<li class="border-bottom border-color"><a href="#"
								class="text-color d-block pb-3 mt-3 text-decoration-none">Mẹo
									phỏng vấn</a></li>
							<li class="border-bottom border-color"><a href="#"
								class="text-color d-block pb-3 mt-3 text-decoration-none">Du
									học</a></li>
							<li class="border-bottom border-color"><a href="#"
								class="text-color d-block pb-3 mt-3 text-decoration-none">Có
									thể bạn chưa biết</a></li>
							<li class="border-bottom border-color"><a href="#"
								class="text-color d-block pb-3 mt-3 text-decoration-none">Về
									nước Nhật</a></li>
							<li><a href="#"
								class="text-color d-block pb-3 mt-3 text-decoration-none">Danh
									sách nhạc Nhật nên nghe</a></li>
						</ul>
					</div>
					<!-- tags -->
					<div class="bg-white px-4 py-5 box-shadow mb-5">
						<h4 class="mb-4">TAGS</h4>
						<ul class="list-inline tag-list">
							<li class="list-inline-item"><a class="hover-ripple"
								href="#">Giải trí</a></li>
							<li class="list-inline-item"><a class="hover-ripple"
								href="#">Nhạc tiếng Nhật</a></li>
							<li class="list-inline-item"><a class="hover-ripple"
								href="#">Nước Nhật</a></li>
							<li class="list-inline-item"><a class="hover-ripple"
								href="#">Tiếng Nhật</a></li>
							<li class="list-inline-item"><a class="hover-ripple"
								href="#">Du học sinh</a></li>
						</ul>
					</div>
				</aside>
			</div>
		</div>
	</section>
	<!-- /blog details -->
	<%@include file="includes/footer.jsp"%>
	<%@include file="includes/tag_plugin_fb.jsp"%>

	<!-- jQuery -->
	<script src="/plugins/jQuery/jquery.min.js"></script>
	<!-- Bootstrap JS -->
	<script src="/plugins/bootstrap/bootstrap.min.js"></script>
	<div id="fb-root"></div>
	<script async defer crossorigin="anonymous"
		src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v4.0&appId=1255400951309189&autoLogAppEvents=1"></script>
	<!-- comment box -->
</body>
</html>