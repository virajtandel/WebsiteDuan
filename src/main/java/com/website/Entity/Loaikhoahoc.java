package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the loaikhoahoc database table.
 * 
 */
@Entity
@NamedQuery(name="Loaikhoahoc.findAll", query="SELECT l FROM Loaikhoahoc l")
public class Loaikhoahoc implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idloaikh;
	private String ghichu;
	private String tenloaikh;

	public Loaikhoahoc() {
	}


	@Id
	public int getIdloaikh() {
		return this.idloaikh;
	}

	public void setIdloaikh(int idloaikh) {
		this.idloaikh = idloaikh;
	}


	@Lob
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}


	@Lob
	public String getTenloaikh() {
		return this.tenloaikh;
	}

	public void setTenloaikh(String tenloaikh) {
		this.tenloaikh = tenloaikh;
	}

}