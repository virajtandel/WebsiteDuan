package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `tuvung(min)` database table.
 * 
 */
@Entity
@Table(name="`tuvung(min)`")
@NamedQuery(name="Tuvung_min_.findAll", query="SELECT t FROM Tuvung_min_ t")
public class Tuvung_min_ implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idtvmin;
	private String audioname;
	private int idbaihoc;
	private int idmina;
	private String nghiatvmin;
	private String tvjpmin;
	private String tvkanjimin;

	public Tuvung_min_() {
	}


	@Id
	public int getIdtvmin() {
		return this.idtvmin;
	}

	public void setIdtvmin(int idtvmin) {
		this.idtvmin = idtvmin;
	}


	@Lob
	public String getAudioname() {
		return this.audioname;
	}

	public void setAudioname(String audioname) {
		this.audioname = audioname;
	}


	public int getIdbaihoc() {
		return this.idbaihoc;
	}

	public void setIdbaihoc(int idbaihoc) {
		this.idbaihoc = idbaihoc;
	}


	public int getIdmina() {
		return this.idmina;
	}

	public void setIdmina(int idmina) {
		this.idmina = idmina;
	}


	@Lob
	public String getNghiatvmin() {
		return this.nghiatvmin;
	}

	public void setNghiatvmin(String nghiatvmin) {
		this.nghiatvmin = nghiatvmin;
	}


	@Lob
	public String getTvjpmin() {
		return this.tvjpmin;
	}

	public void setTvjpmin(String tvjpmin) {
		this.tvjpmin = tvjpmin;
	}


	@Lob
	public String getTvkanjimin() {
		return this.tvkanjimin;
	}

	public void setTvkanjimin(String tvkanjimin) {
		this.tvkanjimin = tvkanjimin;
	}

}