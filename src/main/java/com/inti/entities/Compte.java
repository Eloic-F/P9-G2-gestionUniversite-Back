package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Compte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompte;
	private Long numeroCompte;
	private String statut;
	@OneToOne
	@JoinColumn(name="id_personne")
	private Personne personne;
	
	public Compte() {
		
	}

	public Compte(Long idCompte, Long numeroCompte, String statut, Personne personne) {

		this.idCompte = idCompte;
		this.numeroCompte = numeroCompte;
		this.statut = statut;
		this.personne = personne;
	}

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public Long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(Long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
	
	

}
