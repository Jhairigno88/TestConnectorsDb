package it.sincrono.corso.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.sincrono.corso.dao.Dao;

public class ActorImpl implements ActorUtility {
	
	private Connection c= null;
	private List<Actor> lista= new ArrayList();
	private Actor a=null;
	@Override
	public int createActor(String n, String c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Actor> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int upDateActor(String n, String c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String deleteActorbyID(Sgtring id) {
		c=Dao.getConnection();
		
		try {
			Statement d=this.c.createStatement();
			ResultSet r=d.executeQuery("delete from actor where actor_id='"+id+"';");
			while (r.next()) {
				a=new Actor();
				a.setActor_id(r.getString("actor_id"));
				lista.remove(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return id;
	}

	@Override
	public List<Actor> findByName(String n) {
		
		c= Dao.getConnection();
		try {
			Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select * from actor where first_name='"+n+"';");
		while(r.next()) {
			
				a=new Actor();
				
				a.setFirst_Name(r.getString("first_name"));
				a.setName(r.getString("last_name"));
				lista.add(a);
			}
		
		} catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public List<Actor> findById(int id) {
	
		c= Dao.getConnection();
		
		
		
		return null;
	}
	
}
		


