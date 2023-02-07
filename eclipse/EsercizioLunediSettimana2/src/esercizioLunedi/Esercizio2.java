package esercizioLunedi;

import java.util.Scanner;

public class Esercizio2 {

	static Scanner scanner= new Scanner (System.in);
	
	public static void main(String[] args) {
		
		contaKm();
		
	}

	public static int contaKm() {	
		int x=0;
		int y=0;
		try {
		System.out.println("Inserisci km");
		x=Integer.parseInt(scanner.nextLine());
		System.out.println("Inserisci litri");
		y=Integer.parseInt(scanner.nextLine());
		System.out.println("Km/l: "+(x/y));
		return x/y;
		}catch(ArithmeticException e) {
			System.out.println("Km/l: "+0);
			return x;
		}catch (NumberFormatException s) {
			System.out.println("inserire valori validi");
			return contaKm();			
		}
		
	}
	
}
