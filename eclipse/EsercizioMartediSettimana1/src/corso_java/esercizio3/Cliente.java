package corso_java.esercizio3;

public class Cliente {

	int codiceCliente;
	String nome;
	String cognome;
	String email;
	String dataIscrizione;
	
	public Cliente(int codiceCliente,String nome, String cognome, String email, String dataIscrizione) {
		this.codiceCliente=codiceCliente;
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.dataIscrizione=dataIscrizione;
	}
	
	public void mostraCliente() {
		System.out.println("codice cliente: "+this.codiceCliente+" nome cliente: "+this.nome+" "+this.cognome+" email: "+this.email+" data di iscrizione: "+this.dataIscrizione);
	}
}
