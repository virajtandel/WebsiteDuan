package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the baitest database table.
 * 
 */
@Entity
@NamedQuery(name="Baitest.findAll", query="SELECT b FROM Baitest b")
public class Baitest implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idbaitest;
	private String tenbaitest;
	private Loaibaitest loaibaitest;
	private Trinhdo trinhdo;
	private List<Cauhoi> cauhois;
	private List<Chitietbaitest> chitietbaitests;

	public Baitest() {
	}


	@Id
	public int getIdbaitest() {
		return this.idbaitest;
	}

	public void setIdbaitest(int idbaitest) {
		this.idbaitest = idbaitest;
	}


	@Lob
	public String getTenbaitest() {
		return this.tenbaitest;
	}

	public void setTenbaitest(String tenbaitest) {
		this.tenbaitest = tenbaitest;
	}


	//bi-directional many-to-one association to Loaibaitest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idloaibaitest")
	public Loaibaitest getLoaibaitest() {
		return this.loaibaitest;
	}

	public void setLoaibaitest(Loaibaitest loaibaitest) {
		this.loaibaitest = loaibaitest;
	}


	//bi-directional many-to-one association to Trinhdo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idtrinhdo")
	public Trinhdo getTrinhdo() {
		return this.trinhdo;
	}

	public void setTrinhdo(Trinhdo trinhdo) {
		this.trinhdo = trinhdo;
	}


	//bi-directional many-to-one association to Cauhoi
	@OneToMany(mappedBy="baitest")
	public List<Cauhoi> getCauhois() {
		return this.cauhois;
	}

	public void setCauhois(List<Cauhoi> cauhois) {
		this.cauhois = cauhois;
	}

	public Cauhoi addCauhoi(Cauhoi cauhoi) {
		getCauhois().add(cauhoi);
		cauhoi.setBaitest(this);

		return cauhoi;
	}

	public Cauhoi removeCauhoi(Cauhoi cauhoi) {
		getCauhois().remove(cauhoi);
		cauhoi.setBaitest(null);

		return cauhoi;
	}


	//bi-directional many-to-one association to Chitietbaitest
	@OneToMany(mappedBy="baitest")
	public List<Chitietbaitest> getChitietbaitests() {
		return this.chitietbaitests;
	}

	public void setChitietbaitests(List<Chitietbaitest> chitietbaitests) {
		this.chitietbaitests = chitietbaitests;
	}

	public Chitietbaitest addChitietbaitest(Chitietbaitest chitietbaitest) {
		getChitietbaitests().add(chitietbaitest);
		chitietbaitest.setBaitest(this);

		return chitietbaitest;
	}

	public Chitietbaitest removeChitietbaitest(Chitietbaitest chitietbaitest) {
		getChitietbaitests().remove(chitietbaitest);
		chitietbaitest.setBaitest(null);

		return chitietbaitest;
	}

}