package oop.java;

public class Veicolo {

	//public (visibile a tutti) private (visibile solo nella classe in cui l'ho definito)
	//protected 
	
private	String modello;
private String marca;
private	String targa;
private	String colore;
		
	public Veicolo(String modello, String marca, String targa, String colore) {
		this.modello=modello;
		this.marca=marca;
		this.targa=targa;
		this.colore=colore;
	}

	public String getModello() {
		return modello;
	}

	public String getMarca() {
		return marca;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
		
	}
	
	
}
