<%-- 
    Document   : inscription
    Created on : Jun 30, 2021, 9:19:12 AM
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
        <h1>Ajouter un covoiturier</h1>
        <form method="post" action="/EFM/inscrip">
            <table>
                <tr><td>Notel :</td><td><input type="text" name="notel" id="notel"/></td></tr>
                <tr><td>Nom :</td><td><input type="text" name="nomcov" id="nomcov"/></td></tr>
                <tr> <td>Prenom :</td><td><input type="text" name="prenomcov" id="prenomcov"/></td></tr>
                <tr> <td>Email :</td><td><input type="text" name="email" id="email"/></td></tr>
                <tr> <td>Mot de passe :</td><td><input type="text" name="mdp" id="mdp"/></td></tr>
                <tr><td><input type="submit" name="envoyer" value="Ajouter" /></td></tr>
            </table>
        </form>
    </body>
</html>
