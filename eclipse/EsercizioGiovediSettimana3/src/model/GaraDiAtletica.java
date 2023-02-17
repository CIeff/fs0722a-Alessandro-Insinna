package model;

import java.util.Arrays;

import javax.persistence.Entity;

@Entity
public class GaraDiAtletica extends Evento {

	private Persona[] setAtleti;
	private Persona vincitore;
	public GaraDiAtletica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona[] getSetAtleti() {
		return setAtleti;
	}
	public Persona getVincitore() {
		return vincitore;
	}
	public void setSetAtleti(Persona[] setAtleti) {
		this.setAtleti = setAtleti;
	}
	public void setVincitore(Persona vincitore) {
		this.vincitore = vincitore;
	}
	@Override
	public String toString() {
		return "GaraDiAtletica [setAtleti=" + Arrays.toString(setAtleti) + ", vincitore=" + vincitore + "]";
	}
	
}
