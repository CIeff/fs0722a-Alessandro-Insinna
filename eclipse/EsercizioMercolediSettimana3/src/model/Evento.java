package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Evento")

public class Evento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="titolo",nullable=false)
	private String titolo;
	@Column(name="dataEvento",nullable=false)
	private Date dataEvento;
	@Column(name="descrizione",nullable=true)
	private String descrizione;
	@Column(name="tipoEvento",nullable=false)
	private TipoEvento tipoEvento;
	@Column(name="numeroMassimoPartecipanti")
	private int numeroMassimoPartecipanti;
	
	public Evento() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public String getTitolo() {
		return titolo;
	}
	public Date getDataEvento() {
		return dataEvento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}
	
	
}
