package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quiz_hirabcc database table.
 * 
 */
@Entity
@Table(name="quiz_hirabcc")
@NamedQuery(name="QuizHirabcc.findAll", query="SELECT q FROM QuizHirabcc q")
public class QuizHirabcc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String a;
	private String audio;
	private String b;
	private String c;
	private String cauhoi;
	private String d;
	private String traloi;

	public QuizHirabcc() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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
	public String getTraloi() {
		return this.traloi;
	}

	public void setTraloi(String traloi) {
		this.traloi = traloi;
	}

}