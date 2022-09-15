package com.inti.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Personne;
import com.inti.service.interfaces.IPersonneService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	IPersonneService personneService;

	@CrossOrigin
	@RequestMapping(value = "/user")
	public Personne login(Principal principal) {
		return personneService.findByUsername(principal.getName());
	}

}
