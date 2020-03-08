<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%@include file="includes/heatag.jsp"%>
<link rel="stylesheet" href="css/tuvung.css">
<title>Từ điển</title>
</head>
<body style="background-color: aliceblue">
	<%@include file="includes/header.jsp"%>
	<section class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-3 col-md-3">
				<div style="border-radius: 10px; background-color: white">
					<!-- Search form  -->
					<form action="/view-by-ten-loai-chu-de" method="get" class="input-group pt-4 pl-4 pr-4" role="toolbar" style="border-radius: 10px;"> 	
						<input name="tenloaichude" id="myInput" onkeyup="myFunction()" type="text" class="form-control" placeholder="Tìm kiếm chủ đề..." aria-label="Input group example" aria-describedby="btnGroupAddon">
					</form> 
					<!--list-->
					<div class="hienthiloaichude list-group pl-4 pr-4 pt-2 card example-1 square scrollbar-dusty-grass square thin"
						id="list-bar1">
						<ul id="myUL">
						<!-- Show list loại chủ đề -->
						<c:forEach var="loaiChuDe" items="${ShowLoaiChuDe}">
							<li style="list-style:none"><a href="/view-by-id-chu-de?id=${loaiChuDe.idloaichude}" class="list-group-item list-group-item-action">${loaiChuDe.tenloaichude}</a></li>
						</c:forEach>
						
						</ul>
						
					
					</div>
				</div>
				<!-- kết thúc list menu-->
				<!-- List danh mục trên -->
				<div class="card mt-4" id="card1">
					<div class="card-header" id="cardheader1">
						BÀI VIẾT HỮU ÍCH<span style="font-weight: bolder; color: green; font-size: 40px;">__</span>
					</div>
					<div class="card-body" id="cardbody1">
						<div class="list-group" id="list-bar2">
							<a href="camnang" class="list-group-item list-group-item-action">Cẩm nang tự học tiếng Nhật giao tiếp thành công</a>
							<a href="chuyen" class="list-group-item list-group-item-action">Chuyện không của riếng ai mỗi kỳ JLPT</a>
							<a href="bacongcu" class="list-group-item list-group-item-action">3 Công cụ hỗ trợ đắc lực khi tự học tiếng Nhật </a> 
							<a href="machbancachdat180" class="list-group-item list-group-item-action">Mách bạn cách đạt 180 điểm JLPT</a>
							<a href="hoctiengnhatonline" class="list-group-item list-group-item-action">Học tiếng Nhật online hiệu quả và những điều cần tránh</a>
						</div>
					</div>
				</div>
			</div>
			<!--Danh Mục Từ Vựng Kết Thúc-->

			<div class="col-xs-12 col-sm-9 col-md-9">
				<!--Dòng Chử " Từ Vựng Tiếng Nhật "-->
				<div class="row">
					<div class="col-xs-12 col-sm-6 col-md-6 ">
						<a class="text-dark" style="font-weight: bolder;text-decoration: none" href="/tuvung">TỪ VỰNG TIẾNG NHẬT </a>
					</div>
					<div class="col-xs-12 col-sm-6 col-md-6 ">
						<a style="font-weight: bolder"> </a>
					</div>
					<div class="col-xs-12 col-sm-1 col-md-1 ml-3"
						style="height: 2px; background-color: green;"></div>
				</div>

				<!--Hết Dòng Chử " Từ Vựng Tiếng Nhật-->
				<!--Các Khóa Tra cứu Từ Vựng-->
				<div class="row mt-5">
					<!--Khóa 1-->
					<c:forEach var="chude" items="${showGiaoDienTuVung}" begin="0" end="8">
					
					
						<div
							class="col-12 col-sm-4 col-md-4 border border-right-0 border-left-0 border-top-0 container1 mb-3">
							<!-- Card Wider -->
							
							<div class="card card-cascade wider">
								<!-- Card image -->
							
								<div class="view view-cascade overlay">
									<a href="/tu-vung-max-by-id-chu-de?id=${chude.idchude}" class="card-link">	
									<figure class="figure">
										<img src="/files/${chude.hinhanh}" class="img-fluid rounded image1" height="auto">
									</figure>
									</a>
									<figcaption class="figure-caption text-center font-weight-bolder" style="color: black">
										<a href="/tu-vung-max-by-id-chu-de?id=${chude.idchude}" class="card-link" style="color: black">${chude.tenchude }</a> <br> <br>
									</figcaption>
								</div>
								<!-- Card content -->
								<div class="card-body card-body-cascade text-center">
									<div class="middle1">
										<button class="btn btn-success">
											<a href="/tu-vung-max-by-id-chu-de?id=${chude.idchude}" class="card-link text-white"><i class="fa fa-caret-square-o-right" style="color: white"></i>
											Bắt Đầu</a> 
										</button>
									</div>
								</div>
							</div>
						</div>
						
					</c:forEach>
					<!--Khoa 4-->
					<!--Hết Từ Vựng-->
				</div>
			</div>
		</div>
			<!--Đóng DIV row Đầu-->
	</section>
	<%@include file="includes/footer.jsp"%>
	<%@include file="includes/tag_plugin_fb.jsp"%>
</body>
<script type="text/javascript" src="js/snowstorm.js"></script>
<script type="text/javascript">
	snowStorm.snowColor = 'white';
	snowStorm.flakesMaxActive = 150;
	snowStorm.useTwinkleEffect = true;
	//JQuerry show loaichude
		function myFunction() {
		    var input, filter, ul, li, a, i, txtValue;
		    input = document.getElementById("myInput");
		    filter = input.value.toUpperCase();
		    ul = document.getElementById("myUL");
		    li = ul.getElementsByTagName("li");
		    for (i = 0; i < li.length; i++) {
		        a = li[i].getElementsByTagName("a")[0];
		        txtValue = a.textContent || a.innerText;
		        if (txtValue.toUpperCase().indexOf(filter) > -1) {
		            li[i].style.display = "";
		        } else {
		            li[i].style.display = "none";
		        }
		    }
		}
</script>

</html>