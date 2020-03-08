package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the giaotrinh database table.
 * 
 */
@Entity
@NamedQuery(name="Giaotrinh.findAll", query="SELECT g FROM Giaotrinh g")
public class Giaotrinh implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idgiaotrinh;
	private String ghichu;
	private String tengiaotrinh;
	private Trinhdo trinhdo;

	public Giaotrinh() {
	}


	@Id
	public int getIdgiaotrinh() {
		return this.idgiaotrinh;
	}

	public void setIdgiaotrinh(int idgiaotrinh) {
		this.idgiaotrinh = idgiaotrinh;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTengiaotrinh() {
		return this.tengiaotrinh;
	}

	public void setTengiaotrinh(String tengiaotrinh) {
		this.tengiaotrinh = tengiaotrinh;
	}


	//bi-directional many-to-one association to Trinhdo
	@ManyToOne
	@JoinColumn(name="idtrinhdo")
	public Trinhdo getTrinhdo() {
		return this.trinhdo;
	}

	public void setTrinhdo(Trinhdo trinhdo) {
		this.trinhdo = trinhdo;
	}

}