package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Section;

public interface ISectionService {
	
	List<Section> findAll();
	
	Section findOne(Long id);
	
	Section save(Section section);
	
	void delete(Long id);

}
