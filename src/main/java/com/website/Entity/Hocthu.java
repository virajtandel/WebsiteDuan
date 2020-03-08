package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hocthu database table.
 * 
 */
@Entity
@NamedQuery(name="Hocthu.findAll", query="SELECT h FROM Hocthu h")
public class Hocthu implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idhocthu;
	private String noidung;
	private String video;
	private Chitietkhoahoc chitietkhoahoc;

	public Hocthu() {
	}


	@Id
	public int getIdhocthu() {
		return this.idhocthu;
	}

	public void setIdhocthu(int idhocthu) {
		this.idhocthu = idhocthu;
	}


	@Lob
	public String getNoidung() {
		return this.noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}


	@Lob
	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}


	//bi-directional many-to-one association to Chitietkhoahoc
	@ManyToOne
	@JoinColumn(name="idchitietkhoahoc")
	public Chitietkhoahoc getChitietkhoahoc() {
		return this.chitietkhoahoc;
	}

	public void setChitietkhoahoc(Chitietkhoahoc chitietkhoahoc) {
		this.chitietkhoahoc = chitietkhoahoc;
	}

}