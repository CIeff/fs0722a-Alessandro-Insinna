package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Utente;

public class GestioneUtenteJpa {

	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("TeoriaMartediSettimana3Pt2");
	static EntityManager em=emf.createEntityManager();
	
	public static void main(String[] args) {
	
		Utente u= new Utente();
		u.setNome("Mario");
		u.setCognome("Rossi");
		u.setEmail("mario@gmail.com");
		
		addUtente(u);
		
		
	}

	private static void addUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto con successo nel database");
	}
	
}
