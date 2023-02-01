package com.epicode.tech;

import java.util.Scanner;

public class MainProject {

	static Scanner scanner= new Scanner(System.in);
	static Persona[] spettatori= new Persona[50];
	
	public static void main(String[] args) {

		
		
		int i=0;
		while(i<spettatori.length) {
			System.out.println("vuoi vendere biglietti? (si/no)");
			String r=scanner.nextLine();
			if(r.equals("si")) {
			registrazione();
			i++;
			}
			else {
				stampaBiglietti();
				break;
			}
		}
		
		
		
	}
	
	public static void registrazione() {

		System.out.println("inserisci nome ");
		String nome=scanner.nextLine();
		System.out.println("inserisci cognome ");
		String cognome=scanner.nextLine();
		System.out.println("inserisci età ");
		int eta=Integer.parseInt(scanner.nextLine());		
		
		if(eta>=18) {
			System.out.println("puoi entrare");
			emettiBiglietto(new Persona(nome,cognome,eta));
		}else {
			System.out.println("non puoi entrare");
		}
	}
	
	public static void emettiBiglietto(Persona p) {
		for(int i=0; i<spettatori.length;i++) {
		if(spettatori[i]==null) {
			spettatori[i]=p;
			break;
			}
		}
	}
	
	public static void stampaBiglietti() {
		System.out.println("Elenco biglietti");
		for(int i=0; i<spettatori.length;i++) {
			if(spettatori[i]!=null) {
			System.out.print(spettatori[i]);
			}
		}
	}

}
