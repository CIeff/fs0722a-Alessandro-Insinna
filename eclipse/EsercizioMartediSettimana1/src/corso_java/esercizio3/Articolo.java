package corso_java.esercizio3;

public class Articolo {
	
	int codiceArticolo;
	String descrizioneArticolo;
	double prezzo;
	int numeroPezziDisponibiliMagazzino;
	static int stock=0;

	public Articolo(int codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDisponibiliInMagazzino) {
		this.codiceArticolo=codiceArticolo;
		this.descrizioneArticolo=descrizioneArticolo;
		this.prezzo=prezzo;
		this.numeroPezziDisponibiliMagazzino=numeroPezziDisponibiliInMagazzino;
		stock+=numeroPezziDisponibiliInMagazzino;
	}
	
	public static void stampaStock() {
	System.out.println("stock totale: "+stock);
}
	
	public void stampaArticolo() {
		System.out.println("articolo "+this.codiceArticolo+": "+this.descrizioneArticolo+" prezzo "+this.prezzo+" codice articolo: "+this.codiceArticolo+" in stock: "+this.numeroPezziDisponibiliMagazzino);
	}
}
