package com.inti.entities;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Cours implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCours;
	private String libelleCours;
	private float dureeCours;
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	@Temporal(TemporalType.DATE)
	private Date dateCours;
	@Lob
	private byte[] image;

	// ASSOCIATIONS
	@ManyToOne
	@JoinColumn(name = "id_ue")
	private UE ue;
	@ManyToOne
	@JoinColumn(name = "id_formation")
	private Formation formation;
	@ManyToOne
	@JoinColumn(name = "id_personne")
	private Personne personne;
	@OneToMany(mappedBy = "cours")
	@JsonIgnore
	private List<Evaluation> evaluations;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "COURS_QUESTIONS", joinColumns = @JoinColumn(name = "id_cours", referencedColumnName = "idCours"), inverseJoinColumns = @JoinColumn(name = "id_question", referencedColumnName = "idQuestion"))
	private Set<Question> questions = new HashSet<>();

	public Cours() {
		// TODO Auto-generated constructor stub
	}

	public Cours(String libelleCours, float dureeCours, byte[] image) {
		this.libelleCours = libelleCours;
		this.dureeCours = dureeCours;
		this.image = image;
	}

	public Date getDateCours() {
		return dateCours;
	}

	public void setDateCours(Date dateCours) {
		this.dateCours = dateCours;
	}

	public Long getIdCours() {
		return idCours;
	}

	public void setIdCours(Long idCours) {
		this.idCours = idCours;
	}

	public String getLibelleCours() {
		return libelleCours;
	}

	public void setLibelleCours(String libelleCours) {
		this.libelleCours = libelleCours;
	}

	public float getDureeCours() {
		return dureeCours;
	}

	public void setDureeCours(float dureeCours) {
		this.dureeCours = dureeCours;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public UE getUe() {
		return ue;
	}

	public void setUe(UE ue) {
		this.ue = ue;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
