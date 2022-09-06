package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UE implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUE;
	private float creditEcts;
	@OneToMany(mappedBy = "ue")
	private List<Cours> courses;

	public UE() {
		// TODO Auto-generated constructor stub
	}

	public UE(float creditEcts) {
		this.creditEcts = creditEcts;
	}

	public Long getIdUE() {
		return idUE;
	}

	public void setIdUE(Long idUE) {
		this.idUE = idUE;
	}

	public float getCreditEcts() {
		return creditEcts;
	}

	public void setCreditEcts(float creditEcts) {
		this.creditEcts = creditEcts;
	}

	public List<Cours> getCourses() {
		return courses;
	}

	public void setCourses(List<Cours> courses) {
		this.courses = courses;
	}

}
