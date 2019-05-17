package it.sincrono.corso.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import it.sincrono.corso.model.Actor;
import it.sincrono.corso.model.ActorImpl;

/**
 * Servlet implementation class ControllerActor
 */
@WebServlet("/ControllerActor")
public class ControllerActor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String p=request.getParameter("nomeAttore");
	ActorImpl al=new ActorImpl();
	List<Actor> list= al.findByName(p);
	RequestDispatcher rd=request.getRequestDispatcher("views/actorResult.jsp");
	request.setAttribute("AttoriByName", list);
	
	String del=request.getParameter("actor_id");
	ActorImpl adel=new ActorImpl();
	List<Actor> list=adel.deleteActorbyID(del);
	
	rd.forward(request, response);
	
	
	
	}

}
