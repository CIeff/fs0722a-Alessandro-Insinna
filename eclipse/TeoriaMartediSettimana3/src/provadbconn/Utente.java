package provadbconn;

public class Utente {
	
	int id_utente;
	String nome;
	String cognome;
	String data_nascita;
	int anni;
	String email;
	
	public Utente(int id_utente, String nome, String cognome, String data_nascita, int anni, String email) {
		super();
		this.id_utente = id_utente;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.anni = anni;
		this.email = email;
	}
	
	public Utente( String nome, String cognome, String data_nascita, int anni, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.anni = anni;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Utente [id_utente=" + id_utente + ", nome=" + nome + ", cognome=" + cognome + ", data_nascita="
				+ data_nascita + ", anni=" + anni + ", email=" + email + "]";
	}
	
	
}
