package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loaibaitest database table.
 * 
 */
@Entity
@NamedQuery(name="Loaibaitest.findAll", query="SELECT l FROM Loaibaitest l")
public class Loaibaitest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idloaibaitest;
	private String ghichu;
	private String tenloaibaitest;
	private List<Baitest> baitests;

	public Loaibaitest() {
	}


	@Id
	public int getIdloaibaitest() {
		return this.idloaibaitest;
	}

	public void setIdloaibaitest(int idloaibaitest) {
		this.idloaibaitest = idloaibaitest;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTenloaibaitest() {
		return this.tenloaibaitest;
	}

	public void setTenloaibaitest(String tenloaibaitest) {
		this.tenloaibaitest = tenloaibaitest;
	}


	//bi-directional many-to-one association to Baitest
	@OneToMany(mappedBy="loaibaitest")
	public List<Baitest> getBaitests() {
		return this.baitests;
	}

	public void setBaitests(List<Baitest> baitests) {
		this.baitests = baitests;
	}

	public Baitest addBaitest(Baitest baitest) {
		getBaitests().add(baitest);
		baitest.setLoaibaitest(this);

		return baitest;
	}

	public Baitest removeBaitest(Baitest baitest) {
		getBaitests().remove(baitest);
		baitest.setLoaibaitest(null);

		return baitest;
	}

}