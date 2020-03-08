<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<meta charset="UTF-8">
<!-- Page Wrapper -->
<div id="wrapper">
	<!-- Sidebar -->
	<ul
		class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
		id="accordionSidebar">

		<!-- Sidebar - Brand -->
		<a
			class="sidebar-brand d-flex align-items-center justify-content-center"
			href="/index">
			<div class="sidebar-brand-icon rotate-n-15">
				<i class="fas fa-laugh-wink"></i>
			</div>
			<div class="sidebar-brand-text mx-3">
				ADMIN <sup>yuki.vn</sup>
			</div>
		</a>

		<!-- Divider -->
		<hr class="sidebar-divider my-0">

		<!-- Nav Item - Dashboard -->
		<li class="nav-item active"><a class="nav-link" href="/admin/indexadmin">
				<i class="fas fa-fw fa-tachometer-alt"></i> <span>BẢNG ĐIỀU
					KHIỂN</span>
		</a></li>

		<!-- Heading -->
		<div class="sidebar-heading">Thông tin</div>
		<li class="nav-item">
		<a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapsePages_b"
			aria-expanded="true" aria-controls="collapsePages"> <i
				class="fas fa-fw fa-table"></i> <span>Quản lý thông tin</span>
		</a>
			<div id="collapsePages_b" class="collapse"
				aria-labelledby="headingPages" data-parent="#accordionSidebar">
				<div class="bg-white py-2 collapse-inner rounded">
						<a class="collapse-item" href="/admin/thong-ke-bang-chu-cai">Bảng chữ cái</a> 
						<a class="collapse-item" href="/admin/thong-ke-bai-hoc">Bài học</a> 
						<a class="collapse-item" href="/admin/thong-ke-bai-tap">Bài tập</a>
						<a class="collapse-item" href="/admin/thong-ke-bai-test">Bài test</a>
						<a class="collapse-item" href="/admin/thong-ke-bang-mina">Bảng mina</a>
						<a class="collapse-item" href="/admin/thong-ke-cau-hoi">Câu hỏi</a> 
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-tin-tuc">Chi tiết tin tức</a>
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-bai-hoc">Chi tiết bài học</a>
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-bai-tap">Chi tiết bài tập</a>
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-bai-test">Chi tiết bài test</a>
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-khoa-hoc">Chi tiết khóa học</a>
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-ngu-phap">Chi tiết ngữ pháp</a>
						<a class="collapse-item" href="/admin/thong-ke-chi-tiet-thanh-toan">Chi tiết thanh toán</a>
						<a class="collapse-item" href="/admin/thong-ke-chu-de">Chủ đề</a> 
						<a class="collapse-item" href="/admin/thong-ke-danh-muc">Danh mục</a>
						<a class="collapse-item" href="/admin/thong-ke-dap-an">Đáp án</a>
						<a class="collapse-item" href="/admin/thong-ke-giao-trinh">Giáo trình</a>
						<a class="collapse-item" href="/admin/thong-ke-hinh-thuc-thanh-toan">Hình thức thanh toán</a>
						<a class="collapse-item" href="/admin/thong-ke-tu-vung-max">Từ Vựng(Max)</a> 
						<a class="collapse-item" href="/admin/thong-ke-tu-vung-min">Từ Vựng(Min)</a>
						<a class="collapse-item" href="/admin/thong-ke-user">User</a>
						<a class="collapse-item" href="/admin/thong-ke-khoa-hoc">Khóa học</a>
						<a class="collapse-item" href="/admin/thong-ke-loai-bai-test">Loại bài test</a>
						<a class="collapse-item" href="/admin/thong-ke-loai-chu-de">Loại chủ đề</a>
						<a class="collapse-item" href="/admin/thong-ke-loai-khoa-hoc">Loại khóa học</a>
						<a class="collapse-item" href="/admin/thong-ke-ngu-phap">Ngữ pháp</a>
						<a class="collapse-item" href="/admin/thong-ke-quyen">Quyền</a>
						<a class="collapse-item" href="/admin/thong-ke-quiz-hira">Quiz</a>
						<a class="collapse-item" href="/admin/thong-ke-user-role">User-Role</a>
						<a class="collapse-item" href="/admin/thong-ke-trinh-do">Trình độ</a>
						<a class="collapse-item" href="/admin/thong-ke-tin-tuc">Tin tức</a> 
					
						
				</div>
			</div></li>

		<!-- ------------------------------------------------------------------------------------------------------- -->

		<!-- Nav Item - Tables -->
		<!--  -->
		<li class="nav-item"><a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapsePages_a"
			aria-expanded="true" aria-controls="collapsePages"><i
				class="fas fa-edit"></i> <span>Cập nhật thông tin</span> </a>
			<div id="collapsePages_a" class="collapse"
				aria-labelledby="headingPages" data-parent="#accordionSidebar">
				<div class="bg-white py-2 collapse-inner rounded">
					<a class="collapse-item" href="#">Cập nhật từ điển</a> <a
						class="collapse-item" href="#">Cập nhật tài khoản</a> <a
						class="collapse-item" href="#">Cập nhật tin tức</a> <a
						class="collapse-item" href="#">Cập nhật khóa học</a> <a
						class="collapse-item" href="#">Cập nhật bài test</a> <a
						class="collapse-item" href="#">Cập nhật giải trí </a>

				</div>
			</div></li>


		<!-- ------------------------------------------------------------------------------------------------------- -->

		<!-- Nav Item - Tables -->
		<li class="nav-item"><a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapsePages_d"
			aria-expanded="true" aria-controls="collapsePages"> <i
				class="fas fa-address-card"></i> <span> Khóa học</span>
		</a>
			<div id="collapsePages_d" class="collapse"
				aria-labelledby="headingPages" data-parent="#accordionSidebar">
				<div class="bg-white py-2 collapse-inner rounded">
					<a class="collapse-item" href="#">N5</a> <a class="collapse-item"
						href="#">N4</a> <a class="collapse-item" href="#">N3</a> <a
						class="collapse-item" href="#">N2</a> <a class="collapse-item"
						href="#">N1</a>
				</div>
			</div></li>


		<!--------------------------------------------------------------------------------------------------------- -->
		<!-- Nav Item - Pages Collapse Menu -->
		<li class="nav-item"><a class="nav-link collapsed" href="#"
			data-toggle="collapse" data-target="#collapsePages"
			aria-expanded="true" aria-controls="collapsePages"><i
				class="fas fa-sign-in-alt"></i> <span>Thông tin đăng nhập</span> </a>
			<div id="collapsePages" class="collapse"
				aria-labelledby="headingPages" data-parent="#accordionSidebar">
				<div class="bg-white py-2 collapse-inner rounded">
					<h6 class="collapse-header">Màn hình đăng nhập:</h6>
					<a class="collapse-item" href="/login">Đăng nhập</a> <a
						class="collapse-item" href="/register">Đăng ký:</a> <a
						class="collapse-item" href="/forgotpassword">Quên mật khẩu:</a>
					<div class="collapse-divider"></div>
					<h6 class="collapse-header">Trang khác</h6>
					<a class="collapse-item" href="/thongbaoloi">404 Page</a> <a
						class="collapse-item" href="/blank">Trang trống</a>
				</div>
			</div></li>

		<!-- ------------------------------------------------------------------------------------------------------- -->


		<!-- Divider -->
		<hr class="sidebar-divider d-none d-md-block">

		<!-- Sidebar Toggler (Sidebar) -->
		<div class="text-center d-none d-md-inline">
			<button class="rounded-circle border-0" id="sidebarToggle"></button>
		</div>
	</ul>
	<!-- End of Sidebar -->

	<!-- Content Wrapper -->
	<div id="content-wrapper" class="d-flex flex-column">

		<!-- Main Content -->
		<div id="content">
			<!-- Topbar -->
			<nav
				class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

				<!-- Sidebar Toggle (Topbar) -->
				<button id="sidebarToggleTop"
					class="btn btn-link d-md-none rounded-circle mr-3">
					<i class="fa fa-bars"></i>
				</button>

				<!-- Topbar Search -->
				<form
					class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
					<div class="input-group">
						<input type="text" class="form-control bg-light border-0 small"
							placeholder="Tìm kiếm..." aria-label="Search"
							aria-describedby="basic-addon2">
						<div class="input-group-append">
							<button class="btn btn-primary" type="button">
								<i class="fas fa-search fa-sm"></i>
							</button>
						</div>
					</div>
				</form>

				<!-- Topbar Navbar -->
				<ul class="navbar-nav ml-auto">

					<!-- Nav Item - Search Dropdown (Visible Only XS) -->
					<li class="nav-item dropdown no-arrow d-sm-none"><a
						class="nav-link dropdown-toggle" href="#" id="searchDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
					</a> <!-- Dropdown - Messages -->
						<div
							class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
							aria-labelledby="searchDropdown">
							<form class="form-inline mr-auto w-100 navbar-search">
								<div class="input-group">
									<input type="text" class="form-control bg-light border-0 small"
										placeholder="Tìm kiếm..." aria-label="Search"
										aria-describedby="basic-addon2">
									<div class="input-group-append">
										<button class="btn btn-primary" type="button">
											<i class="fas fa-search fa-sm"></i>
										</button>
									</div>
								</div>
							</form>
						</div></li>

					<!-- Nav Item - Alerts -->
					<li class="nav-item dropdown no-arrow mx-1"><a
						class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!-- Counter - Alerts -->
							<span class="badge badge-danger badge-counter">3+</span>
					</a> <!-- Dropdown - Alerts -->
						<div
							class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
							aria-labelledby="alertsDropdown">
							<h6 class="dropdown-header">Trung tâm cảnh báo</h6>
							<a class="dropdown-item d-flex align-items-center" href="#">
								<div class="mr-3">
									<div class="icon-circle bg-primary">
										<i class="fas fa-file-alt text-white"></i>
									</div>
								</div>
								<div>
									<div class="small text-gray-500">Ngày 12 tháng 12 năm
										2019</div>
									<span class="font-weight-bold">Một báo cáo mới hàng
										tháng đã sẵn sàng để tải về!</span>
								</div>
							</a> <a class="dropdown-item d-flex align-items-center" href="#">
								<div class="mr-3">
									<div class="icon-circle bg-success">
										<i class="fas fa-donate text-white"></i>
									</div>
								</div>
								<div>
									<div class="small text-gray-500">Ngày 7 tháng 12 năm 2019</div>
									$ 290,29 đã được gửi vào tài khoản của bạn!
								</div>
							</a> <a class="dropdown-item d-flex align-items-center" href="#">
								<div class="mr-3">
									<div class="icon-circle bg-warning">
										<i class="fas fa-exclamation-triangle text-white"></i>
									</div>
								</div>
								<div>
									<div class="small text-gray-500">Ngày 2 tháng 12 năm 2019</div>
									Thông báo chi tiêu: Chúng tôi đã nhận thấy chi tiêu cao bất
									thường cho tài khoản của bạn.
								</div>
							</a> <a class="dropdown-item text-center small text-gray-500"
								href="#">Hiển thị tất cả cảnh báo</a>
						</div></li>

					<!-- Nav Item - Messages -->
					<li class="nav-item dropdown no-arrow mx-1"><a
						class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i> <!-- Counter - Messages -->
							<span class="badge badge-danger badge-counter">7</span>
					</a> <!-- Dropdown - Messages -->
						<div
							class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
							aria-labelledby="messagesDropdown">
							<h6 class="dropdown-header">Trung tâm tin nhắn</h6>
							<a class="dropdown-item d-flex align-items-center" href="#">
								<div class="dropdown-list-image mr-3">
									<img class="rounded-circle"
										src="https://source.unsplash.com/fn_BT9fwg_E/60x60" alt="">
									<div class="status-indicator bg-success"></div>
								</div>
								<div class="font-weight-bold">
									<div class="text-truncate">Hi admin, mình muốn đăng kí
										khóa học N1</div>
									<div class="small text-gray-500">Văn Quang · 58m</div>
								</div>
							</a> <a class="dropdown-item d-flex align-items-center" href="#">
								<div class="dropdown-list-image mr-3">
									<img class="rounded-circle"
										src="https://source.unsplash.com/AU4VPcFN4LE/60x60" alt="">
									<div class="status-indicator"></div>
								</div>
								<div>
									<div class="text-truncate">Cảm ơn admin, khóa học này đã
										thay đổi mình rất nhiều</div>
									<div class="small text-gray-500">Đại Nhật · 1d</div>
								</div>
							</a> <a class="dropdown-item d-flex align-items-center" href="#">
								<div class="dropdown-list-image mr-3">
									<img class="rounded-circle"
										src="https://source.unsplash.com/CS2uCrpNzJY/60x60" alt="">
									<div class="status-indicator bg-warning"></div>
								</div>
								<div>
									<div class="text-truncate">Mình đăng kí khóa N3, admin
										check giúp mình với!</div>
									<div class="small text-gray-500">Huy Hóa · d</div>
								</div>
							</a> <a class="dropdown-item d-flex align-items-center" href="#">
								<div class="dropdown-list-image mr-3">
									<img class="rounded-circle"
										src="https://source.unsplash.com/Mv9hjnEUHR4/60x60" alt="">
									<div class="status-indicator bg-success"></div>
								</div>
								<div>
									<div class="text-truncate">Khóa học này đã thay đổi bản
										thân tôi rất nhiều!</div>
									<div class="small text-gray-500">Hữu Thắng · 2w</div>
								</div>
							</a> <a class="dropdown-item text-center small text-gray-500"
								href="#">Xem thêm tin nhắn</a>
						</div></li>

					<div class="topbar-divider d-none d-sm-block"></div>

					<!-- Nav Item - User Information -->
					<li class="nav-item dropdown no-arrow"><a
						class="nav-link dropdown-toggle" href="#" id="userDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false"> <span
							class="mr-2 d-none d-lg-inline text-gray-600 small">${pageContext.request.userPrincipal.name}</span> <img class="img-profile rounded-circle"
							src="../avatars/q123123.jpg">
					</a> <!-- Dropdown - User Information -->
						<div
							class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
							aria-labelledby="userDropdown">
							<a class="dropdown-item" href="#"> <i
								class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Hồ sơ
							</a> <a class="dropdown-item" href="/admin/update-profile?name=${pageContext.request.userPrincipal.name}"> <i
								class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i> Cài đặt
							</a> <a class="dropdown-item" href="#"> <i
								class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i> Hoạt
								động đăng nhập
							</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="/logout" data-toggle="modal"
								data-target="#logoutModal"> <i
								class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
								Đăng xuất
							</a>
						</div></li>

				</ul>

			</nav>