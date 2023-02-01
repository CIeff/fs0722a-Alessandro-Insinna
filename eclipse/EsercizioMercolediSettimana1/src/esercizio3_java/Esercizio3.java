package esercizio3_java;

import java.util.Arrays;
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
				char[] x=new char[s.length()];
				String v="";
				for(int i=0;i<s.length();i++) {
					System.out.println(s.charAt(i));
					x[i]=s.charAt(i);
					v+=s.charAt(i)+",";					
					}
				String vv=v.substring(0, v.length()-1);
				System.out.println(vv);
			System.out.println(Arrays.toString(x));
			}
		}		
		System.out.println("Fine");
	}
	
	
}
