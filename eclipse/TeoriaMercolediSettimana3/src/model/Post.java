package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the post database table.
 * 
 */
@Entity
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_post")
	private Integer idPost;

	@Column(name="data_post")
	private Timestamp dataPost;

	@Column(name="testo_post")
	private String testoPost;

	//bi-directional many-to-one association to Utente
	@ManyToOne
	@JoinColumn(name="id_utente")
	private Utente utente;

	public Post() {
	}

	public Integer getIdPost() {
		return this.idPost;
	}

	public void setIdPost(Integer idPost) {
		this.idPost = idPost;
	}

	public Timestamp getDataPost() {
		return this.dataPost;
	}

	public void setDataPost(Timestamp dataPost) {
		this.dataPost = dataPost;
	}

	public String getTestoPost() {
		return this.testoPost;
	}

	public void setTestoPost(String testoPost) {
		this.testoPost = testoPost;
	}

	public Utente getUtente() {
		return this.utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

}