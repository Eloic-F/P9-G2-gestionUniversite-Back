package com.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFormation;
	private String titreFormation;
	private String gradeFormation;
	
	@OneToMany(mappedBy = "Formation")
	List<Cours> courss;
	
	@OneToMany(mappedBy = "Formation")
	List<Classe> classes;

	public Formation() {
		super();
	}

	public Formation(Long idFormation, String titreFormation, String gradeFormation, List<Cours> courss,
			List<Classe> classes) {
		super();
		this.idFormation = idFormation;
		this.titreFormation = titreFormation;
		this.gradeFormation = gradeFormation;
		this.courss = courss;
		this.classes = classes;
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

	public List<Cours> getCourss() {
		return courss;
	}

	public void setCourss(List<Cours> courss) {
		this.courss = courss;
	}

	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Formation [idFormation=" + idFormation + ", titreFormation=" + titreFormation + ", gradeFormation="
				+ gradeFormation + ", courss=" + courss + ", classes=" + classes + "]";
	}

	
	
	

}
