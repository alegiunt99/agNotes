package com.agnotes.entity;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class NoteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	private String titolo;
	private String contenuto;
	private Date dataInserimento = new Date();
	public NoteEntity() {
		super();
	}
	public NoteEntity(int id, String titolo, String contenuto) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.contenuto = contenuto;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getContenuto() {
		return contenuto;
	}
	public void setContenuto(String contenuto) {
		this.contenuto = contenuto;
	}
	public Date getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteEntity other = (NoteEntity) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "NoteEntity [id=" + id + ", titolo=" + titolo + ", contenuto=" + contenuto + ", dataInserimento="
				+ dataInserimento + "]";
	}
	
	
	
}
