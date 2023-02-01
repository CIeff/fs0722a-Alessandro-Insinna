package esercizio5_java;

public class Esercizio5 {

	public static void main(String[] args) {
		
		Dipendente Pino= new Dipendente("ABC12SDD",Dipartimento.VENDITE);		
		calcolaPaga(Pino);
		calcolaPaga(Pino,30);
		
		Dipendente Valeria= new Dipendente("FGX85NSS",2000,50,Livello.DIRIGENTE,Dipartimento.PRODUZIONE);
		calcolaPaga(Valeria);
		calcolaPaga(Valeria,30);
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
	
}
