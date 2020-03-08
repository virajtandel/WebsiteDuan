package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the chitietkhoahoc database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietkhoahoc.findAll", query="SELECT c FROM Chitietkhoahoc c")
public class Chitietkhoahoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idctkh;
	private String doituong;
	private String hocphi;
	private String noidungchitiet;
	private String sobuoi;
	private String tenloaikhoahoc;
	private int thoigian;
	private String video;
	private Khoahoc khoahoc;
	private List<Hocthu> hocthus;

	public Chitietkhoahoc() {
	}


	@Id
	public int getIdctkh() {
		return this.idctkh;
	}

	public void setIdctkh(int idctkh) {
		this.idctkh = idctkh;
	}


	@Lob
	public String getDoituong() {
		return this.doituong;
	}

	public void setDoituong(String doituong) {
		this.doituong = doituong;
	}


	@Lob
	public String getHocphi() {
		return this.hocphi;
	}

	public void setHocphi(String hocphi) {
		this.hocphi = hocphi;
	}


	@Lob
	public String getNoidungchitiet() {
		return this.noidungchitiet;
	}

	public void setNoidungchitiet(String noidungchitiet) {
		this.noidungchitiet = noidungchitiet;
	}


	@Lob
	public String getSobuoi() {
		return this.sobuoi;
	}

	public void setSobuoi(String sobuoi) {
		this.sobuoi = sobuoi;
	}


	@Lob
	public String getTenloaikhoahoc() {
		return this.tenloaikhoahoc;
	}

	public void setTenloaikhoahoc(String tenloaikhoahoc) {
		this.tenloaikhoahoc = tenloaikhoahoc;
	}


	public int getThoigian() {
		return this.thoigian;
	}

	public void setThoigian(int thoigian) {
		this.thoigian = thoigian;
	}


	@Lob
	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}


	//bi-directional many-to-one association to Khoahoc
	@ManyToOne
	@JoinColumn(name="idkhoahoc")
	public Khoahoc getKhoahoc() {
		return this.khoahoc;
	}

	public void setKhoahoc(Khoahoc khoahoc) {
		this.khoahoc = khoahoc;
	}


	//bi-directional many-to-one association to Hocthu
	@OneToMany(mappedBy="chitietkhoahoc")
	public List<Hocthu> getHocthus() {
		return this.hocthus;
	}

	public void setHocthus(List<Hocthu> hocthus) {
		this.hocthus = hocthus;
	}

	public Hocthu addHocthus(Hocthu hocthus) {
		getHocthus().add(hocthus);
		hocthus.setChitietkhoahoc(this);

		return hocthus;
	}

	public Hocthu removeHocthus(Hocthu hocthus) {
		getHocthus().remove(hocthus);
		hocthus.setChitietkhoahoc(null);

		return hocthus;
	}

}