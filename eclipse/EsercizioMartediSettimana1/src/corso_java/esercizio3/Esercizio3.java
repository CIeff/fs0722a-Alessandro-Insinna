package corso_java.esercizio3;

public class Esercizio3 {

	public static void main(String[] args) {
		
		
		Cliente cliente1= new Cliente(28, "Pino","Insegno","pi@no.nsegno","2022-10-08");
		cliente1.mostraCliente();

		System.out.println("=======================================================");
		
		Carrello carrelloCliente1= new Carrello(cliente1,null,0);
		
		Articolo articolo1= new Articolo(11,"ciabatte",4.56,40);
		articolo1.stampaArticolo();
		
		Articolo articolo2= new Articolo(12,"cuffie",6.24,24);
		articolo2.stampaArticolo();
		
		Articolo.stampaStock();		
		System.out.println("=======================================================");
		
		carrelloCliente1.mostraCliente();		
		System.out.println("=======================================================");
		
		carrelloCliente1.aggiungiArticolo(articolo1);
		System.out.println("=======================================================");
		carrelloCliente1.aggiungiArticolo(articolo2);
		
		System.out.println("=======================================================");
		Articolo.stampaStock();
		carrelloCliente1.prezzoArticoli();
				
	}
	

}
