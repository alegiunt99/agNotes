package com.agnotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.agnotes.entity.NoteEntity;
import com.agnotes.service.NoteService;

@Controller
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@GetMapping("/home")
	public String home(Model model){
		
		model.addAttribute("notes", service.findAllNotes());
		
		return "home";
		
	}
	
	@PostMapping("/save")
	public String salva(@ModelAttribute("newNote") NoteEntity newNote){
		
		service.addNote(newNote);
		
		return "redirect:/agnote/home";
		
	}
	
	@GetMapping("/add_note")
	public String addNote(Model model){
		
		model.addAttribute("newNote", new NoteEntity());
		
		return "addnote";
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteNote(@PathVariable int id){
		
		service.deleteNote(id);
		
		return "redirect:/agnote/home";
		
	}
	
	@GetMapping("/edit/{id}")
	public String editNote(Model model, @PathVariable int id){
		
		model.addAttribute("newNote", service.findNoteById(id));
		
		return "edit";
		
	}
	
	@GetMapping("/show/{id}")
	public String showNote(Model model, @PathVariable int id){
		
		model.addAttribute("newNote", service.findNoteById(id));
		
		return "show";
		
	}
	
	
	
	
	
}
