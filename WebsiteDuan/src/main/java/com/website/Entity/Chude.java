package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chude database table.
 * 
 */
@Entity
@NamedQuery(name="Chude.findAll", query="SELECT c FROM Chude c")
public class Chude implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idchude;
	private String hinhanh;
	private String tenchude;
	private Loaichude loaichude;
	private Trinhdo trinhdo;

	public Chude() {
	}


	@Id
	public int getIdchude() {
		return this.idchude;
	}

	public void setIdchude(int idchude) {
		this.idchude = idchude;
	}


	@Lob
	public String getHinhanh() {
		return this.hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}


	@Lob
	public String getTenchude() {
		return this.tenchude;
	}

	public void setTenchude(String tenchude) {
		this.tenchude = tenchude;
	}


	//bi-directional many-to-one association to Loaichude
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idloaichude")
	public Loaichude getLoaichude() {
		return this.loaichude;
	}

	public void setLoaichude(Loaichude loaichude) {
		this.loaichude = loaichude;
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

}