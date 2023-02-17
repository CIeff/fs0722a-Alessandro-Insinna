package mainProject;

import java.util.Date;

import dao.EventoDAO;
import model.Evento;
import model.PartitaDiCalcio;
import model.TipoEvento;

public class GestioneEventi {

	public static void main(String[] args) {
		Evento e = saveEvento();
		System.out.println(e);
	}
	
	public static PartitaDiCalcio saveEvento() {
		PartitaDiCalcio ev = new PartitaDiCalcio();
		ev.setTitolo("derby");
		ev.setDescrizione("derby");
		ev.setDataEvento(new Date());
		ev.setTipoEvento(TipoEvento.PUBBLICO);
		ev.setNumeroMassimoPartecipanti(350);
		ev.setNumeroGolSquadraDiCasa(2);
		ev.setNumeroGolSquadraOspite(1);
		ev.setSquadraDiCasa("Roma");
		ev.setSquadraOspite("Lazio");
		ev.setSquadraVincente("Roma");
		
		EventoDAO evDao = new EventoDAO();
		evDao.save(ev);
		
		return ev;
	}

}
