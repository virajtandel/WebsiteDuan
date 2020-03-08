<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiết Học Thử</title>
<!--HEAD TAG-->
<%@include file="includes/heatag.jsp"%>
<link rel="stylesheet" href="css/hocthu.css">
<link rel="stylesheet" href="css/stylehocthu.css">
</head>
<body>
	<!--HEADER-->
	<%@include file="includes/header.jsp"%>
	<section class="container">
		<div class="row">
			<div class="col-12 col-sm-2 col-md-1"></div>
			<div class="col-12 col-sm-8 col-md-10">
				<iframe class="mx-auto d-block nhungvideo" width="100%"
					height="500vh" style="margin-top: 5%;"
					src="https://www.youtube.com/embed/ZC-43d_zWz8" frameborder="0"
					allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
					allowfullscreen></iframe>
				<br>
				<div class="mt-4">
					<button class="btn btn-danger">
						<i class="far fa-file-alt"></i> Nội dung bài học
					</button>
				</div>
				<div style=" width: 100%, height: auto; border-radius: 2%" class="bg-light mt-2">
					<!--text-->
					<div style="padding: 7%">
						<h5>HIRAGANA – ひらがな (Phần 1)</h5>
						<p style="margin-bottom: 0rem;text-align: justify;">Bước đầu tiên khi học tiếng
							Nhật là làm quen bảng chữ cái. Hoặc, ít nhất là, học các thanh âm
							xuất hiện trong ngôn ngữ ấy. Không có âm nào trong tiếng Nhật
							hoàn toàn giống với ngôn ngữ châu Á, và chỉ có 2 ngoại lệ trong
							bảng chữ cái sẽ được giải thích sau. Bảng chữ cái tiếng Nhật
							không có chữ cái mà thay vào đó là các ký tự, và về mặt kỹ thuật
							thì nó không phải bảng chữ cái mà là bộ ký tự. Các chữ cái bạn
							được học ở khóa học này là chữ Hiragana. Hiragana là bảng chữ
							chính hoặc nói cách khác là bộ ký tự chính trong tiếng Nhật.
							Tiếng Nhật cũng bao gồm 2 bộ ký tự khác là Kanji (ký tự Trung
							Quốc), chúng ta sẽ tìm hiểu sau, và 1 bảng chữ khác nữa.</p>
						<h6>Có 5 nguyên âm trong tiếng Nhật: あ (a) / い (i) / う( u) /
							え (e) / お (o)</h6>
						<p>Tất cả các ký tự Hiragana đều kết thúc bằng các nguyên âm
							này, ngoại trừ “n”.</p>
						<h6>Ngoại lệ:</h6>
						<p>
							1. Chữ Hiragana は (ha) được phát âm là “wa” khi nó đứng ngay sau
							chủ đề của câu. Chữ này thường chỉ được phát âm là “ha” khi nó là
							1 thành phần của từ vựng. <br> 2. Chữ Hiragana へ (he) được
							phát âm là “e” khi nó chỉ phương hướng hay địa điểm mà hành động
							hướng tới. Cả 2 trường hợp này đều rất dễ nhận biết.
						</p>
					</div>
				</div>
			</div>
			<div class="col-12 col-sm-2 col-md-1"></div>
		</div>
	</section>
	<section>
		<div class="col-xs-12 col-sm-12 col-md-12 row sticky-top">
			<div class="col-xs-12 col-sm-5 sol-md-5"></div>
			<div class="col-xs-12 col-sm-2 sol-md-2  ">
				<button type="button" class="btn btn-lg btn-primary container ">Hoàn thành <i class="fas fa-forward"></i></button>
			</div>
			<div class="col-xs-12 col-sm-5 sol-md-5"></div>
		</div>
	</section>
	<!--FOOTER-->
	<%@include file="includes/footer.jsp"%>
	<%@include file="includes/tag_plugin_fb.jsp"%>
</body>
</html>