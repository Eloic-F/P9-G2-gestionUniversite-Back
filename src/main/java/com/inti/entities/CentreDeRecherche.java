package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.inti.model.Adresse;

@Entity
public class CentreDeRecherche implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCentreDeRecherche;
	private String nomCentreDeRecherche;
	@Embedded
	private Adresse adresseCentreDeRecherche;
	@Lob
	private byte[] logo;

	@ManyToOne
	@JoinColumn(name = "id_Universite")
	private Universite universite;

	public CentreDeRecherche() {
		super();
	}

	public CentreDeRecherche(Long idcentreDeRecherche, String nomCentreDeRecherche, Adresse adresseCentreDeRecherche,
			byte[] logo, Universite universite) {
		super();
		idCentreDeRecherche = idcentreDeRecherche;
		this.nomCentreDeRecherche = nomCentreDeRecherche;
		this.adresseCentreDeRecherche = adresseCentreDeRecherche;
		this.logo = logo;
		this.universite = universite;
	}

	public Long getCentreDeRecherche() {
		return idCentreDeRecherche;
	}

	public void setCentreDeRecherche(Long centreDeRecherche) {
		idCentreDeRecherche = centreDeRecherche;
	}

	public String getNomCentreDeRecherche() {
		return nomCentreDeRecherche;
	}

	public void setNomCentreDeRecherche(String nomCentreDeRecherche) {
		this.nomCentreDeRecherche = nomCentreDeRecherche;
	}

	public Adresse getAdresseCentreDeRecherche() {
		return adresseCentreDeRecherche;
	}

	public void setAdresseCentreDeRecherche(Adresse adresseCentreDeRecherche) {
		this.adresseCentreDeRecherche = adresseCentreDeRecherche;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}

	@Override
	public String toString() {
		return "CentreDeRecherche [CentreDeRecherche=" + idCentreDeRecherche + ", nomCentreDeRecherche="
				+ nomCentreDeRecherche + ", adresseCentreDeRecherche=" + adresseCentreDeRecherche + ", logo="
				+ Arrays.toString(logo) + ", universite=" + universite + "]";
	}

}
