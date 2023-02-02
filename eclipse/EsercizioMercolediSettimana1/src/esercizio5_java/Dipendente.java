package esercizio5_java;

public class Dipendente {
	
	public static double stipendioBase=1000;
	
	private double stipendio;	
	private String matricola;
	private Livello Livello;
	private Dipartimento dipartimento; 	
	private double importoOrarioStraordinario;
	
	
	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario,
			Livello livello, Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		Livello = livello;
		this.dipartimento = dipartimento;
	}
	
	public Dipendente(String matricola, Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio=stipendioBase;
		this.importoOrarioStraordinario=30;
		this.Livello=Livello.OPERAIO;
	}
	
	
	public String getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Livello getLivello() {
		return Livello;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	
	public void stampaDipendente() {
		System.out.println("matricola: "+this.matricola+" dipartimento: "+this.dipartimento+" stipendio: "+this.stipendio+" importo orario straordinario: "+this.importoOrarioStraordinario+" livello: "+this.Livello);
	}
	
	public void promuovi() {
		switch(Livello) {
		case OPERAIO:
			this.Livello=Livello.IMPIEGATO;
			this.stipendio=stipendioBase*1.2;
			System.out.println("nuovo livello dipendente: "+this.Livello);
			break;		
		case IMPIEGATO:
			this.Livello=Livello.QUADRO;
			this.stipendio=stipendioBase*1.5;
			System.out.println("nuovo livello dipendente: "+this.Livello);
			break;
		case QUADRO:
			this.Livello=Livello.DIRIGENTE;
			this.stipendio=stipendioBase*2;
			System.out.println("nuovo livello dipendente: "+this.Livello);
			break;
		default:
			System.out.println("Il dipendente è già dirigente");
		}
	}
	
}
