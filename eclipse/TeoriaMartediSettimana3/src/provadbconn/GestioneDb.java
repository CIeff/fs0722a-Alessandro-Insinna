package provadbconn;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestioneDb {

	static List<Utente> listaUtenti= new ArrayList<Utente>();
	
	public static void main(String[] args) {
		
		try {
			DbConnection dbConn= new DbConnection();
			dbConn.creaTabellaUtenti();
			//dbConn.svuotaListaUtente();
			Utente u= new Utente("Mario","Rossi","1/8/1999",23,"ma@rio.mario");
			Utente u2= new Utente("Giuseppe","Rosso","1/8/1999",23,"ma@oir.mario");
			//dbConn.salvaUtente(u);
			//dbConn.salvaUtente(u2);
			dbConn.modificaUtente(u2);
			Utente utd= dbConn.LeggiUtenteDaId(29);
			System.out.println(utd);
			//dbConn.salvaUtente(utd);
			//dbConn.eliminaUtente(utd);
			listaUtenti=dbConn.leggiUtenti();
			for ( Utente ut: listaUtenti) {
				System.out.println(ut);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
