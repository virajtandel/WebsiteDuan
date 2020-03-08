package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quizhocthu database table.
 * 
 */
@Entity
@NamedQuery(name="Quizhocthu.findAll", query="SELECT q FROM Quizhocthu q")
public class Quizhocthu implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idquizht;
	private String a;
	private String audio;
	private String b;
	private String c;
	private String cauhoi;
	private String d;
	private String dapan;
	private int idhocthu;

	public Quizhocthu() {
	}


	@Id
	public int getIdquizht() {
		return this.idquizht;
	}

	public void setIdquizht(int idquizht) {
		this.idquizht = idquizht;
	}


	@Lob
	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
	}


	@Lob
	public String getAudio() {
		return this.audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}


	@Lob
	public String getB() {
		return this.b;
	}

	public void setB(String b) {
		this.b = b;
	}


	@Lob
	public String getC() {
		return this.c;
	}

	public void setC(String c) {
		this.c = c;
	}


	@Lob
	public String getCauhoi() {
		return this.cauhoi;
	}

	public void setCauhoi(String cauhoi) {
		this.cauhoi = cauhoi;
	}


	@Lob
	public String getD() {
		return this.d;
	}

	public void setD(String d) {
		this.d = d;
	}


	@Lob
	public String getDapan() {
		return this.dapan;
	}

	public void setDapan(String dapan) {
		this.dapan = dapan;
	}


	public int getIdhocthu() {
		return this.idhocthu;
	}

	public void setIdhocthu(int idhocthu) {
		this.idhocthu = idhocthu;
	}

}