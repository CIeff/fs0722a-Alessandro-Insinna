package corso_java;

public class Veicolo {

	String modello;
	String marca;
	String targa;
	String colore;
	int cilindrata;
	static int count;
	int conta;
	
	public Veicolo(String modello, String marca, String targa, String colore, int cilindrata) {
		this.modello=modello;
		this.marca=marca;
		this.targa=targa;
		this.colore=colore;
		this.cilindrata=cilindrata;
		this.conta=count;
		count++;
	}
	
	public Veicolo(String modello, String marca, int cilindrata) {
		this.modello=modello;
		this.marca=marca;
		this.cilindrata=cilindrata;	
		this.conta=count;
		count++;
	}	
	
	public Veicolo(String modello, String marca, int cilindrata, String colore) {
		this.modello=modello;
		this.marca=marca;
		this.cilindrata=cilindrata;
		this.colore=colore;
		this.conta=count;
		count++;
	}
	
	public void start() {
		System.out.println("veicolo avviato");
	}
	
	public void stop() {
		System.out.print("veicolo fermo");
	}
	
	public String info() {
		return this.marca+ " "+ this.modello+" "+this.colore+
				" "+this.targa+" cc:"+this.cilindrata;
	}
	
}


