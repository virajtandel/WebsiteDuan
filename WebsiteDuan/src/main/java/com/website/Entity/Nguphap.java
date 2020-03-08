package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the nguphap database table.
 * 
 */
@Entity
@NamedQuery(name="Nguphap.findAll", query="SELECT n FROM Nguphap n")
public class Nguphap implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idnguphap;
	private String noidungnp;
	private String tennguphap;
	private List<Chitietnguphap> chitietnguphaps;
	private Baihoc baihoc;
	private Mina mina;

	public Nguphap() {
	}


	@Id
	public int getIdnguphap() {
		return this.idnguphap;
	}

	public void setIdnguphap(int idnguphap) {
		this.idnguphap = idnguphap;
	}


	@Lob
	public String getNoidungnp() {
		return this.noidungnp;
	}

	public void setNoidungnp(String noidungnp) {
		this.noidungnp = noidungnp;
	}


	public String getTennguphap() {
		return this.tennguphap;
	}

	public void setTennguphap(String tennguphap) {
		this.tennguphap = tennguphap;
	}


	//bi-directional many-to-one association to Chitietnguphap
	@OneToMany(mappedBy="nguphap")
	public List<Chitietnguphap> getChitietnguphaps() {
		return this.chitietnguphaps;
	}

	public void setChitietnguphaps(List<Chitietnguphap> chitietnguphaps) {
		this.chitietnguphaps = chitietnguphaps;
	}

	public Chitietnguphap addChitietnguphap(Chitietnguphap chitietnguphap) {
		getChitietnguphaps().add(chitietnguphap);
		chitietnguphap.setNguphap(this);

		return chitietnguphap;
	}

	public Chitietnguphap removeChitietnguphap(Chitietnguphap chitietnguphap) {
		getChitietnguphaps().remove(chitietnguphap);
		chitietnguphap.setNguphap(null);

		return chitietnguphap;
	}


	//bi-directional many-to-one association to Baihoc
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idbaihoc")
	public Baihoc getBaihoc() {
		return this.baihoc;
	}

	public void setBaihoc(Baihoc baihoc) {
		this.baihoc = baihoc;
	}


	//bi-directional many-to-one association to Mina
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idmina")
	public Mina getMina() {
		return this.mina;
	}

	public void setMina(Mina mina) {
		this.mina = mina;
	}

}