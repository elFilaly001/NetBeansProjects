<%-- 
    Document   : Q3
    Created on : Jun 14, 2022, 9:28:59 AM
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
        <%@include file="q1.jsp"%>
        <label>email</label><br>
        <input name="login" type="text" /><br>
        <label>mot de passe</label><br>
        <input name="mdp" type="text"/><br>
        <input type="submit"  name="connecter" value="connecter"/>
    </body>
</html>
