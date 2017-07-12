<%@page import="com.dadon.beans.CategorieProduit"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/myCss.css" />
    </head>
    <body>
       	<strong><p style="color:blue;">Liste des produits à acheter : </p></strong>
		<div id="list4">
			<ul>
				<li>
					<% 
						com.dadon.beans.CategorieProduit catProduit = (CategorieProduit) request.getAttribute("categorieProduit");
						out.println(catProduit.getName());
					%>
					
					<ul>
						<% 
							for (com.dadon.beans.Produit prod : catProduit.getProduits()) {
								out.println("<li>");
								out.println(prod.getName());
								out.println("</li>");
							}
						%>
					</ul>
				</li>
				
				<li>Légumes
					<ul>
						<li>Tomate</li>
						<li>Oignon</li>
					</ul>
				</li>
				
				<li>Hygiène
					<ul>
						<li>Savon</li>
						<li>Shampoing</li>
					</ul>
				</li>
			</ul>
		</div>
    </body>
</html>