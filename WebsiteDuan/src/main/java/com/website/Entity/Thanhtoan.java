package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


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
	private List<Chitietthanhtoan> chitietthanhtoans;
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


	//bi-directional many-to-one association to Chitietthanhtoan
	@OneToMany(mappedBy="thanhtoan")
	public List<Chitietthanhtoan> getChitietthanhtoans() {
		return this.chitietthanhtoans;
	}

	public void setChitietthanhtoans(List<Chitietthanhtoan> chitietthanhtoans) {
		this.chitietthanhtoans = chitietthanhtoans;
	}

	public Chitietthanhtoan addChitietthanhtoan(Chitietthanhtoan chitietthanhtoan) {
		getChitietthanhtoans().add(chitietthanhtoan);
		chitietthanhtoan.setThanhtoan(this);

		return chitietthanhtoan;
	}

	public Chitietthanhtoan removeChitietthanhtoan(Chitietthanhtoan chitietthanhtoan) {
		getChitietthanhtoans().remove(chitietthanhtoan);
		chitietthanhtoan.setThanhtoan(null);

		return chitietthanhtoan;
	}


	//bi-directional many-to-one association to Hinhthucthanhtoan
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idhinhthuctt")
	public Hinhthucthanhtoan getHinhthucthanhtoan() {
		return this.hinhthucthanhtoan;
	}

	public void setHinhthucthanhtoan(Hinhthucthanhtoan hinhthucthanhtoan) {
		this.hinhthucthanhtoan = hinhthucthanhtoan;
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