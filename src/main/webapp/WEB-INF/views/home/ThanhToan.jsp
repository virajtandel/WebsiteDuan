<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
	<meta charset="utf-8">
	<title>Thanh Toán</title>
	<!-- <link rel="stylesheet" href="css/style.css"> -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@include file="includes/heatag.jsp"%>
	<link href="css/ThanhToan.css" rel="stylesheet">
</head>

<body>
<!--HEADER-->
	<%@include file="includes/header.jsp" %>
	<section>
		<div class="site-section">
			<div class="container">
				<div class="row">
					<div class="col-md-11">


						<div id="payment-member-info" class="payment-box">
							<p>
								<label>Mã đơn hàng: </label><span
									class="right-content order_code">DK87448</span>
							</p>
							<p>
								<label>Khóa học:</label><span class="right-content order_code">N4</span>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>

		<section class="section1">
			<div class="site-section">
				<div class="container">
					<div class="row">
						<div class="col-md-11">
							<center>
								<div class="col-md-7">


									<div class="form-group row">
										<div class="col-md-6">
											<label for="c_fname" class="text-black">Nhập mã giảm
												giá <span class="text-danger">*</span>
											</label> <input type="text" class="form-control" id="c_fname"
												name="c_fname">
										</div>
										<div class="col-md-3">
											<input type="submit" class="btn btn-primary btn-lg btn-block"
												value="Áp dụng">
										</div>
									</div>


								</div>

							</center>
							<center>
								<div class="col-md-7">


									<div class="form-group row">
										<div class="col-md-6">
											<label for="c_fname" class="text-black">Chọn hình
												thức thanh toán <span class="text-danger">*</span>
											</label>

										</div>
									</div>
									<div class="row">



										<button type="button" class="btn btn-secondary">
											<a class="w3-button w3-black" href="ThanhToan">Thẻ ATM
												nội địa</a>
										</button>
										&emsp;
										<button type="button" class="btn btn-secondary">
											<a class="w3-button w3-black" href="ThanhToan1">Thẻ
												visa,Master</a>
										</button>
										&emsp;
										<button type="button" class="btn btn-secondary">
											<a class="w3-button w3-black" href="ThanhToan2">Chuyển
												khoản</a>
										</button>


										&emsp;
										<button type="button" class="btn btn-secondary">
											<a class="w3-button w3-black" href="ThanhToan3">TT tại
												Yuki</a>
										</button>

									</div>
								</div>




							</center>





							<div class="form-group row">

								<div class="text-black chu">Thanh toán trực tuyến bằng thẻ
									ATM nội địa (mất phí giao dịch)</div>
								<div class="text-black chu">
									<ul>
										<li>Chấp nhận thanh toán các loại thẻ thanh toán nội địa
											(thẻ ATM) do các Ngân hàng trong nước phát hành.</li>
										<li>An toàn bảo mật cho khách hàng trong khi thanh toán.</li>
										<li>Dịch vụ được kích hoạt ngay khi thanh toán thành
											công.</li>
									</ul>
								</div>
							</div>

							<div class="form-group row">

								<div class="text-black chu">
									<b>Để đảm bảo quyền lợi, khách hàng cần lưu ý</b>
								</div>
								<div class="text-black chu">
									<ul>
										<li>Để thanh toán bằng thẻ ATM, thẻ của Quý khách phải
											được đăng ký và kích hoạt chức năng thanh toán trực tuyến với
											ngân hàng trước khi sử dụng.</li>
										<li>Quý khách cần điền đầy đủ thông tin thẻ bao gồm "Ngân
											hàng phát hành thẻ", "Tên chủ thể", "Số thẻ", "Ngày hiệu
											lực".</li>
										<li>Các thông tin thẻ tín dụng của Quý khách sẽ được bảo
											mật và được xác nhận với ngân hàng phát hành thẻ.</li>
										<li>Dịch vụ chỉ được đăng ký / gia hạn khi nhận được
											thanh toán và thông tin chính xác đầy đủ.</li>
										<li>Đơn hàng thanh toán trực tuyến qua Thẻ nội địa/ Thẻ
											Quốc tế/ Paypal hoặc tiền từ ID thông thường dịch vụ sẽ được
											đăng ký tự động sau khi thanh toán thành công, chậm nhất là
											sau 24h. Nếu sau thời gian này Quý khách không thấy dịch vụ
											được kích hoạt vui lòng phản hồi ngay cho chúng tôi.</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<div class="site-section">
			<div class="container">
				<div class="row">
					<div class="col-md-11">
						&emsp;
						<p class="bank_info" style="background-color: #83D2F7">Hãy
							chọn 1 trong các ngân hàng dưới đây</p>
						<center>
							<button type="button">
								<img src="images/2.jpg" height="20px">
							</button>
							&emsp;
							<button type="button">
								<img src="images/3.png" height="25px">
							</button>
							&emsp;
							<button type="button">
								<img src="images/4.jpg" height="27px">
							</button>
							&emsp;
							<button type="button">
								<img src="images/5.png" height="27px">
							</button>
						</center>
					</div>
				</div>
			</div>
		</div>
		<div class="site-section">
			<div class="container">
				<div class="row">
					<div class="col-md-11">
						<div id="payment-require-info">

							<div class="text-black">
								<b>Hãy bổ sung thêm thông tin dưới đây để tiếp tục thanh
									toán</b>
								<table>
									<tr>
										<td>Số điện thoại:</td>
										<td><input type="text" class="form-control" id="c_fname"
											name="c_fname"></td>
									</tr>
								</table>
							</div>
						</div>
						&emsp;&emsp;&emsp;
						<button type="button" class="btn btn-secondary"
							style="float: right; background-color: forestgreen;">
							<a class="w3-button w3-black" href="#">Thanh toán</a>
						</button>
	</section>


</body>

</html>