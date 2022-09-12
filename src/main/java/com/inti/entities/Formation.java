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
public class Formation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormation;
	private String titreFormation;
	private String gradeFormation;

	@OneToMany(mappedBy = "formation")
	@JsonIgnore
	List<Cours> courses;

	@OneToMany(mappedBy = "formation")
	@JsonIgnore
	List<Classe> classes;
	@ManyToOne
	@JoinColumn(name = "id_Section")
	private Section section;

	public Formation() {
		super();
	}

	public Formation(Long idFormation, String titreFormation, String gradeFormation, List<Cours> courses,
			List<Classe> classes) {
		super();
		this.idFormation = idFormation;
		this.titreFormation = titreFormation;
		this.gradeFormation = gradeFormation;
		this.courses = courses;
		this.classes = classes;
	}

	public void setCourses(List<Cours> courses) {
		this.courses = courses;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Long getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}

	public String getTitreFormation() {
		return titreFormation;
	}

	public void setTitreFormation(String titreFormation) {
		this.titreFormation = titreFormation;
	}

	public String getGradeFormation() {
		return gradeFormation;
	}

	public void setGradeFormation(String gradeFormation) {
		this.gradeFormation = gradeFormation;
	}

	public List<Cours> getCourses() {
		return courses;
	}

	public void setCourss(List<Cours> courses) {
		this.courses = courses;
	}

	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}
}
