package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the gruppo database table.
 * 
 */
@Entity
@NamedQuery(name="Gruppo.findAll", query="SELECT g FROM Gruppo g")
public class Gruppo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_gruppo")
	private Integer idGruppo;

	@Column(name="nome_gruppo")
	private String nomeGruppo;

	//bi-directional many-to-many association to Utente
	@ManyToMany(mappedBy="gruppos")
	private List<Utente> utentes;

	public Gruppo() {
	}

	public Integer getIdGruppo() {
		return this.idGruppo;
	}

	public void setIdGruppo(Integer idGruppo) {
		this.idGruppo = idGruppo;
	}

	public String getNomeGruppo() {
		return this.nomeGruppo;
	}

	public void setNomeGruppo(String nomeGruppo) {
		this.nomeGruppo = nomeGruppo;
	}

	public List<Utente> getUtentes() {
		return this.utentes;
	}

	public void setUtentes(List<Utente> utentes) {
		this.utentes = utentes;
	}

}