package com.epicode.gestioneprenotazioni.postazione;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Long>{
	public List<Postazione> findByTipo(TipologiaPostazione tipo);
	
}
