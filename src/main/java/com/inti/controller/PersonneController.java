package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Cours;
import com.inti.entities.Examen;
import com.inti.entities.Personne;
import com.inti.entities.Question;
import com.inti.service.interfaces.IPersonneService;

@RestController
@CrossOrigin
public class PersonneController {
	@Autowired
	IPersonneService personneService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@GetMapping("/personnes")
	public List<Personne> findAll() {
		return personneService.findAll();
	}

	@GetMapping("/personnes/{id}")
	public Personne findOne(@PathVariable("id") Long id) {
		return personneService.findOne(id);
	}

	/*
	 * @PostMapping("/personnes") public Personne savePersonne(@RequestBody Personne
	 * personne) { return personneService.save(personne); }
	 */
	@PostMapping("personnes")
	public Personne savePersonne(@RequestBody Personne user) {
		Personne currentUser = new Personne(user.getNom(), user.getPrenom(), user.getDateNaissance(), user.getEmail(),
				user.getNumeroTel(), user.getUsername(), bCryptPasswordEncoder.encode(user.getPassword()),
				user.getCompte(), user.getRoles());
		return personneService.save(currentUser);
	}

	@DeleteMapping("/personnes/{id}")
	public void deletePersonne(@PathVariable("id") Long id) {
		personneService.delete(id);
	}

	/*
	 * @PutMapping("/personnes/{id}") public Personne
	 * updatePersonneWithPut(@PathVariable("id") Long id, @RequestBody Personne
	 * personne) { Personne currentPersonne = personneService.findOne(id);
	 * currentPersonne.setPrenom(personne.getPrenom());
	 * currentPersonne.setNom(personne.getNom()); return
	 * personneService.save(currentPersonne); }
	 */

	@GetMapping("/personnes/questions/{id}")
	public List<Question> findAllQuestion(@PathVariable("id") Long id) {
		return personneService.findAllQuestion(id);
	}

	@GetMapping("/personnes/examens/{id}")
	public List<Examen> findAllExamen(@PathVariable("id") Long id) {
		return personneService.findAllExamen(id);
	}

	@GetMapping("/personnes/cours/{id}")
	public List<Cours> findAllCours(@PathVariable("id") Long id) {
		return personneService.findAllCours(id);
	}

	@GetMapping("/personnes/secu/{username}")
	public Personne findByUsername(@PathVariable("username") String username) {
		return personneService.findByUsername(username);
	}

	@PutMapping("/personnes/{id}") // http://localhost:9090/personnes/2
	public Personne updatePersonneWithPut(@PathVariable("id") Long id /* id = 2 */, @RequestBody Personne personne) { //
		Personne currentUser = personneService.findOne(id); // nom = ayari, prenom = oussama, username=ouss, //
															// password=ouss
		System.out.println(currentUser.toString());
		currentUser.setNom(personne.getNom()); // currentUser.setNomPersonne("Jean")
		currentUser.setPrenom(personne.getPrenom()); // // // currentUser.setPrenomPersonne("Jean")
		currentUser.setDateNaissance(personne.getDateNaissance());
		currentUser.setEmail(personne.getEmail());
		currentUser.setNumeroTel(personne.getNumeroTel());
		currentUser.setUsername(personne.getUsername());
		currentUser.setPassword(personne.getPassword());
		return personneService.save(currentUser);
	}

}
