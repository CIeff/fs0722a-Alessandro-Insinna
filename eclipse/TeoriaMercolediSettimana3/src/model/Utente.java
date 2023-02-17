package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_utente")
	private Integer idUtente;

	@Column(name="citta_utente")
	private String cittaUtente;

	@Column(name="cognome_utente")
	private String cognomeUtente;

	@Column(name="nome_utente")
	private String nomeUtente;

	//bi-directional one-to-one association to Credenziali
	@OneToOne(mappedBy="utente")
	private Credenziali credenziali;

	//bi-directional many-to-one association to Post
	@OneToMany(mappedBy="utente")
	private List<Post> posts;

	//bi-directional many-to-many association to Gruppo
	@ManyToMany
	@JoinTable(
		name="appartiene"
		, joinColumns={
			@JoinColumn(name="id_utente")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_gruppo")
			}
		)
	private List<Gruppo> gruppos;

	public Utente() {
	}

	public Integer getIdUtente() {
		return this.idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getCittaUtente() {
		return this.cittaUtente;
	}

	public void setCittaUtente(String cittaUtente) {
		this.cittaUtente = cittaUtente;
	}

	public String getCognomeUtente() {
		return this.cognomeUtente;
	}

	public void setCognomeUtente(String cognomeUtente) {
		this.cognomeUtente = cognomeUtente;
	}

	public String getNomeUtente() {
		return this.nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public Credenziali getCredenziali() {
		return this.credenziali;
	}

	public void setCredenziali(Credenziali credenziali) {
		this.credenziali = credenziali;
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Post addPost(Post post) {
		getPosts().add(post);
		post.setUtente(this);

		return post;
	}

	public Post removePost(Post post) {
		getPosts().remove(post);
		post.setUtente(null);

		return post;
	}

	public List<Gruppo> getGruppos() {
		return this.gruppos;
	}

	public void setGruppos(List<Gruppo> gruppos) {
		this.gruppos = gruppos;
	}

}