package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietbaitest database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietbaitest.findAll", query="SELECT c FROM Chitietbaitest c")
public class Chitietbaitest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idctbaitest;
	private Baitest baitest;
	private User user;

	public Chitietbaitest() {
	}


	@Id
	public int getIdctbaitest() {
		return this.idctbaitest;
	}

	public void setIdctbaitest(int idctbaitest) {
		this.idctbaitest = idctbaitest;
	}


	//bi-directional many-to-one association to Baitest
	@ManyToOne
	@JoinColumn(name="idbaitest")
	public Baitest getBaitest() {
		return this.baitest;
	}

	public void setBaitest(Baitest baitest) {
		this.baitest = baitest;
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