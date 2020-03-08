<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<!-- Custom styles for this template-->
<link href="/css/sb-admin-2.min.css" rel="stylesheet">
	<%@include file="includes/heatag.jsp"%>
<title>Hồ sơ</title>

</head>
<body>
	<!--HEADER-->
	<%@include file="includes/header.jsp"%>
	<nav class="navbar navbar-light bg-light">
		<form class="form-inline">
			<button class="btn btn-primary mr-3" type="button">
				<a style="color: black;text-decoration: none"
					href="/admin/update-profile?username=${pageContext.request.userPrincipal.name}">Thông
					tin tài khoản</a>
			</button>
			<button class="btn btn-outline-primary" type="button">
				<a style="color: black;text-decoration: none"
					href="/admin/update-profile_pass?username=${pageContext.request.userPrincipal.name}">Đổi
					mật khẩu</a>
			</button>
		</form>
	</nav>
	<hr>
	<br>
	<form:form action="/admin/update-profile_pass" modelAttribute="updateProfile_pass" method="POST">
		<div class="container">
			<h1>HỒ SƠ</h1> <h5>${message }</h5>
			<i class="fas fa-key"> Đổi mật khẩu</i>
			<hr>
			<div class="row">
				<!-- left column -->
				<div class="col-12 col-sm-3 col-md-3"></div>
				<!-- edit form column -->
				<div class="col-12 col-sm-9 col-md-9 personal-info">
					<h3>Đổi mật khẩu</h3>
					<div class="form-group">
						<form:input path="id" Class="form-group" hidden="true" />
					</div>
					<div class="form-group">
						<div class="col-lg-8">
							<form:input path="username" class="form-control" type="text" hidden="true"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">Mật khẩu mới:</label>
						<div class="col-md-8">
							<input class="form-control" type="text" required="true"/>
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">Xác nhận mật khẩu
							mới:</label>
						<div class="col-md-8">
							<input class="form-control" type="password" name="password" required="true">
						</div>
					</div>
					 <!--  
					<div class="form-group">
						<div class="col-md-8">
							<div class="g-recaptcha"
								data-sitekey="6LfKURIUAAAAAO50vlwWZkyK_G2ywqE52NU7YO0S"
								data-callback="verifyRecaptchaCallback"
								data-expired-callback="expiredRecaptchaCallback"></div>
							<input class="form-control d-none" data-recaptcha="true" required
								data-error="Hãy xác nhận nếu bạn không phải Robert Chen">
							<div class="help-block with-errors"></div>
						</div>
					</div> -->
					<div class="form-group">
						<div class="col-md-8">
							<button type="submit"  class="btn btn-success">Lưu thay đổi</button>
							<button type="reset" class="btn btn-secondary">Reset</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<hr>
	<script src="https://www.google.com/recaptcha/api.js"></script>
	<!-- Bootstrap core JavaScript-->
	<script src="/vendor/jquery/jquery.min.js"></script>
	<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="/vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="/js/demo/chart-area-demo.js"></script>
	<script src="/js/demo/chart-pie-demo.js"></script>
</body>
</html>