package com.juan.dojosAndNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojosAndNinjas.models.Ninja;
import com.juan.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private NinjaRepository nRepo;
	
	public NinjaService(NinjaRepository repo) {
		this.nRepo = repo;
	}
	
	// get all 
	public List<Ninja> getAllNinjas() {
		return this.nRepo.findAll();
	}
	
	// get one
	public Ninja getSingleNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
	
	// create
	public Ninja createNinja(Ninja newNinja) {
		return this.nRepo.save(newNinja);
	}
}
