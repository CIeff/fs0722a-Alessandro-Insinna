package provadbconn;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbConnection {
	
	String url="jdbc:postgresql://localhost:5432/";
	String dbName="javadb";
	String username="postgres";
	String password="root";
	Connection conn;
	Statement st;
	
	public DbConnection() throws SQLException {
		this.conn=DriverManager.getConnection(url+dbName,username,password);
		this.st=conn.createStatement();
	}
	
	public void creaTabellaUtenti() throws SQLException {
		String sql="CREATE TABLE IF NOT EXISTS utente ("
					+ "	id SERIAL PRIMARY KEY, "
					+ "	nome VARCHAR NOT NULL,"
					+ "	cognome VARCHAR NOT NULL,"
					+ "data_nascita Date NOT NULL,"
					+ "anni INT4 NOT NULL,"
					+ "email VARCHAR NOT NULL UNIQUE"
					+ ");";
		this.st.executeUpdate(sql);
	}
	
	public void salvaUtente(Utente u) throws SQLException 
	{String sql = "INSERT INTO Utente (nome, cognome, data_nascita, anni, email)"
            + " VALUES ('" + u.nome + "', '" + u.cognome + "', '" + u.data_nascita+ "',"
            +      " " + u.anni + ", '" + u.email+ "')"; 
		this.st.executeUpdate(sql);
	}
	
	public List<Utente> leggiUtenti() throws SQLException {
		List<Utente> listaUtenti= new ArrayList<Utente>();
		String sql="SELECT * FROM Utente";
		ResultSet res= this.st.executeQuery(sql);
		while(res.next()) {
			int id=res.getInt("id");
			String nome=res.getString("nome");
			String cognome=res.getString("cognome");
			String data_nascita=res.getString("data_nascita");
			int anni=res.getInt("anni");
			String email=res.getString("email");	
			
			Utente u= new Utente(id,nome,cognome,data_nascita,anni,email);
			listaUtenti.add(u);
			
			};
			return listaUtenti;				
		}
	
	public void modificaUtente(Utente u) throws SQLException {
		String sql="UPDATE Utente SET nome='RinoPino',cognome='FinoGino' WHERE Utente.nome='Mario'";
		this.st.executeUpdate(sql);
	}
	
	public void svuotaListaUtente() throws SQLException {
		String sql="TRUNCATE Utente";
		this.st.executeUpdate(sql);
	}
	
	public Utente LeggiUtenteDaId(int id) throws SQLException {
		String sql="SELECT * FROM Utente WHERE id="+id;
		ResultSet res=this.st.executeQuery(sql);
		if(res.next()) {
			int id1=res.getInt("id");
			String nome=res.getString("nome");
			String cognome=res.getString("cognome");
			String data_nascita=res.getString("data_nascita");
			int anni=res.getInt("anni");
			String email=res.getString("email");	
			
			return new Utente(id1,nome,cognome,data_nascita,anni,email);
		}else {
			return null;
		}
	}
	
	public void eliminaUtente(Utente u) throws SQLException{
		String sql="DELETE FROM Utente WHERE Utente.id="+u.id_utente;
		this.st.executeUpdate(sql);
	}
				
		
	
}
