package model;

import javax.persistence.Entity;


@Entity
public class PartitaDiCalcio extends Evento {

	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private int numeroGolSquadraDiCasa;
	private int numeroGolSquadraOspite;
	public PartitaDiCalcio() {
		super();
	}
	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}
	public String getSquadraOspite() {
		return squadraOspite;
	}
	public String getSquadraVincente() {
		return squadraVincente;
	}
	public int getNumeroGolSquadraDiCasa() {
		return numeroGolSquadraDiCasa;
	}
	public int getNumeroGolSquadraOspite() {
		return numeroGolSquadraOspite;
	}
	public void setSquadraDiCasa(String squadraDiCasa) {
		this.squadraDiCasa = squadraDiCasa;
	}
	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}
	public void setSquadraVincente(String squadraVincente) {
		this.squadraVincente = squadraVincente;
	}
	public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
		this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
	}
	public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}
	@Override
	public String toString() {
		return "PartitaDiCalcio [squadraDiCasa=" + squadraDiCasa + ", squadraOspite=" + squadraOspite
				+ ", squadraVincente=" + squadraVincente + ", numeroGolSquadraDiCasa=" + numeroGolSquadraDiCasa
				+ ", numeroGolSquadraOspite=" + numeroGolSquadraOspite + "]";
	}
	
	
}
