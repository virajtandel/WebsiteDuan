<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<!--HEAD TAG-->
	<%@include file="includes/heatag.jsp"%>
	<link href="../css/dangky_dangnhap.css" rel="stylesheet">
	<title>DangNhap</title>
</head>
<body>
	<header class="sticky-top container-fluid">
		<nav class="">
			<div class="col-12 col-sm-12 col-md-12 social padding">
				<a href="/index" class="link-index" style="text-decoration: none;color:yellow"><i
					class="fa fa-arrow-circle-left" ></i> Về Trang Chủ</a>
			</div>
		</nav>
	</header>
	<section>
		<div class="container-fluid ">
			<div class="row">
				<div class="col-12 col-sm-4 col-md-4"></div>
				<div class="col-12 col-sm-4 col-md-4  row-container">
					<h3>Đăng Nhập</h3>
					<a href="https://www.facebook.com/dialog/oauth?client_id=3186000524806898&redirect_uri=http://localhost:8888/websocial" target="_blank">
						<button type="submit" class="btn btn-primary btn-block md-3 ">
							<i class="fab fa-facebook"> Đăng Nhập Qua FaceBook</i> 
						</button>
					</a>
					<a href="https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin">
						<button type="submit" class="btn btn-danger btn-block md-3 mt-2">
							<i class="fab fa-google-plus-g"> Đăng Nhập Qua Google</i> 
						</button>
					</a>
					<!-- Form -->
					<form role="form" action="/security_login" method="POST" id="formlogin" name="login-form">
						<hr class="light text-center">
						<div class="form-group">
							<input name="username" class="form-control" placeholder="Tên Đăng Nhập" required="true">
						</div>
						<div class="form-group">
							<br> <input type="password" class="form-control"
								name="password" placeholder="Mật Khẩu" required="true">
						</div>
						<div class="form-group">
							<c:if test="${pageContext.request.getParameter('error') == 'true'}">
								<div style="color: red; font-size: 13px;background-color: #F6CECE;padding: 10px;text-align: center;border-radius:5px">Tài khoản hoặc
									mật khẩu không đúng</div>
							</c:if>
						</div>
				
						<br/>
						
						<center class="mt-3">
							<button type="submit"
								class="btn btn-warning  btn-block md-3 form-control"
								style="height: 40px; width: 150px">Đăng nhập</button>
							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
						</center>
						<hr class="light">
						<span class="summit">Bạn chưa có tài khoản?</span>
						<a href="/dangki" class="btn-dangnhap" style="text-decoration: none"> Đăng ký ngay! </a>
					</form>
				</div>
				<div  class="col-12 col-sm-4 col-md-4"></div>
			</div>
		</div>
	</section>
	<script>
		var myapp = angular.module("myapp", []);
		myapp.controller("myctrl", function($scope) {

		});
		
	</script>
	<script type="text/javascript" src="/js/snowstorm.js"></script>
	<script type="text/javascript">
		snowStorm.snowColor = " rgb(245, 245, 245)";
		snowStorm.flakesMaxActive = 150;
		snowStorm.useTwinkleEffect = true;
	</script>

	<!-- Social 
	<script>
		window.fbAsyncInit = function() {
			FB.init({
				appId : '{your-app-id}',
				cookie : true,
				xfbml : true,
				version : '{api-version}'
			});

			FB.AppEvents.logPageView();

		};

		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id)) {
				return;
			}
			js = d.createElement(s);
			js.id = id;
			js.src = "https://connect.facebook.net/en_US/sdk.js";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
	</script> -->
</body>

</html>