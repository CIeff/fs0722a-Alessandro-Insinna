package corso_java.Esercizio2;

public class Sim {
	String numeroDiTelefono;
	double credito;
	Chiamata[] chiamate;
	
public Sim(String numeroDiTelefono) {
	this.numeroDiTelefono=numeroDiTelefono;
	this.credito=0;
	this.chiamate=new Chiamata[5];
}
	
	public void stampaSim() {
		System.out.println("numero di telefono: "+this.numeroDiTelefono);
		System.out.println("credito: "+this.credito);
		System.out.println("lista chiamate effettuate: "+this.chiamate);
	}
	
	public void ricarica(int n) {
		this.credito+=n;
	}
	
	public void stampaUltime5Chiamate() {
		for(int c=0;c<this.chiamate.length;c++) {
			if(this.chiamate[c]!=null) {
		System.out.println("-chiamata 1: "+ this.chiamate[c]);
			}else {
				System.out.println("nessuna chiamata "+c);
			}
		}
	}
	
	public void effettuaChiamata(double durata, String numeroChiamato) {
		Chiamata c= new Chiamata(durata, numeroChiamato);
		System.out.println(c);
		for(int r=0;r<this.chiamate.length;r++) {
			if(this.chiamate[r]!=null) {
		System.out.println("-chiamata 1: "+ this.chiamate[r]);
			}else {
				System.out.println(r);
			}
	}

}
}
