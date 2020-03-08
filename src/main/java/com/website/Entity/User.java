package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String avatar;
	private String cmnd;
	private String diachi;
	private String email;
	private int enabled;
	private String gioitinh;
	private String hoten;
	private String ngaysinh;
	private Date ngaytao;
	private String password;
	private String sdt;
	private String username;
	private List<Binhluan> binhluans;
	private List<Chitietbaihoc> chitietbaihocs;
	private List<Chitietbaitest> chitietbaitests;
	private List<Thanhtoan> thanhtoans;
	private List<Tintuc> tintucs;
	private List<UsersRole> usersRoles;

	public User() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Lob
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


	@Lob
	public String getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}


	@Lob
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}


	@Lob
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public int getEnabled() {
		return this.enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}


	@Lob
	public String getGioitinh() {
		return this.gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}


	@Lob
	public String getHoten() {
		return this.hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}


	@Lob
	public String getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}


	@Temporal(TemporalType.DATE)
	public Date getNgaytao() {
		return this.ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}


	@Lob
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Lob
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}


	@Lob
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	//bi-directional many-to-one association to Binhluan
	@OneToMany(mappedBy="user")
	public List<Binhluan> getBinhluans() {
		return this.binhluans;
	}

	public void setBinhluans(List<Binhluan> binhluans) {
		this.binhluans = binhluans;
	}

	public Binhluan addBinhluan(Binhluan binhluan) {
		getBinhluans().add(binhluan);
		binhluan.setUser(this);

		return binhluan;
	}

	public Binhluan removeBinhluan(Binhluan binhluan) {
		getBinhluans().remove(binhluan);
		binhluan.setUser(null);

		return binhluan;
	}


	//bi-directional many-to-one association to Chitietbaihoc
	@OneToMany(mappedBy="user")
	public List<Chitietbaihoc> getChitietbaihocs() {
		return this.chitietbaihocs;
	}

	public void setChitietbaihocs(List<Chitietbaihoc> chitietbaihocs) {
		this.chitietbaihocs = chitietbaihocs;
	}

	public Chitietbaihoc addChitietbaihoc(Chitietbaihoc chitietbaihoc) {
		getChitietbaihocs().add(chitietbaihoc);
		chitietbaihoc.setUser(this);

		return chitietbaihoc;
	}

	public Chitietbaihoc removeChitietbaihoc(Chitietbaihoc chitietbaihoc) {
		getChitietbaihocs().remove(chitietbaihoc);
		chitietbaihoc.setUser(null);

		return chitietbaihoc;
	}


	//bi-directional many-to-one association to Chitietbaitest
	@OneToMany(mappedBy="user")
	public List<Chitietbaitest> getChitietbaitests() {
		return this.chitietbaitests;
	}

	public void setChitietbaitests(List<Chitietbaitest> chitietbaitests) {
		this.chitietbaitests = chitietbaitests;
	}

	public Chitietbaitest addChitietbaitest(Chitietbaitest chitietbaitest) {
		getChitietbaitests().add(chitietbaitest);
		chitietbaitest.setUser(this);

		return chitietbaitest;
	}

	public Chitietbaitest removeChitietbaitest(Chitietbaitest chitietbaitest) {
		getChitietbaitests().remove(chitietbaitest);
		chitietbaitest.setUser(null);

		return chitietbaitest;
	}


	//bi-directional many-to-one association to Thanhtoan
	@OneToMany(mappedBy="user")
	public List<Thanhtoan> getThanhtoans() {
		return this.thanhtoans;
	}

	public void setThanhtoans(List<Thanhtoan> thanhtoans) {
		this.thanhtoans = thanhtoans;
	}

	public Thanhtoan addThanhtoan(Thanhtoan thanhtoan) {
		getThanhtoans().add(thanhtoan);
		thanhtoan.setUser(this);

		return thanhtoan;
	}

	public Thanhtoan removeThanhtoan(Thanhtoan thanhtoan) {
		getThanhtoans().remove(thanhtoan);
		thanhtoan.setUser(null);

		return thanhtoan;
	}


	//bi-directional many-to-one association to Tintuc
	@OneToMany(mappedBy="user")
	public List<Tintuc> getTintucs() {
		return this.tintucs;
	}

	public void setTintucs(List<Tintuc> tintucs) {
		this.tintucs = tintucs;
	}

	public Tintuc addTintuc(Tintuc tintuc) {
		getTintucs().add(tintuc);
		tintuc.setUser(this);

		return tintuc;
	}

	public Tintuc removeTintuc(Tintuc tintuc) {
		getTintucs().remove(tintuc);
		tintuc.setUser(null);

		return tintuc;
	}


	//bi-directional many-to-one association to UsersRole
	@OneToMany(mappedBy="userBean")
	public List<UsersRole> getUsersRoles() {
		return this.usersRoles;
	}

	public void setUsersRoles(List<UsersRole> usersRoles) {
		this.usersRoles = usersRoles;
	}

	public UsersRole addUsersRole(UsersRole usersRole) {
		getUsersRoles().add(usersRole);
		usersRole.setUserBean(this);

		return usersRole;
	}

	public UsersRole removeUsersRole(UsersRole usersRole) {
		getUsersRoles().remove(usersRole);
		usersRole.setUserBean(null);

		return usersRole;
	}

}