package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `tuvung(max)` database table.
 * 
 */
@Entity
@Table(name="`tuvung(max)`")
@NamedQuery(name="Tuvung_max_.findAll", query="SELECT t FROM Tuvung_max_ t")
public class Tuvung_max_ implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idtvmax;
	private String audioname;
	private String hinhanh;
	private int idchude;
	private String nghiatvmax;
	private String tvjpmax;
	private String tvkanjimax;

	public Tuvung_max_() {
	}


	@Id
	public int getIdtvmax() {
		return this.idtvmax;
	}

	public void setIdtvmax(int idtvmax) {
		this.idtvmax = idtvmax;
	}


	@Lob
	public String getAudioname() {
		return this.audioname;
	}

	public void setAudioname(String audioname) {
		this.audioname = audioname;
	}


	@Lob
	public String getHinhanh() {
		return this.hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}


	public int getIdchude() {
		return this.idchude;
	}

	public void setIdchude(int idchude) {
		this.idchude = idchude;
	}


	@Lob
	public String getNghiatvmax() {
		return this.nghiatvmax;
	}

	public void setNghiatvmax(String nghiatvmax) {
		this.nghiatvmax = nghiatvmax;
	}


	@Lob
	public String getTvjpmax() {
		return this.tvjpmax;
	}

	public void setTvjpmax(String tvjpmax) {
		this.tvjpmax = tvjpmax;
	}


	@Lob
	public String getTvkanjimax() {
		return this.tvkanjimax;
	}

	public void setTvkanjimax(String tvkanjimax) {
		this.tvkanjimax = tvkanjimax;
	}

}