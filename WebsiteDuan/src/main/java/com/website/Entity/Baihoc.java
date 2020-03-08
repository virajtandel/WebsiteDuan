package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the baihoc database table.
 * 
 */
@Entity
@NamedQuery(name="Baihoc.findAll", query="SELECT b FROM Baihoc b")
public class Baihoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idbaihoc;
	private String noidungbh;
	private String tenbaihoc;
	private List<Baitap> baitaps;
	private List<Chitietbaihoc> chitietbaihocs;
	private List<Nguphap> nguphaps;

	public Baihoc() {
	}


	@Id
	public int getIdbaihoc() {
		return this.idbaihoc;
	}

	public void setIdbaihoc(int idbaihoc) {
		this.idbaihoc = idbaihoc;
	}


	@Lob
	public String getNoidungbh() {
		return this.noidungbh;
	}

	public void setNoidungbh(String noidungbh) {
		this.noidungbh = noidungbh;
	}


	@Lob
	public String getTenbaihoc() {
		return this.tenbaihoc;
	}

	public void setTenbaihoc(String tenbaihoc) {
		this.tenbaihoc = tenbaihoc;
	}


	//bi-directional many-to-one association to Baitap
	@OneToMany(mappedBy="baihoc")
	public List<Baitap> getBaitaps() {
		return this.baitaps;
	}

	public void setBaitaps(List<Baitap> baitaps) {
		this.baitaps = baitaps;
	}

	public Baitap addBaitap(Baitap baitap) {
		getBaitaps().add(baitap);
		baitap.setBaihoc(this);

		return baitap;
	}

	public Baitap removeBaitap(Baitap baitap) {
		getBaitaps().remove(baitap);
		baitap.setBaihoc(null);

		return baitap;
	}


	//bi-directional many-to-one association to Chitietbaihoc
	@OneToMany(mappedBy="baihoc")
	public List<Chitietbaihoc> getChitietbaihocs() {
		return this.chitietbaihocs;
	}

	public void setChitietbaihocs(List<Chitietbaihoc> chitietbaihocs) {
		this.chitietbaihocs = chitietbaihocs;
	}

	public Chitietbaihoc addChitietbaihoc(Chitietbaihoc chitietbaihoc) {
		getChitietbaihocs().add(chitietbaihoc);
		chitietbaihoc.setBaihoc(this);

		return chitietbaihoc;
	}

	public Chitietbaihoc removeChitietbaihoc(Chitietbaihoc chitietbaihoc) {
		getChitietbaihocs().remove(chitietbaihoc);
		chitietbaihoc.setBaihoc(null);

		return chitietbaihoc;
	}


	//bi-directional many-to-one association to Nguphap
	@OneToMany(mappedBy="baihoc")
	public List<Nguphap> getNguphaps() {
		return this.nguphaps;
	}

	public void setNguphaps(List<Nguphap> nguphaps) {
		this.nguphaps = nguphaps;
	}

	public Nguphap addNguphap(Nguphap nguphap) {
		getNguphaps().add(nguphap);
		nguphap.setBaihoc(this);

		return nguphap;
	}

	public Nguphap removeNguphap(Nguphap nguphap) {
		getNguphaps().remove(nguphap);
		nguphap.setBaihoc(null);

		return nguphap;
	}

}