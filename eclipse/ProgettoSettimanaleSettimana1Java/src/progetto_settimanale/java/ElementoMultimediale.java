package progetto_settimanale.java;

//classe astratta dalla quale derivare i 3 tipi di file multimediali (foto/audio/video)
abstract class ElementoMultimediale {
	
	String titolo;
	int durata;
	
	//costruttori
	public ElementoMultimediale(String titolo, int durata) {
		super();
		this.titolo = titolo;
		this.durata = durata;
	}
	
	public ElementoMultimediale(String titolo) {
		super();
		this.titolo = titolo;
		this.durata = 0;
	}

	
	//getters & setters
	public String getTitolo() {
		return titolo;
	}

	public int getDurata() {
		return durata;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}
	
	//metodi
	public void play() {
		System.out.print("play");
	};
}
