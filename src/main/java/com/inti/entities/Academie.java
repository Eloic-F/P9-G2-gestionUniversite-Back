package com.inti.entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.inti.model.Adresse;

@Entity
public class Academie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAcademie;
	private String nomAcademie;
	private Adresse adresseAcademie;
	private byte[] logo;
	
	@OneToMany(mappedBy = "Academie")
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

	@Override
	public String toString() {
		return "Academie [idAcademie=" + idAcademie + ", nomAcademie=" + nomAcademie + ", adresseAcademie="
				+ adresseAcademie + ", logo=" + Arrays.toString(logo) + ", universites=" + universites + "]";
	}

	
	

	

}
