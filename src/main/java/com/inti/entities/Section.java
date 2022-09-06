package com.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Section {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idSection;
	private String nomSection;
	
	@ManyToOne
	@JoinColumn(name="idUniversite")
	private Universite universite;
	
	@OneToMany(mappedBy = "Section")
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

	@Override
	public String toString() {
		return "Section [idSection=" + idSection + ", nomSection=" + nomSection + ", universite=" + universite
				+ ", formations=" + formations + "]";
	}
	
	

}