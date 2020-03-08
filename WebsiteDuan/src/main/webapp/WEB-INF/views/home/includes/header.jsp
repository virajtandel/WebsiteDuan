<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="heatag.jsp"%>
<header class="sticky-top">
	<div class="header container-fluid">
		<div class="container">
			<a href="index"> <img class="logo text-uppercase"
				src="images/logo.png" alt="">
			</a>
			<!-- <h2 class="logo">YUKI</h2> -->
			<input type="checkbox" id="chk"> <label for="chk"
				class="show-menu-btn"> <i class="fas fa-bars"></i>
			</label>
			<ul class="menu">
				<a class="text-uppercase " href="/khoahoc">Khóa học</a>
				<a class="text-uppercase " href="/tuvung">Từ vựng</a>
				<a class="text-uppercase " href="/bangchucai">Bảng chữ cái</a>
				<a class="text-uppercase " href="/blog">Tin tức</a>
				<a class="text-uppercase " href="/luyenthi">Luyện thi</a>
				<a class="text-uppercase " href="/homeforum">Forum</a>
				<c:choose>
					<c:when test="${pageContext.request.userPrincipal.name == null}">
						<a href="dangnhap"><button type="button" id="btn_login"
								class="btn btn-danger text-xs text-sm">
								Đăng nhập <i class="fas fa-sign-in-alt"></i>
							</button></a>
						<label for="chk" class="hide-menu-btn"> <i
							class="fas fa-times"></i>
						</label>
						<!--  nếu đăng nhập -->
					</c:when>
					<c:otherwise>
						<div class="dropdown">
							<img src="/avatars/q123123.jpg" class="img-thumbnail" style="width: 35px; height: 35px; border-radius: 50%;">
								<span style="color: royalblue;">${pageContext.request.userPrincipal.name}
									<i class="fas fa-angle-down"></i>
								</span>
							<div class="dropdown-content">
								<ul class="content-drop">
									<c:if test="${pageContext.request.isUserInRole('USER')}">
									<li style="line-height: 20px; font-weight: normal;"><a
										href="/update-profile?username=${pageContext.request.userPrincipal.name}"><i
											class="fas fa-id-card-alt pr-3"></i> Hồ sơ </a></li>
									</c:if>
									
									<c:if test="${pageContext.request.isUserInRole('ADMIN')}">
									<li style="line-height: 20px; font-weight: normal;"><a
										href="/admin/update-profile?username=${pageContext.request.userPrincipal.name}"><i
											class="fas fa-id-card-alt pr-3"></i> Hồ sơ </a></li>
							
										<li style="line-height: 20px; font-weight: none;"><a
											href="/admin/indexadmin"> <i
												class="fas fa-users-cog pr-3"></i> Quản lí
										</a></li>
									</c:if>
									<li style="line-height: 20px; font-weight: none;"><a
										href="/logout"> <i class="fas fa-sign-in-alt pr-3"></i>
											Đăng xuất
									</a></li>
								</ul>

							</div>
						</div>

					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</header>