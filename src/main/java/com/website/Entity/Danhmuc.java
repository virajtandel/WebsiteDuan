package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the danhmuc database table.
 * 
 */
@Entity
@NamedQuery(name="Danhmuc.findAll", query="SELECT d FROM Danhmuc d")
public class Danhmuc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int iddanhmuc;
	private String ghichu;
	private String tendanhmuc;
	private List<Chiitiettintuc> chiitiettintucs;

	public Danhmuc() {
	}


	@Id
	public int getIddanhmuc() {
		return this.iddanhmuc;
	}

	public void setIddanhmuc(int iddanhmuc) {
		this.iddanhmuc = iddanhmuc;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTendanhmuc() {
		return this.tendanhmuc;
	}

	public void setTendanhmuc(String tendanhmuc) {
		this.tendanhmuc = tendanhmuc;
	}


	//bi-directional many-to-one association to Chiitiettintuc
	@OneToMany(mappedBy="danhmuc")
	public List<Chiitiettintuc> getChiitiettintucs() {
		return this.chiitiettintucs;
	}

	public void setChiitiettintucs(List<Chiitiettintuc> chiitiettintucs) {
		this.chiitiettintucs = chiitiettintucs;
	}

	public Chiitiettintuc addChiitiettintuc(Chiitiettintuc chiitiettintuc) {
		getChiitiettintucs().add(chiitiettintuc);
		chiitiettintuc.setDanhmuc(this);

		return chiitiettintuc;
	}

	public Chiitiettintuc removeChiitiettintuc(Chiitiettintuc chiitiettintuc) {
		getChiitiettintucs().remove(chiitiettintuc);
		chiitiettintuc.setDanhmuc(null);

		return chiitiettintuc;
	}

}