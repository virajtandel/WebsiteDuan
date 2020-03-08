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
	<!-- blog -->
	<section class="section">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 order-2 order-lg-1">
					<div class="row">
						<!-- blog post -->
						<c:forEach var="tintuc" items="${showTinTuc}">
							<div class="col-12 col-sm-6 col-md-6 col-lg-6 mb-4">
								<article
									class="card border-0 rounded-0 position-relative box-shadow zindex-1">
									<div class="card-type">Mới</div>
									<img class="card-img-top rounded-top-0 clip-half-cycle"
										src="/files/${tintuc.hinhanh}" class="img-fluid" alt="blog-thumb">
									<div class="card-body">
										<div class="title-border-left">
											<div class="card-meta  mb-2">
												Bởi: <strong class="text-dark">${tintuc.user.username}</strong>/
												ngày: <strong class="text-dark"> ${tintuc.ngaydang }</strong>
											</div>
											<h4 class="card-title">
											<c:set var="string1" value="${fn:substring(tintuc.tieude, 0,20)}" />
												<a href="/detail-blog?id=${tintuc.idtintuc}" class="text-dark" style="font-size: 15px">${string1}....</a>
											</h4>
										</div>
										<c:set var="string2"
											value="${fn:substring(tintuc.noidung, 0,40)}" />
										<p class="card-text" style="font-size: 12px">${string2 }....</p>
										<a href="/detail-blog?id=${tintuc.idtintuc}"
											class="btn btn-secondary">xem thêm <i class="fas fa-arrow-right"></i></a>
									</div>
								</article>
							</div>
						</c:forEach>

					</div>
				</div>
				<!-- sidebar -->
				<aside class="col-lg-4 order-1 order-lg-2">
					<!-- search -->
					<div class="bg-white px-4 py-5 box-shadow mb-5">
						<div class="position-relative">
							<form action="#">
								<h4>Tìm kiếm</h4>
								<input type="search"
									class="form-control rounded-0 border-top-0 border-left-0 border-right-0 border-color pl-0 focus-shadow-none font-italic"
									id="postSearch" name="postSearch" placeholder="Nhập từ khóa...">
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
										<a href="/detail-blog?id=${tintuc.idtintuc}" class="text-dark">${tintuc.tieude }</a>
									</h5>
									${tintuc.ngaydang }
								</div>
							</div>
						</c:forEach>
					</div>
				</aside>
				<!-- /sidebar -->
			</div>
		</div>
	</section>
	<!-- /blog -->
	<!--FOOTER-->
	<%@include file="includes/footer.jsp"%>
	<%@include file="includes/tag_plugin_fb.jsp"%>

	<!-- jQuery -->
	<script src="/plugins/jQuery/jquery.min.js"></script>
	<!-- Bootstrap JS -->
	<script src="/plugins/bootstrap/bootstrap.min.js"></script>
</body>
</html>