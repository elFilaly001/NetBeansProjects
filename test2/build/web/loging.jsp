<%-- 
    Document   : loging
    Created on : Mar 15, 2022, 2:59:16 PM
    Author     : ABDOU
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <form action="s1" method="post">
        <label>login</label><br>
        <input name="login" type="text" /><br>
        <label>mdp</label><br>
        <input name="mdp" type="text"/><br>
        <input type="submit"  name="connecter" value="connecter"/>
        </form>
        
    </body>
</html>
