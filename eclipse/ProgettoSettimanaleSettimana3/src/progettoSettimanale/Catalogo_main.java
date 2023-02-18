package progettoSettimanale;


import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;



public class Catalogo_main {
	
	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("ProgettoSettimanaleSettimana3");
	static EntityManager em=emf.createEntityManager();

	static Logger log= Logger.getLogger(Catalogo_main.class.getName());
	static Scanner scanner = new Scanner (System.in);
	
	static Utente utenteAttivo;
	static List<Utente> utenti = new ArrayList<Utente>();
	static List<Lettura> lettureInPrestito= new ArrayList<Lettura>();
	static List<Lettura> letture= new ArrayList<Lettura>();
	
	public static void main(String[] args) throws IOException {
				
		log.info("prova logger");
		
		List<Lettura> libreria = new ArrayList<Lettura>();
		
		getUtenti();
		getLettura();
		inizializzazioneUtente();
		inizializzaLibreria(libreria);
		modificaLibreria(libreria);
	}	
	
	   public static List<Utente> getUtenti() {
	        try {
	            TypedQuery<Utente> query = em.createQuery("SELECT u FROM Utente u", Utente.class);
	            utenti = query.getResultList();
	        } finally {
	           
	        }

	        return utenti;
	    }
	   
	   
	   public static List<Lettura> getLettura(){
		   try {
	            TypedQuery<Lettura> query = em.createQuery("SELECT l FROM Lettura l", Lettura.class);
	            letture = query.getResultList();
	        } finally {
	           
	        }
		   return letture;
	   }
	   
	public static List<Utente> inizializzazioneUtente() {
	    System.out.println("Usare utente di default, crearne uno o usare un account esistente? (1- default / 2- crea utente / 3- scegli un account esistente)");
	    String risposta = scanner.nextLine();		
	    if("1".equals(risposta)) {
	    	TypedQuery<Utente> query = em.createQuery(
	    		    "SELECT u FROM Utente u WHERE u.nome = :nomeUtente", Utente.class);
	    		query.setParameter("nomeUtente", "default");
	    		Utente utenteDefault = query.getSingleResult();
	    		utenteAttivo = utenteDefault;
	    		System.out.println("Selezionato utente di default");
	    		System.out.println(utenteDefault.getNome());
	    } else if("2".equals(risposta)) {
	        try {
	            System.out.println("Inserisci nome");
	            String nome = scanner.nextLine();
	            System.out.println("Inserisci cognome");
	            String cognome = scanner.nextLine();
	            System.out.println("Inserisci data di nascita -(AAAA/MM/GG)");
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	            LocalDate dataDiNascita = LocalDate.parse(scanner.nextLine(), formatter);
	            Utente ut = new Utente(nome, cognome, dataDiNascita, null);
	            utenti.add(ut);
	            em.getTransaction().begin();
	            em.persist(ut);
	            em.getTransaction().commit();
	            utenteAttivo=ut;
	        } catch (NumberFormatException e) {
	            System.out.println("Errore: formato numero tessera non valido");
	            inizializzazioneUtente();
	        } catch (DateTimeParseException e) {
	            System.out.println("Errore: formato data di nascita non valido");
	            inizializzazioneUtente();
	        }
	    } else if("3".equals(risposta)) {
	        creaUtente();
	    } else {
	        System.out.println("Inserimento non valido");
	        inizializzazioneUtente();
	    }
	    return utenti;
	}
	
	public static void creaUtente( ) {
	    System.out.println("Scegli tra gli account possibili (inserire numero di tessera equivalente per selezione account) / 0 per terminare operazioni");
	    for(Utente uten : utenti) {
	    	System.out.println(uten.getNumeroTessera()+" - "+uten.getNome()+" - "+uten.getCognome());
	    }
	    try {
	        int account = Integer.parseInt(scanner.nextLine());
	        if (account != 0) {
	            boolean utenteTrovato = false;
	            for (Utente u : utenti) {
	                System.out.println(u.getNumeroTessera() + " - " + u.getNome());
	                if (account == u.getNumeroTessera()) {
	                    System.out.println("Account di: " + u.getNome() + " " + u.getCognome() + " selezionato");
	                    utenteAttivo = u;
	                    utenteTrovato = true;
	                    break;
	                }
	            }
	            if (!utenteTrovato) {
	                System.out.println("Numero di tessera non valido");
	                creaUtente();
	            }
	        } else {
	            System.out.println("Fine scelta dell'account");
	            inizializzazioneUtente();
	        }
	    } catch (NumberFormatException e) {
	        System.out.println("Input non valido, inserire un numero");
	        creaUtente();
	    }
	}
	
	
	public static List<Lettura> inizializzaLibreria(List<Lettura>libreria) {
		
		String risposta = "y";

		while (risposta.equals("y")) {
			System.out.println("Inserire Lettura? (y/n)");
			risposta = scanner.nextLine();

			if (risposta.equals("y")) {
				aggiungiAlCatalogo(libreria, sceltaLibroRiv(libreria));
			} else if (!risposta.equals("n")) {
				System.out.println("Input non valido. Inserire y o n.");
				inizializzaLibreria(libreria);
			}else {
				System.out.println("Fine inizializzazione Libreria");
			}
		}
		
		for(Lettura lettura : libreria) {
			System.out.println("elemento aggiunto: "+lettura.toString());
		}
		
		System.out.println("Letture totali presenti-- ");
		for (Lettura let : letture) {
			System.out.println(let);
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
				System.out.println("Quale azione vuoi effettuare? (1- aggiunta elemento / 2- rimozione elemento tramite ISBN / 3- ricerca per isbn / 4- ricerca per anno di pubblicazione / 5- ricerca per autore / 6- ricerca per titolo (o parte di esso) / 7- ricerca letture attualmente in prestito da un utente specifico / 8- ricerca tutti i prestiti scaduti non ancora restituiti / 9-prendi in prestito una lettura / 10- restituisci lettura)");
				String risposta2= scanner.nextLine();
				switch(risposta2) {
				case "1":
					aggiungiAlCatalogo(libreria,sceltaLibroRiv(libreria));
					break;
				case "2":
					rimozioneLettura(libreria);
					break;
				case "3":
					ricercaIsbn();
					break;
				case "4":
					ricercaAnnoPubblicazione(libreria);
					break;
				case "5":
					ricercaAutore(libreria);
					break;
				case "6":
					ricercaTitolo();
					break;
				case "7":
					ricercaLetturePrestitoUtente();
					break;
				case "8":
					ricercaPrestitiScaduti();
					break;
				case "9":
					prendiInPrestito();
					break;
				case "10":
					restituisciLettura();
					break;
				default:
					System.out.println("Input non valido, riprovare (1- aggiunta elemento / 2- rimozione elemento tramite ISBN / 3- ricerca per isbn / 4- ricerca per anno di pubblicazione / 5- ricerca per autore / 6- ricerca per titolo (o parte di esso) / 7- ricerca letture attualmente in prestito da un utente specifico / 8- ricerca tutti i prestiti scaduti non ancora restituiti / 9-prendi in prestito una lettura / 10- restituisci lettura)");
					modificaLibreria(libreria);
					break;
				}
				
			}else if(!risposta.equals("n")) {
				System.out.println("Input non valido, riprovare (1- aggiunta elemento / 2- rimozione elemento tramite ISBN / 3- ricerca per isbn / 4- ricerca per anno di pubblicazione / 5- ricerca per autore / 6- ricerca per titolo (o parte di esso) / 7- ricerca letture attualmente in prestito da un utente specifico / 8- ricerca tutti i prestiti scaduti non ancora restituiti / 9-prendi in prestito una lettura / 10- restituisci lettura)");
			}
		}
		System.out.println("Fine");
		return libreria;		
		
	}
	
	public static List<Lettura> aggiungiAlCatalogo(List<Lettura> libreria, Lettura l) {
	    // controllo dell'isbn prima di aggiungere
	    Query q = em.createQuery("SELECT l FROM Lettura l WHERE l.ISBN = :isbn");
	    q.setParameter("isbn", l.getISBN());
	    List<Lettura> risultatiRicerca = q.getResultList();
	    if (risultatiRicerca.isEmpty()) {
	        em.getTransaction().begin();
	        em.persist(l);
	        em.getTransaction().commit();
	        libreria.add(l);
	        System.out.println("Elemento aggiunto al catalogo");
	    } else {
	        System.out.println("ISBN già presente");
	    }
	    return libreria;
	}
	
	public static List<Lettura> rimozioneLettura(List<Lettura> libreria){
		System.out.println("Inserisci codice ISBN");
		String isbn=scanner.nextLine();
		em.getTransaction().begin();
		Libro l=em.find(Libro.class, isbn);
		if(l!=null) {
			em.remove(l);
			libreria.remove(l);
			System.out.println("Elemento rimosso");
		}else {
			System.out.println("Elemento non trovato con codice isbn inserito");
		}
		em.getTransaction().commit();
		return libreria;
	}
	
	public static List<Libro> ricercaIsbn(){
		System.out.println("Inserisci ISBN per la ricerca");
		String isbn=scanner.nextLine();
		Query q=em.createQuery("SELECT l FROM Libro l WHERE l.ISBN= :isbn", Libro.class);
		q.setParameter("isbn", isbn);
		List<Libro> risultatiRicerca=q.getResultList();
		for(Lettura l : risultatiRicerca) {
			System.out.println(l);
		}
		return risultatiRicerca;
	}
	
	public static List<Libro> ricercaAnnoPubblicazione(List<Lettura> libreria){
		  System.out.println("Inserisci anno di pubblicazione per la ricerca");
		    int annoInput;
		    try {
		        annoInput = Integer.parseInt(scanner.nextLine());
		    } catch (NumberFormatException e) {
		        System.err.println("Inserire un anno valido!");
		        return null;
		    }
		Query q = em.createQuery("SELECT l FROM Libro l WHERE l.annoPubblicazione = :anno");
		q.setParameter("anno", annoInput);
		List<Libro> risultati = q.getResultList();
		for(Lettura l : risultati) {
			System.out.println(l);
		}
		return risultati;
	}
	
	public static List<Lettura> ricercaAutore(List<Lettura> libreria) {
		System.out.println("Inserisci il nome dell'autore per la ricerca: ");
		String autore = scanner.nextLine();		
		Query q = em.createQuery("SELECT l FROM Libro l WHERE l.autore = :autore");
		q.setParameter("autore", autore);
		List<Libro> risultati = q.getResultList();
		for(Lettura l : risultati) {
			System.out.println(l);
		}
		return libreria;
	}
	
	public static List<Lettura> ricercaTitolo(){
		System.out.println("Inserici titolo (o parte di esso) per la ricerca");
		String titolo=scanner.nextLine();
		Query q = em.createQuery("SELECT l FROM Libro l WHERE LOWER(l.titolo) LIKE LOWER(:titolo)");
		q.setParameter("titolo", "%" + titolo + "%");
		List<Lettura> risultati = q.getResultList();
		for(Lettura l : risultati) {
			System.out.println(l);
		}
		return risultati;
	}
	
	public static void prendiInPrestito(){
		System.out.println("Inserisci isbn lettura da prendere in prestito- ");
		String isbnLettura=scanner.nextLine();
		Query q=em.createQuery("SELECT l FROM Libro l WHERE l.ISBN= :isbn", Libro.class);
		q.setParameter("isbn", isbnLettura);
		Lettura l=(Lettura) q.getSingleResult();
		System.out.println(l);
		lettureInPrestito.add(l);
		Date data= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, 1);
		Date data2 = cal.getTime();
		Prestito prestito = new Prestito(utenteAttivo,l.getTitolo(),data,data2,null,l);
		em.getTransaction().begin();
		em.persist(prestito);
		em.getTransaction().commit();
		System.out.println("Lettura presa in prestito con successo, ritornarla entro 1 mese");
	}
	
	public static void restituisciLettura() {
		Query controlloUtente = em.createQuery("SELECT p FROM Prestito p WHERE p.utente_id.numeroTessera = :numeroTessera");
	    controlloUtente.setParameter("numeroTessera", utenteAttivo.getNumeroTessera());
	    List<Prestito> prestitiUtente = controlloUtente.getResultList();
	    if(prestitiUtente.isEmpty()) {
	        System.out.println("L'account non ha letture in prestito.");
	        return;
	    }
	    System.out.println("Inserisci ISBN lettura da restituire");
	    String isbnRest= scanner.nextLine();
	    TypedQuery<Prestito> q=em.createQuery("SELECT p FROM Prestito p WHERE p.lettura.ISBN = :isbn AND p.utente_id.numeroTessera = :numeroTessera", Prestito.class);
	    q.setParameter("isbn", isbnRest);
	    q.setParameter("numeroTessera", utenteAttivo.getNumeroTessera());
	    List<Prestito> prestiti = q.getResultList();
	    if(prestiti.isEmpty()) {
	        System.out.println("Lettura non trovata in prestito.");
	    } else {
	        Prestito prestito = prestiti.get(0);
	        prestito.setDataRestituzioneEffettiva(new Date());
	        em.getTransaction().begin();
	        em.merge(prestito);
	        em.getTransaction().commit();
	        System.out.println("Lettura restituita correttamente.");
	        lettureInPrestito.remove(prestito.getLettura());
	    }
	}
	
	public static void ricercaLetturePrestitoUtente() {
	    int numeroTessera = utenteAttivo.getNumeroTessera();
	    Query q = em.createQuery("SELECT p.elementoPrestato FROM Prestito p LEFT JOIN p.utente_id u WHERE u.numeroTessera = :numeroTessera AND p.dataRestituzioneEffettiva IS NULL");
	    q.setParameter("numeroTessera", numeroTessera);
	    List<Lettura> risultati = q.getResultList();
	    if (risultati.isEmpty()) {
	        System.out.println("L'account " + utenteAttivo.getNome() + " " + utenteAttivo.getCognome() + " non ha letture in prestito.");
	    } else {
	        System.out.println("Lista letture in prestito dell'account: " + utenteAttivo.getNome() + " " + utenteAttivo.getCognome());
	        System.out.println(risultati);
	    }
	}
	
	public static void ricercaPrestitiScaduti() {
		Query q = em.createQuery("SELECT p FROM Prestito p WHERE p.dataRestituzionePrevista < :dataOggi AND p.dataRestituzioneEffettiva IS NULL");
		q.setParameter("dataOggi", null);
		List<Prestito> risultati = q.getResultList();
		  if(risultati.isEmpty()) {
		        System.out.println("Nessuna lettura consegnata in ritardo");
		    } else {
		    	System.out.println("Lista letture con consegna scaduta (ancora da restituire): ");
				System.out.println(risultati);
		    }	
	}
	
}
