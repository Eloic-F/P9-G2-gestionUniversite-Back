package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Section implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idSection;
	private String nomSection;
	
	@ManyToOne
	@JoinColumn(name="id_Universite")
	private Universite universite;
	
	@OneToMany(mappedBy = "section")
	@JsonIgnore
	List<Formation> formations;

	public Section() {
		super();
	}

	public Section(Long idSection, String nomSection, Universite universite, List<Formation> formations) {
		super();
		this.idSection = idSection;
		this.nomSection = nomSection;
		this.universite = universite;
		this.formations = formations;
	}

	public Long getIdSection() {
		return idSection;
	}

	public void setIdSection(Long idSection) {
		this.idSection = idSection;
	}

	public String getNomSection() {
		return nomSection;
	}

	public void setNomSection(String nomSection) {
		this.nomSection = nomSection;
	}

	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

}
