package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bangchucai database table.
 * 
 */
@Entity
@NamedQuery(name="Bangchucai.findAll", query="SELECT b FROM Bangchucai b")
public class Bangchucai implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idbang;
	private String chucai;
	private String linkamthanh;
	private String linkhinhanh;
	private String loaibang;
	private String romajji;
	private String vidu1;
	private String vidu2;
	private String vidu3;

	public Bangchucai() {
	}


	@Id
	public int getIdbang() {
		return this.idbang;
	}

	public void setIdbang(int idbang) {
		this.idbang = idbang;
	}


	@Lob
	public String getChucai() {
		return this.chucai;
	}

	public void setChucai(String chucai) {
		this.chucai = chucai;
	}


	@Lob
	public String getLinkamthanh() {
		return this.linkamthanh;
	}

	public void setLinkamthanh(String linkamthanh) {
		this.linkamthanh = linkamthanh;
	}


	@Lob
	public String getLinkhinhanh() {
		return this.linkhinhanh;
	}

	public void setLinkhinhanh(String linkhinhanh) {
		this.linkhinhanh = linkhinhanh;
	}


	@Lob
	public String getLoaibang() {
		return this.loaibang;
	}

	public void setLoaibang(String loaibang) {
		this.loaibang = loaibang;
	}


	@Lob
	public String getRomajji() {
		return this.romajji;
	}

	public void setRomajji(String romajji) {
		this.romajji = romajji;
	}


	@Lob
	public String getVidu1() {
		return this.vidu1;
	}

	public void setVidu1(String vidu1) {
		this.vidu1 = vidu1;
	}


	@Lob
	public String getVidu2() {
		return this.vidu2;
	}

	public void setVidu2(String vidu2) {
		this.vidu2 = vidu2;
	}


	@Lob
	public String getVidu3() {
		return this.vidu3;
	}

	public void setVidu3(String vidu3) {
		this.vidu3 = vidu3;
	}

}