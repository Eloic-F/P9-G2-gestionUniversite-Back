package com.inti.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse implements Serializable {
	private String rue;
	private Long codePostal;
	private String ville;

	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	public Adresse(String rue, Long codePostal, String ville) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public Long getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
