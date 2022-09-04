package com.epicode.gestioneprenotazioni.postazione;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



import com.epicode.gestioneprenotazioni.edificio.Edificio;
import com.epicode.gestioneprenotazioni.prenotazione.Prenotazione;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Postazione {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descrizione;
	private TipologiaPostazione tipologia;
	private int occupanti;
	
	@ManyToOne
	private Edificio edificio;
	@OneToMany
	private List<Prenotazione> prenotazioni = new ArrayList<>();
	public Postazione(String descrizione, TipologiaPostazione tipologia, int occupanti, Edificio edificio,
			List<Prenotazione> prenotazioni) {
		super();
		this.descrizione = descrizione;
		this.tipologia = tipologia;
		this.occupanti = occupanti;
		this.edificio = edificio;
		this.prenotazioni = prenotazioni;
	}
	

}
