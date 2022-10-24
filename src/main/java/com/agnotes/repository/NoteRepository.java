package com.agnotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agnotes.entity.NoteEntity;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Integer>{
	
	
	
}
