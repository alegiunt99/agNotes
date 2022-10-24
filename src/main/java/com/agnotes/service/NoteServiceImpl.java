package com.agnotes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agnotes.entity.NoteEntity;
import com.agnotes.repository.NoteRepository;

@Service
@Transactional
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	private NoteRepository repo;
	
	@Override
	public void addNote(NoteEntity newNote) {
		
		repo.save(newNote);
	}



	@Override
	public void deleteNote(int id) {
		
		 repo.deleteById(id);
		
	}

	@Override
	public NoteEntity findNoteById(int id) {
		
		
		
		return repo.getReferenceById(id);
	}



	@Override
	public List<NoteEntity> findAllNotes() {
		
		return repo.findAll();
	}

}
