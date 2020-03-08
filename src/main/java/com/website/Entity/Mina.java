package com.website.Entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mina database table.
 * 
 */
@Entity
@NamedQuery(name="Mina.findAll", query="SELECT m FROM Mina m")
public class Mina implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idmina;
	private String audiokaiwa;
	private String audiomondai;
	private String audiotumoi;
	private String tenmina;
	private List<Nguphap> nguphaps;

	public Mina() {
	}


	@Id
	public int getIdmina() {
		return this.idmina;
	}

	public void setIdmina(int idmina) {
		this.idmina = idmina;
	}


	@Lob
	public String getAudiokaiwa() {
		return this.audiokaiwa;
	}

	public void setAudiokaiwa(String audiokaiwa) {
		this.audiokaiwa = audiokaiwa;
	}


	@Lob
	public String getAudiomondai() {
		return this.audiomondai;
	}

	public void setAudiomondai(String audiomondai) {
		this.audiomondai = audiomondai;
	}


	@Lob
	public String getAudiotumoi() {
		return this.audiotumoi;
	}

	public void setAudiotumoi(String audiotumoi) {
		this.audiotumoi = audiotumoi;
	}


	@Lob
	public String getTenmina() {
		return this.tenmina;
	}

	public void setTenmina(String tenmina) {
		this.tenmina = tenmina;
	}


	//bi-directional many-to-one association to Nguphap
	@OneToMany(mappedBy="mina")
	public List<Nguphap> getNguphaps() {
		return this.nguphaps;
	}

	public void setNguphaps(List<Nguphap> nguphaps) {
		this.nguphaps = nguphaps;
	}

	public Nguphap addNguphap(Nguphap nguphap) {
		getNguphaps().add(nguphap);
		nguphap.setMina(this);

		return nguphap;
	}

	public Nguphap removeNguphap(Nguphap nguphap) {
		getNguphaps().remove(nguphap);
		nguphap.setMina(null);

		return nguphap;
	}

}