package esercizioLunedi;

import java.util.Arrays;
import java.util.Scanner;

public class Esercizio1 {
	
	static Scanner scanner= new Scanner (System.in);

	public static void main(String[] args) {
		
		int[] array= new int[5];
		
		caricaArray(array);
		stampaArray(array);
		ciclo(array);		
		
	}
	
	public static int randomNumber() {
		return (int) (Math.random()*9+1);
	}

	public static int[] caricaArray(int[] x) {
		for(int i=0;i<x.length;i++) {
			x[i]=randomNumber();
		}
		return x;
	}
	
	public static void stampaArray(int[]x) {	
		System.out.println(Arrays.toString(x));
	}
	
	public static int inserisciNumero() {
		System.out.println("inserisci numero");
		try {
		int x= Integer.parseInt(scanner.nextLine());
		return x;
		}catch(Exception e) {
			System.out.println("valore inserito non valido. Inserisci un numero da 1-5");
			return inserisciNumero();
		}
	}
	
	public static int inserisciNumeroScelta() {
		System.out.println("inserisci numero posizione");
		try {
		int x= Integer.parseInt(scanner.nextLine());
		return x;
		}
		 catch(ArrayIndexOutOfBoundsException e)  
        {  
				System.out.println("valore inserito non valido. Inserisci un numero da 1-5");
				return inserisciNumeroScelta();
        }  
		/*
		catch(Exception e) {
			System.out.println("valore inserito non valido. Inserisci un numero da 1-5");
			return inserisciNumeroScelta();
		}
		*/ catch (ArithmeticException c) {
            System.out.println("valore inserito non valido. Inserisci un numero da 1-5");
            return inserisciNumeroScelta();
            }
	}
	
	public static int[] cambio(int[] x,int s,int n) {
		try {
		x[s]=n;
		return x;
		} catch(ArrayIndexOutOfBoundsException e)  
        {  
				System.out.println("valore posizione inserito non valido. Inserisci un numero da 1-5");
				return x;
        }  
		catch(Exception e) {
			System.out.println("valore inserito non valido. Inserisci un numero da 1-5");
			return x;
		}
		
	}
	
	public static void ciclo(int[] x) {
		int s=inserisciNumeroScelta();
		int s1=s-1;
		int n=inserisciNumero();
		cambio(x,s1,n);	
		stampaArray(x);
		while(s!=0) {
			 s=inserisciNumeroScelta();
			 s1=s-1;
			 n=inserisciNumero();
			cambio(x,s1,n);
			stampaArray(x);
		}
		System.out.println("Fine");
	}
	
}
