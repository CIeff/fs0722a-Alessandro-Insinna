package progetto_settimanale.java;

public class Audio extends ElementoMultimediale  implements RegAudio{

	private int volume;
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata);
		this.volume=volume;
		
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
		for(int i=0;i<this.durata;i++) {
			System.out.println(this.titolo+" "+t);
		}
		
	}

	
}
