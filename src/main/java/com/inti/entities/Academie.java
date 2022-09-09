package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import com.inti.model.Adresse;

@Entity
public class Academie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAcademie;
	private String nomAcademie;
	@Embedded
	private Adresse adresseAcademie;
	@Lob
	private byte[] logo;

	@OneToMany(mappedBy = "academie")
	List<Universite> universites;

	public Academie() {
		super();
	}

	public Academie(Long idAcademie, String nomAcademie, Adresse adresseAcademie, byte[] logo,
			List<Universite> universites) {
		super();
		this.idAcademie = idAcademie;
		this.nomAcademie = nomAcademie;
		this.adresseAcademie = adresseAcademie;
		this.logo = logo;
		this.universites = universites;
	}

	public Long getIdAcademie() {
		return idAcademie;
	}

	public void setIdAcademie(Long idAcademie) {
		this.idAcademie = idAcademie;
	}

	public String getNomAcademie() {
		return nomAcademie;
	}

	public void setNomAcademie(String nomAcademie) {
		this.nomAcademie = nomAcademie;
	}

	public Adresse getAdresseAcademie() {
		return adresseAcademie;
	}

	public void setAdresseAcademie(Adresse adresseAcademie) {
		this.adresseAcademie = adresseAcademie;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public List<Universite> getUniversites() {
		return universites;
	}

	public void setUniversites(List<Universite> universites) {
		this.universites = universites;
	}

}
