package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietthanhtoan database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietthanhtoan.findAll", query="SELECT c FROM Chitietthanhtoan c")
public class Chitietthanhtoan implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idcttt;
	private String ghichu;
	private float hocphi;
	private String ngaytt;
	private Khoahoc khoahoc;
	private Thanhtoan thanhtoan;

	public Chitietthanhtoan() {
	}


	@Id
	public int getIdcttt() {
		return this.idcttt;
	}

	public void setIdcttt(int idcttt) {
		this.idcttt = idcttt;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	public float getHocphi() {
		return this.hocphi;
	}

	public void setHocphi(float hocphi) {
		this.hocphi = hocphi;
	}


	@Lob
	public String getNgaytt() {
		return this.ngaytt;
	}

	public void setNgaytt(String ngaytt) {
		this.ngaytt = ngaytt;
	}


	//bi-directional many-to-one association to Khoahoc
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idkhoahoc")
	public Khoahoc getKhoahoc() {
		return this.khoahoc;
	}

	public void setKhoahoc(Khoahoc khoahoc) {
		this.khoahoc = khoahoc;
	}


	//bi-directional many-to-one association to Thanhtoan
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idthanhtoan")
	public Thanhtoan getThanhtoan() {
		return this.thanhtoan;
	}

	public void setThanhtoan(Thanhtoan thanhtoan) {
		this.thanhtoan = thanhtoan;
	}

}