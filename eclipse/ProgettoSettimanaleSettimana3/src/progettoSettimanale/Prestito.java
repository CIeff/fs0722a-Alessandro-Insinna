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
	private String elementoPrestato;
	private Date dataInizioPrestito;
	private Date dataRestituzionePrevista;
	private Date dataRestituzioneEffettiva;
	
	
	 @OneToOne
	 @JoinColumn(name = "id_lettura")
	 private Lettura lettura;
	 
	 
	
	public Prestito(Utente utente_id, String elementoPrestato, Date dataInizioPrestito,
			Date dataRestituzionePrevista, Date dataRestituzioneEffettiva, Lettura lettura) {
		super();
		this.utente_id = utente_id;
		this.elementoPrestato = elementoPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
		this.lettura = lettura;
	}
	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
		
		
	}
	public Utente getUtente() {
		return utente_id;
	}
	public String getElementoPrestato() {
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
	public void setElementoPrestato(String elementoPrestato) {
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
	public Lettura getLettura() {
		return lettura;
	}
	public void setLettura(Lettura lettura) {
		this.lettura = lettura;
	}
	
	

}
