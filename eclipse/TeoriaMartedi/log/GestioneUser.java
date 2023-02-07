package test.log;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GestioneUser {
	
	private List<User> listaUtenti = new ArrayList<User>();
	Logger log = LoggerFactory.getLogger(MainProject.class);

	public void addToList(User u) {
		if(!listaUtenti.contains(u)) {
			listaUtenti.add(u);
		} else {
			log.error(u.getNome() + " " + u.getCognome() + " già inserito!!!");
		} 
	}
	
	public void removeToList(User u) {
		if(listaUtenti.contains(u)) {
			listaUtenti.remove(u);
		} else {
			log.error(u.getNome() + " " + u.getCognome() + " non è presente nella lista!!!");
		}
	}

	public void printList() {
		for (User user : listaUtenti) {
			log.info(user.toString());
		}
		
		for (int i = 0; i < listaUtenti.size(); i++) {
			log.info(listaUtenti.get(i).toString());
		}
	}

	public User getUserByIndex(int index) {
		return listaUtenti.get(index);
	}

	public void updateUser(User u, int index) {
		listaUtenti.set(index, u);
	}

}
