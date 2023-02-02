package corso_java;

public class Automobile extends Veicolo implements Navigatore{

	
	
	private int porte;
	private int cilindrata;

	public Automobile(String marca, String modello,int cilindrata, int porte) {
		super(marca, modello);
		this.porte = porte;
	}

	public int getPorte() {
		return porte;
	}
	public int getCilindrata() {
		return cilindrata;
	}
		

	@Override
	public String aggiorna() {
		// TODO Auto-generated method stub
		return "Navigatore automobile aggiornato";
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Navigatore automobile acceso";
	}

	@Override
	public String impostaMappa() {
		// TODO Auto-generated method stub
		return "Imposta mappa";
	}

	@Override
	public String avvia() {
		// TODO Auto-generated method stub
		return "Navigatore automobile avviato";
	};

}




