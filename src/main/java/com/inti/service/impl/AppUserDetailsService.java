package com.inti.service.impl;

import com.inti.entities.Personne;
import com.inti.entities.Role;
import com.inti.model.PersonneDetail;
import com.inti.service.interfaces.IPersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class AppUserDetailsService implements UserDetailsService {
	@Autowired
	IPersonneService personneService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Personne personne=personneService.findByUsername(username);
		Set<Role> roles=personne.getRoles();
		Set<GrantedAuthority> authorities=new HashSet<GrantedAuthority>();
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getLibelleRole()));
		}
		PersonneDetail personneDetail= new PersonneDetail();
		personneDetail.setPersonne(personne);  // l'utilisateur
		personneDetail.setAuthorities(authorities); // les profils
		return personneDetail;
	}

}