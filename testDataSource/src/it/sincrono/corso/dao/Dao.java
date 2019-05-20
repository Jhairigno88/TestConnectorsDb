package it.sincrono.corso.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

//creo la claase Data Acces Object
public class Dao {
	//sfrutta due istanze
	//SINGLETON classe che ha costruttore privato, � un deisgn pattern che permette di istanziare la sola classe una volta.
	//FACTORY METHOD
	
	private static Dao d=null;
	// i modificatori di accesso devono sempre essere impostati come static.
	private static Connection c=null;
	private static DataSource ds=null;
	//al costruttore privato daremo il compito di istanziare le classi che ci serviranno
	private Dao() {
			try {
				Context initCtx= new InitialContext();
				Context envCtx= (Context) initCtx.lookup("java:comp/env");
				//metodo che fa un look up sulla componente java a livello di ambiente (enviroment) 
				//che sono stati applicati.
				//questo tipo di metodo restituisce un oggetto di tipo object, 
				//ed � il motivo per cui si restituisce 
				//un cast(Context)
				 ds = (DataSource)envCtx.lookup("jdbc/sakila");
				//secondo LOOKUP che va a cercare un data source che si chiama appunto sakila
				//anche questo metodo ci restituisce un object e va quindi castato come anche 
				//il LOOKUP di sopra.
	
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	//struttura del metodo che permetter� la connessione.
	public static Connection getConnection() {
		
			if(ds==null) {
				new Dao();
			}//se la classe ds � ancora a null allora richiamer� un nuovo costruttore
		
			try {
				c=ds.getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return c;
	}
	
	
	//factory method, ovvero,il metodo che ritorna l'oggetto istanziato dalla classe.
	public Dao getDao() {
		return d;
	}
	
	
}
