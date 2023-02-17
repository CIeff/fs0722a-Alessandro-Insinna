package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the credenziali database table.
 * 
 */
@Entity
@NamedQuery(name="Credenziali.findAll", query="SELECT c FROM Credenziali c")
public class Credenziali implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_credenziali")
	private Integer idCredenziali;

	private String email;

	private String password;

	//bi-directional one-to-one association to Utente
	@OneToOne
	@JoinColumn(name="id_credenziali")
	private Utente utente;

	public Credenziali() {
	}

	public Integer getIdCredenziali() {
		return this.idCredenziali;
	}

	public void setIdCredenziali(Integer idCredenziali) {
		this.idCredenziali = idCredenziali;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}