package corso_java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prova console log");
		
		int varx;
		varx=25;
		int vary=10;
		
		int somma= varx+vary;
		System.out.println(somma);
		
		
		int arrx[]= new int [5];
		for(int i=0;i<5;i++) {
			arrx[i]=i;
			System.out.println(arrx[i]);
		}
		System.out.println(Arrays.toString(arrx));
	
		int arry[]= {25,21,2,4,5};
		
		int n=4;
		double f=24.94;
		char c='x';
		boolean b=true;
		String s = "stringa";
		String xv= "15";
		
		
		double db=n; 
		System.out.println(db);
		
		int xc=(int) f;
		System.out.println(xc);
		
		int zx=Integer.parseInt(xv);
		System.out.println(zx);
		
		double num1=10;
		int num2=3;
		double res=num1/num2;
		System.out.println(res);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("scrivi il tuo nome: ");
		String nome= sc.nextLine();
		System.out.print("età? ");
		int eta= Integer.parseInt(sc.nextLine());
		System.out.println("ciao "+nome);
		
		if(eta>18) {
			System.out.println("Sei maggiorenne");
		}else {
			System.out.println("sei minorenne");
		}
			
		stampa();
		
	}
	
	public static void stampa () {
		System.out.println("FINE");
	}
	

}