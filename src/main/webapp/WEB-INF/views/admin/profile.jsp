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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>


<title>Hồ sơ</title>

</head>
<body>
	<!--HEADER-->
	<%@include file="includes/header.jsp"%>
	<nav class="navbar navbar-light bg-light">
		<form class="form-inline">
			<button class="btn btn-outline-primary mr-3" type="button">
				<a style="color: black; text-decoration: none;"
					href="/admin/update-profile?username=${pageContext.request.userPrincipal.name}">Thông
					tin tài khoản</a>
			</button>
			<button class="btn btn-primary" type="button">
				<a style="color: black; text-decoration: none;"
					href="/admin/update-profile_pass?username=${pageContext.request.userPrincipal.name}">Đổi
					mật khẩu</a>
			</button>
		</form>
	</nav>
	<hr>
	<br>
	
	<form:form action="update-profile" modelAttribute="updateProfile"
		enctype="multipart/form-data" method="POST">
		<div class="container">
			<h1>HỒ SƠ</h1>
			<i class="fas fa-id-card"> Thông tin tài khoản</i>
			<h5 class="text-warning">${message }</h5>
			<hr>
			<div class="row">
				<!-- left column -->
				<div class="col-12 col-sm-3 col-md-3">
					<div class="form-group">
						<label for="exampleInputEmail1">Ảnh đại diện</label>
						<input type="file" name="uploadFiles" class="form-control" id="imgInp" accept=".jpg, .png, .jpeg"/>
						<img id="blah" src="/avatars/${showAnhTruoc }" width="60%" class="mx-auto d-block mt-3"> 
						<input type="hidden" value = "${showAnhTruoc}" name="anhtruoc"/>

					</div>
				</div>
				<!-- edit form column -->
				<div class="col-md-9 personal-info">
					<h3>Thông tin tài khoản</h3>
					<form:input path="id" Class="form-group" type="hidden" />
					<div class="form-group">
						<div class="col-lg-8">
							<form:input path="username" class="form-control" type="text" hidden="true"/>
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-8">
							<form:input path="password" value="${password}"
								class="form-control" type="text" hidden="true" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-3 control-label">Họ tên:</label>
						<div class="col-lg-8">
							<form:input path="hoten" class="form-control" type="text" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-3 control-label">Giới tính:</label>
						<div class="col-lg-8">
							<div class="ui-select">
								<form:select path="gioitinh" id="gender" class="form-control">
									<option value="Nam" selected="selected">Nam</option>
									<option value="Nữ">Nữ</option>
								</form:select>
							</div>
						</div>
					</div>
					<div class="form-group">
						<label class="col-lg-3 control-label">Ngày sinh:</label>
						<div class="col-lg-8">
							<form:input path="ngaysinh" class="form-control" type="date" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-lg-3 control-label">Địa chỉ:</label>
						<div class="col-lg-8">
							<form:input path="diachi" class="form-control" type="text" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">Số điện thoại:</label>
						<div class="col-md-8">
							<form:input path="sdt" class="form-control" type="number" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">CMND:</label>
						<div class="col-md-8">
							<form:input path="cmnd" class="form-control" type="number" />
						</div>
					</div>
					<div class="form-group">
						<label class="col-md-3 control-label">Email:</label>
						<div class="col-md-8">
							<form:input path="email" class="form-control" type="email" />
						</div>
					</div>
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
	<script>
		function readURL(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();

				reader.onload = function(e) {
					$('#blah').attr('src', e.target.result);
				}

				reader.readAsDataURL(input.files[0]);
			}
		}

		$("#imgInp").change(function() {
			readURL(this);
		});
	</script>
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