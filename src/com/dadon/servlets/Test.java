package com.dadon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dadon.beans.CategorieProduit;
import com.dadon.beans.Coyote;
import com.dadon.beans.Produit;

public class Test extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		/* Création et initialisation du message. */
		String paramAuteur = request.getParameter( "auteur" );
		String message = "Transmission de variables : OK ! " + paramAuteur;
		
		/* Création du bean */
		Coyote premierBean = new Coyote();
		
		/* Initialisation de ses propriétés */
		premierBean.setNom( "Coyote" );
		premierBean.setPrenom( "Wile E." );
			
		/* Stockage du message et du bean dans l'objet request */
		request.setAttribute( "test", message );
		request.setAttribute( "coyote", premierBean );
		
		
		//Test affichage liste de produits
		CategorieProduit categorieProduit = new CategorieProduit();
		
		categorieProduit.setName("Fruits");
		Produit fraise = new Produit();
		fraise.setName("fraise");
		Produit orange = new Produit();
		orange.setName("orange");
		
		List<Produit> produits = new ArrayList<Produit>();
		produits.add(fraise);
		produits.add(orange);
		
		categorieProduit.setProduits(produits);
		request.setAttribute( "categorieProduit", categorieProduit);
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/dadon.jsp").forward(request,  response);
	}
}
