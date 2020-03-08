package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the binhluan database table.
 * 
 */
@Entity
@NamedQuery(name="Binhluan.findAll", query="SELECT b FROM Binhluan b")
public class Binhluan implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idchitietbl;
	private String blcha;
	private String ghichu;
	private Date ngaybl;
	private String noidungbl;
	private Tintuc tintuc;
	private User user;

	public Binhluan() {
	}


	@Id
	public int getIdchitietbl() {
		return this.idchitietbl;
	}

	public void setIdchitietbl(int idchitietbl) {
		this.idchitietbl = idchitietbl;
	}


	@Lob
	public String getBlcha() {
		return this.blcha;
	}

	public void setBlcha(String blcha) {
		this.blcha = blcha;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Temporal(TemporalType.DATE)
	public Date getNgaybl() {
		return this.ngaybl;
	}

	public void setNgaybl(Date ngaybl) {
		this.ngaybl = ngaybl;
	}


	@Lob
	public String getNoidungbl() {
		return this.noidungbl;
	}

	public void setNoidungbl(String noidungbl) {
		this.noidungbl = noidungbl;
	}


	//bi-directional many-to-one association to Tintuc
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idtintuc")
	public Tintuc getTintuc() {
		return this.tintuc;
	}

	public void setTintuc(Tintuc tintuc) {
		this.tintuc = tintuc;
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