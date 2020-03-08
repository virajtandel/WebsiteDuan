package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cauhoi database table.
 * 
 */
@Entity
@NamedQuery(name="Cauhoi.findAll", query="SELECT c FROM Cauhoi c")
public class Cauhoi implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idcauhoi;
	private String audioch;
	private String ndcauhoi;
	private Baitest baitest;
	private List<Dapan> dapans;

	public Cauhoi() {
	}


	@Id
	public int getIdcauhoi() {
		return this.idcauhoi;
	}

	public void setIdcauhoi(int idcauhoi) {
		this.idcauhoi = idcauhoi;
	}


	@Lob
	public String getAudioch() {
		return this.audioch;
	}

	public void setAudioch(String audioch) {
		this.audioch = audioch;
	}


	@Lob
	public String getNdcauhoi() {
		return this.ndcauhoi;
	}

	public void setNdcauhoi(String ndcauhoi) {
		this.ndcauhoi = ndcauhoi;
	}


	//bi-directional many-to-one association to Baitest
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idbaitest")
	public Baitest getBaitest() {
		return this.baitest;
	}

	public void setBaitest(Baitest baitest) {
		this.baitest = baitest;
	}


	//bi-directional many-to-one association to Dapan
	@OneToMany(mappedBy="cauhoi")
	public List<Dapan> getDapans() {
		return this.dapans;
	}

	public void setDapans(List<Dapan> dapans) {
		this.dapans = dapans;
	}

	public Dapan addDapan(Dapan dapan) {
		getDapans().add(dapan);
		dapan.setCauhoi(this);

		return dapan;
	}

	public Dapan removeDapan(Dapan dapan) {
		getDapans().remove(dapan);
		dapan.setCauhoi(null);

		return dapan;
	}

}