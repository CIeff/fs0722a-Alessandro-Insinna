package progettoSettimanale;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Rivista")
public class Rivista extends Lettura {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Periodicità periodicità;
	
	public Rivista(String ISBN, String titolo, int annoPubblicazione, int numeroPagine,Periodicità periodicità) {
		super(ISBN, titolo, annoPubblicazione, numeroPagine);
		this.periodicità=periodicità;
	}
	

	public Rivista() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Periodicità getPeriodicità() {
		return periodicità;
	}


	@Override
	public String toString() {
		return "Rivista --- ISBN= "+getISBN()+" "+"periodicità=" + periodicità + "";
	}
	

}
