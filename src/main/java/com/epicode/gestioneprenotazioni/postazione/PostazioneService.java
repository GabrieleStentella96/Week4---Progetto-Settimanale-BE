package com.epicode.gestioneprenotazioni.postazione;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PostazioneService {
	@Autowired
	private PostazioneRepository repo;
	
	public void create(Postazione postazione) {
		repo.save(postazione);
		
	}
	public Postazione read(Long id) {
		return repo.findById(id).get();
	}
	
	public void update(Postazione postazione) {
		repo.save(postazione);
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public String findByTipo(TipologiaPostazione tipo) {
		List<Postazione> postazioni= new ArrayList<>(); 
		List<Postazione> postazioniTrovate= new ArrayList<>(); 
		
		repo.findAll().forEach(element->postazioni.add(element));
		postazioni.stream().filter(element->element.getTipologia() == tipo).forEach(element->postazioniTrovate.add(element));
		String x = "";	
		for (Postazione postazione : postazioniTrovate) {
			x+=postazione;
		}
		return x;
	}
	
}
