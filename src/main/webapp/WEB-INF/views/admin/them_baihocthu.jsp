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

<title>Thêm Bảng Bài Học Thử</title>

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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

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
				<h6 class="m-0 font-weight-bold text-primary">Thêm Bảng Học Thử</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
					<form:form action="/admin/add-hoc-thu" modelAttribute="addHocThu" method="POST">
						<div class="form-group" >
							<label for="video">Video</label>
							<form:input path="video" id="video" name="video" cssClass="form-control" required="true"/>
							<span>
							<b>Chú ý*:</b><br>
										+ Search Google cách nhúng link từ video yotubue. <br>
									    + Cấu hình width - height sao cho phù hợp với mục đích và yêu cầu của bạn.	
							</span>
							
						</div>
						<div class="form-group">
							<label for="noidung">Nội dung</label>
							<form:textarea path="noidung" id="noidung" name="noidung" cssClass="form-control"/>
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Chi Tiết Khoá Học</label>
							<form:select path="chitietkhoahoc.idctkh" cssClass="form-control">
								<form:options items="${showCBBChiTietKhoaHoc}" />
							</form:select>
						</div>
						<button type="submit" value="updateBaiHoc" class="btn btn-dark">
							THÊM MỚI <i class="fas fa-plus"></i>
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
	<script>
	//Show image when update or add file 1
	function readURL(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#blah').attr('src', e.target.result);
			}

			reader.readAsDataURL(input.files[0]);
		}
	}

	$("#imgInp").change(function() {
		readURL(this);
	});
	//Show image when update or add file 2
	function readURL1(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();

			reader.onload = function(e) {
				$('#blah1').attr('src', e.target.result);
			}

			reader.readAsDataURL(input.files[0]);
		}
	}

	$("#imgInp1").change(function() {
		readURL1(this);
	});
	</script>
</body>

</html>
