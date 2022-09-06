package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.UE;

public interface IUEService {

	List<UE> findAll();

	UE findOne(Long id);

	UE save(UE ue);

	void delete(Long id);

}
