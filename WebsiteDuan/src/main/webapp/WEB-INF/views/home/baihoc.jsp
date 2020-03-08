<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Bài học</title>
    <link rel="stylesheet" href="/css/baihoc.css">
    <link rel="stylesheet" href="css/footer.css" />
    <%@include file="includes/heatag.jsp"%>
</head>

<body>
    <!-- ############################################################## SECTION ########################################################## -->
    <%@include file="includes/header.jsp"%>
    <section class="bg-light ">
        <div class="row">
            <div class="col-12 col-sm-2 col-md-2">
                <ul class="list-group list-group-flush" style="margin-right: -20px;">
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0010_Group-1-copy.png" alt=""> Bảng chữ cái</li>
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0009_Layer-2.png" alt=""> 50 bài Mina</li>
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0007_Layer-4.png" alt=""> 512 từ Kanjo cơ bản</li>
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0006_Layer-5.png" alt=""> 1945 từ Kanji nâng cao</li>
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0008_Layer-3.png" alt=""> 1000 mẫu câu giao tiếp</li>
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0004_Layer-7.png" alt=""> Luyện thi JLPN N1 -> N5</li>
                    <li class="list-group-item danh-muc-bang-chu-cai"> <img class="img-fluid hinh-tittle" width="15%"
                            src="images/2_0000_Layer-10.png" alt=""> Thông tin tham khảo</li>
                </ul>
            </div>
            <div class="col-12 col-sm-3 col-md-3 ml-3">
                <div class="row">
                    <div class="card col-12 col-sm-12 col-md-12">
                        <div class="card-body col-12 col-sm-12 col-md-12">
                            <center></center><span class="tu-moi">Từ mới</span></center>
                        </div>
                    </div>
                </div>
                <!-- List bar -->
                <div class="row mt-2">
                    <div class="card">
                        <div class="card-body">
                            <div class="list-group pl-4 pr-4 pt-2 card example-1 square scrollbar-dusty-grass square thin"
                                id="list-bar1">
                                <a href="#" class="list-group-item list-group-item-action ">
                                    Từ vựng tiếng Nhật </a> <a href="#"
                                    class="list-group-item list-group-item-action">Từ vựng trong
                                    nhà máy</a> <a href="#" class="list-group-item list-group-item-action">An toàn thực
                                    phẩm</a> <a href="#" class="list-group-item list-group-item-action">Âm
                                    nhạc </a> <a href="#" class="list-group-item list-group-item-action">Cảm
                                    giác và cảm xúc </a> <a href="#" class="list-group-item list-group-item-action">Côn
                                    trùng và
                                    bò sát</a> <a href="#" class="list-group-item list-group-item-action">Công
                                    nghệ </a> <a href="#" class="list-group-item list-group-item-action">Cơ
                                    thể con người </a> <a href="#" class="list-group-item list-group-item-action">Du
                                    lịch và
                                    giải trí </a> <a href="#" class="list-group-item list-group-item-action">Danh từ
                                    thường
                                    dùng </a> <a href="#" class="list-group-item list-group-item-action">Đồ
                                    ăn và đồ uống</a> <a href="#" class="list-group-item list-group-item-action">Đồ dùng
                                    trong
                                    gia đình</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-sm-6 col-md-6">
                <div class="container">
                    <!-- Nav tabs -->
                    <ul class="nav nav-tabs">
                        <li class="nav-item">
                            <a class="nav-link active content-tab-title" data-toggle="tab" href="#home">Từ mới</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link content-tab-title" data-toggle="tab" href="#menu1">Ngữ pháp</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link content-tab-title" data-toggle="tab" href="#menu2">Kaiwa</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link content-tab-title" data-toggle="tab" href="#menu3">Mondai</a>
                        </li>
                    </ul>
                    <!-- Tab panes -->
                    <div class="tab-content content-of-tab">

                        <div id="home" class="container tab-pane active"><br>
                            <ol class="row p-5">
                                <ul class="row">
                                    <li class="col-12 col-sm-12 col-md-12" style="list-style-type: none;">
                                        <center>
                                            <audio controls>
                                                <source
                                                    src="https://translate.google.com/translate_tts?ie=UTF-8&client=tw-ob&q=%E3%81%8A%E3%81%AF%E3%82%88%E3%81%86%E3%81%94%E3%81%96%E3%81%84%E3%81%BE%E3%81%99&tl=ja&total=1&idx=0&textlen=9"
                                                    type="audio/ogg">
                                            </audio>

                                        </center>
                                    </li>

                                </ul>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>


                            </ol>
                        </div>
                        <div id="menu1" class="container tab-pane fade"><br>
                            <ol class="row p-5">
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>
                                <li class="col-12 col-sm-12 col-md-12 content-tab-noi-dung"><a href="">Coffee <br>
                                        Coffee <br> Coffee</a> </li>

                            </ol>
                        </div>
                        <div id="menu2" class="container tab-pane fade"><br>
                            <div class="list-group">
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <center>
                                        <audio controls>
                                            <source src="http://eup.mobi/apps/mina/listen/4 - 4 - Kaiwa.mp3"
                                                type="audio/ogg">
                                        </audio>

                                    </center>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <center>ABC</center>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <div class="row">
                                        <div class="col-12 col-sm-4 col-md-4 col-lg-4">
                                            <span>A</span> <br>
                                            <span>B</span>
                                        </div>
                                        <div class="col-12 col-sm-8 col-md-8 col-lg-8">
                                            <span>A</span> <br>
                                            <span>B</span> <br>
                                            <span>C</span>

                                        </div>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <div class="row">
                                        <div class="col-12 col-sm-4 col-md-4 col-lg-4">
                                            <span>A</span> <br>
                                            <span>B</span>
                                        </div>
                                        <div class="col-12 col-sm-8 col-md-8 col-lg-8">
                                            <span>A</span> <br>
                                            <span>B</span> <br>
                                            <span>C</span>

                                        </div>
                                    </div>
                                </a>
                                <a href="#" class="list-group-item list-group-item-action content-kaiwa">
                                    <div class="row">
                                        <div class="col-12 col-sm-4 col-md-4 col-lg-4">
                                            <span>A</span> <br>
                                            <span>B</span>
                                        </div>
                                        <div class="col-12 col-sm-8 col-md-8 col-lg-8">
                                            <span>A</span> <br>
                                            <span>B</span> <br>
                                            <span>C</span>

                                        </div>
                                    </div>
                                </a>


                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    <%@include file="includes/footer.jsp"%>


    </section>

</body>

</html>