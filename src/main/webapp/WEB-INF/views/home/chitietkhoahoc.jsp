<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>

<head>
    <title>Chi tiết khóa học</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <!--HEAD TAG-->
	<%@include file="includes/heatag.jsp"%>
    <!-- My CSS -->
    <link rel="stylesheet" href="css/chitietkhoahoc.css">
    <link rel="stylesheet" href="css/header.css">

</head>

<body style="background-color: aliceblue">
  <!--HEADER-->
	<%@include file="includes/header.jsp" %>
    <section>
        <div class="card container mt-2">
            <div class="card-body ">
                <div class="container">
                    <div class="row">
                        <div class="col-12 col-sm-7 col-md-7">
                            <br>
                            <br>
                            <div class="row">
                                <div class="col-8 col-sm-8">
                                    <div class="row">
                                        <div class="col-12 col-sm-12">
                                            <h5><b>${ShowChiTietKhoaHocByIDChuDe.tenloaikhoahoc}</b> <b style="color: red">______</b></h5>
                                        </div>
                                        <div class="col-12 col-sm-12">
                                            <div class="row">
                                                <div class="col-5 col-sm-5 col-md-5 text-muted"><i class="fas fa-book"></i> Số buổi</div>
                                                <br><br>
                                                <div class="col-7 col-sm-7 col-md-7">${ShowChiTietKhoaHocByIDChuDe.sobuoi} BUỔI</div>
                                                <br>
                                                <div class="col-5 col-sm-5 col-md-5 text-muted "><i class="fas fa-stopwatch"></i> Thời gian</div>
                                                <br><br>
                                                <div class="col-7 col-sm-7 col-md-7">${ShowChiTietKhoaHocByIDChuDe.thoigian} NGÀY</div><br>
                                                <div class="col-5 col-sm-5 col-md-5 text-muted"><i class="fas fa-user"></i> Đối tượng</div>
                                                <br><br>
                                                <div class="col-7 col-sm-7 col-md-7">${ShowChiTietKhoaHocByIDChuDe.doituong}</div>
                                                <br><br>
                                                <div class="col-5 col-sm-5 col-md-5 text-muted"><i class="fas fa-dollar-sign"></i> Học phí</div>
                                                <br>
                                                <div class="col-7 col-sm-7 col-md-7">${ShowChiTietKhoaHocByIDChuDe.hocphi} vnđ</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-12 col-sm-5 col-md-5">
                            <br><br>
                            <iframe class="rounded" width="100%" height="100%"
                                src="https://www.youtube.com/embed/RIPlhGvXmEM" frameborder="0"
                                allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
                                allowfullscreen></iframe>
                        </div>
                    </div>
                </div>
                <br>
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12 col-sm-7 col-md-7">
                            <div class="row">
                                <div class="col-12 col-sm-12">
                                    <div class="row">
                                        <div class="col-12 col-sm-12 col-md-12">
                                            <h5><b>Thành viên đã học</b><b style="color: #F79A03"> ______</b></h5>
                                        </div>
                                        <div class="col-12 col-sm-12 col-md-12">
                                            <div class="row">
                                                <div class="d-flex p-0  text-white">
                                                    <div class="p-1"><img class="rounded-circle img-thumbnail"
                                                            src="images/anh_user.png" width="10%" title="user" alt="">
                                                        <img class="rounded-circle img-thumbnail"
                                                            src="images/anh_user.png" width="10%" title="user" alt="">
                                                        <img class="rounded-circle img-thumbnail"
                                                            src="images/anh_user.png" width="10%" title="user" alt="">
                                                        <img class="rounded-circle img-thumbnail"
                                                            src="images/anh_user.png" width="10%" title="user" alt="">
                                                        <span class="text-muted">+ 3000</span>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-5 col-md-5">
                            <div class="row">
                                <div class="col-6 col-sm-6  mt-5">
                                    <a href="ThanhToan">
                                    <button id="" type="button" style="margin-left: 35px;width: 80%;height: 120%;"
                                        class="btn btn-warning rounded"><b>Đăng ký ngay</b></button></a>
                                </div>
                                <div class="col-6 col-sm-6  mt-5">
                                    <a style="text-decoration: none;color: black" href="/view-hoc-thu-by-id?id=${ShowChiTietKhoaHocByIDChuDe.idctkh}"><button id="btnh1" type="button" style="width: 80%;height: 120%"
                                        class="btn btn-outline-warning text-dark"><b>Học thử  <i
                                                class="fas fa-angle-double-right"></i></b></button></a> 
                                </div>
                            </div>
                        </div>
                    </div>
                </div><br>
                <div class="container">
                    <div class="row mb-4">
                        <div class="col-xs-12 col-sm-12 col-sm-12" style="text-align: justify;">
                           ${ShowChiTietKhoaHocByIDChuDe.noidungchitiet}
                        </div>
                    </div>
                </div>
                <h3 class="text-center" style="color: #745798">LỘ TRÌNH HỌC TIẾNG NHẬT N5</h3>
                <ul class="list-group">
                    <!-- Buổi 1 -->
                    <li class="list-group-item active"
                        style="background-color: #745798;color:gold;font-size: 16px;font-weight: bold"><i
                            class="far fa-folder-open"></i> BUỔI HỌC SỐ 1</li>
                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Bảng chữ cái
                        Hiragana(phần 1)</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Hàng chữ あ(a) - か(ka) - さ(sa)
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Bảng chữ cái
                        Kantana(phần 1)</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-10 col-sm-10 col-md-10">
                                        Hàng chữ あ(a) - か(ka) - さ(sa)
                                    </div>
                                    <div class="col-2 col-sm-2 col-md-2">
                                        <i class="fas fa-lock" style="margin-left: 20%"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <!-- Buổi 2 -->
                    <li class="list-group-item active"
                        style="background-color: #745798;color:gold;font-size: 16px;font-weight: bold"><i
                            class="far fa-folder-open"></i> BUỔI HỌC SỐ 2</li>
                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Bảng chữ cái
                        Hiragana(phần 1)</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Hàng chữ あ(a) - か(ka) - さ(sa)
                                    </div>
                                    <div class="col-2 col-sm-2 col-md-2">
                                        <i class="fas fa-lock" style="margin-left: 20%"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Bảng chữ cái
                        Kantana(phần 1)</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-10 col-sm-10 col-md-10">
                                        Hàng chữ あ(a) - か(ka) - さ(sa)
                                    </div>
                                    <div class="col-2 col-sm-2 col-md-2">
                                        <i class="fas fa-lock" style="margin-left: 20%"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <!-- Buổi 3 -->
                    <li class="list-group-item active"
                        style="background-color: #745798;color:gold;font-size: 16px;font-weight: bold"><i
                            class="far fa-folder-open"></i> BUỔI HỌC SỐ 3</li>
                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Bảng chữ cái
                        Hiragana(phần 1)</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Hàng chữ あ(a) - か(ka) - さ(sa)
                                    </div>
                                    <div class="col-2 col-sm-2 col-md-2">
                                        <i class="fas fa-lock" style="margin-left: 20%"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>

                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Bảng chữ cái
                        Kantana(phần 1)</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-10 col-sm-10 col-md-10">
                                        Hàng chữ あ(a) - か(ka) - さ(sa)
                                    </div>
                                    <div class="col-2 col-sm-2 col-md-2">
                                        <i class="fas fa-lock" style="margin-left: 20%"></i>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <!-- Buổi 4 -->
                    <li class="list-group-item active"
                        style="background-color: #745798;color:gold;font-size: 16px;font-weight: bold"><i
                            class="far fa-folder-open"></i> BUỔI HỌC SỐ 4</li>
                    <li class="list-group-item" style="letter-spacing: 1px;background-color: #E8E7E3">Ngữ pháp giới
                        thiệu tiếng Nhật</li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Bài tập giới thiệu kiến thức
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Video tổng hợp ngữ pháp
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Câu khẳng định của danh từ
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Câu phủ định của danh từ
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Câu nghi vấn
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Cách dùng
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row">
                            <div class="col-2 col-sm-2 col-md-2"></div>
                            <div class="col-12 col-sm-12 col-md-12">
                                <div class="row">
                                    <div class="col-9 col-sm-10 col-md-10">
                                        Câu hỏi về một ai đó, cách nói tuổi
                                    </div>
                                    <div class="col-3 col-sm-2 col-md-2">
                                        <button type="button" class="btn btn-success"
                                            style="margin-left: 10%;width:50px;height: 80%;font-size: 80%;padding: 0px;">Học
                                            thử</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
                <br>
                <center>
                    <button type="button" class="btn btn-warning text-white" style="font-weight: bold">Đăng ký
                        ngay</button>
                </center>
            </div>
        </div>
    </section>
	<!--FOOTER-->
	<%@include file="includes/footer.jsp" %>
	<%@include file="includes/tag_plugin_fb.jsp"%>
</body>

</html>