package progettoSettimanale;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Libro")
public class Libro extends Lettura{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String autore;
    private String genere;

	public Libro(String ISBN, String titolo, int annoPubblicazione, int numeroPagine,String autore, String genere) {
		super(ISBN, titolo, annoPubblicazione, numeroPagine);
		this.autore=autore;
		this.genere=genere;
	}
	
	
	  public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getAutore() {
	        return autore;
	    }

	    public String getGenere() {
	        return genere;
	    }


		@Override
		public String toString() {
			return "Libro --- titolo="+getTitolo()+" "+ "autore=" + autore + ", genere=" + genere + "";
		}
	    
}
