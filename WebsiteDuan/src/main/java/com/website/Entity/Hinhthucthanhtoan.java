package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hinhthucthanhtoan database table.
 * 
 */
@Entity
@NamedQuery(name="Hinhthucthanhtoan.findAll", query="SELECT h FROM Hinhthucthanhtoan h")
public class Hinhthucthanhtoan implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idhinhthuctt;
	private String ghichu;
	private String tenhinhthuctt;
	private List<Thanhtoan> thanhtoans;

	public Hinhthucthanhtoan() {
	}


	@Id
	public int getIdhinhthuctt() {
		return this.idhinhthuctt;
	}

	public void setIdhinhthuctt(int idhinhthuctt) {
		this.idhinhthuctt = idhinhthuctt;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTenhinhthuctt() {
		return this.tenhinhthuctt;
	}

	public void setTenhinhthuctt(String tenhinhthuctt) {
		this.tenhinhthuctt = tenhinhthuctt;
	}


	//bi-directional many-to-one association to Thanhtoan
	@OneToMany(mappedBy="hinhthucthanhtoan")
	public List<Thanhtoan> getThanhtoans() {
		return this.thanhtoans;
	}

	public void setThanhtoans(List<Thanhtoan> thanhtoans) {
		this.thanhtoans = thanhtoans;
	}

	public Thanhtoan addThanhtoan(Thanhtoan thanhtoan) {
		getThanhtoans().add(thanhtoan);
		thanhtoan.setHinhthucthanhtoan(this);

		return thanhtoan;
	}

	public Thanhtoan removeThanhtoan(Thanhtoan thanhtoan) {
		getThanhtoans().remove(thanhtoan);
		thanhtoan.setHinhthucthanhtoan(null);

		return thanhtoan;
	}

}