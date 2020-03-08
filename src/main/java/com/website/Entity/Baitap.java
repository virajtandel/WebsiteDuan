package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the baitap database table.
 * 
 */
@Entity
@NamedQuery(name="Baitap.findAll", query="SELECT b FROM Baitap b")
public class Baitap implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idbaitap;
	private String noidungbt;
	private String tenbaitap;
	private Baihoc baihoc;
	private List<Chitietbaitap> chitietbaitaps;

	public Baitap() {
	}


	@Id
	public int getIdbaitap() {
		return this.idbaitap;
	}

	public void setIdbaitap(int idbaitap) {
		this.idbaitap = idbaitap;
	}


	@Lob
	public String getNoidungbt() {
		return this.noidungbt;
	}

	public void setNoidungbt(String noidungbt) {
		this.noidungbt = noidungbt;
	}


	@Lob
	public String getTenbaitap() {
		return this.tenbaitap;
	}

	public void setTenbaitap(String tenbaitap) {
		this.tenbaitap = tenbaitap;
	}


	//bi-directional many-to-one association to Baihoc
	@ManyToOne
	@JoinColumn(name="idbaihoc")
	public Baihoc getBaihoc() {
		return this.baihoc;
	}

	public void setBaihoc(Baihoc baihoc) {
		this.baihoc = baihoc;
	}


	//bi-directional many-to-one association to Chitietbaitap
	@OneToMany(mappedBy="baitap")
	public List<Chitietbaitap> getChitietbaitaps() {
		return this.chitietbaitaps;
	}

	public void setChitietbaitaps(List<Chitietbaitap> chitietbaitaps) {
		this.chitietbaitaps = chitietbaitaps;
	}

	public Chitietbaitap addChitietbaitap(Chitietbaitap chitietbaitap) {
		getChitietbaitaps().add(chitietbaitap);
		chitietbaitap.setBaitap(this);

		return chitietbaitap;
	}

	public Chitietbaitap removeChitietbaitap(Chitietbaitap chitietbaitap) {
		getChitietbaitaps().remove(chitietbaitap);
		chitietbaitap.setBaitap(null);

		return chitietbaitap;
	}

}