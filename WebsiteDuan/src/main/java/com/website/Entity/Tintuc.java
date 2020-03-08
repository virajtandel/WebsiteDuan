package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tintuc database table.
 * 
 */
@Entity
@NamedQuery(name="Tintuc.findAll", query="SELECT t FROM Tintuc t")
public class Tintuc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idtintuc;
	private String hinhanh;
	private int luotxem;
	private String ngaydang;
	private String noidung;
	private String tieude;
	private List<Binhluan> binhluans;
	private List<Chiitiettintuc> chiitiettintucs;
	private User user;

	public Tintuc() {
	}


	@Id
	public int getIdtintuc() {
		return this.idtintuc;
	}

	public void setIdtintuc(int idtintuc) {
		this.idtintuc = idtintuc;
	}


	@Lob
	public String getHinhanh() {
		return this.hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}


	public int getLuotxem() {
		return this.luotxem;
	}

	public void setLuotxem(int luotxem) {
		this.luotxem = luotxem;
	}


	@Lob
	public String getNgaydang() {
		return this.ngaydang;
	}

	public void setNgaydang(String ngaydang) {
		this.ngaydang = ngaydang;
	}


	@Lob
	public String getNoidung() {
		return this.noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}


	@Lob
	public String getTieude() {
		return this.tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}


	//bi-directional many-to-one association to Binhluan
	@OneToMany(mappedBy="tintuc")
	public List<Binhluan> getBinhluans() {
		return this.binhluans;
	}

	public void setBinhluans(List<Binhluan> binhluans) {
		this.binhluans = binhluans;
	}

	public Binhluan addBinhluan(Binhluan binhluan) {
		getBinhluans().add(binhluan);
		binhluan.setTintuc(this);

		return binhluan;
	}

	public Binhluan removeBinhluan(Binhluan binhluan) {
		getBinhluans().remove(binhluan);
		binhluan.setTintuc(null);

		return binhluan;
	}


	//bi-directional many-to-one association to Chiitiettintuc
	@OneToMany(mappedBy="tintuc")
	public List<Chiitiettintuc> getChiitiettintucs() {
		return this.chiitiettintucs;
	}

	public void setChiitiettintucs(List<Chiitiettintuc> chiitiettintucs) {
		this.chiitiettintucs = chiitiettintucs;
	}

	public Chiitiettintuc addChiitiettintuc(Chiitiettintuc chiitiettintuc) {
		getChiitiettintucs().add(chiitiettintuc);
		chiitiettintuc.setTintuc(this);

		return chiitiettintuc;
	}

	public Chiitiettintuc removeChiitiettintuc(Chiitiettintuc chiitiettintuc) {
		getChiitiettintucs().remove(chiitiettintuc);
		chiitiettintuc.setTintuc(null);

		return chiitiettintuc;
	}


	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="iduser")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}