<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
<title>Từ vựng chi tiết</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="css/tuvungmax.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
<!-- Lien ket Boostrap 4 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="https://kit.fontawesome.com/4d64ca3050.js"></script>
<!-- Icon -->
<link href="images/imgmenu.png" rel="icon">

</head>

<body>
	<section>
		<!-- Back ve trang chinh -->
		<div class="container-fluid">
			<div class="row mt-2">
				<div class="col-6 col-sm-5 col-md-5">
					<span id="title-tallest"><a class="card-link ml-4"
						href="/tuvung"><i
							class="fas fa-chevron-circle-left text-warning"></i> Từ vựng
							phương tiện giao thông</a></span>
				</div>

				<div class="col-2 col-sm-4 col-md-4"></div>
				<div class="col-4 col-sm-3 col-md-3">
					<div class="row">
						<div class="col-2 col-sm-4 col-md-4"></div>
						<div class="col-2 col-sm-4 col-md-4"></div>
						<div class="col-8 col-sm-4 col-md-4 mt-5">
							<!-- Modal -->
							<div class="container">
								<!-- Button to Open the Modal -->
								<button type="button" class="btn btn-outline-info mr-5"
									data-toggle="modal" data-target="#myModal">
									<i class="fas fa-list"></i>
								</button>
								<!-- The Modal -->
								<div class="modal fade" id="myModal">
									<div class="modal-dialog">
										<div class="modal-content">
											<!-- Modal Header -->
											<div class="modal-header">
												<h4 class="modal-title">Danh sách từ vựng</h4>
												<button type="button" class="close" data-dismiss="modal">
													&times;</button>
											</div>

											<!-- Modal body -->
											<div class="modal-body">
												<table class="table" style=""100%"">
													<thead>
														<tr>
															<th>Kanji</th>
															<th>Japan</th>
															<th>Nghĩa của từ</th>
														</tr>
													</thead>
													<tbody>
														<c:forEach var="tuvungmax"
															items="${ViewTuVungMaxByIDChuDe}">
															<tr>
																<td>${tuvungmax.tvkanjimax}</td>
																<td>${tuvungmax.tvjpmax}</td>
																<td>${tuvungmax.nghiatvmax}</td>
															</tr>
														</c:forEach>
													</tbody>
												</table>
											</div>

											<!-- Modal footer -->
											<div class="modal-footer">
												<button type="button" class="btn btn-danger"
													data-dismiss="modal">Đóng</button>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- End Modal -->
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- Slide content  -->
		<div class="container">
			<div class="row mt-2 mb-2">
				<div class="carousel slide col-12 col-sm-3 col-md-3"></div>
				<div id="demo" class="carousel slide col-12 col-sm-6 col-md-6"
					data-ride="carousel">
					<!-- Indicators -->
					<ul class="carousel-indicators">
						<c:forEach var="tuvungmax" items="${ViewTuVungMaxByIDChuDe}"
							varStatus="loop">
							<li data-target="#demo" data-slide-to="${loop.index+1}"
								class="active"></li>
						</c:forEach>
					</ul>

					<!-- The slideshow -->

					<div class="carousel-inner">
						
						<div class="carousel-item active">
							<div class="card" style="width: 70%;margin-left: 15%">
								<button onclick="document.getElementById('audio').play()"
									class=" bg-danger icon-volume">
									<i class="fas fa-volume-up"></i>
								</button>
								<audio controls id="audio"
									src="https://www.freetranslations.org/speak.php?word=%E3%81%95%E3%81%82%E5%A7%8B%E3%82%81%E3%81%BE%E3%81%97%E3%82%87%E3%81%86%0A&lang=ja"
									preload="auto" hidden="true"></audio>
								<img class="card-img-top img-fluid" style="width:400px;height:250px;"
									src="images_tuvungmax/chaobuoitoi.jpg" alt="Card image">

								<div class="card-body text-center">
									<h4 class="card-title">Từ vựng kanji</h4>
									<h4 class="card-title">Từ vựng Japan</h4>
									<p class="card-text">Nghĩa của từ</p>
									<br>	
								</div>
							</div>
						</div>
						<c:forEach var="tuvungmax" items="${ViewTuVungMaxByIDChuDe}">
						<div class="carousel-item">
							<div class="card" style="width: 70%;margin-left: 15%">
								<button onclick="document.getElementById('audio${tuvungmax.idtvmax}').play()"
									class=" bg-danger icon-volume">
									<i class="fas fa-volume-up"></i>
								</button>
								<audio controls id="audio${tuvungmax.idtvmax}"
									src="${tuvungmax.audioname}"
									preload="auto" hidden></audio>

								<img style="width:400px;height:250px;" class="img-fluid" src="../images_tuvungmax/${tuvungmax.hinhanh }">

								<div class="card-body text-center">
									<h4 class="card-title">${tuvungmax.tvkanjimax }</h4>
									<h4 class="card-title">${tuvungmax.tvjpmax }</h4>
									<p class="card-text">${tuvungmax.nghiatvmax }</p>
									   <br>	
								</div>
							</div>
						</div>
						</c:forEach>

					</div>

					<!-- Left and right controls -->
					<a class="carousel-control-prev" href="#demo" data-slide="prev">
						<h2>
							<i class="fas fa-caret-left text-danger"></i>
						</h2>
					</a> <a class="carousel-control-next" href="#demo" data-slide="next">
						<h2>
							<i class="fas fa-caret-right text-danger"></i>
						</h2>
					</a>
				</div>
				<div class="carousel slide col-12 col-sm-3 col-md-3"></div>
			</div>
		</div>
		<!-- End Slide Content -->
		<div class="row container mb-2" id="btn-submit">
			<a href="/tuvung" class="ml-auto"><button type="button"
					class="btn btn-danger ">
					Hoàn thành <i class="fas fa-check text-light"></i>
				</button></a>
		</div>

	</section>

</body>
<script>
	$(document).ready(
			function() {
				$(".carousel-control-prev").hide();
				$("#btn-submit").hide();

				$(".carousel").carousel({
					interval : false
				});
				$("#demo").on(
						"slid.bs.carousel",
						"",
						function() {
							var $this = $(this);
							if ($(".carousel-inner .carousel-item:first")
									.hasClass("active")) {
								$(".carousel-control-next").show();
								$(".carousel-control-prev").hide();
								$("#btn-submit").hide();

								console.log("slide1");
							} else if ($(".carousel-inner .carousel-item:last")
									.hasClass("active")) {
								console.log("last slide");
								$(".carousel-control-next").hide();
								$(".carousel-control-prev").show();
								console.log("cuooi");
								$("#btn-submit").show();
							} else {
								$(".carousel-control-next").show();
								$(".carousel-control-prev").show();
								$("#btn-submit").hide();
								console.log("giua~");
							}
						});
			});
</script>

</html>