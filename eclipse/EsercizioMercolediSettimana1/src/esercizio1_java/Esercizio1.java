package esercizio1_java;

public class Esercizio1 {

	public static void main(String[] args) {
		
		System.out.println(stringaPariDispari("ciao"));
		System.out.println(annoBisestile(2020));

	}

	public static boolean stringaPariDispari(String stringa) {
		return stringa.length()%2==0;
	}
	
	public static boolean annoBisestile(int n) {
		if(n%4==0) {
			return true;
		}
		else if(n%100==0 && n%400==0) {
			return true;
			}
		else {return false;}
		}
	}

