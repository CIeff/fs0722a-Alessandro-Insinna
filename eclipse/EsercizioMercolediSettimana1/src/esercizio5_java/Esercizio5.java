package esercizio5_java;

import java.util.Arrays;

public class Esercizio5 {

	public static void main(String[] args) {
		
		Dipendente Pino= new Dipendente("ABC12SDD",Dipartimento.PRODUZIONE);		
		calcolaPaga(Pino);
		calcolaPaga(Pino,30);
		
		Dipendente Gino= new Dipendente("ABC12SDV",Dipartimento.PRODUZIONE);		
		calcolaPaga(Pino);
		calcolaPaga(Gino,30);
		
		Dipendente Rino= new Dipendente("ABC12SDR",1500,45,Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);		
		//calcolaPaga(Pino);
		//calcolaPaga(Pino,30);
		
		Dipendente Valeria= new Dipendente("FGX85NSS",2000,60,Livello.DIRIGENTE,Dipartimento.VENDITE);
		calcolaPaga(Valeria);
		calcolaPaga(Valeria,30);
		
		Pino.promuovi();
		Rino.promuovi();
		
		Pino.stampaDipendente();
		Gino.stampaDipendente();
		Rino.stampaDipendente();
		Valeria.stampaDipendente();
		System.out.println("=============================================");
	
		Dipendente[] lavoratori=new Dipendente[4];
		
		caricaArrayPiuCalcolaPagaTotale(lavoratori, Pino, Gino, Rino, Valeria);
	
	}
	
	static double calcolaPaga(Dipendente dip) {
		System.out.println(dip.getStipendio());
		return dip.getStipendio();
	}

	static double calcolaPaga(Dipendente dip, int n) {
		System.out.println((dip.getStipendio()+(n*dip.getImportoOrarioStraordinario())));
		System.out.println("=============================================");
		return (dip.getStipendio()+(n*dip.getImportoOrarioStraordinario()));
		
	}
		
	
	static Dipendente[] caricaArrayPiuCalcolaPagaTotale(Dipendente[]ar,Dipendente x,Dipendente t, 	Dipendente 	y,Dipendente u) {
		
		int somma=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[0]==null) {
				ar[0]=x;
				
			}else if(ar[1]==null) {
				ar[1]=t;
				
			}else if(ar[2]==null) {
				ar[2]=y;
				
			}else if(ar[3]==null) {
				ar[3]=u;
				
			}
			ar[i].stampaDipendente();
			somma+=calcolaPaga(ar[i],5);			
		}
		System.out.println("Paga totale dei lavoratori con 5 ore di straordinario l'uno: "+somma);
		return ar;
	}
}
