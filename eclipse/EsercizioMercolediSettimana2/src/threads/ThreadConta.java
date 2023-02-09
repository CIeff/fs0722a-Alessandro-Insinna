package threads;

public class ThreadConta extends Thread {

	private int[] n;
	int x;
	int o;
	private int somma;
	
	public ThreadConta(int[] n,int x, int o) {
		this.n=n;
		this.x=x;
		this.o=o;
	}

	@Override
	public void run() {
		conta();
	}

	public int conta() {
		for(int i=x;i<o;i++) {
			this.somma+=n[i];
		}
		System.out.println("Somma parziale thread-> "+somma);
		return somma;		
	}

	
	
}
