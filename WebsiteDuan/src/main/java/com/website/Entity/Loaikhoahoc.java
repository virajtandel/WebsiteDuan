package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loaikhoahoc database table.
 * 
 */
@Entity
@NamedQuery(name="Loaikhoahoc.findAll", query="SELECT l FROM Loaikhoahoc l")
public class Loaikhoahoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idloaikh;
	private String ghichu;
	private String tenloaikh;
	private List<Khoahoc> khoahocs;

	public Loaikhoahoc() {
	}


	@Id
	public int getIdloaikh() {
		return this.idloaikh;
	}

	public void setIdloaikh(int idloaikh) {
		this.idloaikh = idloaikh;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTenloaikh() {
		return this.tenloaikh;
	}

	public void setTenloaikh(String tenloaikh) {
		this.tenloaikh = tenloaikh;
	}


	//bi-directional many-to-one association to Khoahoc
	@OneToMany(mappedBy="loaikhoahoc")
	public List<Khoahoc> getKhoahocs() {
		return this.khoahocs;
	}

	public void setKhoahocs(List<Khoahoc> khoahocs) {
		this.khoahocs = khoahocs;
	}

	public Khoahoc addKhoahoc(Khoahoc khoahoc) {
		getKhoahocs().add(khoahoc);
		khoahoc.setLoaikhoahoc(this);

		return khoahoc;
	}

	public Khoahoc removeKhoahoc(Khoahoc khoahoc) {
		getKhoahocs().remove(khoahoc);
		khoahoc.setLoaikhoahoc(null);

		return khoahoc;
	}

}