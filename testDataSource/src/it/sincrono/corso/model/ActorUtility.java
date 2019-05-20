package it.sincrono.corso.model;

import java.util.List;

public interface ActorUtility {
	
	public int createActor(String n, String c);
	
	public List<Actor> readAll();
	
	public int upDateActor(String n, String c, int i);
	
	public int deleteActorbyID(int id);
	
	public List<Actor> findByName(String n);
	
	public List<Actor> findById(int id);

}

