package corso_java.esercizio3;

import java.util.Arrays;

public class Carrello {

	Cliente clienteAssociato;
	Articolo[] elencoArticoli;
	double totaleCostoArticoli;
	
	public Carrello(Cliente clienteAssociato, Articolo elencoArticoli[], double totaleCostoArticoli) {
		this.clienteAssociato=clienteAssociato;
		this.elencoArticoli=elencoArticoli;
		this.totaleCostoArticoli=totaleCostoArticoli;
	}
	
		public void mostraCliente() {
			System.out.println("codice cliente: "+this.clienteAssociato.codiceCliente+"nome cliente: "+this.clienteAssociato.nome+" "+this.clienteAssociato.cognome+" email: "+this.clienteAssociato.email+" data di iscrizione: "+this.clienteAssociato.dataIscrizione);
		}
	
	
		public Articolo[] aggiungiArticolo(Articolo articolo) {
		
		if(this.elencoArticoli==null) {
			Articolo arr[]=new Articolo[1];
			arr[arr.length-1]=articolo;
			this.elencoArticoli=arr;
		}else {
			Articolo arr[]=new Articolo[this.elencoArticoli.length+1];
			for(int i=0;i<this.elencoArticoli.length;i++) {
				arr[i]=this.elencoArticoli[i];
			}
			arr[arr.length-1]=articolo;
			this.elencoArticoli=arr;
		}			
			
		System.out.println("Numero articoli nel carrello: "+this.elencoArticoli.length);
		
		for(int x=0;x<this.elencoArticoli.length;x++) {			
			System.out.println("articolo "+this.elencoArticoli[x].codiceArticolo+": "+this.elencoArticoli[x].descrizioneArticolo+" prezzo "+this.elencoArticoli[x].prezzo+" codice articolo: "+this.elencoArticoli[x].codiceArticolo+" in stock: "+this.elencoArticoli[x].numeroPezziDisponibiliMagazzino);
		}
			
		return this.elencoArticoli;
	}
	
	public double prezzoArticoli() {
		double conta = 0;
		for(int i=0;i<this.elencoArticoli.length;i++) {
			conta+=this.elencoArticoli[i].prezzo;
		}
		System.out.println("prezzo carrello: "+ conta);
		return conta;
	}
}
