package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the thanhtoan database table.
 * 
 */
@Entity
@NamedQuery(name="Thanhtoan.findAll", query="SELECT t FROM Thanhtoan t")
public class Thanhtoan implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idthanhtoan;
	private BigDecimal tongthanhtoan;
	private Hinhthucthanhtoan hinhthucthanhtoan;
	private User user;

	public Thanhtoan() {
	}


	@Id
	public int getIdthanhtoan() {
		return this.idthanhtoan;
	}

	public void setIdthanhtoan(int idthanhtoan) {
		this.idthanhtoan = idthanhtoan;
	}


	public BigDecimal getTongthanhtoan() {
		return this.tongthanhtoan;
	}

	public void setTongthanhtoan(BigDecimal tongthanhtoan) {
		this.tongthanhtoan = tongthanhtoan;
	}


	//bi-directional many-to-one association to Hinhthucthanhtoan
	@ManyToOne
	@JoinColumn(name="idhinhthuctt")
	public Hinhthucthanhtoan getHinhthucthanhtoan() {
		return this.hinhthucthanhtoan;
	}

	public void setHinhthucthanhtoan(Hinhthucthanhtoan hinhthucthanhtoan) {
		this.hinhthucthanhtoan = hinhthucthanhtoan;
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