package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loaichude database table.
 * 
 */
@Entity
@NamedQuery(name="Loaichude.findAll", query="SELECT l FROM Loaichude l")
public class Loaichude implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idloaichude;
	private String tenloaichude;
	private List<Chude> chudes;

	public Loaichude() {
	}


	@Id
	public int getIdloaichude() {
		return this.idloaichude;
	}

	public void setIdloaichude(int idloaichude) {
		this.idloaichude = idloaichude;
	}


	@Lob
	public String getTenloaichude() {
		return this.tenloaichude;
	}

	public void setTenloaichude(String tenloaichude) {
		this.tenloaichude = tenloaichude;
	}


	//bi-directional many-to-one association to Chude
	@OneToMany(mappedBy="loaichude")
	public List<Chude> getChudes() {
		return this.chudes;
	}

	public void setChudes(List<Chude> chudes) {
		this.chudes = chudes;
	}

	public Chude addChude(Chude chude) {
		getChudes().add(chude);
		chude.setLoaichude(this);

		return chude;
	}

	public Chude removeChude(Chude chude) {
		getChudes().remove(chude);
		chude.setLoaichude(null);

		return chude;
	}

}