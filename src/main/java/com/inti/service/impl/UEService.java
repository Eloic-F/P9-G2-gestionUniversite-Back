package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.UE;
import com.inti.repositories.UERepository;
import com.inti.service.interfaces.IUEService;

@Service
public class UEService implements IUEService {

	@Autowired
	UERepository ueRepository;

	@Override
	public List<UE> findAll() {
		return ueRepository.findAll();
	}

	@Override
	public UE findOne(Long id) {
		return ueRepository.findById(id).get();
	}

	@Override
	public UE save(UE ue) {
		return ueRepository.save(ue);
	}

	@Override
	public void delete(Long id) {
		ueRepository.deleteById(id);
	}
}
