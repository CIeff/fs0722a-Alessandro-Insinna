package corso_java;

import java.util.Scanner;

public class ExceptionMainProject {
	
	static Scanner scanner= new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		System.out.println("Calcolatrice");
		operazione();

	}
	
	public static void operazione() {
		System.out.println("operazione da fare: 1-somma | 2-sottrazione | 3-moltiplicazione | 4-divisione");
		int operazione=0;
		
		try {		
			operazione= Integer.parseInt(scanner.nextLine());
			switch (operazione) {		
			case 1:
				somma();
				break;
			case 2:
				sottrazione();
				break;
			case 3:
				moltiplicazione();
				break;
			case 4:
				divisione();
				break;
				}	
		}catch(NumberFormatException e){
			System.out.println("inserisci numero valido");
			operazione();
		}
		
				
		
	}
	
	public static void somma() {
		int x= inserisciNumero();
		int y=inserisciNumero();
		int somma=x+y;
		System.out.print("somma: "+somma);
	}
	
	public static void sottrazione() {
		int x= inserisciNumero();
		int y=inserisciNumero();
		int sottrazione=x-y;
		System.out.println("risultato: "+sottrazione);
	}
	
	public static void moltiplicazione() {
		int x= inserisciNumero();
		int y=inserisciNumero();
		int risultato=x*y;
		System.out.println("risultato: "+risultato);
	}
	
	public static void divisione() {
		int x= inserisciNumero();
		int y=inserisciNumero();
		try {
			int risultato= x/y;
			System.out.println(risultato);
		}catch (ArithmeticException e) {
			System.out.println("divisione non possibile");
			divisione();
		}
		
	}
	public static int inserisciNumero() {
		System.out.println("inserisci numero per l'operazione");
		try {
		int x=Integer.parseInt(scanner.nextLine());
		return x;
		}
		catch(NumberFormatException e){
			System.out.println("numero inserito non valido, preso 0 ");
			return 0;
		}
		
		
	}

}
