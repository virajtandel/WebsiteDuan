package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitietnguphap database table.
 * 
 */
@Entity
@NamedQuery(name="Chitietnguphap.findAll", query="SELECT c FROM Chitietnguphap c")
public class Chitietnguphap implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idctnp;
	private String audioname;
	private String giaithichnp;
	private String ndnguphap;
	private String tenctnp;
	private String vidunp;
	private Nguphap nguphap;

	public Chitietnguphap() {
	}


	@Id
	public int getIdctnp() {
		return this.idctnp;
	}

	public void setIdctnp(int idctnp) {
		this.idctnp = idctnp;
	}


	@Lob
	public String getAudioname() {
		return this.audioname;
	}

	public void setAudioname(String audioname) {
		this.audioname = audioname;
	}


	@Lob
	public String getGiaithichnp() {
		return this.giaithichnp;
	}

	public void setGiaithichnp(String giaithichnp) {
		this.giaithichnp = giaithichnp;
	}


	@Lob
	public String getNdnguphap() {
		return this.ndnguphap;
	}

	public void setNdnguphap(String ndnguphap) {
		this.ndnguphap = ndnguphap;
	}


	@Lob
	public String getTenctnp() {
		return this.tenctnp;
	}

	public void setTenctnp(String tenctnp) {
		this.tenctnp = tenctnp;
	}


	@Lob
	public String getVidunp() {
		return this.vidunp;
	}

	public void setVidunp(String vidunp) {
		this.vidunp = vidunp;
	}


	//bi-directional many-to-one association to Nguphap
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idnguphap")
	public Nguphap getNguphap() {
		return this.nguphap;
	}

	public void setNguphap(Nguphap nguphap) {
		this.nguphap = nguphap;
	}

}