package esercizio.giovedi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		
		//instanziaERiempiProdotti();
		//ProdottiCategoriaBooksConPrezzoMag100(instanziaERiempiProdotti());
		
		

		List<Product> prova1= new ArrayList<Product>();
		Product p1= new Product(1123,"Libro>100","books",223.3);
		Product p2= new Product(1143,"Libro<100","books",23.3);
		Product p3= new Product(1153,"Libro>100","asd",1.98);
		Product p4= new Product(1123,"Libro2>100","books",243.3);
		prova1.add(p1);
		prova1.add(p4);
		prova1.add(p2);
		prova1.add(p3);
		
		LocalDate data1= LocalDate.of(2022,12,13);
		
		Customer Pino= new Customer(11,"Pino",1);
		Customer Rino= new Customer(11,"Pino",1);
		Customer Fino= new Customer(11,"Pino",2);
		
		Order ordine1= new Order(1,"spedito",data1,data1,prova1,Pino);
		

		List<Product> prova2= new ArrayList<Product>();
		Product p11= new Product(1151,"prodotto baby","baby",223.3);
		Product p22= new Product(1163,"Libro<100","books",23.3);
		Product p33= new Product(1877,"prodotto baby2","baby",1.98);
		Product p44= new Product(1845,"Libro2>100","books",243.3);
		prova2.add(p11);
		prova2.add(p44);
		prova2.add(p22);
		prova2.add(p33);
		
		Order ordine2= new Order(2,"spedito",data1,data1,prova2,Pino);
		
		
		List<Product> prova3= new ArrayList<Product>();
		Product p111= new Product(1155,"prodotto ","boys",223.3);
		Product p222= new Product(1167,"Libro<100","asd11",23.3);
		Product p333= new Product(1887,"prodotto baby2","baby",1.98);
		Product p444= new Product(1836,"Libro2>100","boys",243.3);
		prova3.add(p111);
		prova3.add(p444);
		prova3.add(p222);
		prova3.add(p333);
		
		Order ordine3= new Order(3,"spedito",data1,data1,prova3,Pino);
		
		List<Order> listaOrdini= new ArrayList<Order>();
		listaOrdini.add(ordine1);
		listaOrdini.add(ordine2);
		listaOrdini.add(ordine3);
		
		//ProdottiCategoriaBooksConPrezzoMag100(prova1);
		//ListaOrdiniConAlmeno1Baby(listaOrdini);
		ProdottiBoys(prova3);
	}
	
	public static List<Product> instanziaERiempiProdotti(){
		List<Product> prodotti= new ArrayList<Product>();
		
		System.out.println("Vuoi inizializzare un prodotto? (y/n)");
		String risposta=scanner.nextLine();
		while(risposta.equals("y")) {
			System.out.println("Inserisci id prodotto- ");
			long idProd=Integer.parseInt(scanner.nextLine());
			System.out.println("Inserisci nome prodotto- ");
			String nomeProd=scanner.nextLine();
			System.out.println("Inserisci categoria prodotto- ");
			String catProd=scanner.nextLine();
			System.out.println("Inserisci prezzo prodotto- ");
			double prezzoProd=Double.parseDouble(scanner.nextLine());
			
			Product prodotto= new Product(idProd,nomeProd, catProd,prezzoProd);
			prodotti.add(prodotto);
			System.out.println("Prodotto instanziato con successo");
			System.out.println("Vuoi inizializzare un prodotto? (y/n)");
			risposta=scanner.nextLine();
		}
		System.out.println("Fine inizializzazione prodotti");			
		
		return prodotti;
	}
	
	public static void ProdottiCategoriaBooksConPrezzoMag100(List<Product> prodotti) {
		Stream<Product> streamProd = prodotti.stream();
		List<Product> prodottiFiltrati = streamProd.filter(el -> "books".equals(el.getCategory()) && el.getPrice() > 100)
			.collect(Collectors.toList());

		for (Product prodotto : prodottiFiltrati) {
			System.out.println(prodotto);
		}
		
		System.out.println();
	}

	public static void ListaOrdiniConAlmeno1Baby(List<Order> ordini) {
		Stream<Order> streamOrdini = ordini.stream();
		List<Order> ordiniArr = streamOrdini.filter(ordine -> ordine.products.stream()
			.anyMatch(prodotto -> prodotto.getCategory().equals("baby")))
			.collect(Collectors.toList());
		

		for (Order ordine : ordiniArr) {
			System.out.println(ordine.toString());
		}
	}
	
	public static void ProdottiBoys(List<Product> prodotti) {
	    Stream<Product> streamProdotti = prodotti.stream();
	    List<Product> prodottiFiltrati = streamProdotti
	    		.filter(el -> "boys".equals(el.getCategory()))
	            .map(el -> new Product(el.getId(), el.getName(), el.getCategory(), el.getPrice() / 100 * 10))
	            .collect(Collectors.toList());

	    
	    for (Product prodotto : prodottiFiltrati) {
	        System.out.println(prodotto);
	    }
	}

	
}

