package test.log;

public class User {
	
	private String nome;
	private String cognome;
	private String citta;
	private int eta;
	
	public User(String nome, String cognome, String citta, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		this.eta = eta;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return "User [nome=" + nome + ", cognome=" + cognome + ", citta=" + citta + ", eta=" + eta + "]";
	}
	
}
