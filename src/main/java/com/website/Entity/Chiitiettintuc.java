package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chiitiettintuc database table.
 * 
 */
@Entity
@NamedQuery(name="Chiitiettintuc.findAll", query="SELECT c FROM Chiitiettintuc c")
public class Chiitiettintuc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idcttintuc;
	private Danhmuc danhmuc;
	private Tintuc tintuc;

	public Chiitiettintuc() {
	}


	@Id
	public int getIdcttintuc() {
		return this.idcttintuc;
	}

	public void setIdcttintuc(int idcttintuc) {
		this.idcttintuc = idcttintuc;
	}


	//bi-directional many-to-one association to Danhmuc
	@ManyToOne
	@JoinColumn(name="iddanhmuc")
	public Danhmuc getDanhmuc() {
		return this.danhmuc;
	}

	public void setDanhmuc(Danhmuc danhmuc) {
		this.danhmuc = danhmuc;
	}


	//bi-directional many-to-one association to Tintuc
	@ManyToOne
	@JoinColumn(name="idtintuc")
	public Tintuc getTintuc() {
		return this.tintuc;
	}

	public void setTintuc(Tintuc tintuc) {
		this.tintuc = tintuc;
	}

}