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
import com.inti.entities.Section;
import com.inti.service.interfaces.ISectionService;

@RestController
@CrossOrigin
public class SectionController {

	    @Autowired
	    ISectionService sectionService;

	    @GetMapping("/sections")
	    public List<Section> findAll() {
	        return sectionService.findAll();
	    }

	    @GetMapping("/sections/{id}")
	    public Section findOne(@PathVariable("id") Long id) {
	        return sectionService.findOne(id);
	    }

	    @PostMapping("/sections")
	    public Section saveSection(@RequestBody Section section) {
	        return sectionService.save(section);
	    }

	    @DeleteMapping("/sections/{id}")
	    public void deleteSection(@PathVariable("id") Long id) {
	        sectionService.delete(id);
	    }

}
