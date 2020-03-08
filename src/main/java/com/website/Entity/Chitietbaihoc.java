package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietbaihoc database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietbaihoc.findAll", query="SELECT c FROM Chitietbaihoc c")
public class Chitietbaihoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idctbh;
	private Baihoc baihoc;
	private User user;

	public Chitietbaihoc() {
	}


	@Id
	public int getIdctbh() {
		return this.idctbh;
	}

	public void setIdctbh(int idctbh) {
		this.idctbh = idctbh;
	}


	//bi-directional many-to-one association to Baihoc
	@ManyToOne
	@JoinColumn(name="idbaihoc")
	public Baihoc getBaihoc() {
		return this.baihoc;
	}

	public void setBaihoc(Baihoc baihoc) {
		this.baihoc = baihoc;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="iduser")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}