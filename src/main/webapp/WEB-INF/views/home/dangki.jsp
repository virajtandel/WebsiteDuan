<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Đăng ký tài khoản</title>
<!--HEAD TAG-->
<%@include file="includes/heatag.jsp"%>
<!-- My css -->
<link href="css/dangky_dangnhap.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="js/validation_signup.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>

</head>

<body>
	<header  class="sticky-top container-fluid">
			<nav>
					<div class="col-12 col-sm-12 col-md-12 social padding">
				<a href="/index" class="link-index" style="text-decoration: none;color:yellow""><i
					class="fa fa-arrow-circle-left" ></i> Về Trang Chủ</a>
			</div>
			</nav>
	</header>
	<section>
		<div class="container-fluid">
			<div class="row">
				<div class="col-12 col-sm-4 col-md-4"></div>
				<div class="col-12 col-sm-4 col-md-4  row-container">
					<form:form action="/add	User" modelAttribute="addUser" method="post" class="dangki" name="frmdangki">
						<h1>Đăng ký</h1>
						<br>
						<div class="form-group">
							<input type="text" class="form-control" id="username" name="username"	placeholder="Tên đăng nhập..."  pattern="^[a-z0-9_-]{3,16}$"  minlength="3" maxlength="50" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="password1" name="password1" placeholder="Mật Khẩu..."  pattern="^[a-z0-9_-]{3,16}$" minlength="6" maxlength="20" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="password" name="password" placeholder="Nhập lại mật khẩu..."minlength="6" maxlength="20" required>
							<span id="message"></span>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="hoten" placeholder="Nhập họ tên đầy đủ..." pattern="^[a-z A-z ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ]+$" minlength="3" maxlength="50" required>
						</div>
						<div class=form-group>
							<select class="form-control" name="gioitinh">
								<option value="fiat" selected>Nam</option>
								<option value="volvo">Nữ</option>
							</select>
						</div>
						<div class="form-group">
							<input type="text" class="form-control" name="number" placeholder="Số Điện Thoại..." pattern="^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$" minlength="10" maxlength="10" required>
						</div>
						<br>
						<center>
							<button type="submit" class="btn btn-warning font-weight-bolder  btn-block md-3"
								style="height: 40px; width: 150px">Đăng Ký</button>
						</center>
						<hr class="light">
						<div class="bgfoot"> 
						<span class="summit">Bạn đã có tài khoản?</span>
						<a href="/dangnhap" class="btn-dangnhap" style="text-decoration: none"> Đăng nhập ngay!</a>
						</div>
						<p class="text-danger">${message }</p>
					</form:form>
				</div>
				<div class="col-12 col-sm-4 col-md-4"></div>
			</div>
		</div>
	</section>
	<script>
	$('#password1, #password').on('keyup', function () {
	    if ($('#password1').val() == $('#password').val()) {
	        $('#message').html('').css('color', 'white');
	    } else 
	        $('#message').html('Mật khẩu nhập lại không khớp').css('color', 'white');
	});
	</script>
	<script type="text/javascript" src="js/snowstorm.js"></script>
	<script type="text/javascript">
		snowStorm.snowColor = " rgb(245, 245, 245)";
		snowStorm.flakesMaxActive = 150;
		snowStorm.useTwinkleEffect = true;
	</script>
	
</body>

</html>