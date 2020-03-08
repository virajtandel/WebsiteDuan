package com.website.Controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.website.Entity.Baihoc;
import com.website.Entity.Baitap;
import com.website.Entity.Baitest;
import com.website.Entity.Bangchucai;
import com.website.Entity.Cauhoi;
import com.website.Entity.Chiitiettintuc;
import com.website.Entity.Chitietbaihoc;
import com.website.Entity.Chitietbaitap;
import com.website.Entity.Chitietbaitest;
import com.website.Entity.Chitietkhoahoc;
import com.website.Entity.Chitietnguphap;
import com.website.Entity.Chitietthanhtoan;
import com.website.Entity.Chude;
import com.website.Entity.Danhmuc;
import com.website.Entity.Dapan;
import com.website.Entity.Giaotrinh;
import com.website.Entity.Hinhthucthanhtoan;
import com.website.Entity.Khoahoc;
import com.website.Entity.Loaibaitest;
import com.website.Entity.Loaichude;
import com.website.Entity.Loaikhoahoc;
import com.website.Entity.Mina;
import com.website.Entity.Nguphap;
import com.website.Entity.QuizHirabcc;
import com.website.Entity.Role;
import com.website.Entity.Thanhtoan;
import com.website.Entity.Tintuc;
import com.website.Entity.Trinhdo;
import com.website.Entity.Tuvung_max_;
import com.website.Entity.Tuvung_min_;
import com.website.Entity.User;
import com.website.Entity.UsersRole;
import com.website.Repository.BaiTapRepository;
import com.website.Repository.BaihocRepository;
import com.website.Repository.BaitestRepository;
import com.website.Repository.BangchucaiRepository;
import com.website.Repository.CauhoiRepository;
import com.website.Repository.ChitietbaihocRepository;
import com.website.Repository.ChitietbaitapRepository;
import com.website.Repository.ChitietbaitestRepository;
import com.website.Repository.ChitietkhoahocRepository;
import com.website.Repository.ChitietnguphapRepository;
import com.website.Repository.ChitietthanhtoanRepository;
import com.website.Repository.ChitiettintucRepository;
import com.website.Repository.ChudeRepository;
import com.website.Repository.DanhmucRepository;
import com.website.Repository.DapanRepository;
import com.website.Repository.GiaotrinhRepository;
import com.website.Repository.HinhthucthanhtoanRepository;
import com.website.Repository.KhoahocRepository;
import com.website.Repository.LoaibaitestRepository;
import com.website.Repository.LoaichudeRepository;
import com.website.Repository.LoaikhoahocRepository;
import com.website.Repository.MinaRepository;
import com.website.Repository.NguphapRepository;
import com.website.Repository.QuizHirabccRepository;
import com.website.Repository.QuyenRepository;
import com.website.Repository.ThanhtoanRepository;
import com.website.Repository.TintucRepository;
import com.website.Repository.TrinhdoRepository;
import com.website.Repository.TuvungMaxRepository;
import com.website.Repository.TuvungminRepository;
import com.website.Repository.UserRepository;
import com.website.Repository.UserroleRepository;

@Controller
@Transactional
@RequestMapping("/admin")
public class AdminController {

	@Autowired // Khai bao bien
	BaihocRepository baihocRSP;
	@Autowired
	BaiTapRepository baitapRSP;
	@Autowired
	BaitestRepository baitestRSP;
	@Autowired
	CauhoiRepository cauhoiRSP;
	@Autowired
	ChitiettintucRepository chitiettintucRSP;
	@Autowired
	ChitietbaihocRepository chitietbaihocRSP;
	@Autowired
	ChitietbaitapRepository chitietbaitapRSP;
	@Autowired
	ChitietbaitestRepository chitietbaitestRSP;
	@Autowired
	ChitietkhoahocRepository chitietkhoahocRSP;
	@Autowired
	ChitietnguphapRepository chitietnguphapRSP;
	@Autowired
	ChitietthanhtoanRepository chitietthanhtoanRSP;
	@Autowired
	ChudeRepository chudeRSP;
	@Autowired
	DanhmucRepository danhmucRSP;
	@Autowired
	DapanRepository dapanRSP;
	@Autowired
	GiaotrinhRepository giaotrinhRSP;
	@Autowired
	HinhthucthanhtoanRepository hinhthucthanhtoanRSP;
	@Autowired
	TuvungMaxRepository tuvungmaxRSP;
	@Autowired
	TuvungminRepository tuvungminRSP;
	@Autowired
	UserRepository userRSP;
	@Autowired
	KhoahocRepository khoahocRSP;
	@Autowired
	LoaibaitestRepository loaibaitestRSP;
	@Autowired
	LoaichudeRepository loaichudeRSP;
	@Autowired
	LoaikhoahocRepository loaikhoahocRSP;
	@Autowired
	NguphapRepository nguphapRSP;
	@Autowired
//	QuyenRepository quyenRSP;
	QuyenRepository roleRSP;
	@Autowired
	TrinhdoRepository trinhdoRSP;
	@Autowired
	TintucRepository tintucRSP;
	@Autowired
	ThanhtoanRepository thanhtoanRSP;
	@Autowired
	BangchucaiRepository bangchucaiRSP;
	@Autowired
	UserroleRepository userroleRSP;
	@Autowired
	MinaRepository minaRSP;
	@Autowired
	QuizHirabccRepository quizRSP;
	// Khởi tạo hàm String upload files publics
	public static final String uploadingdir = System.getProperty("user.dir") + "/src/main/resources/static/files/";
	// Khởi tạo hàm String upload files Tung vung max
	public static final String uploadingdirTuVungMax = System.getProperty("user.dir")
			+ "/src/main/resources/static/images_tuvungmax/";
	// Khởi tạo hàm String Avatar
	public static final String uploadingdirAvatar = System.getProperty("user.dir")
			+ "/src/main/resources/static/avatars/";
	// Khởi tạo hàm String Bang chu cai
	public static final String uploadingBangChuCai = System.getProperty("user.dir")
			+ "/src/main/resources/static/images/bangchucai/chucai/";
	// Khởi tạo hàm String Bang chu cai
	public static final String uploadingBangChuCaiCV = System.getProperty("user.dir")
			+ "/src/main/resources/static/images/bangchucai/detailchucai/";

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

// TODO ############################################################# SHOW INDEX ###################################################### //
	@RequestMapping("/*")
	public String errorline44() {
		return "home/error404";
	}

// TODO ############################################################# SHOW ADMIN ###################################################### //
	@RequestMapping("indexadmin")
	public String indexadmin() {
		return "admin/indexadmin";
	}
// TODO ############################################################# BÀI HỌC ###################################################### //

	// Show View
	@RequestMapping("/thong-ke-bai-hoc")
	public String ViewBaiHoc(HttpServletRequest request) {
		System.out.println("Bai Hoc");
		request.setAttribute("showBaiHoc", baihocRSP.findAll());
		return "admin/thongkebaihoc";
	}

	// Delete
	@RequestMapping(value = "/delete-baihoc")
	public String deleteBaiHoc(Model model, @RequestParam(value = "id", required = true) Integer id) {

		try {

			baihocRSP.deleteById(id);

			model.addAttribute("showBaiHoc", baihocRSP.findAll());
			System.out.println("Xóa lỗi 133311");

		} catch (Exception ex) {

			return "redirect:/admin/thong-ke-bai-hoc";

		}
		return "redirect:/admin/thong-ke-bai-hoc";
	}

	// Add
	@RequestMapping(value = "addBaiHoc", method = RequestMethod.GET)
	public String addBaiHoc(HttpServletRequest request, Model model) {
		System.out.println("add bai hoc");
		model.addAttribute("addBaiHoc", new Baihoc());
		return "admin/them_baihoc";
	}

	@RequestMapping(value = "addBaiHoc", method = RequestMethod.POST)
	public String addBaiHoc(HttpServletRequest request, Model model, @ModelAttribute("addBaiHoc") Baihoc baihoc) {
		System.out.println("add bai hoc");
		baihocRSP.save(baihoc);
		model.addAttribute("addBaiHoc", baihocRSP.findAll());
		return "redirect:/admin/thong-ke-bai-hoc";
	}

	// Update
	@RequestMapping(value = "update-baihoc", method = RequestMethod.GET)
	public String updateBaiHoc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		Baihoc baihoc = baihocRSP.findByBaiHocbyID(id);
		model.addAttribute("updateBaiHoc", baihoc);
		return "admin/sua_baihoc";
	}

	@RequestMapping(value = "update-baihoc", method = RequestMethod.POST)
	public String updateBaiHoc(HttpServletRequest request, Model model, @ModelAttribute("updateBaiHoc") Baihoc baihoc) {
		baihocRSP.save(baihoc);
		model.addAttribute("updateBaiHoc", baihocRSP.findAll());
		return "redirect:/admin/thong-ke-bai-hoc";
	}
//TODO ############################################################# BÀI TẬP ###################################################### //

	// Show View
	@RequestMapping("/thong-ke-bai-tap")
	public String ViewBaiTap(HttpServletRequest request) {
		System.out.println("Bai Tap");
		request.setAttribute("showBaiTap", baitapRSP.findAll());
		return "admin/thongkebaitap";
	}

	// Delete
	@RequestMapping(value = "/delete-baitap")
	public String deleteBaiTap(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			baitapRSP.deleteById(id);
			model.addAttribute("showBaiTap", baitapRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-bai-tap";
	}

	// Add
	@RequestMapping(value = "add-bai-tap", method = RequestMethod.GET)
	public String addBaiTap(HttpServletRequest request, Model model) {
		System.out.println("add Bai Tap");
		// Show CBB Bai Hoc
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}

		request.setAttribute("showTenBH", mapBaiHoc);

		model.addAttribute("addBaiTap", new Baitap());
		return "admin/them_baitap";
	}

	@RequestMapping(value = "add-bai-tap", method = RequestMethod.POST)
	public String addBaiTap(HttpServletRequest request, Model model, @ModelAttribute("addBaiTap") Baitap baitap) {
		baitapRSP.save(baitap);
		model.addAttribute("showBaiTap", baitapRSP.findAll());
		return "redirect:/admin/thong-ke-bai-tap";
	}

	// update
	@RequestMapping(value = "update-baitap", method = RequestMethod.GET)
	public String updateBaiTap(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update");
		// ----------------
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		// -----------------
		Baitap bt = baitapRSP.findByBaiTapbyID(id);

		request.setAttribute("showTenBH", mapBaiHoc);
		model.addAttribute("updateBaiTap", bt);
		return "admin/sua_baitap";
	}

	@RequestMapping(value = "update-baitap", method = RequestMethod.POST)
	public String updateBaiTap(HttpServletRequest request, Model model, @ModelAttribute("updateBaiTap") Baitap baitap) {
		baitapRSP.save(baitap);
		model.addAttribute("showBaiTap", baitapRSP.findAll());
		return "redirect:/admin/thong-ke-bai-tap";
	}

//TODO ############################################################# BÀI TEST ###################################################### //
	// Show View
	@RequestMapping("/thong-ke-bai-test")
	public String ViewBaiTest(HttpServletRequest request) {
		System.out.println("Chi tiey bai hoc");
		request.setAttribute("showBaiTest", baitestRSP.findAll());
		return "admin/thongkebaitest";
	}

	// Delete
	@RequestMapping(value = "/delete-bai-test")
	public String deleteBaiTest(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			baitestRSP.deleteById(id);
			model.addAttribute("showBaiTest", baitestRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-bai-test";
	}

	// Add
	@RequestMapping(value = "add-bai-test", method = RequestMethod.GET)
	public String addBaiTest(HttpServletRequest request, Model model) {
		System.out.println("add Bai Test");
		// Show Cbb Ten Trinh Do
		Map<Integer, String> mapTrinhdo = new LinkedHashMap<Integer, String>();
		List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapTrinhdo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
		}

		request.setAttribute("showTenTrinhDo", mapTrinhdo);
		// Show Cbb ten loai loai bai test
		Map<Integer, String> mapBaiTest = new LinkedHashMap<Integer, String>();
		List<Loaibaitest> baitest = (List<Loaibaitest>) loaibaitestRSP.findAll();
		for (int i = 0; i < baitest.size(); i++) {
			mapBaiTest.put(baitest.get(i).getIdloaibaitest(), baitest.get(i).getTenloaibaitest());
		}
		request.setAttribute("showTenLoaiBaiTest", mapBaiTest);
		// Addtribute
		model.addAttribute("addBaiTest", new Baitest());
		return "admin/them_baitest";
	}

	@RequestMapping(value = "add-bai-test", method = RequestMethod.POST)
	public String addBaiTest(HttpServletRequest request, Model model, @ModelAttribute("addBaiTest") Baitest baitest) {
		baitestRSP.save(baitest);
		model.addAttribute("showBaiTest", baitestRSP.findAll());
		return "redirect:/admin/thong-ke-bai-test";
	}

	// Update
	@RequestMapping(value = "update-baitest", method = RequestMethod.GET)
	public String updateBaiTest(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update bai test");
		// ----------------
		// Show Cbb Ten Trinh Do
		Map<Integer, String> mapTrinhdo = new LinkedHashMap<Integer, String>();
		List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapTrinhdo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
		}

		request.setAttribute("showTenTrinhDo", mapTrinhdo);
		// Show Cbb ten loai loai bai test
		Map<Integer, String> mapLoaiBaiTest = new LinkedHashMap<Integer, String>();
		List<Loaibaitest> loaibaitest = (List<Loaibaitest>) loaibaitestRSP.findAll();
		for (int i = 0; i < loaibaitest.size(); i++) {
			mapLoaiBaiTest.put(loaibaitest.get(i).getIdloaibaitest(), loaibaitest.get(i).getTenloaibaitest());
		}
		request.setAttribute("showTenLoaiBaiTest", mapLoaiBaiTest);
		// -----------------
		Baitest bt = baitestRSP.findByBaiTestbyID(id);

		model.addAttribute("updateBaiTest", bt);
		return "admin/sua_baitest";
	}

	@RequestMapping(value = "update-baitest", method = RequestMethod.POST)
	public String updateBaiTest(HttpServletRequest request, Model model,
			@ModelAttribute("updateBaiTest") Baitest baitest) {
		baitestRSP.save(baitest);
		model.addAttribute("showBaiTest", baitestRSP.findAll());
		return "redirect:/admin/thong-ke-bai-test";
	}

//TODO ############################################################# CÂU HỎI ###################################################### //
//Show view
	@RequestMapping("/thong-ke-cau-hoi")
	public String ViewCauHoi(HttpServletRequest request) {
		System.out.println("Cau Hoi");
		request.setAttribute("showCauHoi", cauhoiRSP.findAll());
		return "admin/thongkecauhoi";
	}
//Delete

	@RequestMapping(value = "/delete-cau-hoi")
	public String deleteCauHoi(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			cauhoiRSP.deleteById(id);
			model.addAttribute("showCauHoi", cauhoiRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-cau-hoi";
	}

//Add
	@RequestMapping(value = "add-cau-hoi", method = RequestMethod.GET)
	public String addCauHoi(HttpServletRequest request, Model model) {
		System.out.println("add Cau hoi");
		// Show Cbb ten bai test
		Map<Integer, String> mapBaiTest = new LinkedHashMap<Integer, String>();
		List<Baitest> baitest = (List<Baitest>) baitestRSP.findAll();
		for (int i = 0; i < baitest.size(); i++) {
			mapBaiTest.put(baitest.get(i).getIdbaitest(), baitest.get(i).getTenbaitest());
		}
		request.setAttribute("showTenBaiTest", mapBaiTest);
		// Addtribute
		model.addAttribute("addCauHoi", new Cauhoi());
		return "admin/them_cauhoi";
	}

	@RequestMapping(value = "add-cau-hoi", method = RequestMethod.POST)
	public String addCauHoi(HttpServletRequest request, Model model, @ModelAttribute("addCauHoi") Cauhoi cauhoi) {
		cauhoiRSP.save(cauhoi);
		model.addAttribute("showCauHoi", cauhoiRSP.findAll());
		return "redirect:/admin/thong-ke-cau-hoi";
	}

	// Update
	@RequestMapping(value = "update-cauhoi", method = RequestMethod.GET)
	public String updateCauHoi(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update cau hoi");
		// ----------------
		// Show Cbb ten bai test
		Map<Integer, String> mapBaiTest = new LinkedHashMap<Integer, String>();
		List<Baitest> baitest = (List<Baitest>) baitestRSP.findAll();
		for (int i = 0; i < baitest.size(); i++) {
			mapBaiTest.put(baitest.get(i).getIdbaitest(), baitest.get(i).getTenbaitest());
		}
		request.setAttribute("showTenBaiTest", mapBaiTest);
		// -----------------
		Cauhoi ch = cauhoiRSP.findByIdCauHoi(id);

		model.addAttribute("updateCauHoi", ch);
		return "admin/sua_cauhoi";
	}

	@RequestMapping(value = "update-cauhoi", method = RequestMethod.POST)
	public String updateCauHoi(HttpServletRequest request, Model model, @ModelAttribute("updateCauHoi") Cauhoi cauhoi) {
		cauhoiRSP.save(cauhoi);
		model.addAttribute("showCauHoi", cauhoiRSP.findAll());
		return "redirect:/admin/thong-ke-cau-hoi";
	}

//TODO ############################################################# CHI TIẾT TIN  TỨC ###################################################### //
//Show view
	@RequestMapping("/thong-ke-chi-tiet-tin-tuc")
	public String ViewChiTietTinTuc(HttpServletRequest request) {
		System.out.println("Cau Hoi");
		request.setAttribute("showCTT", chitiettintucRSP.findAll());
		return "admin/thongkechitiettintuc";
	}

// Delete
	@RequestMapping(value = "/delete-chitiettintuc")
	public String delete(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitiettintucRSP.deleteById(id);
			model.addAttribute("showCTT", chitiettintucRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-chi-tiet-tin-tuc";
	}

//Add
	@RequestMapping(value = "add-chi-tiet-tin-tuc", method = RequestMethod.GET)
	public String addChiTietTinTuc(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Tin Tuc");
		// Show Cbb Tên Tin Tức
		Map<Integer, String> mapTinTuc = new LinkedHashMap<Integer, String>();
		List<Tintuc> tintuc = (List<Tintuc>) tintucRSP.findAll();
		for (int i = 0; i < tintuc.size(); i++) {
			mapTinTuc.put(tintuc.get(i).getIdtintuc(), tintuc.get(i).getTieude());
		}
		request.setAttribute("showCbbTinTuc", mapTinTuc);
		// Show Cbb Tên Danh Mục
		Map<Integer, String> mapDanhMuc = new LinkedHashMap<Integer, String>();
		List<Danhmuc> danhmuc = (List<Danhmuc>) danhmucRSP.findAll();
		for (int i = 0; i < danhmuc.size(); i++) {
			mapDanhMuc.put(danhmuc.get(i).getIddanhmuc(), danhmuc.get(i).getTendanhmuc());
		}
		request.setAttribute("showCbbDanhMuc", mapDanhMuc);
		// Addtribute
		model.addAttribute("addChiTietTinTuc", new Chiitiettintuc());
		return "admin/them_chitiettintuc";
	}

	@RequestMapping(value = "add-chi-tiet-tin-tuc", method = RequestMethod.POST)
	public String addChiTietTinTuc(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietTinTuc") Chiitiettintuc cttt) {
		chitiettintucRSP.save(cttt);
		model.addAttribute("showCTT", chitiettintucRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-tin-tuc";
	}

//Update
	@RequestMapping(value = "update-chi-tiet-tin-tuc", method = RequestMethod.GET)
	public String updateChiTietTinTuc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet tin tuc");
		// ----------------
		// Show Cbb Tên Tin Tức
		Map<Integer, String> mapTinTuc = new LinkedHashMap<Integer, String>();
		List<Tintuc> tintuc = (List<Tintuc>) tintucRSP.findAll();
		for (int i = 0; i < tintuc.size(); i++) {
			mapTinTuc.put(tintuc.get(i).getIdtintuc(), tintuc.get(i).getTieude());
		}
		request.setAttribute("showCbbTinTuc", mapTinTuc);
		// Show Cbb Tên Danh Mục
		Map<Integer, String> mapDanhMuc = new LinkedHashMap<Integer, String>();
		List<Danhmuc> danhmuc = (List<Danhmuc>) danhmucRSP.findAll();
		for (int i = 0; i < danhmuc.size(); i++) {
			mapDanhMuc.put(danhmuc.get(i).getIddanhmuc(), danhmuc.get(i).getTendanhmuc());
		}
		request.setAttribute("showCbbDanhMuc", mapDanhMuc);
		// -----------------
		Chiitiettintuc ch = chitiettintucRSP.findByIDCTTT(id);

		model.addAttribute("updateChiTietTinTuc", ch);
		return "admin/sua_chitiettintuc";
	}

	@RequestMapping(value = "update-chi-tiet-tin-tuc", method = RequestMethod.POST)
	public String updateChiTietTinTuc(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietTinTuc") Chiitiettintuc cttt) {
		chitiettintucRSP.save(cttt);
		model.addAttribute("showCTT", chitiettintucRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-tin-tuc";
	}

//TODO ############################################################# CHI TIẾT BÀI HỌC ###################################################### //
//Show view
	@RequestMapping("/thong-ke-chi-tiet-bai-hoc")
	public String ViewChiTietTBaiHoc(HttpServletRequest request) {
		System.out.println("Cau Hoi");
		request.setAttribute("showCTBH", chitietbaihocRSP.findAll());
		return "admin/thongkechitietbaihoc";
	}

	// Delete
	@RequestMapping(value = "/delete-chitietbaihoc")
	public String deleteChitietBaiHoc(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitietbaihocRSP.deleteById(id);
			model.addAttribute("showCTBH", chitietbaihocRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-chi-tiet-bai-hoc";
	}

	// Add
	@RequestMapping(value = "add-chi-tiet-bai-hoc", method = RequestMethod.GET)
	public String addChiTietBaiHoc(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Bai Hoc");
		// Show Cbb Tên User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCbbUser", mapUser);
		// Show Cbb Bài Học
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		request.setAttribute("showCbbBaiHoc", mapBaiHoc);
		// Addtribute
		model.addAttribute("addChiTietBaiHoc", new Chitietbaihoc());
		return "admin/them_chitietbaihoc";
	}

	@RequestMapping(value = "add-chi-tiet-bai-hoc", method = RequestMethod.POST)
	public String addChiTietBaiHoc(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietBaiHoc") Chitietbaihoc ctbh) {
		chitietbaihocRSP.save(ctbh);
		model.addAttribute("showCTBH", chitietbaihocRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-bai-hoc";
	}

	// Update
	@RequestMapping(value = "update-chi-tiet-bai-hoc", method = RequestMethod.GET)
	public String updateChiTietBaiHoc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet bai hoc");
		// ----------------
		// Show Cbb Tên User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCbbUser", mapUser);
		// Show Cbb Bài Học
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		request.setAttribute("showCbbBaiHoc", mapBaiHoc);
		// -----------------
		Chitietbaihoc ctbh = chitietbaihocRSP.findByIDCTBH(id);

		model.addAttribute("updateChiTietBaiHoc", ctbh);
		return "admin/sua_chitietbaihoc";
	}

	@RequestMapping(value = "update-chi-tiet-bai-hoc", method = RequestMethod.POST)
	public String updateChiTietBaiHoc(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietBaiHoc") Chitietbaihoc ctbh) {
		chitietbaihocRSP.save(ctbh);
		model.addAttribute("showCTBH", chitietbaihocRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-bai-hoc";
	}

//TODO ############################################################# CHI TIẾT BÀI TẬP ###################################################### //
	// Show view
	@RequestMapping("/thong-ke-chi-tiet-bai-tap")
	public String ViewChiTietTBaiTap(HttpServletRequest request) {
		System.out.println("Chi Tiet Bai Tap");
		request.setAttribute("showCTBT", chitietbaitapRSP.findAll());
		return "admin/thongkechitietbaitap";
	}

	// Delete
	@RequestMapping(value = "/delete-chitiet-baitap")
	public String deleteChiTietBaiTap(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitietbaitapRSP.deleteById(id);
			model.addAttribute("showCTBT", chitietbaitapRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-chi-tiet-bai-tap";
	}

	// Add
	@RequestMapping(value = "add-chi-tiet-bai-tap", method = RequestMethod.GET)
	public String addChiTietBaiTap(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Bai Tap");
		// Show Cbb Tên Bai Tap
		Map<Integer, String> mapBaiTap = new LinkedHashMap<Integer, String>();
		List<Baitap> baitap = (List<Baitap>) baitapRSP.findAll();
		for (int i = 0; i < baitap.size(); i++) {
			mapBaiTap.put(baitap.get(i).getIdbaitap(), baitap.get(i).getTenbaitap());
		}
		request.setAttribute("showCbbBaiTap", mapBaiTap);
		// Addtribute
		model.addAttribute("addChiTietBaiTap", new Chitietbaitap());
		return "admin/them_chitietbaitap";
	}

	@RequestMapping(value = "add-chi-tiet-bai-tap", method = RequestMethod.POST)
	public String addChiTietBaiTap(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietBaiTap") Chitietbaitap ctbt) {
		chitietbaitapRSP.save(ctbt);
		model.addAttribute("showCTBT", chitietbaitapRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-bai-tap";
	}

	// Update
	@RequestMapping(value = "update-chi-tiet-bai-tap", method = RequestMethod.GET)
	public String updateChiTietBaiTap(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet bai tap");
		// ----------------
		// Show Cbb Tên Bai Tap
		Map<Integer, String> mapBaiTap = new LinkedHashMap<Integer, String>();
		List<Baitap> baitap = (List<Baitap>) baitapRSP.findAll();
		for (int i = 0; i < baitap.size(); i++) {
			mapBaiTap.put(baitap.get(i).getIdbaitap(), baitap.get(i).getTenbaitap());
		}
		request.setAttribute("showCbbBaiTap", mapBaiTap);
		// -----------------
		Chitietbaitap ctbt = chitietbaitapRSP.findByIdCTbt(id);

		model.addAttribute("updateChiTietBaiTap", ctbt);
		return "admin/sua_chitietbaitap";
	}

	@RequestMapping(value = "update-chi-tiet-bai-tap", method = RequestMethod.POST)
	public String updateChiTietBaiTap(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietBaiTap") Chitietbaitap ctbt) {
		chitietbaitapRSP.save(ctbt);
		model.addAttribute("showCTBT", chitietbaitapRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-bai-tap";
	}

//TODO ############################################################# CHI TIẾT BÀI TEST ###################################################### //
	// Show view
	@RequestMapping("/thong-ke-chi-tiet-bai-test")
	public String ViewChiTietTBaiTest(HttpServletRequest request) {
		System.out.println("Chi Tiet Bai Test");
		request.setAttribute("showCTBTe", chitietbaitestRSP.findAll());
		return "admin/thongkechitietbaitest";
	}

	// Delete
	@RequestMapping(value = "/delete-chitiet-baitest")
	public String deleteChiTietBaiTest(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitietbaitestRSP.deleteById(id);
			model.addAttribute("showCTBTe", chitietbaitestRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-chi-tiet-bai-test";
	}

	// ADD
	@RequestMapping(value = "add-chi-tiet-bai-test", method = RequestMethod.GET)
	public String addChiTietBaiTest(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Bai Test");
		// ++++++++++++++++++++++++++++++Show Combobox User

		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUser", mapUser);
		// ++++++++++++++++++++++++++++++Show Combobox BaiTest
		Map<Integer, String> mapBaiTest = new LinkedHashMap<Integer, String>();
		List<Baitest> baitest = (List<Baitest>) baitestRSP.findAll();
		for (int i = 0; i < baitest.size(); i++) {
			mapBaiTest.put(baitest.get(i).getIdbaitest(), baitest.get(i).getTenbaitest());
		}
		request.setAttribute("showCBBBaiTest", mapBaiTest);
		// Addtribute
		model.addAttribute("addChiTietBaiTest", new Chitietbaitest());
		return "admin/them_chitietbaitest";
	}

	@RequestMapping(value = "add-chi-tiet-bai-test", method = RequestMethod.POST)
	public String addChiTietBaiTest(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietBaiTest") Chitietbaitest ctbt) {
		chitietbaitestRSP.save(ctbt);
		model.addAttribute("showCTBTe", chitietbaitestRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-bai-test";
	}

	// Update
	@RequestMapping(value = "update-chi-tiet-bai-test", method = RequestMethod.GET)
	public String updateChiTietBaiTest(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet bai test");
		// ----------------
		// ++++++++++++++++++++++++++++++Show Combobox User

		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUser", mapUser);
		// ++++++++++++++++++++++++++++++Show Combobox BaiTest
		Map<Integer, String> mapBaiTest = new LinkedHashMap<Integer, String>();
		List<Baitest> baitest = (List<Baitest>) baitestRSP.findAll();
		for (int i = 0; i < baitest.size(); i++) {
			mapBaiTest.put(baitest.get(i).getIdbaitest(), baitest.get(i).getTenbaitest());
		}
		request.setAttribute("showCBBBaiTest", mapBaiTest);
		// ---------Find By ID--------
		Chitietbaitest ctbt = chitietbaitestRSP.findByCTBT(id);

		model.addAttribute("updateChiTietBaiTest", ctbt);
		return "admin/sua_chitietbaitest";
	}

	@RequestMapping(value = "update-chi-tiet-bai-test", method = RequestMethod.POST)
	public String updateChiTietBaiTest(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietBaiTest") Chitietbaitest ctbt) {
		chitietbaitestRSP.save(ctbt);
		model.addAttribute("showCTBTe", chitietbaitestRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-bai-test";
	}

//TODO ############################################################# CHI TIẾT KHÓA HỌC ###################################################### //
	// Show view
	@RequestMapping("thong-ke-chi-tiet-khoa-hoc")
	public String ViewChiTietTKhoaHoc(HttpServletRequest request) {
		System.out.println("Chi Tiet Khoa Hoc");
		request.setAttribute("ChiTietKhoaHoc", chitietkhoahocRSP.findAll());
		return "admin/thongkechitietkhoahoc";
	}

//Delete
	@RequestMapping(value = "/delete-chitiet-khoahoc")
	public String deleteChiTietKhoaHoc(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitietkhoahocRSP.deleteById(id);
			model.addAttribute("ChiTietKhoaHoc", chitietkhoahocRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-chi-tiet-khoa-hoc";
	}

//ADD
	@RequestMapping(value = "add-chi-tiet-khoa-hoc", method = RequestMethod.GET)
	public String addChiTietKhoaHoc(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Khóa Học");
		// ++++++++++++++++++++++++++++++Show Combobox User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUser", mapUser);
		// ++++++++++++++++++++++++++++++Show Combobox KhoaHoc
		Map<Integer, String> mapKhoaHoc = new LinkedHashMap<Integer, String>();
		List<Khoahoc> khoahoc = (List<Khoahoc>) khoahocRSP.findAll();
		for (int i = 0; i < khoahoc.size(); i++) {
			mapKhoaHoc.put(khoahoc.get(i).getIdkhoahoc(), khoahoc.get(i).getTenkhoahoc());
		}
		request.setAttribute("showCBBKhoaHoc", mapKhoaHoc);
		// Addtribute
		model.addAttribute("addChiTietKhoaHoc", new Chitietkhoahoc());
		return "admin/them_chitietkhoahoc";
	}

	@RequestMapping(value = "add-chi-tiet-khoa-hoc", method = RequestMethod.POST)
	public String addChiTietKhoaHoc(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietKhoaHoc") Chitietkhoahoc ctkh) {
		chitietkhoahocRSP.save(ctkh);
		model.addAttribute("ChiTietKhoaHoc", chitietkhoahocRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-khoa-hoc";
	}

	// Update
	@RequestMapping(value = "update-chi-tiet-khoa-hoc", method = RequestMethod.GET)
	public String updateChiTietKhoaHoc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet khoa hoc");
		// ++++++++++++++++++++++++++++++Show Combobox User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUser", mapUser);
		// ++++++++++++++++++++++++++++++Show Combobox KhoaHoc
		Map<Integer, String> mapKhoaHoc = new LinkedHashMap<Integer, String>();
		List<Khoahoc> khoahoc = (List<Khoahoc>) khoahocRSP.findAll();
		for (int i = 0; i < khoahoc.size(); i++) {
			mapKhoaHoc.put(khoahoc.get(i).getIdkhoahoc(), khoahoc.get(i).getTenkhoahoc());
		}
		request.setAttribute("showCBBKhoaHoc", mapKhoaHoc);
		// Addtribute
		// ---------Find By ID--------
		Chitietkhoahoc ctkh = chitietkhoahocRSP.findByIdCtKH(id);

		model.addAttribute("updateChiTietKhoaHoc", ctkh);
		return "admin/sua_chitietkhoahoc";
	}

	@RequestMapping(value = "update-chi-tiet-khoa-hoc", method = RequestMethod.POST)
	public String updateChiTietKhoaHoc(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietKhoaHoc") Chitietkhoahoc ctkh) {
		chitietkhoahocRSP.save(ctkh);
		model.addAttribute("ChiTietKhoaHoc", chitietkhoahocRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-khoa-hoc";
	}

//TODO ############################################################# CHI TIẾT NGỮ PHÁP ###################################################### //
// Show view
	@RequestMapping("/thong-ke-chi-tiet-ngu-phap")
	public String ViewChiTietNguPhap(HttpServletRequest request) {
		System.out.println("Chi Tiet Ngu Phap");
		request.setAttribute("ShowCTNP", chitietnguphapRSP.findAll());
		return "admin/thongkechitietnguphap";
	}

//Delete
	@RequestMapping(value = "/delete-chi-tiet-ngu-phap")
	public String deleteChiTietNguPhap(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitietnguphapRSP.deleteById(id);
			model.addAttribute("ShowCTNP", chitietnguphapRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delete");
		}
		return "redirect:/admin/thong-ke-chi-tiet-ngu-phap";
	}

//Add
	@RequestMapping(value = "add-chi-tiet-ngu-phap", method = RequestMethod.GET)
	public String addChiTietNguPhap(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Ngu Phap");
		// ++++++++++++++++++++++++++++++Show Combobox NguPhap
		Map<Integer, String> mapNguPhap = new LinkedHashMap<Integer, String>();
		List<Nguphap> nguphap = (List<Nguphap>) nguphapRSP.findAll();
		for (int i = 0; i < nguphap.size(); i++) {
			mapNguPhap.put(nguphap.get(i).getIdnguphap(), nguphap.get(i).getTennguphap());
		}
		request.setAttribute("showCBBNguPhap", mapNguPhap);
		// Addtribute
		model.addAttribute("addChiTietNguPhap", new Chitietnguphap());
		return "admin/them_chitietnguphap";
	}

	@RequestMapping(value = "add-chi-tiet-ngu-phap", method = RequestMethod.POST)
	public String addChiTietNguPhap(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietNguPhap") Chitietnguphap ctnp) {
		chitietnguphapRSP.save(ctnp);
		model.addAttribute("ShowCTNP", chitietnguphapRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-ngu-phap";
	}

	// Update
	@RequestMapping(value = "update-chi-tiet-ngu-phap", method = RequestMethod.GET)
	public String updateChiTietNguPhap(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet ngu phap");
		// ++++++++++++++++++++++++++++++Show Combobox NguPhap
		Map<Integer, String> mapNguPhap = new LinkedHashMap<Integer, String>();
		List<Nguphap> nguphap = (List<Nguphap>) nguphapRSP.findAll();
		for (int i = 0; i < nguphap.size(); i++) {
			mapNguPhap.put(nguphap.get(i).getIdnguphap(), nguphap.get(i).getTennguphap());
		}
		request.setAttribute("showCBBNguPhap", mapNguPhap);
		// Addtribute
		// ---------Find By ID--------
		Chitietnguphap ctnp = chitietnguphapRSP.findByIdCTNP(id);

		model.addAttribute("updateChiTietNguPhap", ctnp);
		return "admin/sua_chitietnguphap";
	}

	@RequestMapping(value = "update-chi-tiet-ngu-phap", method = RequestMethod.POST)
	public String updateChiTietNguPhap(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietNguPhap") Chitietnguphap ctnp) {
		chitietnguphapRSP.save(ctnp);
		model.addAttribute("ShowCTNP", chitietnguphapRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-ngu-phap";
	}

//TODO ############################################################# CHI TIẾT THANH TOÁN ###################################################### //
	// Show view
	@RequestMapping("/thong-ke-chi-tiet-thanh-toan")
	public String ViewChiTietThanhToan(HttpServletRequest request) {
		System.out.println("Chi Tiet Thanh Toan");
		request.setAttribute("showCTTT", chitietthanhtoanRSP.findAll());
		return "admin/thongkechitietthanhtoan";
	}

	// Delete
	@RequestMapping(value = "/delete-chi-tiet-thanh-toan")
	public String deleteChiTietThanhToan(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chitietthanhtoanRSP.deleteById(id);
			model.addAttribute("showCTTT", chitietthanhtoanRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delete");
		}
		return "redirect:/admin/thong-ke-chi-tiet-thanh-toan";
	}

//Add
	@RequestMapping(value = "add-chi-tiet-thanh-toan", method = RequestMethod.GET)
	public String addChiTietThanhToan(HttpServletRequest request, Model model) {
		System.out.println("add Chi Tiet Thanh Toan");
		// ++++++++++++++++++++++++++++++Show Combobox Khoahoc
		Map<Integer, String> mapKhoaHoc = new LinkedHashMap<Integer, String>();
		List<Khoahoc> khoahoc = (List<Khoahoc>) khoahocRSP.findAll();
		for (int i = 0; i < khoahoc.size(); i++) {
			mapKhoaHoc.put(khoahoc.get(i).getIdkhoahoc(), khoahoc.get(i).getTenkhoahoc());
		}
		request.setAttribute("showCBBKhoaHoc", mapKhoaHoc);
		// AddTribute Thanh toan
		request.setAttribute("ShowCBBIdThanhToan", thanhtoanRSP.findAll());
		// Addtribute
		model.addAttribute("addChiTietThanhToan", new Chitietthanhtoan());
		return "admin/them_chitietthanhtoan";
	}

	@RequestMapping(value = "add-chi-tiet-thanh-toan", method = RequestMethod.POST)
	public String addChiTietThanhToan(HttpServletRequest request, Model model,
			@ModelAttribute("addChiTietThanhToan") Chitietthanhtoan cttt) {
		chitietthanhtoanRSP.save(cttt);
		model.addAttribute("showCTTT", chitietthanhtoanRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-thanh-toan";
	}

	// Update
	@RequestMapping(value = "update-chi-tiet-thanh-toan", method = RequestMethod.GET)
	public String updateChiTietThanhToan(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update chi tiet ngu phap");
		Map<Integer, String> mapKhoaHoc = new LinkedHashMap<Integer, String>();
		List<Khoahoc> khoahoc = (List<Khoahoc>) khoahocRSP.findAll();
		for (int i = 0; i < khoahoc.size(); i++) {
			mapKhoaHoc.put(khoahoc.get(i).getIdkhoahoc(), khoahoc.get(i).getTenkhoahoc());
		}
		request.setAttribute("showCBBKhoaHoc", mapKhoaHoc);
		// AddTribute Thanh toan
		request.setAttribute("ShowCBBIdThanhToan", thanhtoanRSP.findAll());
		// Addtribute
		// ---------Find By ID--------
		Chitietthanhtoan cttt = chitietthanhtoanRSP.findByIdCTNP(id);

		model.addAttribute("updateChiTietThanhToan", cttt);
		return "admin/sua_chitietthanhtoan";
	}

	@RequestMapping(value = "update-chi-tiet-thanh-toan", method = RequestMethod.POST)
	public String updateChiTietThanhToan(HttpServletRequest request, Model model,
			@ModelAttribute("updateChiTietThanhToan") Chitietthanhtoan cttt) {
		chitietthanhtoanRSP.save(cttt);
		model.addAttribute("showCTTT", chitietthanhtoanRSP.findAll());
		return "redirect:/admin/thong-ke-chi-tiet-thanh-toan";
	}

//TODO ############################################################# CHỦ ĐỀ ###################################################### //
	// Show view
	@RequestMapping("/thong-ke-chu-de")
	public String ViewChuDe(HttpServletRequest request) {
		System.out.println("Chu De");
		request.setAttribute("showChuDe", chudeRSP.findAll());
		return "admin/thongkechude";
	}

	// Delete
	@RequestMapping(value = "/delete-chude")
	public String deleteChuDe(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			chudeRSP.deleteById(id);
			model.addAttribute("showChuDe", chudeRSP.findAll());

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Xóa lỗi " + e);
			model.addAttribute("message", "Lỗi xóa");
		}
		return "redirect:/admin/thong-ke-chu-de";
	}

	// Add
	@RequestMapping(value = "add-chu-de", method = RequestMethod.GET)
	public String addChDe(HttpServletRequest request, Model model) {
		System.out.println("add Chu De");
		File file = new File(uploadingdir);
		System.out.println(file.listFiles().length);

		// Show Ten Trinh Do Lay ID Trinh Do
		Map<Integer, String> mapTrinhDo = new LinkedHashMap<Integer, String>();
		List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapTrinhDo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
		}
		request.setAttribute("showTenTrinhDo", mapTrinhDo);

		// Show Ten Loai Chu De , Lay ID Ten Loai Chu De
		Map<Integer, String> mapLoaiChuDe = new LinkedHashMap<Integer, String>();
		List<Loaichude> loaichude = (List<Loaichude>) loaichudeRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapLoaiChuDe.put(loaichude.get(i).getIdloaichude(), loaichude.get(i).getTenloaichude());
		}
		request.setAttribute("showTenLoaiChuDe", mapLoaiChuDe);

		// Add Addtribute
		model.addAttribute("addChuDe", new Chude());
		return "admin/them_chude";
	}

	@RequestMapping(value = "add-chu-de", method = RequestMethod.POST)
	public String addChDe(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("addChuDe") Chude chude) {
		try {
			File file = new File(uploadingdir + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			System.out.println(uploadFiles.getOriginalFilename());
			System.out.println(uploadingdir + uploadFiles.getOriginalFilename());
			chude.setHinhanh(uploadFiles.getOriginalFilename());
			chudeRSP.save(chude);
			model.addAttribute("showChuDe", chudeRSP.findAll());
			return "redirect:/admin/thong-ke-chu-de";

		} catch (Exception e) {
			// Show Ten Trinh Do Lay ID Trinh Do
			Map<Integer, String> mapTrinhDo = new LinkedHashMap<Integer, String>();
			List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
			for (int i = 0; i < trinhdo.size(); i++) {
				mapTrinhDo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
			}
			request.setAttribute("showTenTrinhDo", mapTrinhDo);
			// Show Ten Loai Chu De , Lay ID Ten Loai Chu De
			Map<Integer, String> mapLoaiChuDe = new LinkedHashMap<Integer, String>();
			List<Loaichude> loaichude = (List<Loaichude>) loaichudeRSP.findAll();
			for (int i = 0; i < trinhdo.size(); i++) {
				mapLoaiChuDe.put(loaichude.get(i).getIdloaichude(), loaichude.get(i).getTenloaichude());
			}
			request.setAttribute("showTenLoaiChuDe", mapLoaiChuDe);
			model.addAttribute("message", "Thêm mới thất bại. Vui lòng thử lại");
			return "admin/them_chude";

		}
	}

	// update
	@RequestMapping(value = "update-chu-de", method = RequestMethod.GET)
	public String updateChuDe(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("Update chu de");
		// ----------------------
		File file = new File(uploadingdir);
		System.out.println(file.listFiles().length);
		// ----------------
		// Show Ten Trinh Do Lay ID Trinh Do
		Map<Integer, String> mapTrinhDo = new LinkedHashMap<Integer, String>();
		List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapTrinhDo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
		}
		request.setAttribute("showTenTrinhDo", mapTrinhDo);
		// Show Ten Loai Chu De , Lay ID Ten Loai Chu De
		Map<Integer, String> mapLoaiChuDe = new LinkedHashMap<Integer, String>();
		List<Loaichude> loaichude = (List<Loaichude>) loaichudeRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapLoaiChuDe.put(loaichude.get(i).getIdloaichude(), loaichude.get(i).getTenloaichude());
		}
		request.setAttribute("showTenLoaiChuDe", mapLoaiChuDe);

		// -----------------
		Chude chude = chudeRSP.findIDChuDe(id);
		request.setAttribute("showImg", chude.getHinhanh());
		model.addAttribute("updateChuDe", chude);
		return "admin/sua_chude";
	}

	@RequestMapping(value = "update-chu-de", method = RequestMethod.POST)
	public String updateChuDe(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("updateChuDe") Chude chude, @RequestParam("name-img-cu") String nameImg) {
		try {
			deleteFile(uploadingdir + nameImg);
			File file = new File(uploadingdir + uploadFiles.getOriginalFilename());
			System.out.println("khai báo file");
			uploadFiles.transferTo(file);
			chude.setHinhanh(uploadFiles.getOriginalFilename());
			chudeRSP.save(chude);
			System.out.println("save");
			model.addAttribute("showChuDe", chudeRSP.findAll());

			return "redirect:/admin/thong-ke-chu-de";
		} catch (Exception ex) {
			// Show Ten Trinh Do Lay ID Trinh Do
			Map<Integer, String> mapTrinhDo = new LinkedHashMap<Integer, String>();
			List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
			for (int i = 0; i < trinhdo.size(); i++) {
				mapTrinhDo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
			}
			request.setAttribute("showTenTrinhDo", mapTrinhDo);
			// Show Ten Loai Chu De , Lay ID Ten Loai Chu De
			Map<Integer, String> mapLoaiChuDe = new LinkedHashMap<Integer, String>();
			List<Loaichude> loaichude = (List<Loaichude>) loaichudeRSP.findAll();
			for (int i = 0; i < trinhdo.size(); i++) {
				mapLoaiChuDe.put(loaichude.get(i).getIdloaichude(), loaichude.get(i).getTenloaichude());
			}
			request.setAttribute("showTenLoaiChuDe", mapLoaiChuDe);
			model.addAttribute("message", "error upload file");
			return "admin/sua_chude";
		}

	}

//TODO ############################################################# DANH MỤC ###################################################### 
	// Show view
	@RequestMapping("/thong-ke-danh-muc")
	public String ViewDanhMuc(HttpServletRequest request) {
		System.out.println("Danh Muc");
		request.setAttribute("showDanhMuc", danhmucRSP.findAll());
		return "admin/thongkedanhmuc";
	}

	// Delete
	@RequestMapping(value = "/delete-danhmuc")
	public String deleteDanhMuc(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			danhmucRSP.deleteById(id);
			model.addAttribute("showDanhMuc", danhmucRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "Lỗi xóa");
		}
		return "redirect:/admin/thong-ke-danh-muc";
	}

	// Add
	@RequestMapping(value = "add-danh-muc", method = RequestMethod.GET)
	public String addDanhMuc(HttpServletRequest request, Model model) {
		System.out.println("add Danh Muc");
		// ++++++++++++++++++++++++++++++Show Combobox Khoahoc
		// Addtribute
		model.addAttribute("addDanhMuc", new Danhmuc());
		return "admin/them_danhmuc";
	}

	@RequestMapping(value = "add-danh-muc", method = RequestMethod.POST)
	public String addDanhMuc(HttpServletRequest request, Model model, @ModelAttribute("addDanhMuc") Danhmuc danhmuc) {
		danhmucRSP.save(danhmuc);
		model.addAttribute("showDanhMuc", danhmucRSP.findAll());
		return "redirect:/admin/thong-ke-danh-muc";
	}

	// Update
	@RequestMapping(value = "update-danh-muc", method = RequestMethod.GET)
	public String updateDanhMuc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Danh muc");
		// ---------Find By ID--------
		Danhmuc danhmuc = danhmucRSP.findByIdDanhMuc(id);
		// Addtribute
		model.addAttribute("updateDanhMuc", danhmuc);
		return "admin/sua_danhmuc";
	}

	@RequestMapping(value = "update-danh-muc", method = RequestMethod.POST)
	public String updateDanhMuc(HttpServletRequest request, Model model,
			@ModelAttribute("updateDanhMuc") Danhmuc danhmuc) {
		danhmucRSP.save(danhmuc);
		model.addAttribute("showDanhMuc", danhmucRSP.findAll());
		return "redirect:/admin/thong-ke-danh-muc";
	}

//TODO ############################################################# ĐÁP ÁN ######################################################
	// Show view
	@RequestMapping("/thong-ke-dap-an")
	public String ViewDapAn(HttpServletRequest request) {
		System.out.println("Dap An");
		request.setAttribute("showDapan", dapanRSP.findAll());
		return "admin/thongkedapan";
	}

//Delete
	@RequestMapping(value = "/delete-dap-an")
	public String deleteDapAn(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			dapanRSP.deleteById(id);
			model.addAttribute("showDapan", dapanRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "Lỗi xóa");
		}
		return "redirect:/admin/thong-ke-dap-an";
	}

	// Add
	@RequestMapping(value = "add-dap-an", method = RequestMethod.GET)
	public String addDapAn(HttpServletRequest request, Model model) {
		System.out.println("add Dap An");
		// ++++++++++++++++++++++++++++++Show Combobox Câu Hỏi
		Map<Integer, String> mapCauHoi = new LinkedHashMap<Integer, String>();
		List<Cauhoi> cauhoi = (List<Cauhoi>) cauhoiRSP.findAll();
		for (int i = 0; i < cauhoi.size(); i++) {
			mapCauHoi.put(cauhoi.get(i).getIdcauhoi(), cauhoi.get(i).getNdcauhoi());
		}
		request.setAttribute("showCBBCauHoi", mapCauHoi);
		// Addtribute
		model.addAttribute("addDapAn", new Dapan());
		return "admin/them_dapan";
	}

	@RequestMapping(value = "add-dap-an", method = RequestMethod.POST)
	public String addDapAn(HttpServletRequest request, Model model, @ModelAttribute("addDapAn") Dapan dapan) {
		dapanRSP.save(dapan);
		model.addAttribute("showDapan", dapanRSP.findAll());
		return "redirect:/admin/thong-ke-dap-an";
	}

//Update
	@RequestMapping(value = "update-dap-an", method = RequestMethod.GET)
	public String updateDapAn(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update DAp An");
		// ++++++++++++++++++++++++++++++Show Combobox Câu Hỏi
		Map<Integer, String> mapCauHoi = new LinkedHashMap<Integer, String>();
		List<Cauhoi> cauhoi = (List<Cauhoi>) cauhoiRSP.findAll();
		for (int i = 0; i < cauhoi.size(); i++) {
			mapCauHoi.put(cauhoi.get(i).getIdcauhoi(), cauhoi.get(i).getNdcauhoi());
		}
		request.setAttribute("showCBBCauHoi", mapCauHoi);
		// ---------Find By ID--------
		Dapan dapan = dapanRSP.findByIDDapAn(id);
		// Addtribute
		model.addAttribute("updateDapan", dapan);
		return "admin/sua_dapan";
	}

	@RequestMapping(value = "update-dap-an", method = RequestMethod.POST)
	public String updateDapAn(HttpServletRequest request, Model model, @ModelAttribute("updateDapan") Dapan dapan) {
		dapanRSP.save(dapan);
		model.addAttribute("showDapan", dapanRSP.findAll());
		return "redirect:/admin/thong-ke-dap-an";
	}

//TODO  ############################################################# GIÁO TRÌNH ######################################################
	// Show view
	@RequestMapping("/thong-ke-giao-trinh")
	public String ViewGiaoTrinh(HttpServletRequest request) {
		System.out.println("Giao Trinh");
		request.setAttribute("showGiaoTrinh", giaotrinhRSP.findAll());
		return "admin/thongkegiaotrinh";
	}

//Delete
	@RequestMapping(value = "/delete-giao-trinh")
	public String deleteGiaoTrinh(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			giaotrinhRSP.deleteById(id);
			model.addAttribute("showGiaoTrinh", giaotrinhRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "Lỗi xóa");
		}
		return "redirect:/admin/thong-ke-giao-trinh";
	}

	// Add
	@RequestMapping(value = "add-giao-trinh", method = RequestMethod.GET)
	public String addGiaoTrinh(HttpServletRequest request, Model model) {
		System.out.println("add Dap An");
		// ++++++++++++++++++++++++++++++Show Combobox Trinh Do
		Map<Integer, String> mapTrinhDo = new LinkedHashMap<Integer, String>();
		List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapTrinhDo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
		}
		request.setAttribute("showCBBTrinhDo", mapTrinhDo);
		// Addtribute
		model.addAttribute("addGiaoTrinh", new Giaotrinh());
		return "admin/them_giaotrinh";
	}

	@RequestMapping(value = "add-giao-trinh", method = RequestMethod.POST)
	public String addGiaoTrinh(HttpServletRequest request, Model model,
			@ModelAttribute("addGiaoTrinh") Giaotrinh giaotrinh) {
		giaotrinhRSP.save(giaotrinh);
		model.addAttribute("showGiaoTrinh", giaotrinhRSP.findAll());
		return "redirect:/admin/thong-ke-giao-trinh";
	}

//Update
	@RequestMapping(value = "update-giao-trinh", method = RequestMethod.GET)
	public String updateGiaoTrinh(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update DAp An");
		// ++++++++++++++++++++++++++++++Show Combobox Trinh Do
		Map<Integer, String> mapTrinhDo = new LinkedHashMap<Integer, String>();
		List<Trinhdo> trinhdo = (List<Trinhdo>) trinhdoRSP.findAll();
		for (int i = 0; i < trinhdo.size(); i++) {
			mapTrinhDo.put(trinhdo.get(i).getIdtrinhdo(), trinhdo.get(i).getTentrinhdo());
		}
		request.setAttribute("showCBBTrinhDo", mapTrinhDo);
		// ---------Find By ID--------
		Giaotrinh giaotrinh = giaotrinhRSP.findByIdGiaoTrinh(id);
		// Addtribute
		model.addAttribute("updateGiaoTrinh", giaotrinh);
		return "admin/sua_giaotrinh";
	}

	@RequestMapping(value = "update-giao-trinh", method = RequestMethod.POST)
	public String updateGiaoTrinh(HttpServletRequest request, Model model,
			@ModelAttribute("updateGiaoTrinh") Giaotrinh giaotrinh) {
		giaotrinhRSP.save(giaotrinh);
		model.addAttribute("showGiaoTrinh", giaotrinhRSP.findAll());
		return "redirect:/admin/thong-ke-giao-trinh";
	}

//TODO  ############################################################# HÌNH THỨC THANH TOÁN ######################################################
	// Show view
	@RequestMapping("/thong-ke-hinh-thuc-thanh-toan")
	public String ViewHinhThucThanhToan(HttpServletRequest request) {
		System.out.println("Giao Trinh");
		request.setAttribute("showHTTT", hinhthucthanhtoanRSP.findAll());
		return "admin/thongkehinhthucthanhtoan";
	}

//Delete
	@RequestMapping(value = "/delete-hinh-thuc-thanh-toan")
	public String deleteHingThucTT(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			hinhthucthanhtoanRSP.deleteById(id);
			model.addAttribute("showHTTT", hinhthucthanhtoanRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "Lỗi xóa");
		}
		return "redirect:/admin/thong-ke-hinh-thuc-thanh-toan";
	}

	// Add
	@RequestMapping(value = "add-hinh-thuc-thanh-toan", method = RequestMethod.GET)
	public String addHinhThucTT(HttpServletRequest request, Model model) {
		System.out.println("add Hinh Thuc Thanh Toan");
		// ==================ADD ADDATTRIBUTE
		model.addAttribute("addHinhThucTT", new Hinhthucthanhtoan());
		return "admin/them_hinhthucthanhtoan";
	}

	@RequestMapping(value = "add-hinh-thuc-thanh-toan", method = RequestMethod.POST)
	public String addHinhThucTT(HttpServletRequest request, Model model,
			@ModelAttribute("addHinhThucTT") Hinhthucthanhtoan hinthuctt) {
		hinhthucthanhtoanRSP.save(hinthuctt);
		model.addAttribute("showHTTT", hinhthucthanhtoanRSP.findAll());
		return "redirect:/admin/thong-ke-hinh-thuc-thanh-toan";
	}

//Update
	@RequestMapping(value = "update-hinh-thuc-thanh-toan", method = RequestMethod.GET)
	public String updateHinhThucTT(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Hinh thuc thanh toan");
		// ---------Find By ID--------
		Hinhthucthanhtoan httt = hinhthucthanhtoanRSP.findByIdHinhThucTT(id);
		// Addtribute
		model.addAttribute("updateHinhThucThanhToan", httt);
		return "admin/sua_hinhthucthanhtoan";
	}

	@RequestMapping(value = "update-hinh-thuc-thanh-toan", method = RequestMethod.POST)
	public String updateHinhThucTT(HttpServletRequest request, Model model,
			@ModelAttribute("updateHinhThucThanhToan") Hinhthucthanhtoan hinhthuctt) {
		hinhthucthanhtoanRSP.save(hinhthuctt);
		model.addAttribute("showHTTT", hinhthucthanhtoanRSP.findAll());
		return "redirect:/admin/thong-ke-hinh-thuc-thanh-toan";
	}
//TODO ############################################################# TỪ VỰNG MAX ######################################################

	// Show view
	@RequestMapping("/thong-ke-tu-vung-max")
	public String ViewTuVungMax(HttpServletRequest request) {
		System.out.println("Tu Vung Max");
		request.setAttribute("showTuVungMax", tuvungmaxRSP.findAll());
		return "admin/thongketuvungmax";
	}

	// Delete
	@RequestMapping(value = "/delete-tu-vung-max")
	public String deleteTuVungMax(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			tuvungmaxRSP.deleteById(id);
			model.addAttribute("showTuVungMax", tuvungmaxRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-tu-vung-max";
	}

	// Add
	@RequestMapping(value = "/add-tu-vung-max", method = RequestMethod.GET)
	public String addTuVungMax(HttpServletRequest request, Model model) {
		System.out.println("add Từ vựng Max");
		File file = new File(uploadingdirTuVungMax);
		System.out.println(file.listFiles().length);
		// Show Cbb chu de
		Map<Integer, String> mapChuDe = new LinkedHashMap<Integer, String>();
		List<Chude> chude = (List<Chude>) chudeRSP.findAll();
		for (int i = 0; i < chude.size(); i++) {
			mapChuDe.put(chude.get(i).getIdchude(), chude.get(i).getTenchude());
		}
		request.setAttribute("showTenChuDe", mapChuDe);
		// AddAttribute Tu vung max
		model.addAttribute("addTuVungMax", new Tuvung_max_());
		return "admin/them_tuvungmax";
	}

	@RequestMapping(value = "/add-tu-vung-max", method = RequestMethod.POST)
	public String addTuVungMax(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("addTuVungMax") Tuvung_max_ tuvungmax) {
		try {
			File file = new File(uploadingdirTuVungMax + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			System.out.println(uploadFiles.getOriginalFilename());
			System.out.println(uploadingdir + uploadFiles.getOriginalFilename());
			tuvungmax.setHinhanh(uploadFiles.getOriginalFilename());
			tuvungmaxRSP.save(tuvungmax);
			model.addAttribute("showTuVungMax", tuvungmaxRSP.findAll());
			return "redirect:/admin/thong-ke-tu-vung-max";

		} catch (Exception e) {
			model.addAttribute("message", "error upload file");
			return "admin/them_tuvungmax";
		}
	}

	// update
	@RequestMapping(value = "update-tu-vung-max", method = RequestMethod.GET)
	public String updateTuVungMax(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("Update tu vung max");
		// ----------------------
		File file = new File(uploadingdirTuVungMax);
		System.out.println(file.listFiles().length);
		// ---------------- Chu de
		Map<Integer, String> mapChuDe = new LinkedHashMap<Integer, String>();
		List<Chude> chude = (List<Chude>) chudeRSP.findAll();
		for (int i = 0; i < chude.size(); i++) {
			mapChuDe.put(chude.get(i).getIdchude(), chude.get(i).getTenchude());
		}
		// -----------------
		Tuvung_max_ tvm = tuvungmaxRSP.findByIDTuvungMax(id);

		request.setAttribute("showTenChuDe", mapChuDe);
		request.setAttribute("ShowHinh", tvm.getHinhanh());
		model.addAttribute("updateTuVungMax", tvm);
		return "admin/sua_tuvungmax";
	}

	@RequestMapping(value = "update-tu-vung-max", method = RequestMethod.POST)
	public String updateTuVungMax(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("updateTuVungMax") Tuvung_max_ tuvungmax,
			@RequestParam("hinhanhed") String imagEd) {
		try {
			deleteFile(uploadingdirTuVungMax + imagEd);
			File file = new File(uploadingdirTuVungMax + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			tuvungmax.setHinhanh(uploadFiles.getOriginalFilename());
		
			tuvungmaxRSP.save(tuvungmax);
			model.addAttribute("showTuVungMax", tuvungmaxRSP.findAll());
			return "redirect:/admin/thong-ke-tu-vung-max";
		} catch (Exception ex) {
			// ==================== Show CBB Chu De ===========================
			Map<Integer, String> mapChuDe = new LinkedHashMap<Integer, String>();
			List<Chude> chude = (List<Chude>) chudeRSP.findAll();
			for (int i = 0; i < chude.size(); i++) {
				mapChuDe.put(chude.get(i).getIdchude(), chude.get(i).getTenchude());
			}
			// =====================================================================
			request.setAttribute("showTenChuDe", mapChuDe);
			model.addAttribute("message", "Vui lòng chọn file");
			return "admin/sua_tuvungmax";
		}

	}

//TODO ############################################################# TỪ VỰNG MIN ######################################################
	// Show view
	@RequestMapping("/thong-ke-tu-vung-min")
	public String ViewTuVungMin(HttpServletRequest request) {
		System.out.println("Tu Vung Min");
		request.setAttribute("showTuVungMin", tuvungminRSP.findAll());
		return "admin/thongketuvungmin";
	}

//Delete
	@RequestMapping(value = "/delete-tu-vung-min")
	public String deleteTuVungMin(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			tuvungminRSP.deleteById(id);
			model.addAttribute("showTuVungMin", tuvungminRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-tu-vung-min";
	}

//Add
	@RequestMapping(value = "add-tu-vung-min", method = RequestMethod.GET)
	public String addTuVungMin(HttpServletRequest request, Model model) {
		System.out.println("add Tu Vung Min");
		// ================Show CBB BaiHoc
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		request.setAttribute("showCBBBaiHoc", mapBaiHoc);
		// ================Show CBB Mina
		Map<Integer, String> mapMiNa = new LinkedHashMap<Integer, String>();
		List<Mina> mina = (List<Mina>) minaRSP.findAll();
		for (int i = 0; i < mina.size(); i++) {
			mapMiNa.put(mina.get(i).getIdmina(), mina.get(i).getTenmina());
		}
		request.setAttribute("showCBBMina", mapMiNa);

		model.addAttribute("addTuVungMin", new Tuvung_min_());
		return "admin/them_tuvungmin";
	}

	@RequestMapping(value = "add-tu-vung-min", method = RequestMethod.POST)
	public String addTuVungMin(HttpServletRequest request, Model model,
			@ModelAttribute("addTuVungMin") Tuvung_min_ tuvungmin) {
		tuvungminRSP.save(tuvungmin);
		model.addAttribute("showTuVungMin", tuvungminRSP.findAll());
		return "redirect:/admin/thong-ke-tu-vung-min";
	}

	// Update
	@RequestMapping(value = "update-tu-vung-min", method = RequestMethod.GET)
	public String updateTuVungMin(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Tu Vung Min");
		// ================Show CBB BaiHoc
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		request.setAttribute("showCBBBaiHoc", mapBaiHoc);
		// ================Show CBB Mina
		Map<Integer, String> mapMiNa = new LinkedHashMap<Integer, String>();
		List<Mina> mina = (List<Mina>) minaRSP.findAll();
		for (int i = 0; i < mina.size(); i++) {
			mapMiNa.put(mina.get(i).getIdmina(), mina.get(i).getTenmina());
		}
		request.setAttribute("showCBBMina", mapMiNa);
		// ---------Find By ID--------
		Tuvung_min_ tvm = tuvungminRSP.findByIDTuVungMin(id);
		// Addtribute
		model.addAttribute("updateTuVungMin", tvm);
		return "admin/sua_tuvungmin";
	}

	@RequestMapping(value = "update-tu-vung-min", method = RequestMethod.POST)
	public String updateTuVungMin(HttpServletRequest request, Model model,
			@ModelAttribute("updateTuVungMin") Tuvung_min_ tungvungm) {
		tuvungminRSP.save(tungvungm);
		model.addAttribute("showTuVungMin", tuvungminRSP.findAll());
		return "redirect:/admin/thong-ke-tu-vung-min";
	}

//TODO ############################################################# USER ############################################################
	// Show view
	@RequestMapping("/thong-ke-user")
	public String ViewUser(HttpServletRequest request) {
		System.out.println("User");
		request.setAttribute("showUser", userRSP.findAll());
		return "admin/thongkeuser";
	}

	// Delete
	@RequestMapping(value = "/delete-user")
	public String deletUser(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			userRSP.deleteById(id);
			model.addAttribute("showUser", userRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-user";
	}

	@RequestMapping(value = "update-user", method = RequestMethod.GET)
	public String updateUser(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("Update User");
		// ----------------------
		File file = new File(uploadingdir);
		System.out.println(file.listFiles().length);
		// -----------------
		User user = userRSP.findByIDUser(id);
		request.setAttribute("hinhanhCu", user.getAvatar());
		model.addAttribute("updateUser", user);
		return "admin/sua_user";
	}

	@RequestMapping(value = "update-user", method = RequestMethod.POST)
	public String updateUser(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("updateUser") User user, @RequestParam("hinhCu") String hinhanhcu) {
		try {
			deleteFile(uploadingdir + hinhanhcu);
			File file = new File(uploadingdir + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			user.setAvatar(uploadFiles.getOriginalFilename());
	
			userRSP.save(user);
			model.addAttribute("showUser", tuvungmaxRSP.findAll());
			return "redirect:/admin/thong-ke-user";
		} catch (Exception ex) {
			model.addAttribute("message", "Vui lòng chọn file");
			return "admin/sua_user";
		}

	}

//TODO ############################################################# KHÓA HỌC ############################################################
	// Show view
	@RequestMapping("/thong-ke-khoa-hoc")
	public String ViewKhoaHoc(HttpServletRequest request) {
		System.out.println("Khóa Học");
		request.setAttribute("showKhoaHoc", khoahocRSP.findAll());
		return "admin/thongkekhoahoc";
	}

	// Delete
	@RequestMapping(value = "/delete-khoa-hoc")
	public String deleteKhoaHoc(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			khoahocRSP.deleteById(id);
			model.addAttribute("showKhoaHoc", khoahocRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-khoa-hoc";
	}

//Add
	@RequestMapping(value = "add-khoa-hoc", method = RequestMethod.GET)
	public String addKhoaHoc(HttpServletRequest request, Model model) {
		System.out.println("add Khoa Hoc");
		// ================Show CBB Loai Khoa Hoc
		Map<Integer, String> mapLoaiKhoaHoc = new LinkedHashMap<Integer, String>();
		List<Loaikhoahoc> loaikhoahoc = (List<Loaikhoahoc>) loaikhoahocRSP.findAll();
		for (int i = 0; i < loaikhoahoc.size(); i++) {
			mapLoaiKhoaHoc.put(loaikhoahoc.get(i).getIdloaikh(), loaikhoahoc.get(i).getTenloaikh());
		}
		request.setAttribute("showCBBLoaiKhoaHoc", mapLoaiKhoaHoc);

		model.addAttribute("addKhoaHoc", new Khoahoc());
		return "admin/them_khoahoc";
	}

	@RequestMapping(value = "add-khoa-hoc", method = RequestMethod.POST)
	public String addKhoaHoc(HttpServletRequest request, Model model, @ModelAttribute("addKhoaHoc") Khoahoc khoahoc) {
		khoahocRSP.save(khoahoc);
		model.addAttribute("showKhoaHoc", khoahocRSP.findAll());
		return "redirect:/admin/thong-ke-khoa-hoc";
	}

	// Update
	@RequestMapping(value = "update-khoa-hoc", method = RequestMethod.GET)
	public String updateKhoaHoc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Khoa hoc");
		// ================Show CBB Loai Khoa Hoc
		Map<Integer, String> mapLoaiKhoaHoc = new LinkedHashMap<Integer, String>();
		List<Loaikhoahoc> loaikhoahoc = (List<Loaikhoahoc>) loaikhoahocRSP.findAll();
		for (int i = 0; i < loaikhoahoc.size(); i++) {
			mapLoaiKhoaHoc.put(loaikhoahoc.get(i).getIdloaikh(), loaikhoahoc.get(i).getTenloaikh());
		}
		request.setAttribute("showCBBLoaiKhoaHoc", mapLoaiKhoaHoc);

		// ---------Find By ID--------
		Khoahoc khoaHoc = khoahocRSP.findByIDKhoaHoc(id);
		// Addtribute
		model.addAttribute("updateKhoaHoc", khoaHoc);
		return "admin/sua_khoahoc";
	}

	@RequestMapping(value = "update-khoa-hoc", method = RequestMethod.POST)
	public String updateKhoaHoc(HttpServletRequest request, Model model,
			@ModelAttribute("updateKhoaHoc") Khoahoc khoahoc) {
		khoahocRSP.save(khoahoc);
		model.addAttribute("showKhoaHoc", khoahocRSP.findAll());
		return "redirect:/admin/thong-ke-khoa-hoc";
	}

//TODO ############################################################# LOẠI BÀI TEST ############################################################
	// Show view
	@RequestMapping("/thong-ke-loai-bai-test")
	public String ViewLoaiBaiTest(HttpServletRequest request) {
		System.out.println("Loại bài test");
		request.setAttribute("showLoaiBaiTest", loaibaitestRSP.findAll());
		return "admin/thongkeloaibaitest";
	}

//Delete
	@RequestMapping(value = "/delete-loai-bai-test")
	public String deleteLoaiBaiTest(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			loaibaitestRSP.deleteById(id);
			model.addAttribute("showLoaiBaiTest", loaibaitestRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-loai-bai-test";
	}

	// Add
	@RequestMapping(value = "add-loai-bai-test", method = RequestMethod.GET)
	public String addLoaiBaiTest(HttpServletRequest request, Model model) {
		System.out.println("add Loai Bai Test");
		model.addAttribute("addLoaiBaiTest", new Loaibaitest());
		return "admin/them_loaibaitest";
	}

	@RequestMapping(value = "add-loai-bai-test", method = RequestMethod.POST)
	public String addLoaiBaiTest(HttpServletRequest request, Model model,
			@ModelAttribute("addLoaiBaiTest") Loaibaitest loaibaitest) {
		loaibaitestRSP.save(loaibaitest);
		model.addAttribute("showLoaiBaiTest", loaibaitestRSP.findAll());
		return "redirect:/admin/thong-ke-loai-bai-test";
	}

	// Update
	@RequestMapping(value = "update-loai-bai-test", method = RequestMethod.GET)
	public String updateLoaiBaiTest(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Loai Bai Test");

		// ---------Find By ID--------
		Loaibaitest loaibaitest = loaibaitestRSP.findByIDLoaiBaiTest(id);
		// Addtribute
		model.addAttribute("updateLoaiBaiTest", loaibaitest);
		return "admin/sua_loaibaitest";
	}

	@RequestMapping(value = "update-loai-bai-test", method = RequestMethod.POST)
	public String updateLoaiBaiTest(HttpServletRequest request, Model model,
			@ModelAttribute("updateLoaiBaiTest") Loaibaitest loaibaitest) {
		loaibaitestRSP.save(loaibaitest);
		model.addAttribute("showLoaiBaiTest", loaibaitestRSP.findAll());
		return "redirect:/admin/thong-ke-loai-bai-test";
	}

//TODO ############################################################# LOẠI CHỦ ĐỀ ############################################################//
	// Show view
	@RequestMapping("/thong-ke-loai-chu-de")
	public String ViewLoaiChuDe(HttpServletRequest request) {
		System.out.println("Loại chu de");
		request.setAttribute("showLoaiChuDe", loaichudeRSP.findAll());
		return "admin/thongkeloaichude";
	}

	// Delete
	@RequestMapping(value = "/delete-loai-chu-de")
	public String deleteLoaiChuDe(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			loaichudeRSP.deleteById(id);
			model.addAttribute("showLoaiChuDe", loaichudeRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-loai-chu-de";
	}

	// Add
	@RequestMapping(value = "add-loai-chu-de", method = RequestMethod.GET)
	public String addLoaiChuDe(HttpServletRequest request, Model model) {
		System.out.println("add Loai Chu De");
		model.addAttribute("addLoaiChuDe", new Loaichude());
		return "admin/them_loaichude";
	}

	@RequestMapping(value = "add-loai-chu-de", method = RequestMethod.POST)
	public String addLoaiChuDe(HttpServletRequest request, Model model,
			@ModelAttribute("addLoaiChuDe") Loaichude loaichude) {
		loaichudeRSP.save(loaichude);
		model.addAttribute("showLoaiChuDe", loaichudeRSP.findAll());
		return "redirect:/admin/thong-ke-loai-chu-de";
	}

	// Update
	@RequestMapping(value = "update-loai-chu-de", method = RequestMethod.GET)
	public String updateLoaiChuDe(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Loai Chu De");
		// ---------Find By ID--------
		Loaichude loaichude = loaichudeRSP.findByIdLoaiChuDe(id);
		// Addtribute
		model.addAttribute("updateLoaiChuDe", loaichude);
		return "admin/sua_loaichude";
	}

	@RequestMapping(value = "update-loai-chu-de", method = RequestMethod.POST)
	public String updateLoaiChuDe(HttpServletRequest request, Model model,
			@ModelAttribute("updateLoaiChuDe") Loaichude loaichude) {
		loaichudeRSP.save(loaichude);
		model.addAttribute("showLoaiChuDe", loaichudeRSP.findAll());
		return "redirect:/admin/thong-ke-loai-chu-de";
	}

//TODO ############################################################# LOẠI KHÓA HỌC ############################################################//
	// Show view
	@RequestMapping("/thong-ke-loai-khoa-hoc")
	public String ViewLoaiKhoaHoc(HttpServletRequest request) {
		System.out.println("Loại khoa hoc");
		request.setAttribute("showLoaikhoahoc", loaikhoahocRSP.findAll());
		return "admin/thongkeloaikhoahoc";
	}

	// Delete
	@RequestMapping(value = "/delete-loai-khoa-hoc")
	public String deleteLoaiKhoaHoc(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			loaikhoahocRSP.deleteById(id);
			model.addAttribute("showLoaikhoahoc", loaikhoahocRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-loai-khoa-hoc";
	}

	// Add
	@RequestMapping(value = "add-loai-khoa-hoc", method = RequestMethod.GET)
	public String addLoaiKhoaHoc(HttpServletRequest request, Model model) {
		System.out.println("add Loai Khoa Hoc");
		model.addAttribute("addLoaiKhoaHoc", new Loaikhoahoc());
		return "admin/them_loaikhoahoc";
	}

	@RequestMapping(value = "add-loai-khoa-hoc", method = RequestMethod.POST)
	public String addLoaiKhoaHoc(HttpServletRequest request, Model model,
			@ModelAttribute("addLoaiKhoaHoc") Loaikhoahoc loaikhoahoc) {
		loaikhoahocRSP.save(loaikhoahoc);
		model.addAttribute("showLoaikhoahoc", loaikhoahocRSP.findAll());
		return "redirect:/admin/thong-ke-loai-khoa-hoc";
	}

	// Update
	@RequestMapping(value = "update-loai-khoa-hoc", method = RequestMethod.GET)
	public String updateLoaiKhoaHoc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Loai Khoa Hoc");
		// ---------Find By ID--------
		Loaikhoahoc loaikh = loaikhoahocRSP.findByIDLoaiKH(id);
		// Addtribute
		model.addAttribute("updateLoaiKhoaHoc", loaikh);
		return "admin/sua_loaikhoahoc";
	}

	@RequestMapping(value = "update-loai-khoa-hoc", method = RequestMethod.POST)
	public String updateLoaiKhoaHoc(HttpServletRequest request, Model model,
			@ModelAttribute("updateLoaiKhoaHoc") Loaikhoahoc loaikhoahoc) {
		loaikhoahocRSP.save(loaikhoahoc);
		model.addAttribute("showLoaikhoahoc", loaikhoahocRSP.findAll());
		return "redirect:/admin/thong-ke-loai-khoa-hoc";
	}

//TODO ############################################################# NGỮ PHÁP ############################################################//
	// Show view
	@RequestMapping("/thong-ke-ngu-phap")
	public String ViewNguPhap(HttpServletRequest request) {
		System.out.println("Ngu phap");
		request.setAttribute("showNguPhap", nguphapRSP.findAll());
		return "admin/thongkenguphap";
	}

//Delete
	@RequestMapping(value = "/delete-ngu-phap")
	public String deleteNguPhap(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			nguphapRSP.deleteById(id);
			model.addAttribute("showNguPhap", nguphapRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-ngu-phap";
	}

	// Add
	@RequestMapping(value = "add-ngu-phap", method = RequestMethod.GET)
	public String addNguPhap(HttpServletRequest request, Model model) {
		System.out.println("add Ngu Phap");
		// ================Show CBB Bai Hoc
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		request.setAttribute("showCBBBaiHoc", mapBaiHoc);
		// ================Show CBB Bai Mina
		Map<Integer, String> mapMina = new LinkedHashMap<Integer, String>();
		List<Mina> mina = (List<Mina>) minaRSP.findAll();
		for (int i = 0; i < mina.size(); i++) {
			mapMina.put(mina.get(i).getIdmina(), mina.get(i).getTenmina());
		}
		request.setAttribute("showCBBBaiMina", mapMina);
		
		// ================== AddAttribute
		model.addAttribute("addNguPhap", new Nguphap());
		return "admin/them_nguphap";
	}

	@RequestMapping(value = "add-ngu-phap", method = RequestMethod.POST)
	public String addNguPhap(HttpServletRequest request, Model model, @ModelAttribute("addNguPhap") Nguphap nguphap) {
		nguphapRSP.save(nguphap);
		model.addAttribute("showNguPhap", nguphapRSP.findAll());
		return "redirect:/admin/thong-ke-ngu-phap";
	}

	// Update
	@RequestMapping(value = "update-ngu-phap", method = RequestMethod.GET)
	public String updateNguPhap(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Khoa hoc");
		// ================Show CBB Bai Hoc
		Map<Integer, String> mapBaiHoc = new LinkedHashMap<Integer, String>();
		List<Baihoc> baihoc = (List<Baihoc>) baihocRSP.findAll();
		for (int i = 0; i < baihoc.size(); i++) {
			mapBaiHoc.put(baihoc.get(i).getIdbaihoc(), baihoc.get(i).getTenbaihoc());
		}
		request.setAttribute("showCBBBaiHoc", mapBaiHoc);
		// ================Show CBB Bai Mina
		Map<Integer, String> mapMina = new LinkedHashMap<Integer, String>();
		List<Mina> mina = (List<Mina>) minaRSP.findAll();
		for (int i = 0; i < mina.size(); i++) {
			mapMina.put(mina.get(i).getIdmina(), mina.get(i).getTenmina());
		}
		request.setAttribute("showCBBBaiMina", mapMina);

		// ---------Find By ID--------
		Nguphap nguphap = nguphapRSP.findByIdNguPhap(id);
		// Addtribute
		model.addAttribute("updateNguPhap", nguphap);
		return "admin/sua_nguphap";
	}

	@RequestMapping(value = "update-ngu-phap", method = RequestMethod.POST)
	public String updateNguPhap(HttpServletRequest request, Model model,
			@ModelAttribute("updateNguPhap") Nguphap nguphap) {
		nguphapRSP.save(nguphap);
		model.addAttribute("showNguPhap", nguphapRSP.findAll());
		return "redirect:/admin/thong-ke-ngu-phap";
	}

//TODO ############################################################# QUYỀN ############################################################//
// Show view
	@RequestMapping("/thong-ke-quyen")
	public String ViewQuyen(HttpServletRequest request) {
		System.out.println("Quyen");
		request.setAttribute("showQuyen", roleRSP.findAll());
		return "admin/thongkequyen";
	}

//Delete
	@RequestMapping(value = "/delete-quyen")
	public String deleteQuyen(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			roleRSP.deleteById(id);
			model.addAttribute("showQuyen", roleRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-quyen";
	}

//Add
	@RequestMapping(value = "add-quyen", method = RequestMethod.GET)
	public String addQuyen(HttpServletRequest request, Model model) {
		System.out.println("add Quyen");
		model.addAttribute("addQuyen", new Role());
		return "admin/them_quyen";
	}

	@RequestMapping(value = "add-quyen", method = RequestMethod.POST)
	public String addQuyen(HttpServletRequest request, Model model, @ModelAttribute("addQuyen") Role role) {
		roleRSP.save(role);
		model.addAttribute("showQuyen", roleRSP.findAll());
		return "redirect:/admin/thong-ke-quyen";
	}

//Update
	@RequestMapping(value = "update-quyen", method = RequestMethod.GET)
	public String updateQuyen(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Quyen");
		// ---------Find By ID--------
		Role role = roleRSP.findByIDQuyen(id);
		// Addtribute
		model.addAttribute("updateQuyen", role);
		return "admin/sua_quyen";
	}

	@RequestMapping(value = "update-quyen", method = RequestMethod.POST)
	public String updateQuyen(HttpServletRequest request, Model model, @ModelAttribute("updateQuyen") Role role) {
		roleRSP.save(role);
		model.addAttribute("showQuyen", roleRSP.findAll());
		return "redirect:/admin/thong-ke-quyen";
	}

//TODO ############################################################# USER_ROLE ############################################################//
//View
	@RequestMapping("/thong-ke-user-role")
	public String ViewUserRole(HttpServletRequest request) {
		System.out.println("User Role");
		request.setAttribute("showUserRole", userroleRSP.findAll());
		return "admin/thongkeuserrole";
	}

//Delete
	@RequestMapping(value = "/delete-user-role")
	public String deleteUserRole(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			userroleRSP.deleteById(id);
			model.addAttribute("showUserRole", userroleRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-user-role";
	}

//Add
	@RequestMapping(value = "add-user-role", method = RequestMethod.GET)
	public String addUserRole(HttpServletRequest request, Model model) {
		System.out.println("add Ngu Phap");
		// ================Show CBB User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUSer", mapUser);
		// ================Show CBB User
		Map<Integer, String> mapRole = new LinkedHashMap<Integer, String>();
		List<Role> role = (List<Role>) roleRSP.findAll();
		for (int i = 0; i < role.size(); i++) {
			mapRole.put(role.get(i).getId(), role.get(i).getName());
		}
		request.setAttribute("showCbbRole", mapRole);
		// ================== AddAttribute
		model.addAttribute("addUserRole", new UsersRole());
		return "admin/them_userrole";
	}

	@RequestMapping(value = "add-user-role", method = RequestMethod.POST)
	public String addUserRole(HttpServletRequest request, Model model,
			@ModelAttribute("addUserRole") UsersRole userRole) {
		userroleRSP.save(userRole);
		model.addAttribute("showUserRole", userroleRSP.findAll());
		return "redirect:/admin/thong-ke-user-role";
	}

//Update
	@RequestMapping(value = "update-user-role", method = RequestMethod.GET)
	public String updateUserRole(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Quyen");
		// ================Show CBB User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUSer", mapUser);
		// ================Show CBB User
		Map<Integer, String> mapRole = new LinkedHashMap<Integer, String>();
		List<Role> role = (List<Role>) roleRSP.findAll();
		for (int i = 0; i < role.size(); i++) {
			mapRole.put(role.get(i).getId(), role.get(i).getName());
		}
		request.setAttribute("showCbbRole", mapRole);
		// ---------Find By ID--------
		UsersRole ur = userroleRSP.findByIDUserRole(id);
		// Addtribute
		model.addAttribute("updateUserRole", ur);
		return "admin/sua_userrole";
	}

	@RequestMapping(value = "update-user-role", method = RequestMethod.POST)
	public String updateUserRole(HttpServletRequest request, Model model,
			@ModelAttribute("updateUserRole") UsersRole ur) {
		userroleRSP.save(ur);
		model.addAttribute("showQushowUserRoleyen", userroleRSP.findAll());
		return "redirect:/admin/thong-ke-user-role";
	}

//TODO ############################################################# TRÌNH ĐỘ ############################################################//
	// Show view
	@RequestMapping("/thong-ke-trinh-do")
	public String ViewTrinhDo(HttpServletRequest request) {
		System.out.println("Trinh do");
		request.setAttribute("showTrinhDo", trinhdoRSP.findAll());
		return "admin/thongketrinhdo";
	}

	// Delete
	@RequestMapping(value = "/delete-trinh-do")
	public String deleteTrinhDo(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			trinhdoRSP.deleteById(id);
			model.addAttribute("showTrinhDo", trinhdoRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-trinh-do";
	}

	// Add
	@RequestMapping(value = "add-trinh-do", method = RequestMethod.GET)
	public String addTrinhDo(HttpServletRequest request, Model model) {
		System.out.println("add Trinh Do");
		model.addAttribute("addTrinhDo", new Trinhdo());
		return "admin/them_trinhdo";
	}

	@RequestMapping(value = "add-trinh-do", method = RequestMethod.POST)
	public String addTrinhDo(HttpServletRequest request, Model model, @ModelAttribute("addTrinhDo") Trinhdo trinhdo) {
		trinhdoRSP.save(trinhdo);
		model.addAttribute("showTrinhDo", trinhdoRSP.findAll());
		return "redirect:/admin/thong-ke-trinh-do";
	}

	// Update
	@RequestMapping(value = "update-trinh-do", method = RequestMethod.GET)
	public String updateTrinhDo(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("update Trinh Do");
		// ---------Find By ID--------
		Trinhdo trinhDo = trinhdoRSP.findByIDTrinhDo(id);
		// Addtribute
		model.addAttribute("updateTrinhDo", trinhDo);
		return "admin/sua_trinhdo";
	}

	@RequestMapping(value = "update-trinh-do", method = RequestMethod.POST)
	public String updateTrinhDo(HttpServletRequest request, Model model,
			@ModelAttribute("updateTrinhDo") Trinhdo trinhDo) {
		trinhdoRSP.save(trinhDo);
		model.addAttribute("showTrinhDo", trinhdoRSP.findAll());
		return "redirect:/admin/thong-ke-trinh-do";
	}

// ############################################################# TIN TỨC ############################################################//
	// Show view
	@RequestMapping("/thong-ke-tin-tuc")
	public String ViewTinTuc(HttpServletRequest request) {
		System.out.println("Tin tuc");
		request.setAttribute("showTinTuc", tintucRSP.findAll());
		return "admin/thongketintuc";
	}

	// Delete
	@RequestMapping(value = "/delete-tin-tuc")
	public String deleteTinTuc(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			tintucRSP.deleteById(id);
			model.addAttribute("showTinTuc", tintucRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-tin-tuc";
	}

	// Add
	@RequestMapping(value = "add-tin-tuc", method = RequestMethod.GET)
	public String addTinTuc(HttpServletRequest request, Model model) {
		System.out.println("add Tin Tức");
		File file = new File(uploadingdir);
		System.out.println(file.listFiles().length);
		// ========Show Ten User Do Lay ID User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUser", mapUser);
		// Add Addtribute
		model.addAttribute("addTinTuc", new Tintuc());
		return "admin/them_tintuc";
	}

	@RequestMapping(value = "add-tin-tuc", method = RequestMethod.POST)
	public String addTinTuc(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("addTinTuc") Tintuc tintuc) {
		try {
			File file = new File(uploadingdir + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			System.out.println(uploadFiles.getOriginalFilename());
			System.out.println(uploadingdir + uploadFiles.getOriginalFilename());
			tintuc.setHinhanh(uploadFiles.getOriginalFilename());
			tintucRSP.save(tintuc);
			model.addAttribute("showTinTuc", tintucRSP.findAll());
			return "redirect:/admin/thong-ke-tin-tuc";

		} catch (Exception e) {
			// ========Show Ten User Do Lay ID User
			Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
			List<User> user = (List<User>) userRSP.findAll();
			for (int i = 0; i < user.size(); i++) {
				mapUser.put(user.get(i).getId(), user.get(i).getUsername());
			}
			request.setAttribute("showCBBUser", mapUser);
			model.addAttribute("message", "Thêm mới thất bại. Vui lòng thử lại");
			return "admin/them_tintuc";

		}
	}

	// update -------------------------------------------
	@RequestMapping(value = "update-tin-tuc", method = RequestMethod.GET)
	public String updateTinTuc(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		System.out.println("Update Tin Tuc");
		// ----------------------
		File file = new File(uploadingdir);
		System.out.println(file.listFiles().length);
		// ----------------
		// ========Show Ten User Do Lay ID User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUser", mapUser);
		// -----------------
		Tintuc tinctuc = tintucRSP.findByIDTinTuc(id);
		request.setAttribute("hinhanh", tinctuc.getHinhanh());
		model.addAttribute("updateTinTuc", tinctuc);
		return "admin/sua_tintuc";
	}

	@RequestMapping(value = "update-tin-tuc", method = RequestMethod.POST)
	public String updateTinTuc(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("updateTinTuc") Tintuc tintuc,
			@RequestParam("hinhtruocDo") String hinhtruocDo) {
		try {
			deleteFile(uploadingdir + hinhtruocDo);
			File file = new File(uploadingdir + uploadFiles.getOriginalFilename());
			uploadFiles.transferTo(file);
			tintuc.setHinhanh(uploadFiles.getOriginalFilename());
	
			tintucRSP.save(tintuc);
			model.addAttribute("showTinTuc", tintucRSP.findAll());
			return "redirect:/admin/thong-ke-tin-tuc";
		} catch (Exception ex) {
			// ========Show Ten User Do Lay ID User
			Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
			List<User> user = (List<User>) userRSP.findAll();
			for (int i = 0; i < user.size(); i++) {
				mapUser.put(user.get(i).getId(), user.get(i).getUsername());
			}
			request.setAttribute("showCBBUser", mapUser);
			model.addAttribute("message", "error upload file");
			return "admin/sua_tintuc";
		}

	}

//TODO ############################################################# THANH TOÁN ############################################################//
	// Show view
	@RequestMapping("/thong-ke-thanh-toan")
	public String ViewThanhToan(HttpServletRequest request) {
		System.out.println("Thanh Toán");
		request.setAttribute("showThanhToan", thanhtoanRSP.findAll());
		return "admin/thongkethanhtoan";
	}

	// Delete
	@RequestMapping(value = "/delete-thanh-toan")
	public String deleteThanhToan(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			thanhtoanRSP.deleteById(id);
			model.addAttribute("showThanhToan", thanhtoanRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-thanh-toan";

	}

	// Add
	@RequestMapping(value = "add-thanh-toan", method = RequestMethod.GET)
	public String addThanhToan(HttpServletRequest request, Model model) {
		System.out.println("add Thanh Toan");
		// ================Show CBB User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUSer", mapUser);
		// ================Show CBB Hinh Thuc Thanh Toan
		Map<Integer, String> mapHinhThucTT = new LinkedHashMap<Integer, String>();
		List<Hinhthucthanhtoan> hinhthuctt = (List<Hinhthucthanhtoan>) hinhthucthanhtoanRSP.findAll();
		for (int i = 0; i < hinhthuctt.size(); i++) {
			mapHinhThucTT.put(hinhthuctt.get(i).getIdhinhthuctt(), hinhthuctt.get(i).getTenhinhthuctt());
		}
		request.setAttribute("showCBBHinhThucTT", mapHinhThucTT);
		// ================== AddAttribute
		model.addAttribute("addThanhToan", new Thanhtoan());
		return "admin/them_thanhtoan";
	}

	@RequestMapping(value = "add-thanh-toan", method = RequestMethod.POST)
	public String addThanhToan(HttpServletRequest request, Model model,
			@ModelAttribute("addThanhToan") Thanhtoan thanhtoan) {
		thanhtoanRSP.save(thanhtoan);
		model.addAttribute("showThanhToan", thanhtoanRSP.findAll());
		return "redirect:/admin/thong-ke-thanh-toan";
	}

	// Update
	@RequestMapping(value = "update-thanh-toan", method = RequestMethod.GET)
	public String updateThanhToan(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		// ================Show CBB User
		Map<Integer, String> mapUser = new LinkedHashMap<Integer, String>();
		List<User> user = (List<User>) userRSP.findAll();
		for (int i = 0; i < user.size(); i++) {
			mapUser.put(user.get(i).getId(), user.get(i).getUsername());
		}
		request.setAttribute("showCBBUSer", mapUser);
		// ================Show CBB Hinh Thuc Thanh Toan
		Map<Integer, String> mapHinhThucTT = new LinkedHashMap<Integer, String>();
		List<Hinhthucthanhtoan> hinhthuctt = (List<Hinhthucthanhtoan>) hinhthucthanhtoanRSP.findAll();
		for (int i = 0; i < hinhthuctt.size(); i++) {
			mapHinhThucTT.put(hinhthuctt.get(i).getIdhinhthuctt(), hinhthuctt.get(i).getTenhinhthuctt());
		}
		request.setAttribute("showCBBHinhThucTT", mapHinhThucTT);

		// ---------Find By ID--------
		Thanhtoan thanhtoan = thanhtoanRSP.findByIdHinhThucTT(id);
		// Addtribute
		model.addAttribute("updateThanhToan", thanhtoan);
		return "admin/sua_thanhtoan";
	}

	@RequestMapping(value = "update-thanh-toan", method = RequestMethod.POST)
	public String updateThanhToan(HttpServletRequest request, Model model,
			@ModelAttribute("updateThanhToan") Thanhtoan thanhtoan) {
		thanhtoanRSP.save(thanhtoan);
		model.addAttribute("showThanhToan", thanhtoanRSP.findAll());
		return "redirect:/admin/thong-ke-thanh-toan";
	}

//TODO ############################################################# BẢNG CHỮ CÁI ############################################################//
	// Show view
	@RequestMapping("/thong-ke-bang-chu-cai")
	public String ViewBangChuCai(HttpServletRequest request) {
		System.out.println("Bang chu cai");
		request.setAttribute("showBangChuCai", bangchucaiRSP.findAll());
		return "admin/thongkebangchucai";
	}

	// Delete
	@RequestMapping(value = "/delete-bang-chu-cai")
	public String deleteBangChuCai(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			bangchucaiRSP.deleteById(id);
			model.addAttribute("showBangChuCai", bangchucaiRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-bang-chu-cai";
	}

	// Add
	@RequestMapping(value = "add-bang-chu-cai", method = RequestMethod.GET)
	public String addBangChuCai(HttpServletRequest request, Model model) {
		System.out.println("add Bang Chu Cai");
		// ================== AddAttribute
		model.addAttribute("addBangChuCai", new Bangchucai());
		return "admin/them_bangchucai";
	}

	@RequestMapping(value = "add-bang-chu-cai", method = RequestMethod.POST)
	public String addBangChuCai(@RequestParam("uploadFiles1") MultipartFile uploadFiles1,
			@RequestParam("uploadFiles2") MultipartFile uploadFiles2, HttpServletRequest request, Model model,
			@ModelAttribute("addBangChuCai") Bangchucai bangchucai) {
		try {
			File file1 = new File(uploadingBangChuCai + uploadFiles1.getOriginalFilename());
			uploadFiles1.transferTo(file1);
			File file2 = new File(uploadingBangChuCaiCV + uploadFiles2.getOriginalFilename());
			uploadFiles2.transferTo(file2);
			bangchucai.setChucai(uploadFiles1.getOriginalFilename());
			bangchucai.setLinkhinhanh(uploadFiles2.getOriginalFilename());
			bangchucaiRSP.save(bangchucai);
			model.addAttribute("showBangChuCai", bangchucaiRSP.findAll());
			return "redirect:/admin/thong-ke-bang-chu-cai";
		} catch (Exception ex) {
			return "admin/them_bangchucai";
		}
	}

	// Update
	@RequestMapping(value = "update-bang-chu-cai", method = RequestMethod.GET)
	public String updateBangChuCai(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		// ---------Find By ID--------
		Bangchucai bangChuCai = bangchucaiRSP.findByIdBangChuCai(id);
		// Addtribute
		model.addAttribute("updateBangChuCai", bangChuCai);
		request.setAttribute("chucaitruoc", bangChuCai.getChucai());
		request.setAttribute("linkanhtruoc", bangChuCai.getLinkhinhanh());
		return "admin/sua_bangchucai";
	}

	@RequestMapping(value = "update-bang-chu-cai", method = RequestMethod.POST)
	public String updateBangChuCai(@RequestParam("uploadFiles1") MultipartFile uploadFiles1,
			@RequestParam("uploadFiles2") MultipartFile uploadFiles2, HttpServletRequest request, Model model,
			@ModelAttribute("updateBangChuCai") Bangchucai bangchucai,
			@RequestParam(value = "chucaitruoc") String chucaitruoc,
			@RequestParam(value = "linkanhtruoc") String linkanhtruoc) {
		try {
			deleteFile(uploadingBangChuCai + chucaitruoc);
			deleteFile(uploadingBangChuCaiCV + linkanhtruoc);
			File file1 = new File(uploadingBangChuCai + uploadFiles1.getOriginalFilename());
			uploadFiles1.transferTo(file1);
			File file2 = new File(uploadingBangChuCaiCV + uploadFiles2.getOriginalFilename());
			uploadFiles2.transferTo(file2);
			bangchucai.setChucai(uploadFiles1.getOriginalFilename());
			bangchucai.setLinkhinhanh(uploadFiles2.getOriginalFilename());
	
			bangchucaiRSP.save(bangchucai);
			model.addAttribute("showBangChuCai", bangchucaiRSP.findAll());
			model.addAttribute("messsage","Error upload file");
			return "redirect:/admin/thong-ke-bang-chu-cai";
		} catch (Exception ex) {
			model.addAttribute("messsage","Error upload file");
			return "admin/sua_bangchucai";
		}
	}

//TODO ############################################################# BẢNG MINA ############################################################//
//Show View
	@RequestMapping("/thong-ke-bang-mina")
	public String ViewBangMiNa(HttpServletRequest request) {
		System.out.println("Bang MiNa");
		request.setAttribute("showBangMiNa", minaRSP.findAll());
		return "admin/thongkebangmina";
	}

//Add
	@RequestMapping(value = "add-bang-mina", method = RequestMethod.GET)
	public String addBangMina(HttpServletRequest request, Model model) {
		System.out.println("add Bang Chu Cai");
		// ================== AddAttribute
		model.addAttribute("AddbangMina", new Mina());
		return "admin/them_bangmina";
	}

	@RequestMapping(value = "add-bang-mina", method = RequestMethod.POST)
	public String addBangMina(HttpServletRequest request, Model model, @ModelAttribute("AddbangMina") Mina mina) {
		minaRSP.save(mina);
		model.addAttribute("showBangMiNa", minaRSP.findAll());
		return "redirect:/admin/thong-ke-bang-mina";
	}

	// Delete
	@RequestMapping(value = "/delete-bang-mina")
	public String deleteBangMina(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			minaRSP.deleteById(id);
			model.addAttribute("showBangMiNa", minaRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-bang-mina";
	}

	// Update
	@RequestMapping(value = "update-bang-mina", method = RequestMethod.GET)
	public String updateBangMina(HttpServletRequest request, Model model,
			@RequestParam(value = "id", required = true) Integer id) {
		// ---------Find By ID--------
		Mina bangMina = minaRSP.findByIdBangMina(id);
		// Addtribute
		model.addAttribute("updateBangMina", bangMina);
		return "admin/sua_bangmina";
	}

	@RequestMapping(value = "update-bang-mina", method = RequestMethod.POST)
	public String updateBangMina(HttpServletRequest request, Model model, @ModelAttribute("updateBangMina") Mina mina) {
		minaRSP.save(mina);
		model.addAttribute("showBangMiNa", minaRSP.findAll());
		return "redirect:/admin/thong-ke-bang-mina";
	}
//TODO ========================================= Quiz ================================================= //
	//View 
	@RequestMapping("/thong-ke-quiz-hira")
	public String ViewQuizHira(HttpServletRequest request) {
		System.out.println("Quiz hira");
		request.setAttribute("ViewThongKeQuiz", quizRSP.findAll());
		return "admin/thongkequizhira";
	}
	// Delete
	@RequestMapping(value = "/delete-quiz-hira")
	public String deleteQuizHira(Model model, @RequestParam(value = "id", required = true) Integer id) {
		try {
			quizRSP.deleteById(id);
			model.addAttribute("ViewThongKeQuiz",  quizRSP.findAll());

		} catch (Exception ex) {
			System.out.println("Xóa lỗi " + ex);
			model.addAttribute("message", "error delele");
		}
		return "redirect:/admin/thong-ke-quiz-hira";
	}
	//Add
		@RequestMapping(value = "add-quiz-hira", method = RequestMethod.GET)
		public String addQuizHira(HttpServletRequest request, Model model) {
			System.out.println("add Bang Chu Cai");
			// ================== AddAttribute
			model.addAttribute("addQuizHira",new QuizHirabcc());
			return "admin/them_quizhira";
		}

		@RequestMapping(value = "add-quiz-hira", method = RequestMethod.POST)
		public String addQuizHira(HttpServletRequest request, Model model, @ModelAttribute("addQuizHira") QuizHirabcc quizHira) {
			quizRSP.save(quizHira);
			model.addAttribute("ViewThongKeQuiz",  quizRSP.findAll());
			return "redirect:/admin/thong-ke-quiz-hira";
		}
		//Update
		@RequestMapping(value = "sua-quiz-hira", method = RequestMethod.GET)
		public String suaQuizHira(HttpServletRequest request, Model model,
				@RequestParam(value = "id", required = true) Integer id) {
			System.out.println("add Bang Chu Cai");
			// ================== AddAttribute
			QuizHirabcc quizHira = quizRSP.FindByIdQuiz(id);
			model.addAttribute("updateQuizHira",quizHira);
			return "admin/sua_quizhira";
		}

		@RequestMapping(value = "sua-quiz-hira", method = RequestMethod.POST)
		public String suaQuizHira(HttpServletRequest request, Model model, @ModelAttribute("updateQuizHira") QuizHirabcc quizHira) {
			quizRSP.save(quizHira);
			model.addAttribute("ViewThongKeQuiz",  quizRSP.findAll());
			return "redirect:/admin/thong-ke-quiz-hira";
		}
//TODO ========================================= Edit Profile ========================================= //
	@Autowired
	private BCryptPasswordEncoder bCrypt; // Khởi tạo chuẩn mã hoá password to BCryptPasswordEncoder

	@RequestMapping(value = "/update-profile", method = RequestMethod.GET)
	public String updateProfile(HttpServletRequest request, Model model,
			@RequestParam(value = "username", required = true) String username) {
		// Khởi tạo lưu file tới đường dẫn
		File file = new File(uploadingdirAvatar);
		User us = userRSP.findByName(username);
		model.addAttribute("updateProfile", us);
		request.setAttribute("password", us.getPassword());
		request.setAttribute("showAnhTruoc", us.getAvatar());
		return "admin/profile";
	}

	@RequestMapping(value = "/update-profile", method = RequestMethod.POST)
	public String updateProfile(@RequestParam("uploadFiles") MultipartFile uploadFiles, HttpServletRequest request,
			Model model, @ModelAttribute("updateProfile") User user, @RequestParam("anhtruoc") String anhtruoc) {
		try {
			// Xoa img cu trong he thong
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
			// return "redirect:/admin/update-profile?username=" + user.getUsername() + "";
			return "admin/profile";
		} catch (Exception ex) {
			model.addAttribute("message", "error upload file");
			model.addAttribute("message", "Thông tin thay đổi thất bại");
			return "admin/profile";
		}
	}

//TODO ========================================= Edit Password ========================================= //

	@RequestMapping(value = "/update-profile_pass", method = RequestMethod.GET)
	public String updateProfile_pass(HttpServletRequest request, Model model,
			@RequestParam(value = "username", required = true) String username) {
		System.out.println("Update User pass");
		User user = userRSP.findByName(username);
		model.addAttribute("updateProfile_pass", user);
		return "admin/profile_pass";
	}

	@RequestMapping(value = "/update-profile_pass", method = RequestMethod.POST)
	public String updateProfile_pass(HttpServletRequest request1, Model model1,
			@ModelAttribute("updateProfile_pass") User user, @RequestParam(value = "password") String pass) {
		try {
			user.setEnabled(1);
			// mã hóa password
			pass = bCrypt.encode(user.getPassword());
			user.setPassword(pass);
			userRSP.save(user);
			model1.addAttribute("message", "Đổi mật khẩu thành công!");
			return "admin/profile_pass";
		} catch (Exception ex) {
			model1.addAttribute("message", "Đổi mật khẩu thất bại!");
			return "admin/profile_pass";
		}
	}

}
