package progetto_settimanale.java;

public class Video extends ElementoMultimediale implements RegVideo {

	private int volume;
	private int luminosita;
	
	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata);
		this.volume=volume;
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

	@Override
	public void abbassaVolume(int n) {
		if(this.volume-n<=0) {
			this.volume=0;
			System.out.println("volume a 0, impossibile abbassarlo ulteriormente");
			System.out.println("volume: "+this.volume);
		}else {
			this.volume-=n;	
			System.out.println("volume: "+this.volume);
		}	
	}

	@Override
	public void alzaVolume(int n) {
		this.volume+=n;		
		System.out.println("volume: "+this.volume);
	}
	
	@Override
	public void play() {
		String t="";
		for(int x=0;x<volume;x++) {
			t+="!";
		}
		String b="";
		for(int z=0;z<luminosita;z++) {
			b+="*";
		}
		for(int i=0;i<this.durata;i++) {
			System.out.println(this.titolo+" "+t+" "+b);
		}
		
	}
	
}
