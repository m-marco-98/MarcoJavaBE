package controller;

import java.io.IOException;

import org.json.JSONArray;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api")

public class ControllerRest extends HttpServlet{

	PokemonCtrl controller = new PokemonCtrl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		JSONArray lista = new JSONArray(controller.getNomiPokemon());
		resp.getWriter().print(lista.toString());
	}
	
		

}
