package com.website.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.website.Entity.Chude;
import com.website.Entity.Loaichude;
import com.website.Entity.Role;
import com.website.Entity.Tintuc;
import com.website.Entity.Tuvung_max_;
import com.website.Entity.User;
import com.website.Entity.UsersRole;
import com.website.Repository.*;

@Controller
public class HomeController {
	// Khởi tạo hàm String Avatar
	public static final String uploadingdirAvatar = System.getProperty("user.dir")
			+ "/src/main/resources/static/avatars/";
//	DELET FILE
	public void deleteFile(String source) throws IOException {
		File file = new File(source);
//          kiem tra nếu file tồn tại thì xóa
		if (file.exists()) {
			System.out.println("file tồn tại");
			file.delete();
			System.out.println("xóa file thành công!");
		}
	}

	@RequestMapping("/*")
	public String error() {
		return "home/error404";
	}

	@RequestMapping("/")
	public String showIndex() {
		return "home/index";
	}

	@RequestMapping("/index")
	public String home() {
		System.out.println("index");
		return "home/index";
	}

	@RequestMapping("/demomodaladvancedSearch")
	public String demomodaladvancedSearch() {
		System.out.println("demomodaladvancedSearch");
		return "home/demomodaladvancedSearch";
	}

	@RequestMapping("/demomodalageconfirmation")
	public String demomodalageconfirmation() {
		System.out.println("demomodalageconfirmation");
		return "home/demomodalageconfirmation";
	}

	@RequestMapping("/demomodallevelup")
	public String demomodallevelup() {
		System.out.println("demomodallevelup");
		return "home/demomodallevelup";
	}

	@RequestMapping("/bacongcu")
	public String bacongcu() {
		System.out.println("bacongcu");
		return "home/bacongcu";
	}
//  TODO ======================================= Profile User ============================================================== //

	@RequestMapping(value = "/update-profile", method = RequestMethod.GET)
	public String updateProfile(HttpServletRequest request, Model model,
			@RequestParam(value = "username", required = true) String username) {
		User us = userRSP.findByName(username);
		model.addAttribute("updateProfile", us);
		request.setAttribute("password", us.getPassword());
		request.setAttribute("showAnhTruoc", us.getAvatar());
		return "home/profile_user";
	}

	@RequestMapping(value = "/update-profile", method = RequestMethod.POST)
	public String updateProfile(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("updateProfile") User user, @RequestParam("anhtruoc") String anhtruoc) {
		try {
			//Xoa img cu trong he thong
			deleteFile(uploadingdirAvatar + anhtruoc);
			File file = new File(uploadingdirAvatar + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			user.setAvatar(uploadFiles.getOriginalFilename());
			user.setEnabled(1);
			user.setUsername(user.getUsername());
			user.setPassword(user.getPassword());
			userRSP.save(user);
			model.addAttribute("showProfile", userRSP.findAll());
			model.addAttribute("message", "Thông tin thay đổi thành công");
			//return "redirect:/admin/update-profile?username=" + user.getUsername() + "";
			return "home/profile_user";
		} catch (Exception ex) {
			model.addAttribute("message", "error upload file");
			model.addAttribute("message", "Thông tin thay đổi thất bại");
			return "home/profile_user";
		}
	}

//TODO ========================================= Edit Password ========================================= //
		@RequestMapping(value = "/update-profile_pass", method = RequestMethod.GET)
		public String updateProfile_passs(HttpServletRequest request, Model model,
				@RequestParam(value = "username", required = true) String username) {
			System.out.println("Update User pass");
			User user = userRSP.findByName(username);
			model.addAttribute("updateProfile_pass", user);
			return "home/changepass_user";
		}

		@RequestMapping(value = "/update-profile_pass", method = RequestMethod.POST)
		public String updateProfile_passs(HttpServletRequest request1, Model model1,
				@ModelAttribute("updateProfile_pass") User user, @RequestParam(value = "password") String pass) {
			try {
				user.setEnabled(1);
				// mã hóa password
				pass = bCrypt.encode(user.getPassword());
				user.setPassword(pass);
				userRSP.save(user);
				model1.addAttribute("message", "Đổi mật khẩu thành công!");
				return "home/changepass_user";
			} catch (Exception ex) {
				model1.addAttribute("message", "Đổi mật khẩu thất bại!");
				return "home/changepass_user";
			}
		}
//	TODO ======================================= Bảng chữ cái ============================================================== //
	@Autowired
	BangchucaiReposiotry bangchucaiRSP;

	@RequestMapping("/bangchucai")
	public String ViewBangChuCai(HttpServletRequest request) {
		System.out.println("bangchucai");
		request.setAttribute("showBangChuCaiH", bangchucaiRSP.FindByHiragana());
		request.setAttribute("showBangChuCaiK", bangchucaiRSP.FindByKatakana());
		return "home/mina";
	}

	// View theo ID Chu Cai Hiragana
//		@RequestMapping(value = "Detail-bang-chu-cai-h", method = RequestMethod.GET)
//		public String detailBangChuCaiHiragana(HttpServletRequest request, Model model,
//				@RequestParam(value = "id", required = true) Integer id) {
//			System.out.println("Detail Hiragana");
//	
//			//Show where By ID
//			Bangchucai bangChuCai = bangchucaiRSP.findByIdBCC(id);
//			request.setAttribute("showDetailBCC", bangChuCai);
//			//Show Full Data Bang Chu Cai
//			request.setAttribute("showBangChuCaiH", bangchucaiRSP.FindByHiragana());
//			request.setAttribute("showBangChuCaiK", bangchucaiRSP.FindByKatakana());
//			return "home/bangchucai_h";
//		}

//	//View theo ID Chu Cai Katakana
//		@RequestMapping(value = "Detail-bang-chu-cai-k", method = RequestMethod.GET)
//		public String detailBangChuCaiKatakana(HttpServletRequest request, Model model,
//				@RequestParam(value = "id", required = true) Integer id) {
//			System.out.println("Detail Katakana");
//	
//			//Show where By ID
//			Bangchucai bangChuCai = bangchucaiRSP.findByIdBCC(id);
//			request.setAttribute("showDetailBCC", bangChuCai);
//			//Show Full Data Bang Chu Cai
//			//request.setAttribute("showBangChuCaiH", bangchucaiRSP.findAll());
//			request.setAttribute("showBangChuCaiH", bangchucaiRSP.FindByHiragana());
//			request.setAttribute("showBangChuCaiK", bangchucaiRSP.FindByKatakana());
//			return "home/bangchucai_k";
//		}
//	TODO ======================================= Quizt ============================================================== //
	@RequestMapping("/quiz")
	public String Quizbcc() {
		System.out.println("quizbcc");
		return "home/quiz";
	}
//	TODO ======================================= Bài học ============================================================== //

	@RequestMapping("/baihoc")
	public String ShowBaiHoc() {
		System.out.println("camnang");
		return "home/baihoc";
	}

	@RequestMapping("/camnang")
	public String camnang() {
		System.out.println("camnang");
		return "home/camnang";
	}

	@RequestMapping("/chitietdiendan")
	public String chitietdiendan() {
		System.out.println("chitietdiendan");
		return "home/chitietdiendan";
	}

	@RequestMapping("/chitietkhoahoc")
	public String chitietkhoahoc() {
		System.out.println("chitietkhoahoc");
		return "home/chitietkhoahoc";
	}

	@RequestMapping("/chuyen")
	public String chuyen() {
		System.out.println("chuyen");
		return "home/chuyen";
	}

	@RequestMapping("/dangki")
	public String dangki() {
		System.out.println("dangki");
		return "home/dangki";
	}

	@RequestMapping("/dangnhap")
	public String dangnhap() {
		System.out.println("dangnhap");
		return "home/dangnhap";
	}

	@RequestMapping("/diendan")
	public String diendan() {
		System.out.println("diendan");
		return "home/diendan";
	}

	@RequestMapping("/error404")
	public String error404() {
		System.out.println("error404");
		return "home/error404";
	}

	@RequestMapping("/footer")
	public String footer() {
		System.out.println("footer");
		return "home/footer";
	}

	@RequestMapping("/header")
	public String header() {
		System.out.println("header");
		return "home/header";
	}

	@RequestMapping("/hoctiengnhatonline")
	public String hoctiengnhatonline() {
		System.out.println("hoctiengnhatonline");
		return "home/hoctiengnhatonline";
	}

	@RequestMapping("/Thanh-Toan")
	public String ThanhToan() {
		System.out.println("ThanhToan");
		return "home/ThanhToan";
	}

	@RequestMapping("/ThanhToan1")
	public String ThanhToan1() {
		System.out.println("ThanhToan1");
		return "home/ThanhToan1";
	}

	@RequestMapping("/ThanhToan2")
	public String ThanhToan2() {
		System.out.println("ThanhToan2");
		return "home/ThanhToan2";
	}

	@RequestMapping("/ThanhToan3")
	public String ThanhToan3() {
		System.out.println("ThanhToan3");
		return "home/ThanhToan3";
	}

	@RequestMapping("/tracuu")
	public String tracuu() {
		System.out.println("tracuu");
		return "home/tracuu";
	}

// TODO ############################################################ Đăng ký ########################################################//
//Add user
	@Autowired
	private BCryptPasswordEncoder bCrypt;
	@Autowired
	UserRepository userRSP;
	@Autowired
//	QuyenRepository quyenRSP;
	QuyenRepository roleRSP;
	@Autowired
	UserroleRepository userroleRSP;

	@RequestMapping(value = "addUser", method = RequestMethod.GET)
	public String addUser(HttpServletRequest request, Model model) {
		System.out.println(" return add user");
		model.addAttribute("addUser", new User());
		return "home/dangki";
	}

//TODO ========================================================== Logout===============================================================//
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}

	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, Model model, @ModelAttribute("addUser") User user1) {

		String pw = bCrypt.encode(user1.getPassword());
		User username1 = userRSP.findIDByUserName(user1.getUsername());
		if (username1 == null) {
			user1.setPassword(pw);
			user1.setEnabled(1);
			userRSP.save(user1);

			Role r = roleRSP.findIDbyname();
			System.out.println(r.getName());
			UsersRole ur = new UsersRole();
			User iduser = userRSP.findIDByUserName(user1.getUsername());

			ur.setUserBean(iduser);
			ur.setRoleBean(r);
			userroleRSP.save(ur);
			return "redirect:/dangnhap";

		} else {
			model.addAttribute("message", "Tài khoản đã tồn tại");
			return "home/dangki";

		}

	}

//TODO ========================================================== Show Detail Blog===============================================================//
	@Autowired
	TintucRepository tintucRSP;

//View
	@RequestMapping("/blog")
	public String ViewBlog(HttpServletRequest request) {
		System.out.println("Tin tuc");
		request.setAttribute("showTinTuc", tintucRSP.findAll());
		return "home/blog";
	}

//View theo ID
	@RequestMapping(value = "detail-blog", method = RequestMethod.GET)
	public String detailBlog(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("details");
		Tintuc tinctuc = tintucRSP.findByIDTinTuc(id);
		request.setAttribute("showTinTuc", tintucRSP.findAll());
		request.setAttribute("showdetail", tinctuc);

		return "home/blog-detail";
	}

//TODO ################################################## Từ vựng max###########################
	@Autowired
	TuvungMaxRepository tuvungmaxRPS;
	@Autowired
	ChudeRepository chudeRPS;
	@Autowired
	LoaichudeRepository loaichudeRPS;
	@Autowired
	LoaichudeRepositoryString loaichudeRPSST;

	// Show
	@RequestMapping("/tuvung")
	public String tuvung(HttpServletRequest request) {
		System.out.println("tuvung");
		request.setAttribute("showGiaoDienTuVung", chudeRPS.findAll());
		request.setAttribute("ShowLoaiChuDe", loaichudeRPS.findAll());
		return "home/tuvung";
	}

	// View by ID
	@RequestMapping(value = "/view-by-id-chu-de", method = RequestMethod.GET)
	public String ViewbyIDLoaiChuDe(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		List<Chude> chude = chudeRPS.findByIdLoaiChudDe(id);
		request.setAttribute("ShowLoaiChuDe", loaichudeRPS.findAll());
		request.setAttribute("ViewDetailChudeByIDLoaiChuDe", chude);
		return "home/tuvung_showbyloaituvung";
	}

	// Ham search by ten loai chu de
	@RequestMapping(value = "/view-by-ten-loai-chu-de", method = RequestMethod.GET)
	public String ViewByTenLoaiChuDe(HttpServletRequest request, Model model,
			@RequestParam(value = "tenloaichude", required = true) String tenloaichude) {
		List<Loaichude> loaichude = loaichudeRPSST.findUsersWithPartOfName(tenloaichude);
		request.setAttribute("showGiaoDienTuVung", chudeRPS.findAll());
		request.setAttribute("ViewDetailChudeByTenLoaiChuDe", loaichude);
		return "home/tuvung_showbysearchloaituvung";
	}

//TODO ######################################Tu vung #########################################//
	@RequestMapping("/searchtuvung")
	public String searchtuvung() {
		return "home/searchtuvung";
	}

//	TODO ======================================= Tu vung max ============================================================== //
//	View tu vung max by ID Chu de
	@RequestMapping(value = "/tu-vung-max-by-id-chu-de", method = RequestMethod.GET)
	public String ViewTuVungMaxByIDChuDe(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) int id) {
		List<Tuvung_max_> tuvungMax = tuvungmaxRPS.findByIDchuDe(id);
		request.setAttribute("ViewTuVungMaxByIDChuDe", tuvungMax);
		return "home/tuvungmax";
	}

// TODO	#################################### FORUM #############################################//

	@RequestMapping("/homeforum")
	public String homeforum() {
		System.out.println("homeforum");
		return "home/homeforum";
	}

	@RequestMapping("/khoahoc")
	public String khoahoc() {
		System.out.println("khoahoc");
		return "home/khoahoc";
	}

	@RequestMapping("/luyenthi")
	public String luyenthi() {
		System.out.println("luyenthi");
		return "home/luyenthi";
	}

	@RequestMapping("/machbancachdat180")
	public String machbancachdat180() {
		System.out.println("machbancachdat180");
		return "home/machbancachdat180";
	}

	@RequestMapping("/messagescompose")
	public String messagescompose() {
		System.out.println("messagescompose");
		return "home/messagescompose";
	}

	@RequestMapping("/messagespage")
	public String messagespage() {
		System.out.println("messagespage");
		return "home/messagespage";
	}

	@RequestMapping("/pagecategories")
	public String pagecategories() {
		System.out.println("pagecategories");
		return "home/pagecategories";
	}

	@RequestMapping("/pagecreatetopic")
	public String pagecreatetopic() {
		System.out.println("pagecreatetopic");
		return "home/pagecreatetopic";
	}

	@RequestMapping("/pagelogin")
	public String pagelogin() {
		System.out.println("pagelogin");
		return "home/pagelogin";
	}

	@RequestMapping("/pagesignup")
	public String pagesignup() {
		System.out.println("pagesignup");
		return "home/pagesignup";
	}

	@RequestMapping("/pagesinglesettings")
	public String pagesinglesettings() {
		System.out.println("pagesinglesettings");
		return "home/pagesinglesettings";
	}

	@RequestMapping("/pagesingletopic")
	public String pagesingletopic() {
		System.out.println("pagesingletopic");
		return "home/pagesingletopic";
	}

	@RequestMapping("/pagetabsguidelines")
	public String pagetabsguidelines() {
		System.out.println("pagetabsguidelines");
		return "home/pagetabsguidelines";
	}

//	#################################### ADMIN #############################################

	@RequestMapping("/thongbaoloi")
	public String thongbaoloi() {
		System.out.println("thongbaoloi");
		return "admin/thongbaoloi";
	}

	@RequestMapping("/buttons")
	public String buttons() {
		System.out.println("buttons");
		return "admin/buttons";
	}

	@RequestMapping("/blank")
	public String blank() {
		System.out.println("blank");
		return "admin/blank";
	}

	@RequestMapping("/cards")
	public String cards() {
		System.out.println("cards");
		return "admin/cards";
	}

	@RequestMapping("/charts")
	public String charts() {
		System.out.println("charts");
		return "admin/charts";
	}

	@RequestMapping("/forgotpassword")
	public String forgotpassword() {
		System.out.println("forgotpassword");
		return "admin/forgotpassword";
	}

	@RequestMapping("/login")
	public String login() {
		System.out.println("login");
		return "admin/login";
	}

	@RequestMapping("/register")
	public String register() {
		System.out.println("register");
		return "admin/register";
	}

	@RequestMapping("/tablesdanhmuc")
	public String tables() {
		System.out.println("tables");
		return "admin/table_danhmuc";
	}

	@RequestMapping("/tables")
	public String tables2() {
		System.out.println("tables2");
		return "admin/tables";
	}

	@RequestMapping("/hoc-thu")
	public String hocthu() {
		return "home/hocthu";
	}

	@RequestMapping("/chi-tiet-hoc-thu")
	public String chitiethocthu() {
		return "home/chitiethocthu";
	}

}
