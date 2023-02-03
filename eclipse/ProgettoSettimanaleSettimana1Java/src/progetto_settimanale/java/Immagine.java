package progetto_settimanale.java;

public class Immagine extends ElementoMultimediale implements RegImmagine{

	int luminosita;	
	
	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita=luminosita;
	}

	@Override
	public void aumentaLuminosita(int n) {
		this.luminosita+=n;
		System.out.println("luminosita: "+this.luminosita);		
	}

	@Override
	public void abbassaLuminosita(int n) {
		if(this.luminosita-n<=0) {
			this.luminosita=0;
			System.out.println("luminosita a 0, impossibile abbassarla ulteriormente");
			System.out.println("luminosita: "+this.luminosita);
		}else {
			this.luminosita-=n;
			System.out.println("luminosita: "+this.luminosita);
		}
	}
	
	/*
	@Override
	public void play() {
	}
	*/
	
	@Override
	public void show() {
		String im="";
		for(int a=0;a<luminosita;a++) {
			im+="*";
		}
		System.out.println(this.titolo+" "+im);
	}
	
	
}
