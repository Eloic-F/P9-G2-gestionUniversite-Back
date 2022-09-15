package com.inti.entities;

import java.io.Serializable;
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

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.model.Adresse;

@Entity
public class Personne implements Serializable {
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
	@JoinColumn(name = "id_classe")
	private Classe classe;
	@ManyToOne
	@JoinColumn(name = "id_universitée")
	private Universite universite;
	@OneToOne
	@JoinColumn(name = "id_compte")
	private Compte compte;
	@OneToMany(mappedBy = "personne")
	@JsonIgnore
	private List<Examen> examens;
	@OneToMany(mappedBy = "personne")
	@JsonIgnore
	private List<Evaluation> evaluations;

	@OneToMany(mappedBy = "personne")
	@JsonIgnore
	private List<Cours> courses;

	@OneToMany(mappedBy = "personne")
	@JsonIgnore
	private List<Question> questions;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "PROFILS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();

	public Personne() {
	}

	public Personne(String nom, String prenom, Date dateNaissance, String email, int numeroTel, Adresse adressePersonne,
			byte[] image, String username, String password) {
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

	public Personne(String nom, String prenom, Date dateNaissance, String email, int numeroTel, String username,
			String password, Compte compte, Set<Role> roles) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.numeroTel = numeroTel;
		this.username = username;
		this.password = password;
		this.compte = compte;
		this.roles = roles;
	}

	public Personne(Long id, String nom, String prenom, Date dateNaissance, String email, int numeroTel,
			Adresse adressePersonne, byte[] image, String username, String password, Classe classe,
			Universite universite, Compte compte, List<Examen> examens, List<Evaluation> evaluations,
			List<Cours> courses, List<Question> questions, Set<Role> roles) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.numeroTel = numeroTel;
		this.adressePersonne = adressePersonne;
		this.image = image;
		this.username = username;
		this.password = password;
		this.classe = classe;
		this.universite = universite;
		this.compte = compte;
		this.examens = examens;
		this.evaluations = evaluations;
		this.courses = courses;
		this.questions = questions;
		this.roles = roles;
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

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, String username, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}
}
