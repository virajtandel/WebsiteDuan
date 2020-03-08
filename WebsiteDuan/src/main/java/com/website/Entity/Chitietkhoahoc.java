package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietkhoahoc database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietkhoahoc.findAll", query="SELECT c FROM Chitietkhoahoc c")
public class Chitietkhoahoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idctkh;
	private String ghichu;
	private Khoahoc khoahoc;
	private User user;

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
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
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