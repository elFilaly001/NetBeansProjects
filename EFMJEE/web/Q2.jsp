<%-- 
    Document   : Q2
    Created on : Jun 14, 2022, 8:54:34 AM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Q1.jsp"%>
        <form method="post" action="Q2">
         <label>matricule</label>
        <input type="number" name="txtmat" required/>
        <label>nom</label>
        <input type="text" name="txtnom" required/>
        <label>prenom</label>
        <input type="text" name="txtprenom" required/>
        <label>tel</label>
        <input type="text" name="txttel" required/>
        <label>email</label>
        <input type="text" name="txtemail" required/>
        <label>passe</label>
        <input type="password" name="txtpass" minlength="8" required/>
        <input type="submit" name="btnaj" value="ajouter"/> 
        </form>
        
    </body>
</html>
