package progettoSettimanale;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Prestito {
	
	@Id
    @GeneratedValue
    private int id;
    
	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente_id;	
	private Rivista elementoPrestato;
	private Date dataInizioPrestito;
	private Date dataRestituzionePrevista;
	private Date dataRestituzioneEffettiva;
	
	
	 @OneToOne
	 @JoinColumn(name = "id_lettura")
	 private Lettura lettura;
	 
	 
	
	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utente getUtente() {
		return utente_id;
	}
	public Rivista getElementoPrestato() {
		return elementoPrestato;
	}
	public Date getDataInizioPrestito() {
		return dataInizioPrestito;
	}
	public Date getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}
	public Date getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}
	public void setUtente(Utente utente) {
		this.utente_id = utente;
	}
	public void setElementoPrestato(Rivista elementoPrestato) {
		this.elementoPrestato = elementoPrestato;
	}
	public void setDataInizioPrestito(Date dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}
	public void setDataRestituzionePrevista(Date dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}
	public void setDataRestituzioneEffettiva(Date dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	
	

}
