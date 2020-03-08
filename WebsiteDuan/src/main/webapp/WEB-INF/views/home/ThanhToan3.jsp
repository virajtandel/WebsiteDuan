<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Thanh Toán 3</title>
  <link rel="stylesheet" href="css/style.css">

  <meta name="viewport" content="width=device-width, initial-scale=1">
<%@include file="includes/heatag.jsp"%>
  <link href="css/ThanhToan.css" rel="stylesheet">

</head>
<body>
  <%@include file="includes/header.jsp" %>
  <section>
    <div class="site-section">
      <div class="container">
        <div class="row">
          <div class="col-md-11">
            <div id="payment-member-info" class="payment-box">
              <p><label>Mã đơn hàng: </label><span class="right-content order_code">DK87448</span></p>
              <p><label>Khóa học:</label><span class="right-content order_code">N4</span></p>
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
                      <label for="c_fname" class="text-black">Nhập mã giảm giá <span
                          class="text-danger">*</span></label>
                      <input type="text" class="form-control" id="c_fname" name="c_fname">
                    </div>
                    <div class="col-md-3">
                      <input type="submit" class="btn btn-primary btn-lg btn-block" value="Áp dụng">
                    </div>
                  </div>
                </div>
              </center>
              <center>
                <div class="col-md-7">
                  <div class="form-group row">
                    <div class="col-md-6">
                      <label for="c_fname" class="text-black">Chọn hình thức thanh toán <span
                          class="text-danger">*</span></label>
                    </div>
                  </div>
                  <div class="row">
                    <button type="button" class="btn btn-secondary"><a class="w3-button w3-black"
                        href="ThanhToan">Thẻ ATM nội địa</a></button>
                    &emsp;
                    <button type="button" class="btn btn-secondary"><a class="w3-button w3-black"
                        href="ThanhToan1">Thẻ visa,Master</a></button>
                    &emsp;
                    <button type="button" class="btn btn-secondary"><a class="w3-button w3-black"
                        href="ThanhToan2">Chuyển khoản</a></button>
                    &emsp;
                    <button type="button" class="btn btn-secondary"><a class="w3-button w3-black"
                        href="ThanhToan3">TT tại Yuki</a></button>
                  </div>
                </div>
              </center>
              <br>&emsp; <b>Thanh toán tại văn phòng đại diện của chúng tôi</b>
              <br> &emsp;<a> Quý khách vui lòng đến địa chỉ văn phòng đại diện tại Hà Nội để giao dịch:</a>
              <div class="col-md-11">
                &emsp;<p class="bank_info" style="background-color: #83D2F7">
                  <a>298 Hà Huy Tập</a>
                  <br><a>Điện thoại: 092.8888.888.</a>
                  <br><a>Số tài khoản: 19034150330011</a>
                  <br><a>Giờ làm việc (từ thứ 2 đến thứ 6)</a>
                  <br><a>Sáng: 7h30 - 11h30</a>
                  <br><a>Chiều: 13h30 - 17h</a>
              </div>
              &emsp; <b>Để đảm bảo quyền lợi, khách hàng cần lưu ý</b><br>
              <div class="col-md-11">
                <li>Giao dịch tại các điểm được quy định.</li>
                <li>Kiểm tra cẩn thận các giao dịch trước khi rời nơi giao dịch.</li>
                <li>Thẻ học chỉ được kích hoạt thành công khi chúng tôi nhận được thanh toán và thông tin chính xác đầy
                  đủ.</li>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section>
      <div class="container">
        <div class="col-md-11">
          <div class="text-black"><b>Hãy bổ sung thêm thông tin dưới đây để tiếp tục thanh toán</b>
            <table>
              <tr>
                <td>Số điện thoại:</td>
                <td> <input type="text" class="form-control" id="c_fname" name="c_fname"></td>
              </tr>
            </table>
          </div>
        </div>
        <button type="button" class="btn btn-secondary" style="float: right;background-color: forestgreen;"><a
            class="w3-button w3-black" href="#">Thanh toán</a></button>
      </div>
      </div>
      </div>
    </section>
</body>
</html>