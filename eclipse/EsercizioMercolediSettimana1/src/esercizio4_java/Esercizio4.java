package esercizio4_java;

import java.util.Scanner;

public class Esercizio4 {

	static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
				
		contoAllaRovescia();
			
	}
	
	public static void contoAllaRovescia() {
		System.out.println("Inserisci numero intero: ");
		int n=Integer.parseInt(scanner.nextLine());		
		for(int i=n-1;i>=0;i--) {
			System.out.println(i);
		}
	}

}
