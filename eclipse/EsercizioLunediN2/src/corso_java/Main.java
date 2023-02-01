package corso_java;

import java.util.Scanner;

public class Main {


public static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Immetti Frase 1 ");
	String frase1=sc.nextLine();
	
	System.out.print("Immetti Frase 2 ");
	String frase2=sc.nextLine();
	
	System.out.print("Immetti Frase 3 ");
	String frase3=sc.nextLine();
	
	String frase4=frase1+frase2+frase3;
	System.out.println(frase4);
	
	

	System.out.println("inserisci lato1 di un  rettangolo: ");
	double l11=Double.parseDouble(sc.nextLine());
	System.out.println("inserisci lato2 di un  rettangolo: ");
	double l22=Double.parseDouble(sc.nextLine());
	
	System.out.println("perimetro rettangolo= "+perimetroRettangolo(l11,l22));
	
	
	
	System.out.println("inserisci lato1 di un  triangolo: ");
	double l1=Double.parseDouble(sc.nextLine());
	System.out.println("inserisci lato2 di un  triangolo: ");
	double l2=Double.parseDouble(sc.nextLine());
	System.out.println("inserisci lato3 di un  triangolo: ");
	double l3=Double.parseDouble(sc.nextLine());
	System.out.println("area triangolo con lati: "+ areaTriangolo(l1,l2,l3));
	
	System.out.println("inserisci numero intero");
	int n1= Integer.parseInt(sc.nextLine());
	System.out.println("modulo: "+pariDispari(n1));
	
	
	}

	private static double perimetroRettangolo(double lato1,double lato2){
		return (lato1+lato2)*2;	
	}
	
	private static int pariDispari(int numero) {
		int res= numero%2;
		if(res==1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	private static double areaTriangolo(double lato1, double lato2, double lato3) {
		double p=(lato1+lato2+lato3)/2;
		double r=(p)*(p-lato1)*(p-lato2)*(p-lato3);
		return Math.sqrt(r);
	}

}
