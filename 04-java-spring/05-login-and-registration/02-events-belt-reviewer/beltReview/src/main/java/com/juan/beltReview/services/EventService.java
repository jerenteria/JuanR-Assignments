package com.juan.beltReview.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.beltReview.models.Event;
import com.juan.beltReview.repositories.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eRepo;
	
	// create event
	public Event createEvent(Event event) {
		return this.eRepo.save(event);
	}
	
	// get one event
	public Event getSingleEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	// get all events
	public List<Event> getAllEvents() {
		return this.eRepo.findAll();
	}
}
