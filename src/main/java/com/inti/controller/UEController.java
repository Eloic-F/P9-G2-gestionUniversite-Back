package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.UE;
import com.inti.service.interfaces.IUEService;

@RestController
@CrossOrigin
public class UEController {
	@Autowired
	IUEService ueService;

	@GetMapping("/ues")
	public List<UE> findAll() {
		return ueService.findAll();
	}

	@GetMapping("/ues/{id}")
	public UE findOne(@PathVariable("id") Long id) {
		return ueService.findOne(id);
	}

	@PostMapping("/ues")
	public UE saveUE(@RequestBody UE ue) {
		return ueService.save(ue);
	}

	@DeleteMapping("/ues/{id}")
	public void deleteUE(@PathVariable("id") Long id) {
		ueService.delete(id);
	}
}
