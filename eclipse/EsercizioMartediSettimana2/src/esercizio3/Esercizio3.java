package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Esercizio3 {

	static Scanner scanner = new Scanner (System.in);
	
	 static Map<String,String> rubrica= new HashMap<String,String>();
	
	public static void main(String[] args) {

		inserisciContatto(rubrica);
		inserisciContatto(rubrica);
		inserisciContatto(rubrica);
		inserisciContatto(rubrica);
		
		ricercaContatto(rubrica);
		stampaRubrica(rubrica);
		//ricercaNumeroContatto(rubrica);
		
	}
	
	public static Map<String,String> inserisciContatto(Map<String,String> r){
		System.out.println("Inserisci nome del nuovo contatto");
		String n= scanner.nextLine();
		System.out.println("Inserisci numero del nuovo contatto da salvare");
		String nn= scanner.nextLine();
		r.put(n, nn);
		return r;
		
	}

	public static Map<String,String> rimuoviContatto(Map<String,String> r){
		System.out.println("Inserisci nome del contatto da eliminare");
		String n=scanner.nextLine();
		if(r.containsKey(n)) {
			r.remove(n);
			System.out.println("Contatto eliminato");
			System.out.println(r.toString());
		}else {
			System.out.println("Contatto non esistente");
			System.out.println(r.toString());
		}
		return r;
	}
	
	public static Map<String,String> ricercaContatto(Map<String,String> r){
		System.out.println("Inserisci numero di telefono per cercare il nome");
		String nn=scanner.nextLine();
		for (Entry<String, String> entry : r.entrySet()) {
            if (entry.getValue().equals(nn)) {
                System.out.println("Nome trovato. Nome associato al numero: "+entry.getKey());
            }           
		}
 		if(!r.containsValue(nn)){	 			
 			System.out.println("Numero non presente in rubrica");
 			
 		} 		
		return r;
        }	
	
	
	public static Map<String,String> ricercaNumeroContatto(Map<String,String> r){
		System.out.println("Inserisci nome per vedere il numero");
		String nn=scanner.nextLine();
		if(r.containsKey(nn)) {
			System.out.println("Contatto trovato. Numero: "+r.get(nn));
		}else {
			System.out.println("Nome non presente in rubrica");
		}
		return r;
		
	}
	
	public static void stampaRubrica (Map<String,String> r){
		System.out.println(r.toString());
	}
}
