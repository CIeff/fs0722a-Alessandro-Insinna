package progettoSettimanale;

public class Rivista extends Lettura {

	private Periodicità periodicità;
	
	public Rivista(String ISBN, String titolo, int annoPubblicazione, int numeroPagine,Periodicità periodicità) {
		super(ISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicità=periodicità;
	}

	public Periodicità getPeriodicità() {
		return periodicità;
	}
	

}
