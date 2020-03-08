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
	
	<form:form action="update-profile" modelAttribute="updateProfile" enctype="multipart/form-data" method="POST">
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
						<input	type="file" name="uploadFiles" class="form-control" id="imgInp" accept=".jpg, .png, .jpeg"/>
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
	</section>
	<!-- Footer -->
	<%@include file="includes/footer.jsp"%>

</body>
</html>