package com.juan.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.languages.models.Language;
import com.juan.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	// Get all languages
	public List<Language> getAllLanaguages() {
		return this.lRepo.findAll();
	}
	
	// Get one language 
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	// Create new language
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	// Delete
	public void deleteLanguage(Long id)  {
		this.lRepo.deleteById(id);
	}
	
}
