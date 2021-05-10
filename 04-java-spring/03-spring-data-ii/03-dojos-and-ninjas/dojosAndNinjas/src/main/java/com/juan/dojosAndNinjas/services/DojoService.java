package com.juan.dojosAndNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojosAndNinjas.models.Dojo;
import com.juan.dojosAndNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dRepo;
	
	public DojoService(DojoRepository repo) {
		this.dRepo = repo;
	}
	
	// Get All dojos
	public List<Dojo> getAllDojos() {
		return this.dRepo.findAll();
	}
	
	// get one dojo
	public Dojo getSingleDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	// create dojo
	public Dojo createDojo(Dojo newDojo) {
		return this.dRepo.save(newDojo);
	}
	
}
