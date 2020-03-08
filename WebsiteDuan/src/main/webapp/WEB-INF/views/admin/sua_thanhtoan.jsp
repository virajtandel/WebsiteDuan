<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Cập Nhật Toán</title>

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
<!-- Text Area -->
<script src="/js/nicEdit.js" type="text/javascript"></script>
<script>
	bkLib.onDomLoaded(function() {
		nicEditors.allTextAreas()
	});
</script>
	<%@include file="includes/heatag.jsp"%>
</head>

<body id="page-top">
	<%@include file="includes/header.jsp"%>
	<!-- End of Topbar -->
	<!-- Begin Page Content -->
	<div class="container-fluid">
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">CẬP NHẬT THÔNG TIN</h1>
		<!-- ----------------------------------------------------------------------------------------------- -->
		<!-- ----------------------------------------------------------------------------------------------- -->

		<!-- ----------------------------------------------------------------------------------------------- -->

		<!-- ----------------------------------------------------------------------------------------------- -->


		<!-- DataTales Example -->
		<div class="card shadow mb-4">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">Cập Nhật Thanh Toán</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<form:form action="/admin/update-thanh-toan" modelAttribute="updateThanhToan"
						method="POST">
						<div class="form-group">
							<form:input path="idthanhtoan" cssClass="form-control" type="hidden" />
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">User</label>
							<form:select path="user.id" cssClass="form-control">
								<form:options items="${showCBBUSer}" />
							</form:select>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Tổng thanh toán</label>
							<form:input type="number" path="tongthanhtoan" cssClass="form-control" />
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Hình thức thanh toán</label>
							<form:select path="hinhthucthanhtoan.idhinhthuctt" cssClass="form-control">
								<form:options items="${showCBBHinhThucTT}" />
							</form:select>
						</div>
						<button type="submit" value="submit" class="btn btn-dark">
							CẬP NHẬT <i class="fas fa-plus"></i>
						</button>
						<button type="reset" value="Reset" class="btn btn-info">
							LÀM MỚI <i class="fas fa-redo-alt"></i>
						</button>
					</form:form>
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
