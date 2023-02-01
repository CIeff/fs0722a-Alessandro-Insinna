package corso_java.Esercizio2;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Sim provaSim= new Sim("384959595848");
		provaSim.ricarica(10);
		provaSim.stampaSim();				
		//provaSim.stampaUltime5Chiamate();
		provaSim.effettuaChiamata(5.4, "33329923923");
	}

}
 