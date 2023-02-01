package esercizio2_java;

public class Esercizio2 {

	public static void main(String[] args) {
		
		stampaIntero(2);
	}
	
	public static void stampaIntero(int n) {
		switch(n) {
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("Numeri validi : 1-2-3, numero inserito non valido");
			break;
		}
	}

}
