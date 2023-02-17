package progettoSettimanale;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Lettura")
public abstract class Lettura implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String ISBN;
    private String titolo;
    private int annoPubblicazione;
    private int numeroPagine;
    
    @OneToOne(mappedBy = "lettura")
    private Prestito prestito;

    public Lettura(String ISBN, String titolo, int annoPubblicazione, int numeroPagine) {
        this.ISBN = ISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public Lettura() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

	@Override
	public String toString() {
		return "Lettura--- ISBN=" + ISBN + ", titolo=" + titolo + ", annoPubblicazione=" + annoPubblicazione
				+ ", numeroPagine=" + numeroPagine + " ";
	}

   
}
