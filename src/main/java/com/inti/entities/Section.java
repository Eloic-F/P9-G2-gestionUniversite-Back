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

}
