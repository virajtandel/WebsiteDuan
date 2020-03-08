package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the khoahoc database table.
 * 
 */
@Entity
@NamedQuery(name="Khoahoc.findAll", query="SELECT k FROM Khoahoc k")
public class Khoahoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idkhoahoc;
	private float hocphi;
	private String ngaytao;
	private String tenkhoahoc;
	private String thoigian;
	private List<Chitietkhoahoc> chitietkhoahocs;
	private List<Chitietthanhtoan> chitietthanhtoans;
	private Loaikhoahoc loaikhoahoc;

	public Khoahoc() {
	}


	@Id
	public int getIdkhoahoc() {
		return this.idkhoahoc;
	}

	public void setIdkhoahoc(int idkhoahoc) {
		this.idkhoahoc = idkhoahoc;
	}


	public float getHocphi() {
		return this.hocphi;
	}

	public void setHocphi(float hocphi) {
		this.hocphi = hocphi;
	}


	@Lob
	public String getNgaytao() {
		return this.ngaytao;
	}

	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}


	@Lob
	public String getTenkhoahoc() {
		return this.tenkhoahoc;
	}

	public void setTenkhoahoc(String tenkhoahoc) {
		this.tenkhoahoc = tenkhoahoc;
	}


	@Lob
	public String getThoigian() {
		return this.thoigian;
	}

	public void setThoigian(String thoigian) {
		this.thoigian = thoigian;
	}


	//bi-directional many-to-one association to Chitietkhoahoc
	@OneToMany(mappedBy="khoahoc")
	public List<Chitietkhoahoc> getChitietkhoahocs() {
		return this.chitietkhoahocs;
	}

	public void setChitietkhoahocs(List<Chitietkhoahoc> chitietkhoahocs) {
		this.chitietkhoahocs = chitietkhoahocs;
	}

	public Chitietkhoahoc addChitietkhoahoc(Chitietkhoahoc chitietkhoahoc) {
		getChitietkhoahocs().add(chitietkhoahoc);
		chitietkhoahoc.setKhoahoc(this);

		return chitietkhoahoc;
	}

	public Chitietkhoahoc removeChitietkhoahoc(Chitietkhoahoc chitietkhoahoc) {
		getChitietkhoahocs().remove(chitietkhoahoc);
		chitietkhoahoc.setKhoahoc(null);

		return chitietkhoahoc;
	}


	//bi-directional many-to-one association to Chitietthanhtoan
	@OneToMany(mappedBy="khoahoc")
	public List<Chitietthanhtoan> getChitietthanhtoans() {
		return this.chitietthanhtoans;
	}

	public void setChitietthanhtoans(List<Chitietthanhtoan> chitietthanhtoans) {
		this.chitietthanhtoans = chitietthanhtoans;
	}

	public Chitietthanhtoan addChitietthanhtoan(Chitietthanhtoan chitietthanhtoan) {
		getChitietthanhtoans().add(chitietthanhtoan);
		chitietthanhtoan.setKhoahoc(this);

		return chitietthanhtoan;
	}

	public Chitietthanhtoan removeChitietthanhtoan(Chitietthanhtoan chitietthanhtoan) {
		getChitietthanhtoans().remove(chitietthanhtoan);
		chitietthanhtoan.setKhoahoc(null);

		return chitietthanhtoan;
	}


	//bi-directional many-to-one association to Loaikhoahoc
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idloaikh")
	public Loaikhoahoc getLoaikhoahoc() {
		return this.loaikhoahoc;
	}

	public void setLoaikhoahoc(Loaikhoahoc loaikhoahoc) {
		this.loaikhoahoc = loaikhoahoc;
	}

}