package com.agnotes.service;

import java.util.List;

import com.agnotes.entity.NoteEntity;

public interface NoteService {	
	
	void addNote(NoteEntity newNote);

	NoteEntity findNoteById(int id);
	
	void deleteNote(int id);
	
	List<NoteEntity> findAllNotes();
	
}
