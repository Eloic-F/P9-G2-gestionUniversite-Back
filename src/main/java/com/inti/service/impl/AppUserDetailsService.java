package com.inti.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.inti.entities.Personne;
import com.inti.entities.Role;
import com.inti.model.PersonneDetail;
import com.inti.service.interfaces.IPersonneService;

@Service
public class AppUserDetailsService implements UserDetailsService {
	@Autowired
	IPersonneService personneService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Personne personne = personneService.findByUsername(username);
		Set<Role> roles = personne.getRoles();
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getLibelleRole())); // les roles dans la variable
																				// authorities :
			// admin,user
		}
		PersonneDetail personneDetail = new PersonneDetail();
		personneDetail.setPersonne(personne); // l'personne
		personneDetail.setAuthorities(authorities); // les profils
		return personneDetail;
	}

}
