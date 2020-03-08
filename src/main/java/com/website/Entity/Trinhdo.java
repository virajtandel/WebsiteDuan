package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the trinhdo database table.
 * 
 */
@Entity
@NamedQuery(name="Trinhdo.findAll", query="SELECT t FROM Trinhdo t")
public class Trinhdo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idtrinhdo;
	private String ghichu;
	private String tentrinhdo;
	private List<Baitest> baitests;
	private List<Chude> chudes;
	private List<Giaotrinh> giaotrinhs;

	public Trinhdo() {
	}


	@Id
	public int getIdtrinhdo() {
		return this.idtrinhdo;
	}

	public void setIdtrinhdo(int idtrinhdo) {
		this.idtrinhdo = idtrinhdo;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTentrinhdo() {
		return this.tentrinhdo;
	}

	public void setTentrinhdo(String tentrinhdo) {
		this.tentrinhdo = tentrinhdo;
	}


	//bi-directional many-to-one association to Baitest
	@OneToMany(mappedBy="trinhdo")
	public List<Baitest> getBaitests() {
		return this.baitests;
	}

	public void setBaitests(List<Baitest> baitests) {
		this.baitests = baitests;
	}

	public Baitest addBaitest(Baitest baitest) {
		getBaitests().add(baitest);
		baitest.setTrinhdo(this);

		return baitest;
	}

	public Baitest removeBaitest(Baitest baitest) {
		getBaitests().remove(baitest);
		baitest.setTrinhdo(null);

		return baitest;
	}


	//bi-directional many-to-one association to Chude
	@OneToMany(mappedBy="trinhdo")
	public List<Chude> getChudes() {
		return this.chudes;
	}

	public void setChudes(List<Chude> chudes) {
		this.chudes = chudes;
	}

	public Chude addChude(Chude chude) {
		getChudes().add(chude);
		chude.setTrinhdo(this);

		return chude;
	}

	public Chude removeChude(Chude chude) {
		getChudes().remove(chude);
		chude.setTrinhdo(null);

		return chude;
	}


	//bi-directional many-to-one association to Giaotrinh
	@OneToMany(mappedBy="trinhdo")
	public List<Giaotrinh> getGiaotrinhs() {
		return this.giaotrinhs;
	}

	public void setGiaotrinhs(List<Giaotrinh> giaotrinhs) {
		this.giaotrinhs = giaotrinhs;
	}

	public Giaotrinh addGiaotrinh(Giaotrinh giaotrinh) {
		getGiaotrinhs().add(giaotrinh);
		giaotrinh.setTrinhdo(this);

		return giaotrinh;
	}

	public Giaotrinh removeGiaotrinh(Giaotrinh giaotrinh) {
		getGiaotrinhs().remove(giaotrinh);
		giaotrinh.setTrinhdo(null);

		return giaotrinh;
	}

}