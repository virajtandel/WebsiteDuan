package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietbaitap database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietbaitap.findAll", query="SELECT c FROM Chitietbaitap c")
public class Chitietbaitap implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idctbt;
	private String audiobt;
	private String ndcauhoi;
	private String ndtraloi;
	private Baitap baitap;

	public Chitietbaitap() {
	}


	@Id
	public int getIdctbt() {
		return this.idctbt;
	}

	public void setIdctbt(int idctbt) {
		this.idctbt = idctbt;
	}


	@Lob
	public String getAudiobt() {
		return this.audiobt;
	}

	public void setAudiobt(String audiobt) {
		this.audiobt = audiobt;
	}


	@Lob
	public String getNdcauhoi() {
		return this.ndcauhoi;
	}

	public void setNdcauhoi(String ndcauhoi) {
		this.ndcauhoi = ndcauhoi;
	}


	@Lob
	public String getNdtraloi() {
		return this.ndtraloi;
	}

	public void setNdtraloi(String ndtraloi) {
		this.ndtraloi = ndtraloi;
	}


	//bi-directional many-to-one association to Baitap
	@ManyToOne
	@JoinColumn(name="idbaitap")
	public Baitap getBaitap() {
		return this.baitap;
	}

	public void setBaitap(Baitap baitap) {
		this.baitap = baitap;
	}

}