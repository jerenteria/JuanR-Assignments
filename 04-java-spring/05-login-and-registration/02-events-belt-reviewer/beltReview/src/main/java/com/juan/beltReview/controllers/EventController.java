package com.juan.beltReview.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.beltReview.models.Event;
import com.juan.beltReview.models.User;
import com.juan.beltReview.services.EventService;
import com.juan.beltReview.services.UserService;

@Controller
@RequestMapping("/events")
public class EventController {
	@Autowired
	private UserService uService;
	@Autowired
	private EventService eService;
	
	@GetMapping("")
	public String home(Model viewModel, HttpSession session) {
		if(session.getAttribute("user__id") == null) {
			return "redirect:/";
		}
		Long userId = (Long)session.getAttribute("user__id");
		User user = this.uService.find(userId);
		List<Event> allEvents = this.eService.getAllEvents();
		viewModel.addAttribute("events", allEvents);
		viewModel.addAttribute("user", user);
		return "home.jsp";
	}
}
