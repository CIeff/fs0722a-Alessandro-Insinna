package test.log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	
	static Logger log = LoggerFactory.getLogger(MainProject.class);

	public static void main(String[] args) {
	
//		log.info("Test Logger!!!");
//		log.error("Test Error");
//		log.warn("Test Warning");
//		log.debug("Test Debug");
		
		//TestCollection();
		//TestList();
		//TestSet();
		//TestMap();
		//TestQueue();
		
	}
	
	public static void TestCollection() {
		Collection<String> c = new ArrayList<String>();
		// non memorizza l'ordine in cui sono memorizzati gli elementi
		// non definisce se ci possono essere valori duplicati
		// non può contenere valori primitivi
		
		c.add("Primo Elemento");
		c.add("Secondo Elemento");
		c.add("Terzo Elemento");
		
		boolean b = c.contains("Secondo Elemento");
		log.info("Contains 'Secondo Elemento': " + b);
		
		boolean isEmp = c.isEmpty();
		log.info("Contains isEmpty: " + isEmp);
		
		int s = c.size();
		log.info("Contains Size: " + s);
		
		c.remove("Primo Elemento");
		
		boolean be = c.contains("Primo Elemento");
		log.info("Contains 'Primo Elemento': " + be);

		c.clear();
		
		boolean emp = c.isEmpty();
		log.info("Contains isEmpty: " + emp);
	}

	public static void TestList() {
		List<String> l = new ArrayList<String>();
		// gli oggetti sono ordinati in base all'ordine di inserimento
		// può contenere duplicati
		// consente di aggiungere elementi specificando l'indice
		// consente di leggere elementi specificando l'indice
		
		l.add("Primo Elemento");
		l.add("Secondo Elemento");
		l.add("Terzo Elemento");
		
		boolean b = l.contains("Secondo Elemento");
		log.info("Contains 'Secondo Elemento': " + b);
		
		boolean isEmp = l.isEmpty();
		log.info("Contains isEmpty: " + isEmp);
		
		int s = l.size();
		log.info("Contains Size: " + s);
		
		l.remove("Primo Elemento");
		
		boolean be = l.contains("Primo Elemento");
		log.info("Contains 'Primo Elemento': " + be);

		//l.clear();
		
		boolean emp = l.isEmpty();
		log.info("Contains isEmpty: " + emp);
		
		// Metodi di List
		
		String ele = l.get(0);
		log.info("Contains: " + ele);
		
		l.set(0, "Elemento Modifificato");
		log.info("Contains: " + l.get(0));
		
		log.info("Contains index Element: " + l.indexOf("Elemento Modifificato"));
		
		Object[] a =  l.toArray();  
	}

	public static void TestSet() {
		Set<String> s = new HashSet<String>();
		// gli oggetti NON sono ordinati
		// NON può contenere duplicati
		
		s.add("Primo Elemento");
		s.add("Secondo Elemento");
		s.add("Terzo Elemento");
		
		boolean b = s.contains("Secondo Elemento");
		log.info("Contains 'Secondo Elemento': " + b);
		
		boolean isEmp = s.isEmpty();
		log.info("Contains isEmpty: " + isEmp);
		
		int size = s.size();
		log.info("Contains Size: " + size);
		
		s.remove("Primo Elemento");
		
		boolean be = s.contains("Primo Elemento");
		log.info("Contains 'Primo Elemento': " + be);

		s.clear();
		
		boolean emp = s.isEmpty();
		log.info("Contains isEmpty: " + emp);
		
	}

	public static void TestMap() {
		Map<String, String> m = new HashMap<String, String>();
		// non può contenere valori primitivi
		// non memorizza l'ordine in cui sono memorizzati gli elementi
		
		m.put("a", "Primo Elemento");
		m.put("b", "Secondo Elemento");
		m.put("c", "Terzo Elemento");
		
		boolean b = m.containsKey("k");
		log.info("Contains 'k': " + b);
		
		String ele = m.get("b");
		log.info("Contains: " + ele);
		
		m.isEmpty();
		
		Set<String> setKey =  m.keySet();
		
		m.remove("a");
		
		m.size();
		
		m.clear();
		
		
	}

	public static void TestQueue() {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("Primo Elemento");
		q.add("Secondo Elemento");
		q.add("Terzo Elemento");
		
		boolean b = q.contains("Secondo Elemento");
		log.info("Contains 'Secondo Elemento': " + b);
		
		boolean isEmp = q.isEmpty();
		log.info("Contains isEmpty: " + isEmp);
		
		String primoPeek = q.peek();
		log.info("Contains 'Primo Elemento': " + primoPeek);
		
		String primoPoll =q.poll();
		log.info("Contains 'Primo Elemento': " + primoPoll);
		
		q.remove();
		
		int s = q.size();
		log.info("Contains Size: " + s);
	
		q.clear();
		
		isEmp = q.isEmpty();
		log.info("Contains isEmpty: " + isEmp);
	}
}
