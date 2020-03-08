<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Thông tin cá nhân</title>
		<%@include file="includes/heatag.jsp"%>
		<link href="css/footer.css" rel="stylesheet">
	</head>
<body>
	<!-- Header -->
	<%@include file="includes/header.jsp"%>
	<!-- Section -->
	<section class="container">
	<nav class="navbar navbar-light">
		<form class="form-inline">
			<button class="btn btn-outline-primary mr-3" type="button">
				<a style="color: black; text-decoration: none;"
					href="/update-profile?username=${pageContext.request.userPrincipal.name}">Thông
					tin tài khoản</a>
			</button>
			<button class="btn btn-primary" type="button">
				<a style="color: black; text-decoration: none;"
					href="/update-profile_pass?username=${pageContext.request.userPrincipal.name}">Đổi
					mật khẩu</a>
			</button>
		</form>
	</nav>
	<hr>
	<br>
	<form:form action="/update-profile_pass" modelAttribute="updateProfile_pass" method="POST">
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
					</div>-->
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
	</section>
	<!-- Footer -->
	<%@include file="includes/footer.jsp"%>

</body>
</html>