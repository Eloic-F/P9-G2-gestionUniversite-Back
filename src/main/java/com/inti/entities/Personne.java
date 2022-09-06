package com.inti.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.format.annotation.DateTimeFormat;

import com.inti.model.Adresse;

@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String email;
	private int numeroTel;
	@Embedded
	private Adresse adressePersonne;
	@Lob
	private byte[] image;
	private String username;
	private String password;

	// ASSOCIATIONS
	@ManyToOne
	@JoinColumn(name = "id_personne")
	private Classe classe;
	@ManyToOne
	@JoinColumn(name = "id_personne")
	private Universite universite;
	@OneToOne
	@JoinColumn(name = "id_compte")
	private Compte compte;
	@OneToMany(mappedBy = "personne")
	private List<Examen> examens;
	@OneToMany(mappedBy = "personne")
	private List<Evaluation> evaluations;
	@ManyToMany(fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "personne")
	private List<Cours> courses;
	@ManyToMany(fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "personne")
	private List<Question> questions;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "PROFILS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();

	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public Personne(String nom, String prenom, Date dateNaissance, String email, int numeroTel, Adresse adressePersonne,
			byte[] image, String username, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.numeroTel = numeroTel;
		this.adressePersonne = adressePersonne;
		this.image = image;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(int numeroTel) {
		this.numeroTel = numeroTel;
	}

	public Adresse getAdressePersonne() {
		return adressePersonne;
	}

	public void setAdressePersonne(Adresse adressePersonne) {
		this.adressePersonne = adressePersonne;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public List<Examen> getExamens() {
		return examens;
	}

	public void setExamens(List<Examen> examens) {
		this.examens = examens;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public List<Cours> getCourses() {
		return courses;
	}

	public void setCourses(List<Cours> courses) {
		this.courses = courses;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
