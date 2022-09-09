package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.inti.model.Adresse;

@Entity
public class Universite implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUniversite;
	private String nomUniversite;
	@Embedded
	private Adresse adresseUniversite;

	@ManyToOne
	@JoinColumn(name = "idAcademie")
	private Academie academie;

	@OneToMany(mappedBy = "universite")
	List<CentreDeRecherche> centreDeRecherches;

	@OneToMany(mappedBy = "universite")
	List<Personne> personnes;

	@OneToMany(mappedBy = "universite")
	List<Section> sections;

	public Universite() {
		super();
	}

	public Universite(Long idUniversite, String nomUniversite, Adresse adresseUniversite, Academie academie,
			List<CentreDeRecherche> centreDeRecherches, List<Personne> personnes, List<Section> sections) {
		super();
		this.idUniversite = idUniversite;
		this.nomUniversite = nomUniversite;
		this.adresseUniversite = adresseUniversite;
		this.academie = academie;
		this.centreDeRecherches = centreDeRecherches;
		this.personnes = personnes;
		this.sections = sections;
	}

	public Long getIdUniversite() {
		return idUniversite;
	}

	public void setIdUniversite(Long idUniversite) {
		this.idUniversite = idUniversite;
	}

	public String getNomUniversite() {
		return nomUniversite;
	}

	public void setNomUniversite(String nomUniversite) {
		this.nomUniversite = nomUniversite;
	}

	public Adresse getAdresseUniversite() {
		return adresseUniversite;
	}

	public void setAdresseUniversite(Adresse adresseUniversite) {
		this.adresseUniversite = adresseUniversite;
	}

	public Academie getAcademie() {
		return academie;
	}

	public void setAcademie(Academie academie) {
		this.academie = academie;
	}

	public List<CentreDeRecherche> getCentreDeRecherches() {
		return centreDeRecherches;
	}

	public void setCentreDeRecherches(List<CentreDeRecherche> centreDeRecherches) {
		this.centreDeRecherches = centreDeRecherches;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

}
