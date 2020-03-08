<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Thống Kê Chi Tiết Bài Test</title>

<!-- Custom fonts for this template -->
<link href="/vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link href="/vendor/datatables/dataTables.bootstrap4.min.css"
	rel="stylesheet">
	<%@include file="includes/heatag.jsp"%>
</head>

<body id="page-top">
	<%@include file="includes/header.jsp"%>
	<!-- End of Topbar -->

	<!-- Begin Page Content -->
	<div class="container-fluid">

		<!-- Page Heading -->
		<!-- ----------------------------------------------------------------------------------------------- -->
		<!-- ----------------------------------------------------------------------------------------------- -->

		<!-- ----------------------------------------------------------------------------------------------- -->

		<!-- ----------------------------------------------------------------------------------------------- -->


		<!-- DataTales Example -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<div class="row">
					<div class="col-4 col-sm-4 col-md-4">
						<h4 class="m-0 font-weight-bold text-primary">THỐNG KÊ CHI
							TIẾT BÀI TEST</h4>
					</div>
					<div class="col-4 col-sm-5 col-md-5"></div>
					<div class="col-4 col-sm-4 col-md-3">
						<div class="row">
							<div class="col-3 col-sm-3 col-md-3"></div>
							<div class="col-9 col-sm-9 col-md-9">
								<a style="float: left;" href="/admin/add-chi-tiet-bai-test"><button
										type="button" class="btn btn-success btn-lg">
										Thêm mới <i class="fas fa-plus-square"> </i>
									</button></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered" id="dataTable" width="100%"
						cellspacing="0">
						<thead>
							<tr>
								<th>ID</th>
								<th>Tên User</th>
								<th>Tên Bài Test</th>
								<th>DELETE</th>
								<th>EDIT</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="ctbaitest" items="${showCTBTe}">
								<tr>
									<td>${ctbaitest.idctbaitest }</td>
									<td>${ctbaitest.user.username }</td>
									<td>${ctbaitest.baitest.tenbaitest }</td>
									<td><a
										href="/admin/delete-chitiet-baitest?id=${ctbaitest.idctbaitest }" onclick="return theFunction()"><button
												type="button" class="btn btn-warning">
												<i class="fas fa-trash"></i>
											</button></a></td>
									<td><a
										href="/admin/update-chi-tiet-bai-test?id=${ctbaitest.idctbaitest }"><button
												type="button" class="btn btn-danger">
												<i class="fas fa-wrench"></i>
											</button></a></td>

								</tr>
							</c:forEach>
						</tbody>
					</table>
					<script>
						function theFunction() {
							if (confirm("Bạn có muốn xóa mục này ?"))
								return true;
							return false;
						}
					</script>
				</div>
			</div>
		</div>

	</div>
	<!-- /.container-fluid -->
	<!-- End of Main Content -->
	<!-- Footer -->
	<footer class="sticky-footer bg-white">
		<div class="container my-auto">
			<div class="copyright text-center my-auto">
				<span>Bản quyền &copy; Yuki.vn</span>
			</div>
		</div>
	</footer>
	<!-- End of Footer -->
	<!-- End of Content Wrapper -->
	<!-- End of Page Wrapper -->
	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="login">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="/vendor/jquery/jquery.min.js"></script>
	<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="/vendor/datatables/jquery.dataTables.min.js"></script>
	<script src="/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="/js/demo/datatables-demo.js"></script>

</body>

</html>
