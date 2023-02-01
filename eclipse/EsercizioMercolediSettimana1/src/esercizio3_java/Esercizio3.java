package esercizio3_java;

import java.util.Scanner;

public class Esercizio3 {
	
	static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		
		dividiStringa();

	}

	public static void dividiStringa() {
		String s="";
		while(!s.equals(":q")){
			System.out.println("inserisci stringa");
			s= scanner.nextLine();			
			if(!s.equals(":q")){			
			for(int i=0;i<s.length();i++) {
				System.out.println(s.charAt(i));
				}
			}
		}		
		System.out.println("Fine");
	}
	
	
}
