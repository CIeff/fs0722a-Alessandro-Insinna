package progettoSettimanale;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utente {

	private String nome;
	private String cognome;
	private LocalDate dataDiNascita;
	@Id
	@GeneratedValue
	private int numeroTessera;
	
	@OneToMany(mappedBy = "utente_id")
    private List<Prestito> prestiti = new ArrayList<>();	
	
	public Utente(String nome, String cognome, LocalDate dataDiNascita, List<Prestito> prestiti) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita = dataDiNascita;
		this.prestiti = prestiti;
	}
	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}
	public int getNumeroTessera() {
		return numeroTessera;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public void setNumeroTessera(int numeroTessera) {
		this.numeroTessera = numeroTessera;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita + ", numeroTessera="
				+ numeroTessera + ", prestiti=" + prestiti + "]";
	}
	
	
	
}
