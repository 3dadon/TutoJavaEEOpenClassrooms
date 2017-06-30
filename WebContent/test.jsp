<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>
    <body>
        <p>Ceci est une page générée depuis une JSP.</p>
        <p>
            <% 
	            String attribut = (String) request.getAttribute("test");
	            out.println( attribut );
	
	            String parametre = request.getParameter( "auteur" );
	            out.println( parametre );
            %>
        </p>
        <p>
            Récupération du bean :
            <%
	        	com.dadon.beans.Coyote notreBean = (com.dadon.beans.Coyote) request.getAttribute("coyote");
	      	    out.println( "Prénom : "+ notreBean.getPrenom() );
	            out.println( "Nom : "+ notreBean.getNom() );
        	%>
        </p>
    </body>
</html>