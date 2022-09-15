package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Examen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExamen;
	private String type;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateExamen;
	private Float dureeExamen;
	private Float note;
	private String correction;

	@ManyToOne
	@JoinColumn(name="id_personne")
	private Personne personne;

  @ManyToOne
  @JoinColumn(name="id_Cours")
  private Cours cours;

	public Examen() {

	}

  public Cours getCours() {
    return cours;
  }

  public void setCours(Cours cours) {
    this.cours = cours;
  }

  public Examen(Long idExamen, String type, Date dateExamen, Float dureeExamen, Float note, String correction,
                Personne personne) {

		this.idExamen = idExamen;
		this.type = type;
		this.dateExamen = dateExamen;
		this.dureeExamen = dureeExamen;
		this.note = note;
		this.correction = correction;
		this.personne = personne;
	}

	public Long getIdExamen() {
		return idExamen;
	}

	public void setIdExamen(Long idExamen) {
		this.idExamen = idExamen;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateExamen() {
		return dateExamen;
	}

	public void setDateExamen(Date dateExamen) {
		this.dateExamen = dateExamen;
	}

	public Float getDureeExamen() {
		return dureeExamen;
	}

	public void setDureeExamen(Float dureeExamen) {
		this.dureeExamen = dureeExamen;
	}

	public Float getNote() {
		return note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

	public String getCorrection() {
		return correction;
	}

	public void setCorrection(String correction) {
		this.correction = correction;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

}
