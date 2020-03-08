package com.website.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.website.Entity.Bangchucai;
import com.website.Entity.Loaichude;
import com.website.Entity.QuizHirabcc;
import com.website.Entity.Tuvung_min_;
import com.website.Repository.BangchucaiReposiotry;
import com.website.Repository.LoaichudeRepository;
import com.website.Repository.NguphapRepository;
import com.website.Repository.QuizHirabccRepository;
import com.website.Repository.TuvungminRepository;
import com.website.Repository.UserRepository;

@RestController
@Transactional
public class AdminControllerAPI {
// TODO	=============================================Biến khởi tạo===============================================//
	@Autowired
	UserRepository baihocrps;
	@Autowired
	TuvungminRepository tuvungminrps;
	UserRepository un;
	@Autowired
	NguphapRepository nguphapRPS;
	@Autowired
	BangchucaiReposiotry bangchucaiRPS;
	@Autowired
	LoaichudeRepository loaichudeRPS;
	@Autowired
	QuizHirabccRepository hiraquizrps;
	
	
	@GetMapping("/rest/employee/getAll")
	public List<Tuvung_min_> getAllEmployees() {
		return (List<Tuvung_min_>) tuvungminrps.findAll();
	};
	
	@PostMapping(path = "/members", consumes = "application/json")
	public String demo(@RequestBody String msg) {
		return msg;
	};
//TODO	=============================================Bài học MiNA===============================================//
		//- Lấy theo từ vựng, trả về nhiều giá trị
		@GetMapping("/rest/mina_tv/{id}")
		public Iterable<Tuvung_min_> getbyTV(@PathVariable("id") Integer id) {
			return (Iterable<Tuvung_min_>) tuvungminrps.findByIDTV(id);
		};

//TODO ################################################# bảng chữ cái #########################################################//
		//- lấy theo hira
		@GetMapping("/rest/mina_hira/getAll")
		public List<Bangchucai> getAllHiragara() {
			return (List<Bangchucai>) bangchucaiRPS.FindByHiragana();
		};
		//- lấy theo kata
		@GetMapping("/rest/mina_kata/getAll")
		public List<Bangchucai> getAllkata() {
			return (List<Bangchucai>) bangchucaiRPS.FindByKatakana();
		};
		//- lấy thông tin chữ cái theo id
		//truyền vào id ( Trả về 1 giá trị)
		@GetMapping("/rest/mina_bcc/{id}")
		public Optional<Bangchucai> getbyIDBCC(@PathVariable("id") Integer id) {
			return (Optional<Bangchucai>) bangchucaiRPS.findbyIDBCC1(id);
		};
//TODO ################################################# loại chủ đề #########################################################//
		@GetMapping("/rest/show_loai_chu_de/getAll")
		public List<Loaichude> getAllLoaiChuDe(){
			return (List<Loaichude>) loaichudeRPS.findAllApiLoaiChuDe();
		}
// TODO ################################################## Quiz ##############################################################//
		// Quiz bảng chữ cái Hira : GetAll
		@GetMapping("/rest/quiz/quizhiragetAll")
		public List<QuizHirabcc> getAllQuizhira() {
			return (List<QuizHirabcc>) hiraquizrps.findAll();
		};
		//Quiz bảng chữ cái Hira: Get by ID
		@GetMapping("/rest/quiz/quizhiragetbyid/{id}")
		public Optional<QuizHirabcc> gethirabyID(@PathVariable("id") Integer id) {
			return (Optional<QuizHirabcc>) hiraquizrps.findById(id);
		};
	
}
