package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Evento;

public class EventoDAO {
	
	static EntityManagerFactory emf= Persistence.createEntityManagerFactory("EsercizioGiovediSettimana3");
	static EntityManager em=emf.createEntityManager();
	static Logger log = LoggerFactory.getLogger(EventoDAO.class);
	
	public void save(Evento e) {		
		try {
			em.getTransaction().begin();
			em.persist(e);
			em.getTransaction().commit();
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
	}

	public Evento getById(Long id) {		
		try {
			em.getTransaction().begin();
			return em.find(Evento.class, id);
		} finally {
			em.close();
		}
		
	}
	
	public void delete(Evento e) {		
		try {
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
		} catch (Exception ec) {
			em.getTransaction().rollback();
			log.error(ec.getMessage());
		} finally {
			em.close();
		}
		
	}
	
	public void refresh(Evento e) {		
		try {
			em.getTransaction().begin();
			em.refresh(e);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

}
