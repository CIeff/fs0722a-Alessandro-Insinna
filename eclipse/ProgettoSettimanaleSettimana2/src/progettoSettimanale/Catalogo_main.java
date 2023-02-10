package progettoSettimanale;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class Catalogo_main {

	static Logger log= Logger.getLogger(Catalogo_main.class.getName());
	static Scanner scanner = new Scanner (System.in);
	static File file=new File("Files/salvataggio su disco.txt");
	
	public static void main(String[] args) throws IOException {
				
		log.info("prova logger");
		
		List<Lettura> libreria = new ArrayList<Lettura>();
		
		inizializzaLibreria(libreria);
		modificaLibreria(libreria);
	}
	
	public static List<Lettura> inizializzaLibreria(List<Lettura>libreria) {
		
		String risposta = "y";

		while (risposta.equals("y")) {
			System.out.println("Inserire Lettura? (y/n)");
			risposta = scanner.nextLine();

			if (risposta.equals("y")) {
				libreria.add(sceltaLibroRiv(libreria));
			} else if (!risposta.equals("n")) {
				System.out.println("Input non valido. Inserire y o n.");
				inizializzaLibreria(libreria);
			}else {
				System.out.println("Fine inizializzazione Libreria");
			}
		}
		
		for(Lettura lettura : libreria) {
			System.out.println(lettura.toString());
		}

		return libreria;
	}
	
	public static Lettura sceltaLibroRiv(List<Lettura> libreria) {
		System.out.println("Quale tipo di lettura vuoi inserire? 1-Libro / 2-Rivista");
		String risposta2 = scanner.nextLine();
		if (risposta2.equals("1")) {
			return creazioneLibro(libreria);
		} else if (risposta2.equals("2")) {
			return creazioneRivista(libreria);
		} else {
			System.out.println("Risposta non valida, inserire 1 o 2.");
			sceltaLibroRiv(libreria);
		}
		return null;
		
	}
	
	public static Libro creazioneLibro(List<Lettura> libreria) {
		  System.out.println("Inserisci ISBN: ");
		  String isbn = scanner.nextLine();
		  for (Lettura lettura : libreria) {
		    if (lettura.getISBN().equals(isbn)) {
		      System.out.println("Esiste già un libro con lo stesso ISBN nella libreria");
		      return null;
		    }
		  }

		  System.out.println("Inserisci titolo: ");
		  String titolo = scanner.nextLine();
		  boolean isValid = false;
		  int annoPubblicazione = 0;
		  while (!isValid) {
		    System.out.println("Inserisci anno di pubblicazione: ");
		    try {
		      annoPubblicazione = Integer.parseInt(scanner.nextLine());
		      isValid = true;
		    } catch (NumberFormatException e) {
		      System.out.println("Errore: Inserire un numero valido per l'anno di pubblicazione");
		    }
		  }

		  isValid = false;
		  int numeroPagine = 0;
		  while (!isValid) {
		    System.out.println("Inserisci numero di pagine: ");
		    try {
		      numeroPagine = Integer.parseInt(scanner.nextLine());
		      isValid = true;
		    } catch (NumberFormatException e) {
		      System.out.println("Errore: Inserire un numero valido per il numero di pagine");
		    }
		  }			
		  System.out.println("Inserisci autore");
		  String autore = scanner.nextLine();
		  System.out.println("Inserisci genere");
		  String genere = scanner.nextLine();

		  Libro nuovoLibro = new Libro(isbn, titolo, annoPubblicazione, numeroPagine, autore, genere);
		  return nuovoLibro;
		}
	
	public static Rivista creazioneRivista(List<Lettura> libreria) {
		  System.out.println("Inserisci ISBN: ");
		  String isbn = scanner.nextLine();
		  for (Lettura lettura : libreria) {
		    if (lettura.getISBN().equals(isbn)) {
		      System.out.println("Esiste già un libro con lo stesso ISBN nella libreria");
		      return null;
		    }
		  }

		System.out.println("Inserisci titolo: ");
		String titolo= scanner.nextLine();
		boolean isValid = false;
		int annoPubblicazione = 0;
		while (!isValid) {
		  System.out.println("Inserisci anno di pubblicazione: ");
		  try {
		    annoPubblicazione = Integer.parseInt(scanner.nextLine());
		    isValid = true;
		  } catch (NumberFormatException e) {
		    System.out.println("Errore: Inserire un numero valido per l'anno di pubblicazione");
		  }
		}

		isValid = false;
		int numeroPagine = 0;
		while (!isValid) {
		  System.out.println("Inserisci numero di pagine: ");
		  try {
		    numeroPagine = Integer.parseInt(scanner.nextLine());
		    isValid = true;
		  } catch (NumberFormatException e) {
		    System.out.println("Errore: Inserire un numero valido per il numero di pagine");
		  }
		}	
		Periodicità periodicita = null;
		while (periodicita == null) {
		    System.out.println("Inserisci Periodicità (SETTIMANALE,MENSILE,SEMESTRALE)");
		    String periodicitaInput = scanner.nextLine();

		    switch (periodicitaInput.toUpperCase()) {
		      case "SETTIMANALE":
		        periodicita = Periodicità.SETTIMANALE;
		        break;
		      case "MENSILE":
		        periodicita = Periodicità.MENSILE;
		        break;
		      case "SEMESTRALE":
		        periodicita = Periodicità.SEMESTRALE;
		        break;
		      default:
		        System.out.println("Periodicità non valida. Riprova.");
		        break;
		    }
		}
		
		Rivista nuovaRivista= new Rivista(isbn,titolo,annoPubblicazione,numeroPagine,periodicita);
		return nuovaRivista;
	}
	
	
	public static List<Lettura> modificaLibreria(List<Lettura> libreria) throws IOException{
		String risposta="y";
		while(risposta.equals("y")) {
			System.out.println("Vuoi modificare la libreria? (y/n)");
			risposta=scanner.nextLine();
			if(risposta.equals("y")) {
				System.out.println("Quale azione vuoi effettuare? (1- aggiunta elemento / 2- rimozione elemento tramite ISBN / 3- ricerca per anno di pubblicazione / 4- ricerca per autore / 5- salvataggio su disco / 6- lettura dal disco)");
				String risposta2= scanner.nextLine();
				switch(risposta2) {
				case "1":
					libreria.add(sceltaLibroRiv(libreria));
					break;
				case "2":
					rimozioneLettura(libreria);
					break;
				case "3":
					ricercaAnnoPubblicazione(libreria);
					break;
				case "4":
					ricercaAutore(libreria);
					break;
				case "5":
					salvataggioSuDisco(libreria);
					break;
				case "6":
					letturaDaDisco();
					break;
				default:
					System.out.println("Scelta non valida");
					break;
				}
				
			}else if(!risposta.equals("n")) {
				System.out.println("Input non valido, riprovare (1- aggiunta lettura / 2- rimozione lettura tramite ISBN / 3- ricerca per anno di pubblicazione / 4- ricerca per autore / 5- salvataggio su disco / 6- lettura dal disco\")");
			}
		}
		System.out.println("Fine");
		return libreria;		
		
	}
	
	public static List<Lettura> rimozioneLettura(List<Lettura> libreria){
		System.out.println("Inserisci codice ISBN");
		String isbn=scanner.nextLine();
		int indexToRemove = -1;
		for(int i=0; i<libreria.size(); i++) {
			Lettura lettura = libreria.get(i);
			if(lettura.getISBN().equals(isbn)) {
				indexToRemove = i;
				break;
			}
		}
		if(indexToRemove != -1) {
			libreria.remove(indexToRemove);
		} else {
			System.out.println("Lettura non trovata.");
		}
		return libreria;
	}
	
	public static List<Lettura> ricercaAnnoPubblicazione(List<Lettura> libreria){
		System.out.println("Inserisci anno di pubblicazione per la ricerca");
		String annoInput = scanner.nextLine();
		try {
			int annoPubblicazione = Integer.parseInt(annoInput);
			Stream<Lettura> streamLibreria = libreria.stream();
			List<Lettura> libreriaRisultati = streamLibreria.filter(el -> el.getAnnoPubblicazione() == annoPubblicazione)
					.collect(Collectors.toList());
			if (libreriaRisultati.isEmpty()) {
				System.out.println("Nessun risultato trovato.");
			} else {
				System.out.println("Ecco i risultati della ricerca: ");
				for (Lettura lettura : libreriaRisultati) {
					System.out.println(lettura.toString());
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("L'anno di pubblicazione deve essere un numero intero.");
		}
		return libreria;
	}
	
	public static List<Lettura> ricercaAutore(List<Lettura> libreria) {
		System.out.println("Inserisci il nome dell'autore per la ricerca: ");
		String autore = scanner.nextLine();
		
		List<Lettura> libriAutore = libreria.stream()
				.filter(lettura -> {
					if (lettura instanceof Libro) {
						Libro libro = (Libro) lettura;
						return libro.getAutore().equals(autore);
					} else {
						return false;
					}
				})
				.collect(Collectors.toList());
		
		if (!libriAutore.isEmpty()) {
			System.out.println("Ecco i risultati della ricerca:");
			for (Lettura libro : libriAutore) {
				System.out.println(libro.toString());
			}
		} else {
			System.out.println("Nessun libro trovato per l'autore- " + autore);
		}
		
		return libreria;
	}
	
	public static void salvataggioSuDisco(List<Lettura> libreria) throws IOException {
		String testo="";
		for (Lettura lettura : libreria) {
			testo+=lettura.toString()+"#";
		}
		System.out.println("File da salvare: "+testo);
		FileUtils.writeStringToFile(file, testo,"UTF-8");
		System.out.println("File salvato con successo");
	}
	
	public static void letturaDaDisco() throws IOException {
		String txtFile= FileUtils.readFileToString(file, "UTF-8");
		System.out.println("File da disco: "+txtFile);
	}
	
}
