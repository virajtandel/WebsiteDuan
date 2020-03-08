package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the dapan database table.
 * 
 */
@Entity
@NamedQuery(name="Dapan.findAll", query="SELECT d FROM Dapan d")
public class Dapan implements Serializable {
	private static final long serialVersionUID = 1L;
	private int iddapan;
	private String dapan;
	private Cauhoi cauhoi;

	public Dapan() {
	}


	@Id
	public int getIddapan() {
		return this.iddapan;
	}

	public void setIddapan(int iddapan) {
		this.iddapan = iddapan;
	}


	@Lob
	public String getDapan() {
		return this.dapan;
	}

	public void setDapan(String dapan) {
		this.dapan = dapan;
	}


	//bi-directional many-to-one association to Cauhoi
	@ManyToOne
	@JoinColumn(name="idcauhoi")
	public Cauhoi getCauhoi() {
		return this.cauhoi;
	}

	public void setCauhoi(Cauhoi cauhoi) {
		this.cauhoi = cauhoi;
	}

}