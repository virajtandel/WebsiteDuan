<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
	<meta charset="utf-8">
	<title>Thanh toán 2</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<%@include file="includes/heatag.jsp"%>
	<link href="css/ThanhToan.css" rel="stylesheet">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<%@include file="includes/header.jsp"%>
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
							<br>
							<div class="text-black chu">Chuyển khoản (miễn phí giao
								dịch)</div>
							<br>
							<p>Quý khách vui lòng chuyển khoản cho chúng tôi theo thông
								tin sau:</p>
							<div class="form-group row">
								<div class="col-md-11">
									&emsp;
									<p class="bank_info" style="background-color: #83D2F7">
										<b>Tại Việt Nam:</b> <br>
										<a>Quý khách cần điền đầy đủ thông tin thẻ bao gồm "Ngân
											hàng phát hành thẻ", "Tên chủ thể", "Số thẻ", "Ngày hiệu
											lực".</a> <br>
										<a>Số tài khoản: 19034150330011</a> <br>
										<a>Chủ tài khoản: Nguyễn Thị Yến</a>
									</p>
								</div>
								<div class="col-md-11">
									&emsp;
									<p class="bank_info" style="background-color: #83D2F7">
										<b>Tại Nhật Bản:</b> <br>
										<a>Yuki.</a> <br>
										<a>名：Nguyen Mau Kien</a> <br>
										<a>銀行：ゆうちょ銀行</a> <br>
										<a>番号 14170 - 37123601</a>
									</p>
								</div>
							</div>
							<div class="col-md-11">
								<b>Để đảm bảo quyền lợi, khách hàng cần lưu ý</b> <br>
								<p>Nội dung thanh toán khi chuyển khoản ghi rõ:</p>
							</div>

							<div class="col-md-11">
								&emsp;
								<p class="bank_info" style="background-color: #F88C7D">
									<b>DK87532</b>
								</p>
							</div>
							<div class="col-md-11">
								&emsp;
								<div class="text-black chu">
									<ul>
										<a>Sau khi thanh toán Quý khách vui lòng gửi thông báo
											hoặc liên hệ với tư vấn viên để chúng tôi hoàn tất phần thanh
											toán cho Quý khách.</a>
										<a>Thẻ học chỉ được kích hoạt khi chúng tôi nhận được
											thanh toán và thông tin chính xác đầy đủ.</a>
										<a>Hãy bấm nút Thanh toán dưới đây để hoàn tất đơn đặt
											hàng</a>
									</ul>
								</div>
							</div>
		</section>
		<section>
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
						</div>
					</div>
				</div>
			</div>
		</section>
</body>
</html>
