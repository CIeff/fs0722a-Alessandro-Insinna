package progettoSettimanale;

public class Libro extends Lettura{
	
	private String autore;
    private String genere;

	public Libro(String ISBN, String titolo, int annoPubblicazione, int numeroPagine,String autore, String genere) {
		super(ISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore=autore;
		this.genere=genere;
	}
	
	  public String getAutore() {
	        return autore;
	    }

	    public String getGenere() {
	        return genere;
	    }
}
