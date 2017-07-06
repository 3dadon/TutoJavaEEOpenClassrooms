package com.dadon.beans;

import java.util.List;

public class CategorieProduit
{
	
	private String name;
	private List<Produit> produits;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public List<Produit> getProduits () {
		return produits;
	}
	
	public void setProduits (List<Produit> produits) {
		this.produits = produits;
	}
}
