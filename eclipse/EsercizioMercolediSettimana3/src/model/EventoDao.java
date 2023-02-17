package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDao {
	
	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("EsercizioMercolediSettimana2");
	static EntityManager em=emf.createEntityManager();
	
	
	public void save(Evento e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Evento aggiunto con successo");
		em.close();
	}
	
	public  Evento getById(int id) {
		em.getTransaction().begin();
		Evento e= em.find(Evento.class,id);
		em.getTransaction().commit();
		em.close();
		if(e != null) {
			System.out.println("Evento trovato: "+e);
		}else {
			System.out.println("Non ci sono eventi con l'id inserito");
		}
		
		return e;
	}
	
	public  void delete(Evento e) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Evento rimosso con successo");
		em.close();
	}
	
	public  void refresh (Evento e) {
		em.getTransaction().begin();
		em.refresh(e);
		em.getTransaction().commit();
		System.out.println("Evento refreshed!");
		em.close();
	}

}
